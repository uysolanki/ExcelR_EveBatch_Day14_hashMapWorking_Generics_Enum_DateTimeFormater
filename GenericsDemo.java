package day13.generics;


public class GenericsDemo {

	public static void main(String[] args) {
//	IntegerPrinter ip=new IntegerPrinter(9);
//	ip.print();
//	
//	StringPrinter sp=new StringPrinter("Alice");
//	sp.print();
//	
//	DoublePrinter dp=new DoublePrinter(9.9);
//	dp.print();
		
		GenericPrinter<Integer,Integer> ip=new GenericPrinter(19,20);
		ip.print();
		
//		GenericPrinter<Double,String> dp=new GenericPrinter(19.5,"Alice");
//		dp.print();
//		
//		GenericPrinter<String,Integer> sp=new GenericPrinter("Ben","Chris");
//		sp.print();
	
	}
}
