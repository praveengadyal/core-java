package com.xworkz.atm;

public class ExceedingAmountLimitException extends RuntimeException {

	public ExceedingAmountLimitException(String msg) {
		super(msg);
	}
	/*
	@Override
	public String toString() {
		return "ExceedingAmountLimit..........";
	}
	*/
	
}
