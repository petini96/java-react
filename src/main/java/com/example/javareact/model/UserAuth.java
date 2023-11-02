package com.example.javareact.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class UserAuth implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(unique = true)
    private String name;

    private String password;
}
