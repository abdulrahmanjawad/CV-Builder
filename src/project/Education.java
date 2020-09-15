package project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Education extends Personal implements ActionListener{
	
	JPanel college, degree, university, city, year, westPanel, skills, p1, p2, p3, p4, p5, p6, eastPanel;
	JLabel lcollege, ldegree, luniversity, lcity, lyear, l1, l2, l3, l4, l5, l6, lSkills;
	JTextField tfdegree, tfuniversity, tfcity,tfyear, t1, t2, t3, t4, t5, t6;
	public static String sDegree, sUni, sCity, sYear, s1, s2, s3, s4, s5, s6;
	
	Education(){
		super();
		internalFrame.setLayout(new BorderLayout(100,40));
		
		title = new JPanel(new FlowLayout()); college = new JPanel(new FlowLayout()); degree = new JPanel(new FlowLayout());
		university = new JPanel(new FlowLayout()); city = new JPanel(new FlowLayout()); year = new JPanel(new FlowLayout());
		westPanel = new JPanel();
		
		lTitle = new JLabel("Education and Skills"); lcollege = new JLabel("College Data");
		ldegree = new JLabel("                    Degree:"); luniversity = new JLabel("              University:");
		lcity = new JLabel("                        City:"); lyear = new JLabel(" 		  Graduation Year:");
		
		lSkills = new JLabel("Skills"); skills = new JPanel();
		
		p1 = new JPanel(new FlowLayout()); p2 = new JPanel(new FlowLayout()); p3 = new JPanel(new FlowLayout());
		p4 = new JPanel(new FlowLayout()); p5 = new JPanel(new FlowLayout()); p6 = new JPanel(new FlowLayout());
		
		l1 = new JLabel("1. "); l2 = new JLabel("2. "); l3 = new JLabel("3. "); l4 = new JLabel("4. "); l5 = new JLabel("5. ");
		l6 = new JLabel("6. ");
		
		t1 = new JTextField(30); t2 = new JTextField(30); t3 = new JTextField(30); t4 = new JTextField(30); t5 = new JTextField(30);
		t6 = new JTextField(30);
		
		tfdegree = new JTextField(30);tfuniversity = new JTextField(30);tfcity = new JTextField(30);
		tfyear = new JTextField(30);
		
		p1.add(l1); p1.add(t1);p1.add(new JLabel()); p2.add(l2); p2.add(t2);p2.add(new JLabel());
		p3.add(l3); p3.add(t3);p3.add(new JLabel()); p4.add(l4); p4.add(t4);p4.add(new JLabel());
		p5.add(l5); p5.add(t5);p5.add(new JLabel()); p6.add(l6); p6.add(t6);p1.add(new JLabel()); 
		
		skills.add(lSkills);skills.add(new JLabel());
		
		eastPanel = new JPanel(); 
		
		BoxLayout e1 = new BoxLayout(eastPanel,  BoxLayout.Y_AXIS);
		eastPanel.setLayout(e1);
		
		eastPanel.add(skills); eastPanel.add(p1); eastPanel.add(p2); eastPanel.add(p3); eastPanel.add(p4); eastPanel.add(p5);
		eastPanel.add(p6);
		
		BoxLayout bl = new BoxLayout(westPanel,  BoxLayout.Y_AXIS);
		westPanel.setLayout(bl);
		
		college.add(lcollege);
		degree.add(ldegree); degree.add(tfdegree); university.add(luniversity); university.add(tfuniversity);
		city.add(lcity); city.add(tfcity); year.add(lyear); year.add(tfyear);
	
		westPanel.add(college);westPanel.add(degree); westPanel.add(university); westPanel.add(city); 
		westPanel.add(year);
	
		title.add(lTitle);
		Font myFont = new Font("Serif",  Font.BOLD,40);
		lTitle.setFont(myFont);
		
		internalFrame.add(title,BorderLayout.NORTH);
		internalFrame.add(westPanel, BorderLayout.WEST);
		internalFrame.add(panelBtn, BorderLayout.SOUTH);
		internalFrame.add(eastPanel, BorderLayout.EAST);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==reset) {
			tfdegree.setText("");tfuniversity.setText("");tfcity.setText("");tfyear.setText("");
			t1.setText("");t2.setText("");t3.setText("");t4.setText("");t5.setText("");t6.setText("");
		}
		else if (e.getSource()==back) {
			new Personal();
			frame.setVisible(false);
		}
		else if (e.getSource()==next) {
			if (tfdegree.getText().equalsIgnoreCase("") || tfuniversity.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
				else if (tfcity.getText().equalsIgnoreCase("") || tfyear.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else if (t1.getText().equalsIgnoreCase("") || t2.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else if (t3.getText().equalsIgnoreCase("") || t4.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else if (t5.getText().equalsIgnoreCase("") || t6.getText().equalsIgnoreCase(""))
				JOptionPane.showMessageDialog(frame, "Atleast 1 field is empty. \nFill all fields ");
			else {
				sDegree = tfdegree.getText(); sUni = tfuniversity.getText(); sCity = tfcity.getText();
				sYear = tfyear.getText(); s1 = t1.getText(); s2 = t2.getText(); s3 = t3.getText();
				s4 = t4.getText(); s5 = t5.getText(); s6 = t6.getText();
				new Experience();
				frame.setVisible(false);
			}					
		}
	}

}