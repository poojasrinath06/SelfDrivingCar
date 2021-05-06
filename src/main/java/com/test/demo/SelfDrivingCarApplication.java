package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SelfDrivingCarApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SelfDrivingCarApplication.class, args);
		SelfDrivingCar c1 = context.getBean(SelfDrivingCar.class);
		Registration r1=context.getBean(Registration.class);
		r1.setStateName("KA");
		r1.setDisNum(14);
		r1.setAlpha("EF");
		r1.setNum(4023);
		c1.setReg(r1);
        c1.start();
        c1.turnSpeed(48.2);
        c1.turn();
        c1.stop();
		
	}
}

