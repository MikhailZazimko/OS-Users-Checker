package com.ikropachev.userlist;

import org.junit.jupiter.api.Test;

import static com.ikropachev.userlist.CheckUserUtil.checkUser;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckUserUtilTest {

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
