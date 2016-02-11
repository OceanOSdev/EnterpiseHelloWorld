package com.seriouscompany.business.java.impl;

import com.seriouscompany.business.java.interfaces.HelloWorld;
import com.seriouscompany.business.java.interfaces.factories.HelloWorldSolutionStrategyFactory;
import com.seriouscompany.business.java.interfaces.strategies.HelloWorldSolutionStrategy;

public class StandardHelloWorld implements HelloWorld {

	private final HelloWorldSolutionStrategyFactory _helloWorldSolutionStrategyFactory;
	
	public StandardHelloWorld(final HelloWorldSolutionStrategyFactory _helloWorldSolutionStrategyFactory) 
	{
		this._helloWorldSolutionStrategyFactory = _helloWorldSolutionStrategyFactory;
	}
	
	@Override
	public void standardHelloWorldPrintMessage(String sMessage) {
		// TODO Auto-generated method stub
		final HelloWorldSolutionStrategy mySolutionStrategy = this._helloWorldSolutionStrategyFactory.createHelloWorldSolutionStrategy();
		mySolutionStrategy.runSolution(sMessage);
	}

}
