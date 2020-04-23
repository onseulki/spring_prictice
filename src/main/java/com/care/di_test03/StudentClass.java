package com.care.di_test03;

import java.util.ArrayList;

public class StudentClass implements Student{
	private ArrayList<String> food;
	private String name;
	private PrintClass pc;
		
	public StudentClass(String name, ArrayList food) {
		this.name = name;
		this.food = food;
	}	
	@Override
	public void execute() {
		pc.print(name, food);
	}
	
	public ArrayList<String> getFood() {
		return food;
	}
	public void setFood(ArrayList<String> food) {
		this.food = food;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PrintClass getPc() {
		return pc;
	}
	public void setPc(PrintClass pc) {
		this.pc = pc;
	}
	public void print() {
		// TODO Auto-generated method stub
		
	}
	


}
