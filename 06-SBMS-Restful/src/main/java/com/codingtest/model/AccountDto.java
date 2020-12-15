package com.codingtest.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class AccountDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4694228351086910340L;

	private Long accountId;

	private String accountNumber;

	private String accountType;

}
