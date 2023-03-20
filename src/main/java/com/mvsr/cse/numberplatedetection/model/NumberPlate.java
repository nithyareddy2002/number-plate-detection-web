package com.mvsr.cse.numberplatedetection.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;


@Data
//@JsonIgnoreProperties({"hibernateLazyInitializer"})
@RequiredArgsConstructor
@Entity
@Table(name="number_plate")
public class NumberPlate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String numberPlate;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="loc_id")
    private Location location;
    private LocalDateTime locatedDt;
    private LocalDateTime createdDt;



}
