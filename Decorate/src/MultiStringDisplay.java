import java.awt.image.SinglePixelPackedSampleModel;
import java.util.ArrayList;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

public class MultiStringDisplay extends Display{
	private ArrayList body = new ArrayList<>();
	private int column = 0;
	
	public void add(String msg) {
		body.add(msg);
		updateColumn(msg);
	}
	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return column;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return body.size();
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		return (String)body.get(row);
	}
	
	private void updateColumn(String msg) {
		if(msg.length() > column) {
			column = msg.getBytes().length;
		}
		for (int i = 0; i < body.size(); i++) {
			int fills = column - ((String)body.get(i)).getBytes().length;
			if(fills > 0) {
				body.set(i, body.get(i)+spaces(fills));
			}
			
		}
	}
	private String spaces(int n) {
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < n; i++) {
			stringBuffer.append(" ");
			
		}
		return stringBuffer.toString();
	}

}
