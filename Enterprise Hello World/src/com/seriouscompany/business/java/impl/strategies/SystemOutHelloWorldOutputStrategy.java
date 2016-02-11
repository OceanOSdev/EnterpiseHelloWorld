package com.seriouscompany.business.java.impl.strategies;

import java.io.IOException;
import com.seriouscompany.business.java.interfaces.strategies.HelloWorldOutputStrategy;

public class SystemOutHelloWorldOutputStrategy implements HelloWorldOutputStrategy {
	public void output(final String output) throws IOException {
		System.out.write(output.getBytes());
		System.out.flush();
	}
}
