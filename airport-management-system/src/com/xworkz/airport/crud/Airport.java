package com.xworkz.airport.crud;

import com.xworkz.airport.dto.TerminalDTO;

public interface Airport {
	



		public boolean creatTerminal(TerminalDTO dto);

		public void getTerminalDetails();

		public TerminalDTO getTerminalDetailsById(int id);

		public  boolean updateNoOfTerminalById(int id,int noOfTerminal);

		public boolean updateTypeByTerminalName(String terminalName,String type);

		public boolean deleteTerminalById(int id);

		public boolean deleteTerminalByType(String type);



		}


