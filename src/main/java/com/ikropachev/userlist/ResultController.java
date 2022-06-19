package com.ikropachev.userlist;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.ikropachev.userlist.CheckUserUtil.checkUser;
import static org.slf4j.LoggerFactory.getLogger;

@Controller
@Tag(name = "Result controller", description = "Get page with result of search")
public class ResultController {
    private static final Logger log = getLogger(ResultController.class);

    @GetMapping("/result")
    @Operation(summary = "View result")
    public String getResult(@RequestParam(name = "name", required = false, defaultValue = "user:emptyDefault")
                            @Parameter(example = "Администратор", required = true) String name, Model model) {
        log.info("try to get result with name {}", name);
        String resultMessage = checkUser(name);
        model.addAttribute("resultMessage", resultMessage);
        return "result";
    }
}
