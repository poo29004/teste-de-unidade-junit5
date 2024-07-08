package poo.formas;

/**
 * Classe para representar um triângulo
 */
public class Triangulo {

    /**
     * Dimensão do lado A do triângulo
     */
    private int ladoA;
    /**
     * Dimensão do lado B do triângulo
     */
    private int ladoB;
    /**
     * Dimensão do lado C do triângulo
     */
    private int ladoC;

    /**
     * Se as dimensões fornecidas para os três lados não formarem um triângulo, então deverá ser criado um triângulo
     * com as seguintes dimensões: 4,3,2
     * @param ladoA dimensão do lado A
     * @param ladoB dimensão do lado B
     * @param ladoC dimensão do lado C
     */
    public Triangulo(int ladoA, int ladoB, int ladoC) {
        // TODO preciso que implemente a lógica para garantir que irá criar um triângulo válido

        // A lógica abaixo irá falhar em alguns testes de unidade
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public String toString() {
        return "(" + ladoA + "," + ladoB + "," + ladoC + ")";
    }
}
