package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {


    @Test
    public void getRandomPassword() {
        String s1 = PasswordGeneration.getRandomPassword();
        String s2 = PasswordGeneration.getRandomPassword();
        assertEquals(8, s1.length());
        assertEquals(8, s2.length());
        assertNotEquals(s1, s2);
    }
}