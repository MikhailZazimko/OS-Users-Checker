package com.ikropachev.userlist;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.ikropachev.userlist.UserListUtil.checkUser;
import static org.slf4j.LoggerFactory.getLogger;

@Controller
public class ResultController {
    private static final Logger log = getLogger(ResultController.class);

    @GetMapping("/result")
    public String getResult(@RequestParam(name = "name", required = false, defaultValue = "user:emptyDefault") String name, Model model) {
        log.info("try to get result with name {}", name);
        String resultMessage = checkUser(name);
        model.addAttribute("resultMessage", resultMessage);
        return "result";
    }

}
