package com.pediritti.fundalise.model.rate;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="ID")
@Table(name = "DAILY_RATE")
public class DailyRate extends Rate {
}
