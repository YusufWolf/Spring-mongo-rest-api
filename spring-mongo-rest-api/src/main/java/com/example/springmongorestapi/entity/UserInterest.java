package com.example.springmongorestapi.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
//@SecondaryTable(name = "UserInterest")
@Table(name = "UserInterest")
public class UserInterest {

    @Id
    private long  Id;

    @Column(name = "intrest_name", length = 25, nullable = false)
    private String prof;

    @Column(name = "hours", length = 25, nullable = false)
    private int hour;

    @Column(name = "average", length = 25, nullable = false)
    private int average;

    @OneToOne
    @JoinColumn(name = "user_Id")
    private User user; // Foreign key referencing the User table
    /*
    @ForeignKey
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Primary key of the Address table

    private String street;
    private String city;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user; // Foreign key referencing the User table

    // Other attributes and getters/setters

  */

}
