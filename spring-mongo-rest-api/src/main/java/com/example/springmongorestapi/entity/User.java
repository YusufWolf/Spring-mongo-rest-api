package com.example.springmongorestapi.entity;


import jakarta.persistence.*;
import lombok.*;
//import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "User")
// bunun bir collection'a denk geleceğini belirtiyoruz.
public class User {  // aslında User  sınıfı iliskisel veritabanında bir tabloya denk geliyor. Collection'dır



    @Id  //  User bir tablo islevi gordugu icin  bu tablonun primeryKey'i olmalı @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id ;

    //İd yi long tut tamam ama normalde bu hatayı vermiyordu yok alakasız bir konu ama string tutma diye dedim tamam
    @Column(name = "name",length = 25 , nullable = false)
    private String name;

    @Column(name = "surname", length = 25)
    private String surname;

    @Column(name = "age",length = 3)
    private int age;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private UserInterest userInterest ;



    //private HashMap features; // Icinde bir cok farklı degisken tutabilen grup gibi dusunulebilir
    // reposirtry'mizin bu Collection'a ulasabilmesi icin getter setter metodları gerekli.


}
