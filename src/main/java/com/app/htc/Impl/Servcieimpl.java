package com.app.htc.Impl;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.app.servcie.Servcie;
@Component
@Profile("htc")
public class Servcieimpl  implements Servcie {

	@Override
	public void m2() {
  System.out.println("employee");
		
	}
	

}
