package project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Personal extends FrameGUI implements ActionListener{
	JPanel title, labels, panelBtn, textPanel, mainPanel, south,tArea;
	JLabel lTitle, lName, lContact, lEmail, lAddress, profession, lProfile;
	JTextField tfName, tfContact, tfEmail, tfAddress;
	JButton back, reset;
	JTextArea profile;
	public static String name,contact,email,address, summary;
	
	Personal(){
		super();
		internalFrame.setLayout(new BorderLayout(100,40)); 
		
		textPanel = new JPanel(new GridLayout(7,0)); title = new JPanel(new FlowLayout());
		labels = new JPanel(new GridLayout(7,0)); 
		south = new JPanel(new GridLayout(0,1)); panelBtn = new JPanel(new FlowLayout());
		mainPanel = new JPanel(new GridLayout(1,20));tArea = new JPanel(new FlowLayout());
		
		lTitle = new JLabel("Personal Information"); lName = new JLabel("Name: "); 
		lContact = new JLabel("Contact No.: "); lEmail = new JLabel("Email: "); lAddress = new JLabel("Address:"); 
		profession = new JLabel("Profession:");lProfile = new JLabel("Profile Summary: ");
		
		tfName = new JTextField(20); tfContact = new JTextField(20); tfEmail = new JTextField(20);
		tfAddress = new JTextField(20);
		profile = new JTextArea(4,100);
		
		back = new JButton("Back"); reset = new JButton("Reset");
		
		textPanel.add(tfName);textPanel.add(new JLabel());textPanel.add(tfContact);textPanel.add(new JLabel());
		textPanel.add(tfEmail);textPanel.add(new JLabel());textPanel.add(tfAddress);
		
		labels.add(lName);labels.add(new JLabel());labels.add(lContact);labels.add(new JLabel());
		labels.add(lEmail);labels.add(new JLabel());labels.add(lAddress);
		
		panelBtn.add(back);panelBtn.add(new JLabel());panelBtn.add(reset);panelBtn.add(new JLabel());
		panelBtn.add(next); 
		title.add(lTitle);
		mainPanel.add(labels);mainPanel.add(textPanel);
		
		
		
		tArea.add(lProfile);tArea.add(profile);
		profile.setLineWrap(true);profile.setWrapStyleWord(true);

		south.add(tArea);south.add(new JLabel());south.add(new JLabel());south.add(new JLabel());
		south.add(panelBtn);
		
		Font myFont = new Font("Serif",  Font.BOLD,40);
		lTitle.setFont(myFont);
		
		internalFrame.add(title, BorderLayout.NORTH);internalFrame.add(mainPanel, BorderLayout.WEST);
		internalFrame.add(south, BorderLayout.SOUTH);
		
		reset.addActionListener(this);back.addActionListener(this);		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==reset) {
			tfName.setText(""); tfContact.setText(""); tfEmail.setText("");	tfAddress.setText("");
			profile.setText(""); 
		}
		else if (e.getSource()==back) {
			new FrameGUI();
			frame.setVisible(false);
		}
		else if (e.getSource()==next) {
			if (tfName.getText().equalsIgnoreCase("") || tfContact.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else if (tfEmail.getText().equalsIgnoreCase("") || tfAddress.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else if (profile.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else {
				name = tfName.getText();contact = tfContact.getText();email = tfEmail.getText();
				address = tfAddress.getText(); summary = profile.getText();
				
				frame.setVisible(false);
			}
		}
	}
}
