package hw06;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    Family test = new Family();
    Human test_child = new Human();


    @Test
    public void check_dChild() {
        test.addChild(test_child);
        boolean actual = test.deleteChild(test_child);
        boolean expected = true;
        assertEquals(expected, actual);
    }


    @Test
    public void check_dChildIndex() {
        test.addChild(test_child);
        assertFalse(test.deleteChildIndex(2));
        assertTrue(test.deleteChildIndex(0));

    }

    @Test
    public void testHuman() {
        Human h1 = new Human("Bob", "Smith");
        Human h2 = new Human("Bob", "Smith");
        assertEquals(h1, h2);
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
        int actual = test.children.length;
        int expected = 1;
        assertEquals(expected, actual);
        assertTrue(test.children[0].equals(test_child));


    }

    @Test
    public void check_ifString() {
        Pet pet = new Pet();
        pet.setNickname("Jack");
        pet.setAge(2);
        String actual = pet.toString();
        String expexted = "null Nickname: Jack,Age:2,TrickLevel:0,Habits:null";
        assertEquals(expexted, actual);


    }
}