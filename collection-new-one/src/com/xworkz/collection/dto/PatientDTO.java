package com.xworkz.collection.dto;



import lombok.*;

@Setter
@Getter
@AllArgsConstructor

public class PatientDTO implements Comparable<PatientDTO>{
	
	private int id;
	private String name;
	private String contactNo;
	private String address;
	private String gender;
	
	
	
	
	public PatientDTO(int id, String name, String contactNo, String address, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.gender = gender;
	}




	@Override
	public String toString() {
		return "PatientDTO [id=" + id + ", name=" + name + ", contactNo=" + contactNo + ", address=" + address
				+ ", gender=" + gender + "]";
	}
	
	

	@Override
	public int compareTo(PatientDTO o) {
		return this.id-o.id;
	}

	
	

}
