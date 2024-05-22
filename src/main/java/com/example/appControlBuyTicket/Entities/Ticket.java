package com.example.appControlBuyTicket.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @ManyToOne(targetEntity = Activity.class)
    @JoinColumn(name = "activity_id")
    private Activity activity;

    @OneToMany(targetEntity = Buy.class, fetch = FetchType.LAZY, mappedBy = "ticket")
    private List<Buy> buys;

}
