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
    public String viewContactPage() {return "../static/webpages/contact";}

    @GetMapping("/adatvedelem/")
    public String viewDataProtectionPage() {return "../static/webpages/adatvedelem";}






}
