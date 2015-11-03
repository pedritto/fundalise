package com.pediritti.fundalise.model.investor;

import com.pediritti.fundalise.model.investor.Investor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INVESTOR_CHARGE")
@SequenceGenerator(name="CHARGE_SEQ", initialValue=1, allocationSize=1, sequenceName="CHARGE_SEQUENCE")
public class InvestorCharge implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "CHARGE_SEQ")
    @Column(name="ID")
    private Integer id;

    @Column(name="INVESTOR_ID")
    private Investor investor;

    @Column(name="FEE")
    private Double fee;

    @Column(name="FREQUENCY")
    private Integer frequency;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }
}
