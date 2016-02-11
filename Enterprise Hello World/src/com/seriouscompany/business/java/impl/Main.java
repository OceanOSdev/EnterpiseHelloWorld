package com.seriouscompany.business.java.impl;

import com.seriouscompany.business.java.impl.factories.EnterpriseGradeHelloWorldSolutionStrategyFactory;
import com.seriouscompany.business.java.impl.printers.HelloWorldMessagePrinter;
import com.seriouscompany.business.java.impl.stringreturners.NewLineStringReturner;
import com.seriouscompany.business.java.interfaces.HelloWorld;

public class Main {
	public static void main(final String[] args)
	{
		HelloWorldMessagePrinter myHelloWorldMessagePrinter = new HelloWorldMessagePrinter();
		EnterpriseGradeHelloWorldSolutionStrategyFactory myEnterpriseGradeHelloWorldSolutionStrategyFactory = new EnterpriseGradeHelloWorldSolutionStrategyFactory(myHelloWorldMessagePrinter);
		final HelloWorld myEnterpriseHelloWorldMessage = new StandardHelloWorld(myEnterpriseGradeHelloWorldSolutionStrategyFactory);
		myEnterpriseHelloWorldMessage.standardHelloWorldPrintMessage("Hello World");
		myEnterpriseHelloWorldMessage.standardHelloWorldPrintMessage(new NewLineStringReturner().getReturnString());
	}
	
}
