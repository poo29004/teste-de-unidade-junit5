package poo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import poo.formas.Triangulo;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrianguloTests {

    /**
     * Testando todas possibilidades de lados com valore igual 0. Temos aqui muita repetição para escrita dos testes.
     * No {@link #ladosQueFormamUmTriangulo(String, int, int, int)} é apresentado um exemplo com testes parametrizados
     * que torna a escrita menos repetitiva.a
     */
    @Test
    public void ladosComDimensaoZero(){
        Triangulo t = new Triangulo(0,3,2);
        assertEquals("(4,3,2)", t.toString(), "ladoA = 0");

        t = new Triangulo(4,0,2);
        assertEquals("(4,3,2)", t.toString(), "ladoB = 0");

        t = new Triangulo(4,3,0);
        assertEquals("(4,3,2)", t.toString(), "ladoC = 0");

        t = new Triangulo(0,0,0);
        assertEquals("(4,3,2)", t.toString(), "três lados = 0");

        t = new Triangulo(4,0,0);
        assertEquals("(4,3,2)", t.toString(), "lados B e C= 0");

        t = new Triangulo(0,3,0);
        assertEquals("(4,3,2)", t.toString(), "lados A e C= 0");

        t = new Triangulo(0,0,2);
        assertEquals("(4,3,2)", t.toString(), "lados A e B= 0");
    }

    /*
    Exemplo de como usar teste parametrizado. Torna a escrita do teste mais simples e menos repetitiva, evitando
    aquilo que foi feito no método  {@link #ladosComDimensaoZero()}.
     */
    static Stream<Arguments> ladosQueFormamTriangulo(){
        return Stream.of(
                Arguments.arguments("(1,1,1)", 1, 1, 1),
                Arguments.arguments("(2,5,6)", 2, 5, 6),
                Arguments.arguments("(10,5,6)", 10, 5, 6),
                Arguments.arguments("(6,10,6)", 6, 10, 6),
                Arguments.arguments("(7,10,16)", 7, 10, 16)
        );
    }

    @ParameterizedTest
    @MethodSource("ladosQueFormamTriangulo")
    public void ladosQueFormamUmTriangulo(String esperado, int ladoA, int ladoB, int ladoC){
        Triangulo t = new Triangulo(ladoA,ladoB,ladoC);
        assertEquals(esperado, t.toString(), "três dimensões válidas");
    }

    static Stream<Arguments> parametrosComLadosQueNaoFormamTriangulo(){
        return Stream.of(
                Arguments.arguments(10, 1, 1),
                Arguments.arguments(1, 10, 1),
                Arguments.arguments(1, 1, 10),
                Arguments.arguments(2, 1, 1),
                Arguments.arguments(1, 2, 1),
                Arguments.arguments(1, 1, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("parametrosComLadosQueNaoFormamTriangulo")
    public void ladosQueNaoFormamTriangulo(int ladoA, int ladoB, int ladoC){
        Triangulo t = new Triangulo(ladoA,ladoB,ladoC);
        assertEquals("(4,3,2)", t.toString(), "lados que não formam um triângulo");
    }
}
