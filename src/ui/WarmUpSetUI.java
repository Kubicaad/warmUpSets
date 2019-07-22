package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import weights.RoundWeightUp;

public class WarmUpSetUI extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JTextField text;

	public WarmUpSetUI() {
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		JPanel textpanel = new JPanel();
		text = new JTextField("Weight");
		JButton b = new JButton("Go");
		b.addActionListener(this);
		b.setVisible(true);
		text.setSize(100,100);
		text.setVisible(true);
		textpanel.add(text);
		textpanel.add(b);
		panel.add(textpanel);
		
		
		setContentPane(panel);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		panel.add(new JLabel(RoundWeightUp.getSets(Double.parseDouble(text.getText()))));
		setContentPane(panel);
		
		
	}
	
}
