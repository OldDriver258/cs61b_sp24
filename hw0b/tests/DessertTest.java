/*
 * @Author: error: error: git config user.name & please set dead value or install git && error: git config user.email & please set dead value or install git & please set dead value or install git
 * @Date: 2024-07-29 17:31:39
 * @LastEditors: error: error: git config user.name & please set dead value or install git && error: git config user.email & please set dead value or install git & please set dead value or install git
 * @LastEditTime: 2024-08-04 15:28:21
 * @FilePath: \hw0b\tests\DessertTest.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.google.common.truth.Truth.assertWithMessage;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DessertTest {
    @Test
    @Order(0)
    @DisplayName("Test Dessert class")
    public void testDessert() {
        // TODO: Uncomment this test when you've created and completed Dessert.java!
        // TODO: Delete lines 24 and 60 of this file to uncomment.
        boolean completed = false;

        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Dessert brownie = new Dessert(1, 2);
        brownie.printDessert();

        assertWithMessage("Are your static and instance variables set correctly?")
                .that(outContent.toString().trim())
                .isEqualTo("1 2 1");

        outContent.reset();

        Dessert iceCream = new Dessert(3, 4);
        iceCream.printDessert();

        assertWithMessage("Are your static and instance variables set correctly?")
                .that(outContent.toString().trim())
                .isEqualTo("3 4 2");

        outContent.reset();

        brownie.printDessert();
        assertWithMessage("Are your static and instance variables set correctly?")
                .that(outContent.toString().trim())
                .isEqualTo("1 2 2");

        outContent.reset();

        String[] args = {};
        Dessert.main(args);
        assertWithMessage("Did you print what was expected in Dessert.main?")
                .that(outContent.toString().trim())
                .isEqualTo("I love dessert!");

        completed = true;
        

        // Check that assertions were run
        if (!completed) {
            String msg =
                    "Be sure to delete lines 24 and 60 of DessertTest.java once you've completed the Dessert class!";
            assertWithMessage(msg).fail();
        }
    }
}
