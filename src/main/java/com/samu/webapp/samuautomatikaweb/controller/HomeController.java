package com.samu.webapp.samuautomatikaweb.controller;

import com.samu.webapp.samuautomatikaweb.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {



    @GetMapping("/")
    public String viewHomePage() {


        return "../static/webpages/index";
    }

    @GetMapping("/contact/")
    public String viewHomePage(@ModelAttribute("userInfo") User user ,HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        for (Cookie temp : cookies){

            if ("samuApp.userName".equals(temp.getName())){
                String myUserName =  temp.getValue();
            }
        }


        return "../static/webpages/index";
    }

    @GetMapping("/index/")
    public String viewHomePageIndex()
    {
        return "../static/webpages/index";
    }

    @GetMapping("/jobs/")
    public String viewJobsPage()
    {
        return "../static/webpages/jobs";
    }

    @GetMapping("/products/")
    public String viewProductsPage() {return "../static/webpages/products";}

    @GetMapping("/building-automation/")
    public String viewBuildingAutomationPage() {return "../static/webpages/building-automation";}

    @GetMapping("/energy-management/")
    public String viewEnergyManagementPage() {return "../static/webpages/energy-management";}

    @GetMapping("/fan-coil/")
    public String viewFanCoilPage() {return "../static/webpages/fan-coil";}

    @GetMapping("/air-treatment/")
    public String viewAirTreatmentPage() {return "../static/webpages/air-treatment";}

    @GetMapping("/thermostat/")
    public String viewThermostatPage() {return "../static/webpages/thermostat";}

    @GetMapping("/heat-central/")
    public String viewHeatCentralPage() {return "../static/webpages/heat-central";}

    @GetMapping("/references/")
    public String viewReferencesPage() {return "../static/webpages/references";}

    @GetMapping("/contact/")
    public String viewContactPage(Model model) {
        model.addAttribute("user",  new User());
        return "../static/webpages/contact";
    }

    @PostMapping
    public String processContact(User user){
        return "";
    }

    @GetMapping("/adatvedelem/")
    public String viewDataProtectionPage() {return "../static/webpages/adatvedelem";}


    @GetMapping("/cookie")
    public String cookieHandling(@ModelAttribute("userInfo") User user, HttpServletResponse response){
        Cookie nameCookie = new Cookie("samuApp.userName",user.getUserName());
        nameCookie.setMaxAge(60*60*24);

        response.addCookie(nameCookie);
        return null;
    }




}
