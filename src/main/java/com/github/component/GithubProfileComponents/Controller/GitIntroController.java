package com.github.component.GithubProfileComponents.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/github/introduction")
public class GitIntroController {
    @GetMapping("/public")
    public String getStatistics() {
        return "<svg width=\"700px\" height=\"150px\" fill=\"none\" xmlns=\"http://www.w3.org/2000/svg\">\n" +
                "   <foreignObject width=\"100%\" height=\"100%\">\n" +
                "     <div xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
                "         <style>\n" +
                "            .card {\n" +
                "                box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);\n" +
                "                transition: 0.3s;\n" +
                "                width: 40%;\n" +
                "            }\n" +
                "            .card:hover {\n" +
                "                box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);\n" +
                "            }\n" +
                "            .container {\n" +
                "              padding: 2px 16px;\n" +
                "            }\n" +
                "         </style>\n" +
                "         <div class=\"card\">\n" +
                "             <div class=\"container\">\n" +
                "                 <h4><b>John Doe</b></h4>\n" +
                "                 <p>Architect & Engineer</p>\n" +
                "             </div>\n" +
                "         </div>\n" +
                "     </div>\n" +
                "   </foreignObject>\n" +
                "</svg>\n" +
                "\n";
    }
}
