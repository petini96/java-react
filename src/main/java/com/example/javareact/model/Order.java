package com.example.javareact.model;

import lombok.Data;

import javax.persistence.*;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "orders") 
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @JsonProperty("ini_date")
    private LocalDateTime iniDate;

    @JsonProperty("end_date")
    private LocalDateTime endDate;

    @JsonProperty("discount_value")
    private Double discountValue;

    @JsonProperty("product_name")
    private String productName;
 
    @JoinColumn(name = "costumer_id", insertable = false, updatable = false)
    @ManyToOne(targetEntity = Costumer.class, fetch = FetchType.EAGER)
    private Costumer costumer;
    
    @Column(name = "costumer_id")
    @JsonProperty("costumer_id")
    private Long costumerId;

}
