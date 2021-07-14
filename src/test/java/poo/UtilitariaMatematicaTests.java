package poo;

import org.junit.jupiter.api.Test;
import poo.util.UtilitariaMatematica;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilitariaMatematicaTests {

    @Test
    public void numerosPerfeitos(){
        assertTrue(UtilitariaMatematica.numeroPerfeito(6), "6 é perfeito");
        assertTrue(UtilitariaMatematica.numeroPerfeito(28), "28 é perfeito");
        assertTrue(UtilitariaMatematica.numeroPerfeito(496), "496 é perfeito");
        assertTrue(UtilitariaMatematica.numeroPerfeito(8128), "8128 é perfeito");
    }

    @Test
    public void numerosNaoPerfeitos(){
        assertFalse(UtilitariaMatematica.numeroPerfeito(0), "0 não é perfeito");
        assertFalse(UtilitariaMatematica.numeroPerfeito(10), "10 não é perfeito");
        assertFalse(UtilitariaMatematica.numeroPerfeito(2), "2 não é perfeito");
        assertFalse(UtilitariaMatematica.numeroPerfeito(1), "1 não é perfeito");
        assertFalse(UtilitariaMatematica.numeroPerfeito(100), "100 não é perfeito");
        assertFalse(UtilitariaMatematica.numeroPerfeito(-6), "-6 não é perfeito");
    }
}
