package com.springbootfundamentals.controller;

import com.springbootfundamentals.exception.AppNotFoundException;
import com.springbootfundamentals.models.Application;
import com.springbootfundamentals.models.Ticket;
import com.springbootfundamentals.services.ApplicationService;
import com.springbootfundamentals.services.ReleaseService;
import com.springbootfundamentals.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/app")
public class AppController {

    private ApplicationService applicationService;
    private TicketService ticketService;

    @Autowired
    public void setApplicationService(ApplicationService applicationService) { this.applicationService = applicationService; }

    @Autowired
    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/tickets")
    public ResponseEntity<List<Ticket>> getAllTickets() {
        List<Ticket> list = ticketService.listTickets();
        return new ResponseEntity<List<Ticket>>(list, HttpStatus.OK);
    }

    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getAllApplications() {
        List<Application> list = applicationService.listApplications();
        return new ResponseEntity<List<Application>>(list, HttpStatus.OK);
    }

    @GetMapping("/application/{id}")
    public ResponseEntity<Application> getApplication(@PathVariable("id") Integer id) {
        try {
            return new ResponseEntity<Application>(applicationService.findApplication(id),
                    HttpStatus.OK);
        } catch (AppNotFoundException exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application Not Found");
        }
    }
}
