package com.github.component.GithubProfileComponents.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/github/introduction")
public class GitIntroController {
    @GetMapping("/public")
    public String getStatistics() {
        return "<svg width=\"700px\" height=\"40px\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "   <foreignObject width=\"100%\" height=\"100%\">\n" +
                "     <div xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "         <style>\n" +
                "            p{\n" +
                "                color: red;\n" +
                "                }\n" +
                "         </style>\n" +
                "         <p>hi</p>\n" +
                "     </div>\n" +
                "   </foreignObject>\n" +
                "</svg>";
    }
}
