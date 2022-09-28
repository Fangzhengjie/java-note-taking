package com.javanotetaking.designpattern.chainofresponsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(3)
@Component
public class ThirdChainHandler extends AbstractChainHandler {
	@Override
	public void execute(ChainRequest request) {
		System.out.printf("execute ThirdChainHandler");
		if (request.getAmount() < 1000) {
			System.out.println("number lt 1000");
			return;
		}
		super.next(request);
	}
}
