// Zadanie 6.3

package com.kodilla.testing.collection;
import org.junit.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println();
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        ByteArrayOutputStream redirectMessage = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(redirectMessage);
        PrintStream old = System.out;

        //When
        System.setOut(ps);
        ArrayList<Integer> testaArray = exterminator.exterminate(emptyList);
        String result = redirectMessage.toString();
        System.out.flush();
        System.setOut(old);

        //Then
        System.out.println("Testing exception for empty ArrayList.");
        Assert.assertEquals(result, "ArrayList is empty. Abort checking list.\n");
    }


    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        MakerSampleList testList = new MakerSampleList();
        ArrayList<Integer> genTestList = testList.generateList();
        OddNumbersExterminator oddList = new OddNumbersExterminator();

        //When
        ArrayList<Integer> result = oddList.exterminate(genTestList);

        //Then
        int z = 0;
        System.out.print("Testing sample array!");
        for (int i : result) {
            z = z + (i % 2);
        }
        Assert.assertFalse(z != 0);
    }
}