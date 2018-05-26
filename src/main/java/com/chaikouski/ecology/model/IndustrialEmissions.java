package com.chaikouski.ecology.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class IndustrialEmissions {

    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    private Long id;
    @ManyToOne
    private Location location;
    @ManyToOne
    private Associate associate;
    @ManyToOne
    private PollutionAgent pollutionAgent;
    private BigDecimal value;
    private String unit;
    private LocalDate dateOfMeasurements;
}
