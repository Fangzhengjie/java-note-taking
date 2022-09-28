package com.javanotetaking.designpattern.chainofresponsibility;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class FirstChainHandler extends AbstractChainHandler {
	@Override
	public void execute(ChainRequest request) {
		System.out.println("execute FirstChainHandler");
		if (request.getAmount() < 10) {
			System.out.println("number lt 10");
			return;
		}
		super.next(request);
	}
}
