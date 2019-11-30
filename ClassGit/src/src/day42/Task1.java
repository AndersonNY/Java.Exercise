package src.day42;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Task1 {

    // create a Login class with attributes
    // use Encapsulation


    @Test
    public void test1() {
        // check if we can create login,
        // set username, set password, set rememberMe

        Login login = new Login();
        login.setUsername("techno.study");
        login.setPassword("123qwe");
        login.setRememberMe(false);

        String expected = "techno.study";
        String actual = login.getUsername();
        //check username

        // Assert.assertTrue(expected.equals(actual)); don't write it like this
        Assert.assertEquals(expected, actual); // this is better

        //check password
        Assert.assertEquals("123qwe", login.getPassword());

        //check rememberMe
//        Assert.assertEquals(false, login.hasRememberMe()); // don't write it like this
        Assert.assertFalse(login.hasRememberMe());
    }



    @Test
    public void test2() {
        Login login = new Login();
        login.setPassword("123123");
//        Assert.assertEquals(null, login.getPassword()); // don't use this
        Assert.assertNull(login.getPassword()); // we have only number, so that why it should return null

        Login login2 = new Login();
        login2.setPassword("mypass123");
        Assert.assertEquals(null, login2.getPassword());

        Login login3 = new Login();
        login3.setPassword("MYpass");
        Assert.assertEquals("MYpass", login3.getPassword());
    }

    @Test
    public void test3() {
        // write the code inside the set password
        // if given string password includes at least one character and number



    }

}








