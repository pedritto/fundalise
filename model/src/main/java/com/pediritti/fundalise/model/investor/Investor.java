package com.pediritti.fundalise.model.investor;

import com.pediritti.fundalise.model.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "INVESTOR")
@SequenceGenerator(name="INVESTOR_SEQ", initialValue=1, allocationSize=1, sequenceName="INVESTOR_SEQUENCE")
public class Investor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "INVESTOR_SEQ")
    @Column(name="ID")
    private Integer id;

    @Column(name="NAME")
    private String name;

    @Column(name="USER_ID")
    private User user;

    @Column(name="CHARGES")
    private List<InvestorCharge> charges;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<InvestorCharge> getCharges() {
        return charges;
    }

    public void setCharges(List<InvestorCharge> charges) {
        this.charges = charges;
    }
}
