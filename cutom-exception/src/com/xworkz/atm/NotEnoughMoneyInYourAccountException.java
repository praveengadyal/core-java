package com.xworkz.atm;

public class NotEnoughMoneyInYourAccountException extends RuntimeException {
	
public NotEnoughMoneyInYourAccountException(String msg) {
	super(msg);
}	
/*
@Override
public String toString() {
	return "not enough money......";
}
*/
}
