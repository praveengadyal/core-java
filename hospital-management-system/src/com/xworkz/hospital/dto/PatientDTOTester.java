package com.xworkz.hospital.dto;

import java.util.Scanner;

import com.xworkz.hospital.constant.Gender;

 

public class PatientDTOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		//System.out.println("enter the number of Patients");
		
		
		PatientDTO dto=new PatientDTO();

		System.out.println("enter the PatientId");
		int id=sc.nextInt();
		System.out.println("enter the patient name");
		String name=sc.next();
		System.out.println("enter the contact number");
		String contactNo=sc.next();
		System.out.println("enter the Address");
		String address=sc.next();
		System.out.println("enter the Gender");
		String gender=sc.next();
		
		dto.setId(id);
		dto.setName(name);
		dto.setContactNo(contactNo);
		dto.setAddress(address);
		dto.setGender(Gender.valueOf(gender));
		
		System.out.println(dto);
		
	}

}
