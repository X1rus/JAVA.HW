package Video7;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Random;

public class TestTask1 {
    @Test
    public  void  isArrayTest() throws Exception
    {
        //Arrange
       Task1.myCollection=new ArrayList<>();
       Task1.newCollection=new ArrayList<>();
        //Act
        if(Task1.newCollection.isEmpty()) System.out.println("Epty");
        else System.out.println("not empty");

        //Assert
        Assert.assertTrue(Task1.myCollection.isEmpty());
        Assert.assertTrue(Task1.myCollection.size()==0);
        Assert.assertTrue(Task1.newCollection.isEmpty());
        Assert.assertTrue(Task1.newCollection.size()==0);

    }
    @Test
    public void isNotEmptyTest() throws  Exception
    {
        //Arrange
        Task1.myCollection=new ArrayList<>();

        //Act
        Random r = new Random();
        Task1.addNumbers(r);

        //Assert
        Assert.assertTrue(Task1.myCollection.size()==10);
    }
    @Test
    public void upTwentyTest() throws  Exception
    {
        //Arrange
        ArrayList<Integer> testArray=new ArrayList<>();

        //Act
        Task1.myCollection.removeIf(i->i>20);
        for(Integer i:Task1.myCollection)
        {
            testArray.add(i);
        }

        //Assert
        Assert.assertEquals(Task1.myCollection,testArray);
    }
    @Test
    public void upFifeTest() throws  Exception
    {
        //Arrange
        Task1.myCollection=new ArrayList<>();
        Task1.newCollection=new ArrayList<>();
        ArrayList<Integer> testArray=new ArrayList<>();

        //Act
        for (Integer i : Task1.myCollection) {
            if (i > 5) Task1.newCollection.add(i);
        }

        for(Integer i: Task1.myCollection)
        {
            if (i > 5) testArray.add(i);

        }

        //Assert
        Assert.assertEquals(testArray,Task1.newCollection);
    }

}
