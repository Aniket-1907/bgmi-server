package com.bgmi.squad.bgmi.bean;


//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@Builder

@NoArgsConstructor
@AllArgsConstructor
public class BGMIDetails {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long bgmiId;
    private String inGameName;
    private String role;
    private String squadName;
    private String IGLName;

}
