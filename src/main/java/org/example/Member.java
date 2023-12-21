package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Member {
    private int id;
    private String userId;
    private String password;
    private String passwordConfirm;



}