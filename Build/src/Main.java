import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Main {
	public static void main(String[] args) {
//		if (args.length != 1) {
//			usag();
//			System.exit(0);
//		}
//		if(args[0].equals("plain")) {
//			TextBuilder textBuilder = new TextBuilder();
//			Director director = new Director(textBuilder);
//			director.construct();
//			String reslut = textBuilder.getresult();
//			System.out.print(reslut);
//		}else if (args[0].equals("html")) {
//			HTMLBuilder htmlBuilder = new HTMLBuilder();
//			Director director = new Director(htmlBuilder);
//			director.construct();
//			String filename = htmlBuilder.getresult();
//			System.out.println(filename + "�ļ���д���");
//		}else {
//			usag();
//			System.exit(0);
//		}
		
		FrameBuilder frameBuilder = new FrameBuilder();
		Director director = new Director(frameBuilder);
		director.construct();
		JFrame frame = frameBuilder.getResult();
		frame.setVisible(true);
		
		
		
	}
	public static void usag() {
		System.out.println("usag java Main plain     ��д���ı��ĵ�");
		System.out.println("usag java Main html      ��дHTML�ĵ�");
	}
	
	
	
}
