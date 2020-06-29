package com.kh.mvc02.validate;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
//유효성 검사
@Service
public class FileValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}

	//검사
	@Override
	public void validate(Object uploadFile, Errors errors) {
		//Object target(uploadFile):검사를 할 친구
		//Errors:잘못된 코드를 담아 줄것
		UploadFile file =(UploadFile)uploadFile;
		if(file.getFile().getSize()==0) {
			errors.rejectValue("file", "errorCode","Please Select a file");
			
		}
		
	}

}
