package com.ranu.LoanProcess.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class LoanProcessTaskRunner implements CommandLineRunner {
	   @Autowired
	   Loanjob loanProcessService;
	@Override
	public void run(String... args) throws Exception {
		 if(args.length>0) {
	            System.out.println("task running with arguments");

	            if (loanProcessService.validateNumber(args[0])) {
	                System.out.println("valid phone number");
	            } else
	                System.out.println("invalid phone number");
	        }else
	            System.out.println("task running without arguments");
		
	}

}
