package com.abhi.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {

	private String listOfValidHobbies;
	@Override
	public void initialize(IsValidHobby isValidHobby){
		this.listOfValidHobbies =isValidHobby.listOfValidHobbies();
	}
	
	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx){
		
		if(studentHobby == null){
			return false;
		}
		
		if(studentHobby.matches("music|football|cricket|hockey")){
			return true;
		}
		else{
			return false;
		}	
		
	}
}
