package geco;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    LoginService loginService = new LoginService(new String[]{"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"});
    LoginGenerator loginGen = new LoginGenerator(loginService);


    @Test
    public void ct1(){
        loginGen.generateLoginForNomAndPrenom("Durand", "Paul");
        List<String> l2 =  Arrays.asList("PDUR");
        assertEquals(l2, loginService.findAllLoginsStartingWith("PDUR"));
    }

    @Test
    public void ct2(){
        loginGen.generateLoginForNomAndPrenom("Ralling", "Jhon");
        List<String> l2 =  Arrays.asList("JRAL2");
        assertEquals(l2, loginService.findAllLoginsStartingWith("JRAL2"));
    }

    @Test
    public void ct3(){
        loginGen.generateLoginForNomAndPrenom("Rolling", "Jean");
        List<String> l2 =  Arrays.asList("JROL1");
        assertEquals(l2, loginService.findAllLoginsStartingWith("JROL1"));
    }

    @Test
    public void ct4(){
        loginGen.generateLoginForNomAndPrenom("Dùrand", "Paul");
        List<String> l2 =  Arrays.asList("PDUR");
        assertEquals(l2, loginService.findAllLoginsStartingWith("PDUR"));
    }

}