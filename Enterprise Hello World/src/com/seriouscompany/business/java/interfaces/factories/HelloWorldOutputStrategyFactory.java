package com.seriouscompany.business.java.interfaces.factories;

import com.seriouscompany.business.java.interfaces.strategies.HelloWorldOutputStrategy;

public interface HelloWorldOutputStrategyFactory {
	public HelloWorldOutputStrategy createOutputStrategy();
}
