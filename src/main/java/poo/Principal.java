package poo;

import java.util.Random;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Pequeno exemplo com testes de unidade. Veja o conteúdo do diretório test\n\n");


        // Exemplo de como fazer sorteio de números usando semente fixa e sem usar semente fixa
        // Os exemplos abaixo não possuem qualquer ligação com os testes de unidade desse projeto, porém
        // talvez possam ser úteis quando for escrever seus próprios testes de unidade

        Random semSementeFixa = new Random();
        Random comSementeFixa = new Random(123456);

        System.out.println("Sem semente fixa          Com semente fixa");
        System.out.printf("%-7s | %-10s %-4s %-7s | %-10s \n%n", "Posição", "Sorteado","","Posição", "Sorteado");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(String.format("%-7s | %8d %-4s %-7s  | %8d \n",
                    "  ["+i+"] ", semSementeFixa.nextInt(100),"","    ["+i+"] ", comSementeFixa.nextInt(100)));
        }
        System.out.println(sb);
    }
}
