package com.xworkz.hospital;

import java.util.Scanner;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.crud.impl.HospitalImpl;
import com.xworkz.hospital.dto.PatientDTO;

public class HospitalTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of patients to be added");
		int size=sc.nextInt();

		HospitalImpl hos=new HospitalImpl(size);

		for(int i=0;i<size;i++){

		PatientDTO dto=new PatientDTO();
		System.out.println("enter the patient id");
		int id=sc.nextInt();
		System.out.println("enter the patient name");
		String name=sc.next();
		System.out.println("enter the patient contact number");
		String contactN0=sc.next();
		System.out.println("enter the patient address");
		String address=sc.next();
		System.out.println("enter the gender");
		String gender=sc.next();

		dto.setGender(Gender.valueOf(gender));
		dto.setId(id);
		dto.setName(name);
		dto.setContactNo(contactN0);
		dto.setAddress(address);
		hos.creatPatient(dto);
		}

		String option=null;


		do{

		System.out.println("enter * to get all patientsDetails");
		System.out.println("enter | to updatePatientContactNoByName");
		System.out.println("enter / to updatePatientAddressById");
		System.out.println("enter - to deletePatientByName");
		System.out.println("enter + to deletePatientById");
		System.out.println("enteer 0 to getPatientDetailsById");
		System.out.println("enter 1 to getPatientNameById");
		System.out.println("enter 2 to getPatientContactNoByName");
		System.out.println("enter 3 to deletePatientByGender");

		System.out.println("enter the symbol to perform your task.....");
		String choice=sc.next();

		  switch(choice){

		    case "*" :    hos.getPatientDetails();
		                  break;

		    case "|" :    System.out.println("provide the name you want to check");
		                  String name1=sc.next();
		                  System.out.println("enter the new/updated Conatct Number");
		                  String contactNo1=sc.next();
		                  hos.updatePatientContactNoByName(name1,contactNo1);
		                  
		                  break;
		                  
		    case "/" :     System.out.println("provide the id you want to check");
					 int id1=sc.nextInt();
					 System.out.println("enter the new/updated Address");
			   	       String address1=sc.next();   
					 hos.updatePatientAddressById(id1,address1);
					 
		                   break;

		    case "-" :     System.out.println("enter the patientName to be deleted");
		                   String name=sc.next();
					 hos.deletePatientByName(name);
					  
					 break;

		   case "+" :      System.out.println("enter the patientId");
					 int id=sc.nextInt();
					 hos.deletePatientById(id);
					
					 break;

		   case "0" :      System.out.println("enter the Id to getPatientDetails");
		                   int exId=sc.nextInt();
		                   hos.getPatientDetailsById(exId);
		                   break;
		  
		   case "1" :      System.out.println("enter the Id to getPatientName");
		         		 int idx=sc.nextInt();
					 hos.getPatientNameById(idx);
					 
					break;
		   
		    case "2" :   System.out.println("enter the name to getPatientContactNo");
					String namex=sc.next();
					hos.getPatientContactNoByName(namex);
					 
					break;

		   case "3" :	 System.out.println("enter the Gender so that patient can be deleted.....");
		             	 String ge=sc.next();
		                   hos.deletePatientByGender(Gender.valueOf(ge));
		                   hos.getPatientDetails();
		           		break;

		   default : System.out.println("enter valid input......WRONG input.....");
		                break;
		}
		System.out.println("enter--> yes to continue ---> No to exist");
		option=sc.next();


		}while(option.equals("yes"));



		}

		

	}


