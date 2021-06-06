package issue;

public class BubleSorter implements Sorter{
	Comparable [] data;
	@Override
	public void sort(Comparable[] data) {
		this.data = data;

        for(int i=0;i<data.length-1;i++)
        {
            for(int j=0;j<data.length-1-i;j++)
            {
                if(data[j].compareTo(data[j+1]) > 0)
                {
                	Comparable passingplace  = data[j];
        			data[j] = data[j+1];
        			data[j+1] = passingplace;
                }
            }
        }

	}

}
