package src.day40;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {


    @Test
    void getName() {

        Person p = new Person();
        p.setName("Techno");
        String actual = p.getName();
        String expected = "Techno";
        Assert.assertEquals(actual, expected);
    }

    @Test
    void setName() {
    }

    @Test

    void MethodTest() {

        Person p1 = new Person();
        p1.setName("SomeValue");

        String actual = p1.Method();
        String expected = "SomeValue";
        Assert.assertEquals(actual, expected);
    } }

