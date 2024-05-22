package com.example.appControlBuyTicket.Dto;

import com.example.appControlBuyTicket.Entities.Product;
import com.example.appControlBuyTicket.Entities.Ticket;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ActivityDto {

    private Long id;
    private String name;
    private String stock;
    private String date;
    private Long productId; // Referencia al ID del producto
    private List<Long> ticketIds; // Referencia a los IDs de los tickets
}
