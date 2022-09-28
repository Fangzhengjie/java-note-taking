package com.javanotetaking.designpattern.chainofresponsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class SecondChainHandler extends AbstractChainHandler {
	@Override
	public void execute(ChainRequest request) {
		System.out.println("execute SecondChainHandler");
		if (request.getAmount() < 100) {
			System.out.println("number lt 100");
			return;
		}
		super.next(request);

	}
}
