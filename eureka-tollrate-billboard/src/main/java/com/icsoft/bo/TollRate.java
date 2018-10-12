package com.icsoft.bo;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class TollRate {
	
	private int stationId;
	private BigDecimal currentRate;
	private String timestamp;
	
}
