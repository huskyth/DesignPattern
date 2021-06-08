import javax.net.ssl.SNIHostName;

public class TextBuilder extends Builder{
	private StringBuffer sb = new StringBuffer();

	@Override
	public void buildTitle(String title) {
		// TODO Auto-generated method stub
		sb.append("===========================\n");
		sb.append("[" +title +"]\n");
		
	}

	@Override
	public void buildString(String str) {
		// TODO Auto-generated method stub
		sb.append("sq" + str + "\n");
		sb.append("\n");
		
	}

	@Override
	public void buildItem(String[] item) {
		// TODO Auto-generated method stub
		for (int i = 0; i < item.length; i++) {
			sb.append(" ."+item[i] +"\n");
		}
		sb.append("\n");
	}

	@Override
	public void buildDone() {
		// TODO Auto-generated method stub
		sb.append("===========================\n");
	}
	public String getresult() {
		return sb.toString();
	}

}
