package com.samu.webapp.samuautomatikaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String viewHomePage()
    {
        return "../static/webpages/index";
    }

    @GetMapping("/jobs")
    public String viewJobsPage()
    {
        return "../static/webpages/jobs";
    }


}
