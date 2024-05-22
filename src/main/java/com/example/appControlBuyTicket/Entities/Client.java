package com.example.appControlBuyTicket.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastname;
    private String phone;

    @OneToMany(targetEntity = Buy.class, fetch = FetchType.LAZY, mappedBy = "client")
    private List<Buy> buys;

}
