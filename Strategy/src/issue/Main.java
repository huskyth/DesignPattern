package issue;

public class Main {
	public static void main(String[] args) {
//		String data[] = {
//				"D","B","C","E","A"
//		};
//		SortAndPrint sPrint = new SortAndPrint(data, new SelectionSorter());
//		sPrint.execute();
		String data2[] = {
				"Da","Bs","Cd","Ef","Ag"
		};
		SortAndPrint sPrint = new SortAndPrint(data2, new QuickSorter());
		sPrint.execute();
	}
}
