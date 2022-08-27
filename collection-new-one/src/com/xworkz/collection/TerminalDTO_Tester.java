package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.dto.TerminalDTO;

public class TerminalDTO_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List list=new ArrayList();
		list.add(new TerminalDTO(4,"kemppegouda",2,"international"));
		list.add(new TerminalDTO(88,"abcd",3,"domestic"));
		list.add(new TerminalDTO(22,"wxyz",1,"xxxxxx"));
		list.add(new TerminalDTO(44,"bbb",4,"ggggg"));
		list.add(new TerminalDTO(34,"zzz",1,"ddhjdshh"));
		list.add(new TerminalDTO(38,"kkkk",2,"nnnnn"));
		list.add(new TerminalDTO(54,"hhhh",3,"adbc"));
		
		
        Collections.sort(list);
		
		list.forEach(System.out::println);
	}

}
