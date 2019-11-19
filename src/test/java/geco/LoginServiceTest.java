package geco;

import org.junit.Test;


import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    String s[] = {"zmd2219a", "amd4565h", "zer8731y"};
    LoginService lS = new LoginService(s);


    String s2[] = {"zargf", "zlfgj", "afdfdt"};
    LoginService lS2 = new LoginService(s2);


    List<String> l = Arrays.asList("zmd2219a", "amd4565h", "zer8731y");



    @Test
    public void loginExist(){
        assertTrue(lS.loginExists("zmd2219a"));
        assertFalse(lS.loginExists("coucou"));
    }

    @Test
    public void findAllLogin(){
        assertNotEquals(l, lS.findAllLogins());
        l.sort(String::compareTo);
        assertEquals(l, lS.findAllLogins());
    }



    @Test
    public void addLogin(){
        lS.addLogin("ght6532j");
        assertTrue(lS.loginExists("ght6532j"));
    }

    @Test
    public void findAllLoginsStartingWith(){
        List<String> l2 =  Arrays.asList("zmd2219a");
        List<String> l3 =  Arrays.asList("zargf", "zlfgj");
        assertEquals(l2, lS.findAllLoginsStartingWith("zmd"));
        assertEquals(l3, lS2.findAllLoginsStartingWith("z"));
    }



}