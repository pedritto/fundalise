package com.pediritti.fundalise.model;

import com.pediritti.fundalise.model.investment.Investment;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "PORTFOLIO")
@SequenceGenerator(name="PORT_SEQ", initialValue=1, allocationSize=1, sequenceName="PORTFOLIO_SEQUENCE")
public class Portfolio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "PORT_SEQ")
    @Column(name="ID")
    private Integer id;

    @Column(name="USER_ID")
    private User user;

    @Column(name="NAME")
    private String name;

    @Column(name="INVESTMENTS")
    private List<Investment> investments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Investment> getInvestments() {
        return investments;
    }

    public void setInvestments(List<Investment> investments) {
        this.investments = investments;
    }
}
