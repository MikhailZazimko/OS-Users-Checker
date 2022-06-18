package com.ikropachev.userlist;

import org.junit.jupiter.api.Test;

import static com.ikropachev.userlist.UserListUtil.checkUser;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserListUtilTest {

    @Test
    void getAdmin() {
        String result = checkUser("Администратор");
        assertTrue("Пользователь есть".equals(result));
    }

    @Test
    void getNonExistentUser() {
        String result = checkUser("name:nonExistent");
        assertTrue("Пользователя нет".equals(result));
    }
}
