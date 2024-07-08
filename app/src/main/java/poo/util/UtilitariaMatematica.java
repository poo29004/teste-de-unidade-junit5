package poo.util;

/**
 * Classe utilitária com métodos usados na matemática
 */
public abstract class UtilitariaMatematica {

    /**
     * Indica se o parâmetro fornecido é um número perfeito. Um número perfeito é um número natural
     * para o qual a soma de todos os seus divisores naturais próprios (excluindo ele mesmo) é igual ao próprio número.
     * @see <a href="https://pt.wikipedia.org/wiki/N%C3%BAmero_perfeito">Número perfeito</a> na Wikipedia.
     *
     * @param numero número a ser testado
     * @return true se o número for perfeito, false caso contrário
     */
    public static boolean numeroPerfeito(int numero) {

        int soma = 0;

        for (int i = numero - 1; i > 0; i--) {
            if (numero % i == 0) {
                soma += i;
            }
        }

        return (soma == numero) && (soma > 0);
    }
}
