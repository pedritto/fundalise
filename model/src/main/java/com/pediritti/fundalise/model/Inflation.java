package com.pediritti.fundalise.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INFLATION")
@SequenceGenerator(name="INF_SEQ", initialValue=1, allocationSize=1, sequenceName="INFLATION_SEQUENCE")
public class Inflation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "INF_SEQ")
    @Column(name="ID")
    private Integer id;

    @Column(name="YEAR")
    private Integer year;

    @Column(name="VALUE")
    private Double value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
