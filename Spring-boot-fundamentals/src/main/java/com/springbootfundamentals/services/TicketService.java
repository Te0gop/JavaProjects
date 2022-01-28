package com.springbootfundamentals.services;

import com.springbootfundamentals.models.Ticket;

import java.util.List;

public interface TicketService{
    List<Ticket> listTickets();
}
