package Video7;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;


public class Task2Test {

    @Test
    public void testCheckName() {
        //Arrange
        boolean isChecked;
        String name = "Petro";
        HashMap<Integer, String> empl = Task2.getIntegerStringHashMap();

        //Act
        isChecked = Task2.checkName(name, empl);

        //Assert
        Assert.assertTrue(isChecked);
    }

    @Test
    public void testCheckID() {
        //Arrange
        boolean isChecked;
        int id = 2;
        HashMap<Integer, String> empl = Task2.getIntegerStringHashMap();

        //Act
        isChecked = Task2.checkID(empl, id);

        //Assert
        Assert.assertTrue(isChecked);
    }


}