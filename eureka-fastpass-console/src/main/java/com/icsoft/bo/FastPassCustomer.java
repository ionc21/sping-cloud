package com.icsoft.bo;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class FastPassCustomer {
	
	private String fastPassId;
	private String customerFullName;
	private String fastPassPhone;
	private BigDecimal currentBalance;
}

