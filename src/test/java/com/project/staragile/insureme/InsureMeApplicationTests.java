package com.project.staragile.insureme;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InsureMeApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testCreatePolicy() {
		Policy policy = new Policy(1, "Gururaj.K.H", "Individual" , 10000, "14-January-2023", "6-April-2023");
		PolicyService pService = new PolicyService();
		//Policy outputPolicy = pService.CreatePolicy();
		assertEquals(policy.getPolicyId(), pService.generateDummyPolicy().getPolicyId());
		
	}
	
	@Test
	void testSearchPolicy() {
		PolicyService pService = new PolicyService();
		assertEquals(null,pService.searchPolicy());
	}

	
}
