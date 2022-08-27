package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.dto.PatientDTO;

public class PatientDTO_Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List list=new ArrayList();
		list.add(new PatientDTO(5,"vijay","1234567890","belagavi","male"));	
		list.add(new PatientDTO(9,"nagya","1132344252","bijapur","male"));	
		list.add(new PatientDTO(70,"malik","6744883929","bagewadi","male"));	
		list.add(new PatientDTO(23,"rahul","5326723689","jamkhandi","male"));	
		list.add(new PatientDTO(55,"vinayak","4837442901","banglore","male"));	
		list.add(new PatientDTO(66,"subhas","745463878739","viajanagar","male"));
		
        Collections.sort(list);
		
		list.forEach(System.out::println);
	
	}

}
