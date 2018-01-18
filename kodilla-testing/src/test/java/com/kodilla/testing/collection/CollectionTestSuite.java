// Zadanie 6.3

package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;
import java.util.Random;

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
            OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
            ArrayList<Integer> emptyList = new ArrayList<>();

            //When
            System.out.println("Testing for empty ArrayList");

            //Then
            ArrayList<Integer> firstTest = oddNumbersExterminator.exterminate(emptyList);
        }


    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        MakerSampleList testList = new MakerSampleList();
        ArrayList<Integer> genTestList = testList.generateList();
        OddNumbersExterminator oddList = new OddNumbersExterminator();

        //When
        ArrayList<Integer> result = oddList.exterminate(genTestList);

        //Then
        int z = 0;
         System.out.print("Testing sample array: ");
        for (int i : result){
            System.out.print(i + ", ");
            z = z + (i%2);
        }
        System.out.print("\b");
        Assert.assertEquals(0,z);
    }




}