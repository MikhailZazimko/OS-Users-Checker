package com.ikropachev.userlist;

import com.sun.jna.platform.win32.Netapi32Util;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class UserListUtil {
    private static final Logger log = getLogger(UserListUtil.class);

    public static String checkUser(String name) {
        String result = "Пользователя нет";
        Netapi32Util.User[] users = Netapi32Util.getUsers();
        log.info("try to find user with name {}", name);
        for (Netapi32Util.User user : users) {
            if ((user.name).equals(name)) {
                result = "Пользователь есть";
                break;
            }
        }
        return result;
    }
}
