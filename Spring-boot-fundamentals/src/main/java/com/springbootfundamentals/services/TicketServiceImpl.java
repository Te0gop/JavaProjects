package com.springbootfundamentals.services;

import com.springbootfundamentals.models.Ticket;
import com.springbootfundamentals.repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public List<Ticket> listTickets() {
        return (List<Ticket>) ticketRepository.findAll();
    }
}
