package com.fdm.demospringBoot;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candle {
	
	@Id
	private int candleId;
	
	private String candleName;

	public String getCandleName() {
		return candleName;
	}

	public void setCandleName(String candleName) {
		this.candleName = candleName;
	}

	public int getCandleId() {
		return candleId;
	}

	public void setCandleId(int candleId) {
		this.candleId = candleId;
	}

}
