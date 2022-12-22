package org.abstraction;

public class AbstractDemo2 extends AbstractDemo1 {

	@Override
	public void password() {
		System.out.println("12345");
	}

	public static void main(String[] args) {
		AbstractDemo2 a = new AbstractDemo2();
		a.username();
		a.mailid();
		a.password();
	}
}
