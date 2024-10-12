package com.bgmi.squad.bgmi.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder

@NoArgsConstructor
@AllArgsConstructor
public class PlayerDTO {

    private String firstName;
    private String lastName;
    private int age;
    private int bgmiId;
    private String inGameName;
    private String role;
    private String squadName;
    private String IGLName;
}
