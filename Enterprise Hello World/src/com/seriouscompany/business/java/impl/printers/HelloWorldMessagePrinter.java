package com.seriouscompany.business.java.impl.printers;

import com.seriouscompany.business.java.impl.strategies.SystemOutHelloWorldOutputStrategy;
import com.seriouscompany.business.java.impl.strategies.adapters.HelloWorldOutputStrategyToHelloWorldExceptionSafeOutputStrategyAdapter;
import com.seriouscompany.business.java.interfaces.strategies.HelloWorldSolutionStrategy;

public class HelloWorldMessagePrinter implements HelloWorldSolutionStrategy {

	@Override
	public void runSolution(String sMessage) {
		SystemOutHelloWorldOutputStrategy msg = new SystemOutHelloWorldOutputStrategy();
		HelloWorldOutputStrategyToHelloWorldExceptionSafeOutputStrategyAdapter adapter = new HelloWorldOutputStrategyToHelloWorldExceptionSafeOutputStrategyAdapter(msg);
		adapter.output(sMessage);
	}

}
