package com.xworkz.airport.dto;

public class TerminalDTO {
	
	
	
	public TerminalDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	private int id;
	private String terminalName;
	private int noOfTerminal;
	private String type;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public int getNoOfTerminal() {
		return noOfTerminal;
	}
	public void setNoOfTerminal(int noOfTerminal) {
		this.noOfTerminal = noOfTerminal;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "TerminalDTO [id=" + id + ", terminalName=" + terminalName + ", noOfTerminal=" + noOfTerminal + ", type="
				+ type + "]";
	}

	

}
