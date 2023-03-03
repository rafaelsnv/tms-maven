import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ex1Test {
    ex1 cut;

    @BeforeEach
    void setUp() {
        cut = new ex1();
    }

    /**
     * Questão 1
     */
    @Test
    void calculaMediaEmpty() {
        List<Integer> list = Arrays.asList();

        double actual = cut.calculaMedia(list);
        assertEquals(0.0, actual);
    }

    @Test
    void calculaMediaZeros() {
        List<Integer> list = Arrays.asList(0, 0);

        double actual = cut.calculaMedia(list);
        assertEquals(0.0, actual);
    }

    @Test
    void calculaMediaRandom() {
        List<Integer> list = Arrays.asList(-13781, 20, 13, -10);

        double actual = cut.calculaMedia(list);
        assertEquals(-3439.5, actual);
    }

    @Test
    void calculaMediaNegative() {
        List<Integer> list = Arrays.asList(-1, -13, -17, -42);

        double actual = cut.calculaMedia(list);
        assertEquals(-18.25, actual);
    }

    /**
     * Questão 2
     */
    @Test
    void estaOrdenadaDescending() {
        List<Integer> list = Arrays.asList(56, 42, 20, 17, 5, 3);

        boolean actual = cut.estaOrdenada(list);
        assertFalse(actual);
    }

    @Test
    void estaOrdenadaAscending() {
        List<Integer> list = Arrays.asList(3, 5, 17, 20, 42, 56);

        boolean actual = cut.estaOrdenada(list);
        assertTrue(actual);
    }

    @Test
    void estaOrdenadaAlmostSorted() {
        List<Integer> list = Arrays.asList(3, 5, 17, 20, 42, 13);

        boolean actual = cut.estaOrdenada(list);
        assertFalse(actual);
    }

    @Test
    void estaOrdenadaNotSorted() {
        List<Integer> list = Arrays.asList(20, 3, 5, 17, 42, 56);

        boolean actual = cut.estaOrdenada(list);
        assertFalse(actual);
    }

    /**
     * Questão 3
     */
    @Test
    void fatorialZero() {
        int actual = cut.fatorial(0);

        assertEquals(1, actual);
    }

    @Test
    void fatorialPositive() {
        int actual = cut.fatorial(4);

        assertEquals(24, actual);
    }

    @Test
    void fatorialNegative() {
        int actual = cut.fatorial(-7);

        assertEquals(1, actual);
    }

    @Test
    void fatorialOne() {
        int actual = cut.fatorial(1);

        assertEquals(1, actual);
    }

    /**
     * Questão 4
     */
    @Test
    void converteTemperaturaAbsolutZero() {
        double actual = cut.converteTemperatura(-273.15);

        assertEquals(-459.67, actual, 0.1);
    }

    @Test
    void converteTemperaturaNegative() {
        double actual = cut.converteTemperatura(-7.00);

        assertEquals(19.4, actual, 0.1);
    }

    @Test
    void converteTemperaturaPositive() {
        double actual = cut.converteTemperatura(42.00);

        assertEquals(107.6, actual, 0.1);
    }

    @Test
    void converteTemperaturaDecimalPositive() {
        double actual = cut.converteTemperatura(13.1313);

        assertEquals(55.63634, actual, 0.1);
    }

    /**
     * Questão 5
     */
    @Test
    void ePrimoTrue() {
        boolean actual = cut.ePrimo(17);

        assertTrue(actual);
    }

    @Test
    void ePrimoNegative() {
        boolean actual = cut.ePrimo(-1);

        assertFalse(actual);
    }

    @Test
    void ePrimoOne() {
        boolean actual = cut.ePrimo(1);

        assertFalse(actual);
    }
    @Test
    void ePrimoFalse() {
        boolean actual = cut.ePrimo(26);

        assertFalse(actual);
    }

    /**
     * Questão 6
     */
    @Test
    void listaOrdenadaAscending() {
        List<Integer> list = Arrays.asList(3, 5, 17, 20, 42, 56);

        boolean actual = cut.listaOrdenada(list);
        assertTrue(actual);
    }

    @Test
    void listaOrdenadaDescending() {
        List<Integer> list = Arrays.asList(56, 42, 20, 17, 5, 3);

        boolean actual = cut.listaOrdenada(list);
        assertTrue(actual);
    }

    @Test
    void listaOrdenadaAlmostSorted() {
        List<Integer> list = Arrays.asList(3, 5, 17, 20, 42, 13);

        boolean actual = cut.listaOrdenada(list);
        assertFalse(actual);
    }

    @Test
    void listaOrdenadaNotSorted() {
        List<Integer> list = Arrays.asList(20, 3, 5, 17, 42, 56);

        boolean actual = cut.listaOrdenada(list);
        assertFalse(actual);
    }

}