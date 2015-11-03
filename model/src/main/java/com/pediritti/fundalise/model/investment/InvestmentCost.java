package com.pediritti.fundalise.model.investment;

import com.pediritti.fundalise.model.investment.Investment;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "INVESTMENT_COST")
@SequenceGenerator(name="COST_SEQ", initialValue=1, allocationSize=1, sequenceName="COST_SEQUENCE")
public class InvestmentCost implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "COST_SEQ")
    @Column(name="ID")
    private Integer id;

    @Column(name="INVESTMENT_ID")
    private Investment investment;

    @Column(name="BUY_IN")
    private Double buyIn;

    @Column(name="SELL_OUT")
    private Double sellOut;

    @Column(name="YEARLY_RATE")
    private Double yearlyRate;

    @Column(name="TAX")
    private Double tax;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Investment getInvestment() {
        return investment;
    }

    public void setInvestment(Investment investment) {
        this.investment = investment;
    }

    public Double getBuyIn() {
        return buyIn;
    }

    public void setBuyIn(Double buyIn) {
        this.buyIn = buyIn;
    }

    public Double getSellOut() {
        return sellOut;
    }

    public void setSellOut(Double sellOut) {
        this.sellOut = sellOut;
    }

    public Double getYearlyRate() {
        return yearlyRate;
    }

    public void setYearlyRate(Double yearlyRate) {
        this.yearlyRate = yearlyRate;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
