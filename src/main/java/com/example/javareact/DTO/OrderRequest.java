package com.example.javareact.DTO;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class OrderRequest {

    private Long id;
    private Double discountValue;
    private LocalDateTime iniDate;
    private LocalDateTime endDate;
    private String productName;
    private Long customerId;
}
