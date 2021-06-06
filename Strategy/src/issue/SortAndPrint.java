package issue;

import java.awt.print.Printable;

public class SortAndPrint {
	Comparable[] data;
	Sorter sorter;
	public SortAndPrint(Comparable[] data,Sorter sorter) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.sorter = sorter;
	}
	public void execute() {
		print();
		sorter.sort(data);
		print();	
	}
	
	public void print() {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ", ");
		}
		System.out.println("");
	}

}
