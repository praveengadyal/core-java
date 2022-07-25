package com.xworkz.hospital.crud;

import com.xworkz.hospital.constant.Gender;
import com.xworkz.hospital.dto.PatientDTO;

public interface Hospital {
	
	public boolean creatPatient(PatientDTO dto);

	public void getPatientDetails();

	public PatientDTO getPatientDetailsById(int id);

	public String getPatientNameById(int id);

	public String getPatientContactNoByName(String name);

	public  boolean updatePatientAddressById(int id,String address);

	public boolean updatePatientContactNoByName(String name,String contactNo);

	public boolean deletePatientByName(String name);

	public boolean deletePatientById(int id);

	public boolean deletePatientByGender(Gender gender);

}
