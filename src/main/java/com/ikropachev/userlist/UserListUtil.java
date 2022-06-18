package com.ikropachev.userlist;

import com.sun.jna.platform.win32.Netapi32Util;

public class UserListUtil {

    public static String checkUser(String name) {
        String result = "Пользователя нет";
        Netapi32Util.User[] users = Netapi32Util.getUsers();
        for (Netapi32Util.User user : users) {
            if ((user.name).equals(name)){
                result = "Пользователь есть";
                break;
            };
        }
        return result;
    }
}
