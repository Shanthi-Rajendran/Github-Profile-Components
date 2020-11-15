package com.github.component.GithubProfileComponents.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/github/introduction")
public class GitIntroController {
    @RequestMapping("/public")
    public String getStatistics() {
        return "introduction/index";
    }
}
