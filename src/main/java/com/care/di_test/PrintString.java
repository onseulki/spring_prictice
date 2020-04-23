package com.care.di_test;

public class PrintString {
	private String print;
	private PrintBean ps;
	
	public void Aprint() {
		ps.PringString(print);
	}	
	
	public String getPrint() {
		return print;
	}
	public void setPrint(String print) {
		this.print = print;
	}

	public PrintBean getPs() {
		return ps;
	}

	public void setPs(PrintBean ps) {
		this.ps = ps;
	}
}
