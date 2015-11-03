package com.pediritti.fundalise.model.investment;

import javax.persistence.*;

import java.io.Serializable;

@Entity
 @Table(name = "SOURCE")
 @SequenceGenerator(name="SRC_SEQ", initialValue=1, allocationSize=1, sequenceName="SOURCE_SEQUENCE")
public class Source implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "SRC_SEQ")
    @Column(name="ID")
    private Integer id;

    @Column(name="NAME")
    private String name;


}
