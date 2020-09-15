package project;

import java.awt.*;
import java.awt.event.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.*;

public class CVdisplay extends Experience implements ActionListener{
	
	JLabel lname, lcontact, lemail, laddress, lprofile;
	JLabel eduL, degree, university, city, year, skill1, skill2, skill3, skill4, skill5, skill6;
	JPanel eduP, degP, uniP, cityP, yearP;
	JPanel sP1, sP2, sP3, sP4, sP5, sP6;
	JLabel wpost, wcomp, wcity, wstart, wend, wdetail1, wdetail2, wdetail3;
	JPanel w1, w2, w3, w4, w5, w6, w7, w8;
	JPanel e1, e2, e3, e4, e5, e6, e7, e8;
	JLabel epost, ecomp, ecity, estart, eend, edetail1, edetail2, edetail3;
	JPanel pname, pPersonal, pProfile, pEducation, pSkill, pEx1, pEx2, north, mcenter, center, rcenter, west, east;
	JButton b;

	
	
	CVdisplay(){
		eduP = new JPanel();
		mcenter = new JPanel();
		pEx1 = new JPanel();
		pEx2 = new JPanel();
		w1 = new JPanel(); w2 = new JPanel(); w3 = new JPanel(); w4 = new JPanel();w5 = new JPanel();w6 = new JPanel();
		w7 = new JPanel();w8 = new JPanel();
		e1 = new JPanel(); e2 = new JPanel(); e3 = new JPanel(); e4 = new JPanel();e5 = new JPanel();e6 = new JPanel();
		e7 = new JPanel();e8 = new JPanel();
		b = new JButton("Finish");
		
		
		mcenter.setLayout(new BorderLayout());
		JLabel eduL =new JLabel("Education details: ");
		eduP.add(eduL);
		
		
		internalFrame.setLayout(new BorderLayout(100,40));
		
		pname = new JPanel(new FlowLayout()); pPersonal = new JPanel(new FlowLayout()); pProfile = new JPanel(new FlowLayout());
		degP = new JPanel(new FlowLayout()); 
		uniP = new JPanel(new FlowLayout()); cityP = new JPanel(new FlowLayout()); yearP = new JPanel(new FlowLayout());
		sP1 = new JPanel(new FlowLayout());	sP2 = new JPanel(new FlowLayout()); sP3 = new JPanel(new FlowLayout());
		sP4 = new JPanel(new FlowLayout()); sP5 = new JPanel(new FlowLayout()); sP6 = new JPanel(new FlowLayout());
		
		north = new JPanel();
		center = new JPanel();
		rcenter = new JPanel();
		west = new JPanel();
		east = new JPanel();
		
		BoxLayout ee2 = new BoxLayout(north,  BoxLayout.Y_AXIS);
		north.setLayout(ee2);
		
		BoxLayout ee3 = new BoxLayout(center,  BoxLayout.Y_AXIS);
		center.setLayout(ee3);
		
		BoxLayout ee4 = new BoxLayout(rcenter,  BoxLayout.Y_AXIS);
		rcenter.setLayout(ee4);
		
		BoxLayout ee5 = new BoxLayout(west,  BoxLayout.Y_AXIS);
		west.setLayout(ee5);
		
		BoxLayout ee6 = new BoxLayout(east,  BoxLayout.Y_AXIS);
		east.setLayout(ee6);
		
		//Personal
		lname = new JLabel(name); lcontact = new JLabel(contact); lemail = new JLabel(email);
		laddress = new JLabel(address);
		lprofile = new JLabel(summary);
		
		//Education
		degree = new JLabel(sDegree); university = new JLabel(sUni); city  = new JLabel(sCity);
		year = new JLabel(sYear); skill1  = new JLabel(s1); skill2  = new JLabel(s2);
		skill3  = new JLabel(s3); skill4  = new JLabel(s4); skill5  = new JLabel(s5);
		skill6  = new JLabel(s6);
		
		JLabel s = new JLabel("Skills: ");
		JPanel sp = new JPanel();
		sp.add(s);
		sP1.add(skill1); sP2.add(skill2); sP3.add(skill3); sP4.add(skill4);  sP5.add(skill5);  sP6.add(skill6);
		rcenter.add(sp); rcenter.add(sP1); rcenter.add(sP2); rcenter.add(sP3); rcenter.add(sP4); rcenter.add(sP5); rcenter.add(sP6);
		rcenter.add(sP6);
		
		//Experience
		wpost = new JLabel(sWPost); wcomp = new JLabel(sWCompany); wcity = new JLabel(sWCity);
		wstart = new JLabel(sWStart); wend = new JLabel(sWEnd); wdetail1 = new JLabel(sW1);
		wdetail2 = new JLabel(sW2);wdetail3 = new JLabel(sW3);
		w1.add(wpost); w2.add(wcomp); w3.add(wcity); w4.add(wstart); w5.add(wend); w6.add(wdetail1);
		w7.add(wdetail2); w8.add(wdetail3);
		
		epost = new JLabel(sEPost); ecomp = new JLabel(sECompany); ecity = new JLabel(sECity);
		estart = new JLabel(sEStart); eend = new JLabel(sEEnd); edetail1 = new JLabel(sE1);
		edetail2 = new JLabel(sE2);edetail3 = new JLabel(sE3);
		e1.add(epost); e2.add(ecomp); e3.add(ecity); e4.add(estart); e5.add(eend); w6.add(wdetail1);
		e7.add(edetail2); e8.add(edetail3);
		
		//Adding components to north 
		pname.add(lname); pPersonal.add(lcontact); pPersonal.add(lemail); 
		pPersonal.add(laddress);
		pProfile.add(lprofile);
		north.add(pname); north.add(pPersonal); north.add(pProfile);
		
		//Adding components to center
		degP.add(degree); uniP.add(university); cityP.add(city); yearP.add(year);
		center.add(eduP); center.add(degP); center.add(uniP); center.add(cityP); center.add(yearP);
		
		//Adding experience
		pEx1.add(lexp1);
		pEx2.add(lexp2);
		west.add(pEx1); west.add(w1);  west.add(w2);  west.add(w3);  west.add(w4);  west.add(w4);  west.add(w5);  west.add(w6);
		west.add(w7);  west.add(w8);
		
		east.add(pEx2); east.add(e1);  east.add(e2);  east.add(e3);  east.add(e4);  east.add(e4);  east.add(e5);  east.add(e6);
		east.add(e7);  east.add(e8);
		
		JPanel exp = new JPanel(new GridLayout(2,1));
		exp.add(west);exp.add(east);
		
		b.addActionListener(this);
		
		
		frame.setSize(1369,900);
		Font myFont = new Font("Serif",  Font.BOLD,40);
		lname.setFont(myFont);
		mcenter.add(center, BorderLayout.WEST);
		mcenter.add(rcenter, BorderLayout.EAST);
		mcenter.add(exp, BorderLayout.CENTER);
		//internalFrame.add(west,BorderLayout.WEST);
		//internalFrame.add(east,BorderLayout.EAST);
		
		internalFrame.add(north,BorderLayout. NORTH);
		internalFrame.add(mcenter,BorderLayout.CENTER);
		internalFrame.add(b,BorderLayout.SOUTH);
		//internalFrame.getContentPane().setBackground(Color.WHITE);	
	}
	public void actionPerformed(ActionEvent e) 
	{
		PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Print Data");

        job.setPrintable(new Printable(){
        public int print(Graphics pg,PageFormat pf, int pageNum){
                pf.setOrientation(PageFormat.PORTRAIT);
             if(pageNum>0){
                return Printable.NO_SUCH_PAGE;
            }

            Graphics2D g2 = (Graphics2D)pg;
            g2.translate(pf.getImageableX(), pf.getImageableY());
            g2.scale(0.34,0.50);

            internalFrame.paint(g2);
            return Printable.PAGE_EXISTS;
        }
});

    boolean ok = job.printDialog();
    if(ok){
    try{

    job.print();
    }
    catch (PrinterException ex){}
    }
}
}