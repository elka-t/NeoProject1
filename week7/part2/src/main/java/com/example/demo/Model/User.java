package com.example.demo.Model;


import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@AllArgsConstructor

@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
}
