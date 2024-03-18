package day13.generics;

public class BoundedGenericPrinter<T extends Animal> {
		T toPrint;

		public BoundedGenericPrinter(T toPrint) {
			this.toPrint = toPrint;
		}
		
		
		public void print()
		{
			System.out.println(toPrint.eat());
		}
		
		
}
