package com.example.appControlBuyTicket.Entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "activities")
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String stock;
    private String date;

    @OneToMany(targetEntity = Ticket.class, fetch = FetchType.LAZY, mappedBy = "activity")
    private List<Ticket> tickets;

    @ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "product_id")
    private Product product;

}
