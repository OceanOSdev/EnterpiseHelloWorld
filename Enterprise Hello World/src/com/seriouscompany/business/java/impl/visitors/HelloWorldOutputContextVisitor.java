package com.seriouscompany.business.java.impl.visitors;

import com.seriouscompany.business.java.interfaces.printers.DataPrinter;
import com.seriouscompany.business.java.interfaces.visitors.OutputContext;
import com.seriouscompany.business.java.interfaces.visitors.OutputContextVisitor;

public class HelloWorldOutputContextVisitor implements OutputContextVisitor{
	
	@Override
	public void visit(final OutputContext context, final String sMessage)
	{
		final DataPrinter printer = context.getPrinter();
		printer.printValue(new String(sMessage));
	}

}
