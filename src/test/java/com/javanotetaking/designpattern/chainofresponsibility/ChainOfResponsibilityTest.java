package com.javanotetaking.designpattern.chainofresponsibility;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
 class ChainOfResponsibilityTest {

	@Autowired
	ChainHandlerContext chainHandlerContext;

	@Test
	public void test() {
		ChainRequest chainRequest = new ChainRequest();
		chainRequest.setAmount(999);
		chainHandlerContext.execute(chainRequest);
	}
}
