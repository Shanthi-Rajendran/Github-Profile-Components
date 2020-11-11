package com.github.component.GithubProfileComponents.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/github/stat")
public class GitStatController {
    @GetMapping("/public")
    public String getStatistics() {
        return "Hello-world";
    }
}
