package com.app.runner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.servcie.Servcie;
@Component
public class DATARunnner  implements   CommandLineRunner{

	  @Autowired
	  private Servcie servcie;
	  
	 @Override
	  public void run(String... args) throws Exception {
		 servcie.m2();
		
		
	}

	public Servcie getServcie() {
		return servcie;
	}

	public void setServcie(Servcie servcie) {
		this.servcie = servcie;
	}

	@Override
	public String toString() {
		return "DATARunnner [servcie=" + servcie + "]";
	}
	 

}
