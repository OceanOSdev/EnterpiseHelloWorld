package com.seriouscompany.business.java.impl.strategies.adapters;

import com.seriouscompany.business.java.interfaces.strategies.HelloWorldExceptionSafeOutputStrategy;
import com.seriouscompany.business.java.interfaces.strategies.HelloWorldOutputStrategy;

public class HelloWorldOutputStrategyToHelloWorldExceptionSafeOutputStrategyAdapter implements HelloWorldExceptionSafeOutputStrategy{
	private final HelloWorldOutputStrategy helloWorldOutputStrategy;
	public HelloWorldOutputStrategyToHelloWorldExceptionSafeOutputStrategyAdapter(final HelloWorldOutputStrategy helloWorldOutputStrategy)
	{
		this.helloWorldOutputStrategy = helloWorldOutputStrategy;
	}
	
	public void output(final String outputStringOutput)
	{
		try
		{
			this.helloWorldOutputStrategy.output(outputStringOutput);
		}catch (final Exception exceptionFromDoingOutput) {
				// We're the enterprise...we don't get exceptions!
		}catch (final Throwable throwableFromDoingOutput) {
			// We're the enterprise...we don't get throwables either!
		}
	}
}
