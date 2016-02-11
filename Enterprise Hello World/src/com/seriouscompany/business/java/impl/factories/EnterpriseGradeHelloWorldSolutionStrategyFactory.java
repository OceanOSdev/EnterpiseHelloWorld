package com.seriouscompany.business.java.impl.factories;

import com.seriouscompany.business.java.interfaces.factories.HelloWorldSolutionStrategyFactory;
import com.seriouscompany.business.java.interfaces.strategies.HelloWorldSolutionStrategy;

public class EnterpriseGradeHelloWorldSolutionStrategyFactory implements HelloWorldSolutionStrategyFactory{
	
	private final HelloWorldSolutionStrategy _helloWorldSolutionStrategy;
	
	public EnterpriseGradeHelloWorldSolutionStrategyFactory(final HelloWorldSolutionStrategy _helloWorldSolutionStrategy)
	{
		this._helloWorldSolutionStrategy = _helloWorldSolutionStrategy;
	}
	
	@Override
	public HelloWorldSolutionStrategy createHelloWorldSolutionStrategy()
	{
		return this._helloWorldSolutionStrategy;
	}
}
