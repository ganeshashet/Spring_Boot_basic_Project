package com.Springexample;

public class Read {
	private String subject;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Read(String subject)
	{
		super();
		this.subject=subject;
	}
	public void Display()
	{
		System.out.println("Hello i am Reading a book...");
	}

}
