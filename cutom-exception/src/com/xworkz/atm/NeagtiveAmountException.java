package com.xworkz.atm;

public class NeagtiveAmountException extends RuntimeException {

	public NeagtiveAmountException(String msg) {
		super(msg);
	}
/*
	@Override
	public String toString() {
		return "NeagtiveAmount should not be withdrawn......";
	}  */
}
