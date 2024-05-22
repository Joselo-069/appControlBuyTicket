package com.example.appControlBuyTicket.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "buys")
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(targetEntity = Client.class)
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne(targetEntity = Ticket.class)
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    private String time;
    private String status;
}
