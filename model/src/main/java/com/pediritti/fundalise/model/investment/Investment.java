package com.pediritti.fundalise.model.investment;


import com.pediritti.fundalise.model.investor.Investor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "INVESTMENT")
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator(name="INVESTMENT_SEQ", initialValue=1, allocationSize=1, sequenceName="INVESTMENT_SEQUENCE")
public class Investment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "INVESTMENT_SEQ")
    @Column(name="ID")
    private Integer id;

    @Column(name="QUANTITY")
    private Double quantity;

    @Column(name="NAME")
    private String name;

    @Column(name="INVESTOR_ID")
    private Investor investor;

    @Column(name="BUY_DATE")
    private Date buyInDate;

    @Column(name="SELL_DATE")
    private Date sellOutDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }

    public Date getBuyInDate() {
        return buyInDate;
    }

    public void setBuyInDate(Date buyInDate) {
        this.buyInDate = buyInDate;
    }

    public Date getSellOutDate() {
        return sellOutDate;
    }

    public void setSellOutDate(Date sellOutDate) {
        this.sellOutDate = sellOutDate;
    }
}
