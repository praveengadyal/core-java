package com.xworkz.hospital.dto;

import com.xworkz.hospital.constant.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {

	private int id;
	private String name;
	private String contactNo;
	private String address;
	private Gender gender;
	
	
	

}
