package com.emlakjet.rabbitmqconsumer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

// we define this is our entity class for spring
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "advertisements")
public class Advertisement {
    // we have to id parameter and our id generated by spring automaticly.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdAt;
    private long price;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}