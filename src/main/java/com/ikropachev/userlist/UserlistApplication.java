package com.ikropachev.userlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.ikropachev.userlist.UserListUtil.checkUsers;

@SpringBootApplication
public class UserlistApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserlistApplication.class, args);
		checkUsers();
	}
}
