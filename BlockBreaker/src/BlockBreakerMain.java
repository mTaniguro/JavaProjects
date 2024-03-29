import javax.swing.JButton;
import javax.swing.JFrame;

public class BlockBreakerMain {
	
	public static void main (String[] args) {
		
		JFrame frame = new JFrame("BlockBreaker");
		
		
		JFrame startScreen = new JFrame();
		JButton start = new JButton("Click To Start!");
		
		BlockBreakerPanel panel = new BlockBreakerPanel(frame, startScreen);
		
		start.addActionListener(listener -> {
			startScreen.setVisible(false);
			frame.setVisible(true);
		});
		
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(490, 600);
		frame.setResizable(false);
		
		
		startScreen.getContentPane().add(start);
		startScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		startScreen.setVisible(true);
		startScreen.setSize(490, 600);
		startScreen.setResizable(false);
		
	}

}
