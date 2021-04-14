package projects;

import java.awt.*;
import javax.swing.*;

public class ChatClient {

	private JTextArea output;
	private JTextField input;
	private JButton sendButton;
	private JButton quitButton;
	
	public ChatClient() {
		output = new JTextArea(10, 50);
		input = new JTextField(10);
		sendButton = new JButton("Send");
		quitButton = new JButton("Quit");
	}
	
	public void launchFrame() {
		JFrame frame = new  JFrame("Chat room");
		
		frame.setLayout(new BorderLayout());
		
		frame.add(output, BorderLayout.WEST);
		frame.add(input, BorderLayout.SOUTH);
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(2, 1));
		p1.add(sendButton);
		p1.add(quitButton);
		
		frame.add(p1, BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main (String [] args) {
		ChatClient c = new ChatClient();
		c.launchFrame();
	}
}
