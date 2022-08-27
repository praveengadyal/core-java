package com.xworkz.collection.dto;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class TerminalDTO implements Comparable<TerminalDTO> {
	

	private int id;
	private String terminalName;
	private int noOfTerminal;
	private String type;
	
	
	
	public TerminalDTO(int id, String terminalName, int noOfTerminal, String type) {
		super();
		this.id = id;
		this.terminalName = terminalName;
		this.noOfTerminal = noOfTerminal;
		this.type = type;
	}



	@Override
	public String toString() {
		return "TerminalDTO [id=" + id + ", terminalName=" + terminalName + ", noOfTerminal=" + noOfTerminal + ", type="
				+ type + "]";
	}


	@Override
	public int compareTo(TerminalDTO o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

	
	
}
