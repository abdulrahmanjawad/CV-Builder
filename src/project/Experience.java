package project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Experience extends Education{
	//West components
	JPanel west, exp1,wPost,wCompany,wCity,wStart,wEnd,westData,westDetails;
	JLabel lexp1,lPost,lCompany,lCity,lStart,lEnd,wl1, wl2, wl3;
	JTextField wtfPost,wtfCompany,wtfCity,wtfStart,wtfEnd,wtf1, wtf2, wtf3;
	
	public static String sWPost,sWCompany,sWCity,sWStart,sWEnd,sW1,sW2,sW3;
	
	//East components
	JPanel east, exp2,ePost,eCompany,eCity,eStart,eEnd,eastData,eastDetails;
	JLabel lexp2,elPost,elCompany,elCity,elStart,elEnd,el1, el2, el3;
	JTextField etfPost,etfCompany,etfCity,etfStart,etfEnd,etf1, etf2, etf3;
	
	public static String sEPost,sECompany,sECity,sEStart,sEEnd,sE1,sE2,sE3;
	
	Experience(){
		super();
		internalFrame.setLayout(new BorderLayout(100,40));
		title = new JPanel(new FlowLayout());
		lTitle = new JLabel("Experience");
		
		// West Panel Experience 1 code
		west = new JPanel();
		BoxLayout w1 = new BoxLayout(west,  BoxLayout.Y_AXIS);
		
		west.setLayout(w1);
		
		exp1 = new JPanel(new FlowLayout());wPost = new JPanel(new FlowLayout());
		wCompany = new JPanel(new FlowLayout());wCity = new JPanel(new FlowLayout());
		wStart = new JPanel(new FlowLayout());wEnd = new JPanel(new FlowLayout());
		westData = new JPanel(new GridLayout(3,2));westDetails =  new JPanel(new GridLayout(8,2));
		
		lexp1 = new JLabel("Experience 1");lPost = new JLabel("Post: ");lCompany = new JLabel("Company: ");
		lCity = new JLabel("City: ");lStart = new JLabel("Start Date: ");lEnd = new JLabel("End Date: ");
		
		wtfPost = new JTextField(25);wtfCompany = new JTextField(25);wtfCity = new JTextField(25);
		wtfStart = new JTextField(25);wtfEnd = new JTextField(25);
		
		exp1.add(lexp1); wPost.add(lPost); wPost.add(wtfPost);
		wCompany.add(lCompany);wCompany.add(wtfCompany); wCity.add(lCity);wCity.add(wtfCity);
		wStart.add(lStart);wStart.add(wtfStart);wEnd.add(lEnd);wEnd.add(wtfEnd);
		
		westData.add(wPost);westData.add(wStart);westData.add(wCompany);westData.add(wEnd);westData.add(wCity);
		
		wl1 = new JLabel("Detail 1:");wl2 = new JLabel("Detail 2:");wl3 = new JLabel("Detail 3:");
		wtf1 = new JTextField(30);wtf2 = new JTextField(30);wtf3 = new JTextField(30);
		
		westDetails.add(wl1);westDetails.add(wtf1);westDetails.add(wl2);
		westDetails.add(wtf2);westDetails.add(wl3);westDetails.add(wtf3);
		
		west.add(exp1);west.add(westData);west.add(westDetails);
		
		//East Panel code
		
		east = new JPanel();
		BoxLayout e2 = new BoxLayout(east,  BoxLayout.Y_AXIS);
		
		east.setLayout(e2);
		
		exp2 = new JPanel(new FlowLayout());ePost = new JPanel(new FlowLayout());
		eCompany = new JPanel(new FlowLayout());eCity = new JPanel(new FlowLayout());
		eStart = new JPanel(new FlowLayout());eEnd = new JPanel(new FlowLayout());
		eastData = new JPanel(new GridLayout(3,2));eastDetails =  new JPanel(new GridLayout(8,2));
		
		lexp2 = new JLabel("Experience 2");elPost = new JLabel("Post: ");elCompany = new JLabel("Company: ");
		elCity = new JLabel("City: ");elStart = new JLabel("Start Date: ");elEnd = new JLabel("End Date: ");
		
		etfPost = new JTextField(25);etfCompany = new JTextField(25);etfCity = new JTextField(25);
		etfStart = new JTextField(25);etfEnd = new JTextField(25);
		
		exp2.add(lexp2); ePost.add(elPost); ePost.add(etfPost);
		eCompany.add(elCompany);eCompany.add(etfCompany); eCity.add(elCity);eCity.add(etfCity);
		eStart.add(elStart);eStart.add(etfStart);eEnd.add(elEnd);eEnd.add(etfEnd);
		
		eastData.add(ePost);eastData.add(eStart);eastData.add(eCompany);eastData.add(eEnd);eastData.add(eCity);
		
		el1 = new JLabel("Detail 1:");el2 = new JLabel("Detail 2:");el3 = new JLabel("Detail 3:");
		etf1 = new JTextField(30);etf2 = new JTextField(30);etf3 = new JTextField(30);
		
		eastDetails.add(el1);eastDetails.add(etf1);eastDetails.add(el2);
		eastDetails.add(etf2);eastDetails.add(el3);eastDetails.add(etf3);
		
		east.add(exp2);east.add(eastData);east.add(eastDetails);
		
		title.add(lTitle);
		Font myFont = new Font("Serif",  Font.BOLD,40);
		lTitle.setFont(myFont);
		internalFrame.add(title,BorderLayout.NORTH);
		internalFrame.add(west, BorderLayout.WEST);
		internalFrame.add(new JLabel("    "), BorderLayout.CENTER);
		internalFrame.add(east, BorderLayout.EAST);
		internalFrame.add(panelBtn, BorderLayout.SOUTH);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==reset) {
			wtfPost.setText("");wtfCompany.setText("");wtfCity.setText("");wtfStart.setText("");wtfEnd.setText("");
			etfPost.setText("");etfCompany.setText("");etfCity.setText("");etfStart.setText("");etfEnd.setText("");
			etf1.setText("");etf2.setText("");etf3.setText("");wtf1.setText("");wtf2.setText("");wtf3.setText("");
		}
		else if (e.getSource()==back) {
			new Education();
			frame.setVisible(false);
		}
		else if (e.getSource()==next) {
			if (wtfPost.getText().equalsIgnoreCase("") || wtfCompany.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else if (wtfCity.getText().equalsIgnoreCase("") || wtfStart.getText().equalsIgnoreCase("") || wtfEnd.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else if (etfPost.getText().equalsIgnoreCase("") || etfCompany.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else if (etfCity.getText().equalsIgnoreCase("") || etfStart.getText().equalsIgnoreCase("") || etfEnd.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else if (etf1.getText().equalsIgnoreCase("") || etf2.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else if (etf3.getText().equalsIgnoreCase("") || wtf1.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else if (wtf2.getText().equalsIgnoreCase("") || wtf3.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else {
				sWPost = wtfPost.getText();sWCompany = wtfCompany.getText();sWCity = wtfCity.getText();sWStart = wtfStart.getText();
				sWEnd = wtfEnd.getText(); sW1 = wtf1.getText(); sW2 = wtf2.getText(); sW3 = wtf3.getText();
				sEPost = etfPost.getText();sECompany = etfCompany.getText();sECity = etfCity.getText();sEStart = etfStart.getText();
				sEEnd = etfEnd.getText(); sE1 = etf1.getText(); sE2 = etf2.getText(); sE3 = etf3.getText();
				new CVdisplay();
				frame.setVisible(false);
			}					
		}
	}
}
