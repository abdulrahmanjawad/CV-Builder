package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class FrameGUI implements ActionListener{
	JFrame frame = new JFrame("CV Builder");
	JPanel panelT, imagePanel, panelN; JButton next; JLabel title, imageP, Pnl;
	JInternalFrame internalFrame = new JInternalFrame();
	ImageIcon image;
	
	FrameGUI(){
		panelT = new JPanel(new BorderLayout()); panelN = new JPanel(new FlowLayout());
		next = new JButton("Next");
		title = new JLabel("        CV BUILDER");
		image = new ImageIcon("D:\\NUST\\Semester 2\\CS212 Object Oriented Prgramming\\Project\\CV.jpeg");
		imageP = new JLabel(image);
		
		
		internalFrame.setLayout(new BorderLayout(100,100));
		
		internalFrame.add(panelT, BorderLayout.CENTER);
		internalFrame.add(panelN, BorderLayout.SOUTH);
		internalFrame.add(imageP, BorderLayout.EAST);
		panelT.add(title, BorderLayout.CENTER);panelN.add(next);
		Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD,60);
		title.setFont(myFont);
		next.addActionListener(this);
		internalFrame.setVisible(true);
		frame.add(internalFrame);
		frame.setVisible(true); 
		frame.setSize(1368, 729);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==next) {
			new Personal();
			frame.setVisible(false);
		}
	}

}
