package com.jpa.conference.controller;

import com.jpa.conference.model.Registration;
import com.jpa.conference.model.RegistrationReport;
import com.jpa.conference.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration")Registration registration) {
        return "registration";
    }

    @GetMapping("registration-reports")
    public @ResponseBody
    List<RegistrationReport> getRegistrationReports() {
         List<RegistrationReport> registrationsReports = registrationService.findAllReports();
         return registrationsReports;
    }

    @GetMapping("registrations")
    public @ResponseBody
    List<Registration> getRegistration() {
        List<Registration> registrations = registrationService.findAll();
        return registrations;
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute ("registration")
                                              Registration registration,
                                  BindingResult result) {

        if(result.hasErrors()) {
            System.out.println("There were errors");
            return "registration";
        } else {
            registrationService.addRegistration(registration);
        }

        System.out.println("Registration: " + registration.getName());

        return "redirect:registration";
    }

    @PostMapping("registration/update")
    public @ResponseBody Registration updateRegistration(@Valid @ModelAttribute("registration")
                                                         Registration registration, BindingResult result) {
        return registrationService.addRegistration(registration);
    }

}
