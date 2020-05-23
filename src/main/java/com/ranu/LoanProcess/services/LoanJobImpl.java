package com.ranu.LoanProcess.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class LoanJobImpl implements Loanjob {

	@Bean
	LoanProcessTaskRunner getLoanProcessTaskRunner() {		
		return new LoanProcessTaskRunner();
	}
	
	@Override
	public boolean validateNumber(String phNumber) {
		// TODO Auto-generated method stub
		  return phNumber.length() > 5;
	}

}
