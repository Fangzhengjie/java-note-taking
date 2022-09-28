package com.javanotetaking.designpattern.chainofresponsibility;

import org.springframework.stereotype.Component;


@Component
public abstract class AbstractChainHandler {


	private AbstractChainHandler next;

	public AbstractChainHandler getNext() {
		return next;
	}

	public void setNextHandler(AbstractChainHandler next) {
		this.next = next;
	}


	public abstract void execute(ChainRequest request);


	/**
	 * 链条的处理方法，单向链表的遍历。
	 */
	protected void next(ChainRequest chainRequest) {
		if (next == null) {
			return;
		}
		// 递归处理下一级链条
		next.execute(chainRequest);
	}
}
