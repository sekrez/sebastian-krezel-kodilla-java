
package com.kodilla.testing.shape;

import org.junit.*;


public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }


    @Test
    public void testRemoveFigureWhenEmpty() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle(10, 21);

        //When
        boolean result = shapeCollector.removeFigure(triangle);

        //Then
        Assert.assertFalse(result);

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape square = new Square(5);
        shapeCollector.addFigure(square);

        //When
        shapeCollector.removeFigure(square);

        //Then
        Assert.assertTrue(shapeCollector.shapeCollection.isEmpty());
        Assert.assertEquals(0, shapeCollector.shapeCollection.size());
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(3);

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertTrue(shapeCollector.shapeCollection.contains(circle));
    }


    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(5);
        shapeCollector.addFigure(circle);

        //When
        Shape testShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(shapeCollector.shapeCollection.get(0), testShape);
    }

    @Test
    public void testShowFiguresWhenEmpty() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle(3.4);
        //When
        shapeCollector.showFigures();
        //Then
        Assert.assertTrue(shapeCollector.shapeCollection.isEmpty());
        Assert.assertEquals(0, shapeCollector.shapeCollection.size());

    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle01 = new Circle(3);
        Shape circle02 = new Circle(5);
        Shape square = new Square(5);
        Shape triangle = new Triangle(5, 6);
        shapeCollector.addFigure(circle01);
        shapeCollector.addFigure(circle02);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        //When
        shapeCollector.showFigures();

        //Then
        Assert.assertEquals(4, shapeCollector.shapeCollection.size());

        for (int n = 0; n < 4; n++) {
            Assert.assertEquals(shapeCollector.shapeCollection.get(n), shapeCollector.getFigure(n));
        }
    }
}


