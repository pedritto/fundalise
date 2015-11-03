package com.pediritti.fundalise.model.rate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "RATE")
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name="RATE_SEQ", initialValue=1, allocationSize=1, sequenceName="RATE_SEQUENCE")
public class Rate implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "RATE_SEQ")
    @Column(name="ID")
    private Integer id;

    @Column(name="BUY_DATE")
    private Date date;

    @Column(name="VALUE")
    private Double value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
