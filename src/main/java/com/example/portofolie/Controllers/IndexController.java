package com.example.portofolie.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/Mo")
    public String portofolie() {
        return "FrontPage";
    }

    @GetMapping("/AboutMe")
    public String aboutMe() {
        return "AboutMe";
    }

    @GetMapping("/Projects")
    public String projects() {
        return "Projects";
    }

    @GetMapping("/ArtGallery")
    public String artGallery() {
        return "ArtGallery";
    }
}
