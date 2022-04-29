package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.APIRequest;
import com.example.entity.APIResponse;
@Service
public class APIService {

	public APIResponse processApiRequest(APIRequest apirequest)  {
		APIResponse apiresponse = new APIResponse();
		apiresponse.setUser_id("john_doe_17091999");
		apiresponse.setEmail("john@xyz.com");
		apiresponse.setRoll_number("ABCD123");
				
		List<String> numbers = new ArrayList<>();
		List<String> alphabets = new ArrayList<>();
		
		List<String> ls	= apirequest.getData();
		//go one by one element
		for (int i = 0; i < ls.size(); i++) {
			boolean ret =isNumeric(ls.get(i));
				if(ret == true) {
					numbers.add(ls.get(i));
				}else {
					alphabets.add(ls.get(i));
				}
		}
		apiresponse.setAlphabets(alphabets);
		apiresponse.setNumbers(numbers);
		return apiresponse;
	}
	
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        Integer d = Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
