package com.pediritti.fundalise.model.investment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="ID")
@Table(name = "FOREIGN_EXCHANGE")
public class ForeignExchange extends Investment {

    @Column(name = "CURRENCY_CODE")
    private String currencyCode;

}
