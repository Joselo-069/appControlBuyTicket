package com.example.appControlBuyTicket.Dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BuyDto {
    private Long id;
    private Long clientId;
    private Long ticketId;
    private String time;
    private String status;
}
