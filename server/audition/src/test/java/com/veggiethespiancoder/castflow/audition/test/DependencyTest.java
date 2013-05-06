package com.veggiethespiancoder.castflow.audition.test;

import com.veggiethespiancoder.castflow.auth.model.User;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DependencyTest {

    @Test
    public void testInstantiateUser() {
        User user = new User("MyUserName");
        assertTrue(user.getUsername().equals("MyUserName"));
    }
}
