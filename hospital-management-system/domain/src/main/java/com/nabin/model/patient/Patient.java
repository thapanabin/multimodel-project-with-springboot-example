package com.nabin.model.patient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
public class Patient {

    @Id
    private int id;
    private String name;
    private String nameOfDisease;


}
