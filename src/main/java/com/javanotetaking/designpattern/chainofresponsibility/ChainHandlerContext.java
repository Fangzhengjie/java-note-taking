package com.javanotetaking.designpattern.chainofresponsibility;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class ChainHandlerContext implements ApplicationContextAware, InitializingBean {
	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@Override
	public void afterPropertiesSet() {
		Map<String, AbstractChainHandler> chainHandlerMap = applicationContext.getBeansOfType(AbstractChainHandler.class);
		List<AbstractChainHandler> chainHandlerList = chainHandlerMap.values().stream().collect(Collectors.toList());
		for (int i = 0, size = chainHandlerList.size(); i < size; i++) {
			AbstractChainHandler handler = chainHandlerList.get(i);
			if (i < size - 1) {
				AbstractChainHandler nextHandler = chainHandlerList.get(i + 1);
				handler.setNextHandler(nextHandler);
			}
		}
		chainHandler = chainHandlerList.get(0);
	}


	private AbstractChainHandler chainHandler;


	public void execute(ChainRequest chainRequest) {
		chainHandler.execute(chainRequest);
	}


}
