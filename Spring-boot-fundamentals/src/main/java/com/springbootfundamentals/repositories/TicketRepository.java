package com.springbootfundamentals.repositories;

import com.springbootfundamentals.models.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Long> {
}
