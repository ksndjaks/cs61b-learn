package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesAll() {
        IntList lst = IntList.of(2, 3, 5, 7, 11, 13);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 9 -> 25 -> 49 -> 121 -> 169", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquareNoPrimes() {
        IntList lst = IntList.of(10, 20, 30, 40, 50);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("10 -> 20 -> 30 -> 40 -> 50", lst.toString());
        assertTrue(!changed);
    }

    @Test
    public void testSquarePrimesAtFirst() {
        IntList lst = IntList.of(5, 10, 20, 30);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("25 -> 10 -> 20 -> 30", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesAtLast() {
        IntList lst = IntList.of(10, 20, 30, 5);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("10 -> 20 -> 30 -> 25", lst.toString());
        assertTrue(changed);
    }
}
