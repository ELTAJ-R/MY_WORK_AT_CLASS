package hw08;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Family test = new Family();
    Human test_child = new Human();
    Human examp = new Human("Jane", "Karleone");


    @Test
    public void check_deleting() {
        test.addChild(test_child);
        boolean actual = test.deleteChild(test_child);
        boolean expected = true;
        assertEquals(expected, actual);
    }


    @Test
    public void check_deleteIndex() {
        test.addChild(test_child);
        assertFalse(test.deleteChildIndex(2));
        assertTrue(test.deleteChildIndex(0));

    }


    @Test
    public void checkCount() {
        test.addChild(test_child);
        int actual = test.countFamily();
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void check_add() {

        test.addChild(test_child);
        assertFalse(test.addChild(test_child));
        //I can not add this child,because it is already in the family.
        assertTrue(test.addChild(examp));


    }

    @Test
    public void check_ifString() {
        RoboCat examp = new RoboCat("Jack", 2, 75);
        examp.setHabits("sleep");
        examp.setHabits("drink");
        String actual = examp.toString();
        String expexted = "Species:ROBOCAT Nickname: Jack,Age:2,TrickLevel:75,Habits:[sleep, drink]";
        assertEquals(expexted, actual);


    }
}




