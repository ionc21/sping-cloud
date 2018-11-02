package com.icsoft.bo;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class TollRate {
	
	private int stationId;
	private BigDecimal currentRate;
	private String timestamp;
	
}
