package com.seriouscompany.business.java.impl.visitors;

import com.seriouscompany.business.java.interfaces.printers.DataPrinter;
import com.seriouscompany.business.java.interfaces.visitors.OutputContext;

public final class HelloWorldOutputContext implements OutputContext {
	
	private final DataPrinter printer;
	
	public HelloWorldOutputContext(final DataPrinter printer)
	{
		super();
		this.printer = printer;
	}
	
	@Override
	public DataPrinter getPrinter()
	{
		return this.printer;
	}

}
