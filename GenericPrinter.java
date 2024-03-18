package day13.generics;

public class GenericPrinter<T, V> {
	T toPrint;
	T toPrintNext;
	public GenericPrinter(T toPrint, T toPrintNext) {
		this.toPrint = toPrint;
		this.toPrintNext = toPrintNext;
	}
	
	public void print()
	{
		System.out.println(toPrint);
		System.out.println(toPrintNext);
	}
	

}
