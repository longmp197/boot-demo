package com.mpl.bootdemo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String firstName;
    private String lastName;

    public User(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
