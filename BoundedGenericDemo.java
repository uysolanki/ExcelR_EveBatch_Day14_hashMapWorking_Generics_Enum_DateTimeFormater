package day13.generics;

public class BoundedGenericDemo {
public static void main(String[] args) {
	BoundedGenericPrinter<Animal> bgp=new BoundedGenericPrinter(new Lion());
	bgp.print();
}
}
