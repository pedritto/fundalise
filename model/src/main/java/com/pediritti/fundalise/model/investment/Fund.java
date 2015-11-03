package com.pediritti.fundalise.model.investment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="ID")
@Table(name = "FUND")
public class Fund extends Investment {

    @Column(name = "ISIN")
    private String isin;

    @Column(name = "SOURCE_ID")
    private Source source;

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
