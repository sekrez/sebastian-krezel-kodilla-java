package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;



public class StatistickCalculatorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {

        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished properly.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateAdvStatisticWithMock_0_Users() {
        //Given
        StatisticCalkulator statCalculator = new StatisticCalkulator();
        Statistics statMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();

        // TESTS when users = 0 posts  = 0 and comments 0
        when(statMock.usersNames()).thenReturn(userList);
        when(statMock.commentsCount()).thenReturn(0);
        when(statMock.postsCount()).thenReturn(0);

        //When
        statCalculator.calculateAdvStatistics(statMock);
        statCalculator.showStatistics();

        //Then
        Assert.assertEquals(statMock.usersNames().size(), statCalculator.getUsersQuantity());
        Assert.assertEquals(statCalculator.getAverageUserComments(), 0,0);
        Assert.assertEquals((statCalculator.getAverageUserPost()), 0, 0 );

    }

     @Test
        public void testCalculateAdvStatisticWithMock_100_Users() {
        //Given
        StatisticCalkulator statCalculator = new StatisticCalkulator();
        Statistics statMock = mock(Statistics.class);
        UsersGenerator usersGenerator = new UsersGenerator();
        List<String> userList = usersGenerator.generateUsers(100);

        // TESTS when users = 100 posts  = 1000 and comments < posts
        when(statMock.usersNames()).thenReturn(userList);
        when(statMock.commentsCount()).thenReturn(5000);
        when(statMock.postsCount()).thenReturn(1000);

        //When
        statCalculator.calculateAdvStatistics(statMock);
        statCalculator.showStatistics();

        //Then
        Assert.assertEquals(statMock.usersNames().size(), statCalculator.getUsersQuantity());
        Assert.assertEquals(statCalculator.getAverageUserComments(), statMock.commentsCount() / statMock.usersNames().size(), 0);
        Assert.assertEquals((statCalculator.getAverageUserPost()), statMock.postsCount() / statMock.usersNames().size(), 0 );

    }

    @Test
    public void testCalculateAdvStatisticWithMockAnother() {

        //Given
        StatisticCalkulator statCalculator = new StatisticCalkulator();
        Statistics statMock = mock(Statistics.class);
        UsersGenerator usersGenerator = new UsersGenerator();
        List<String> userList = usersGenerator.generateUsers(100);

        // TESTS when comments > posts
        when(statMock.usersNames()).thenReturn(userList);
        when(statMock.commentsCount()).thenReturn(2000);
        when(statMock.postsCount()).thenReturn(1000);

        //When
        statCalculator.calculateAdvStatistics(statMock);
        statCalculator.showStatistics();

        //Then
        Assert.assertEquals(statMock.usersNames().size(), statCalculator.getUsersQuantity());
        Assert.assertEquals(statCalculator.getAverageUserComments(), statMock.commentsCount() / statMock.usersNames().size(), 0);
        Assert.assertEquals((statCalculator.getAverageUserPost()), statMock.postsCount() / statMock.usersNames().size(),0);

    }

}
