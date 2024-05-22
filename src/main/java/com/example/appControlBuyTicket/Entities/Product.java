package com.example.appControlBuyTicket.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String price;

    @OneToMany(targetEntity = Activity.class, fetch = FetchType.LAZY, mappedBy = "product")
    private List<Activity> activities;
}
