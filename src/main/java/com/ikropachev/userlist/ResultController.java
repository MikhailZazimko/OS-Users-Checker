package com.ikropachev.userlist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.ikropachev.userlist.UserListUtil.checkUser;

@Controller
public class ResultController {

    @GetMapping("/result")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="user:empty") String name, Model model) {
        String resultMessage = checkUser(name);
        model.addAttribute("resultMessage", resultMessage);
        return "result";
    }

}
