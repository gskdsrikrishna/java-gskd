import java.awt.event.*;  
import javax.swing.*;   
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Gskd2 implements ActionListener
{  
	JFrame f=new JFrame("Gskd Application");
	JTextArea a1,a2,a3,a4,a5,a6,ta;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JPasswordField p1=new JPasswordField();
	JCheckBox cb1,cb2;
	JRadioButton r1,r2;
	ButtonGroup bg;
	JComboBox c1;
	JPanel pn1,pn2,pn3,pn4;
	JTabbedPane tp=new JTabbedPane();
	JDialog jd;
	JMenuBar mb;    
	JMenu file,edit,help;    
	JMenuItem cut,copy,paste,selectAll; 
	// JToolBar tb;
	Gskd2()
	{
		jd=new JDialog(f,"Gskd Application",true);
		jd.setLayout(new FlowLayout());
		b10=new JButton("Continue");
		b10.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				jd.setVisible(false);
			}
		});
		jd.add(new JLabel("Aru you sure to open Gskd Application"));
		jd.add(b10); 
		jd.setSize(400,400);
		jd.setVisible(true);



		// tb=new JToolBar();
		// tb.setRollover(true);
		// b13=new JButton();
		// b13.setBounds(480,120,80,20);
		// tb.add(b13);
		// tb.addSeparator();
		// tb.add(new JButton("Edit"));
		// tb.add(new JComboBox(new String[] {"New","New File","Save","Sava As","Copy"}));
		// f.add(tb); f.add(b13);

		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Gskd/GskdPhoto.png");
		f.setIconImage(icon);

		cut=new JMenuItem("cut");    
		copy=new JMenuItem("copy");    
		paste=new JMenuItem("paste");    
		selectAll=new JMenuItem("selectAll");    
		cut.addActionListener(this);    
		copy.addActionListener(this);    
		paste.addActionListener(this);    
		selectAll.addActionListener(this);    
		mb=new JMenuBar();    
		file=new JMenu("File");    
		edit=new JMenu("Edit");    
		help=new JMenu("Help");     
		edit.add(cut);edit.add(copy);edit.add(paste);edit.add(selectAll);    
		mb.add(file);mb.add(edit);mb.add(help);    
		ta=new JTextArea();       
		f.add(mb);f.add(ta);    
		f.setJMenuBar(mb); 

		b9=new JButton("Pad Color");
		b9.setBounds(380,50,80,20);
		a5=new JTextArea(50,50);
		a5.setBounds(380,80,50,50);
		b9.addActionListener(this);
		f.add(b9); f.add(a5);

		a6=new JTextArea();
		pn1=new JPanel();
		pn2=new JPanel();
		pn3=new JPanel();
		pn1.add(a6);
		tp.setBounds(350,400,120,120);
		tp.add("Main",pn1);
		tp.add("Visit",pn2);
		tp.add("Help",pn3);
		f.add(tp); f.add(a6);



		pn4=new JPanel();
		pn4.setBounds(480,20,200,100);
		pn4.setBackground(Color.gray);
		b11=new JButton("Yellow");
		b11.setBounds(500,50,80,20);
		b11.setBackground(Color.yellow);
		b12=new JButton("Green");
		b12.setBounds(600,50,80,30);
		b12.setBackground(Color.green);
		pn4.add(b11); pn4.add(b12);
		f.add(pn4);


		String p2=JOptionPane.showInputDialog(f,"Enter Password:");
		int num=Integer.parseInt(p2);
		if(num==2024)
		{
			JOptionPane.showMessageDialog(f,"Correct");

    	t1=new JTextField();  
    	t1.setBounds(120,20, 150,20);  
    	t2=new JTextField();
    	t2.setBounds(120,40,150,20);
    	t3=new JTextField();
    	t3.setBounds(120,60,150,20);
    	t4=new JTextField();
    	t4.setBounds(120,80,150,20);
    	t5=new JTextField();
    	t5.setBounds(120,200,150,20);
    	t6=new JTextField();
    	t6.setBounds(120,230,150,20);

    	b1=new JButton("Click");  
    	b1.setBounds(290,20,80,20); 
    	b2=new JButton("Click");
    	b2.setBounds(290,40,80,20);
    	b3=new JButton("Click");
    	b3.setBounds(290,60,80,20);
    	b4=new JButton("Click");
    	b4.setBounds(290,80,80,20);

    	String name[]={"Sri Krishna","Bhuvaneswari","Vijay","Gskd","Indu","Bhuvana"};
    	c1=new JComboBox(name);
    	c1.setBounds(120,360,100,20);
    	f.add(c1);

    	String data[][]={{"1","Gskd","14"},{"2","Bhumi","12"},{"3","Vijay","9"},
    					 {"4","Sri Krishna","14"},{"5","Indu","7"},{"6","Bhuvana","12"}};    
    	String column[]={"Roll.No","Name","Class"};         
    	JTable jt=new JTable(data,column);    
   		jt.setBounds(120,400,200,100);          
    	JScrollPane sp=new JScrollPane(jt);    
    	f.add(jt); f.add(sp);

    	JOptionPane.showMessageDialog(f,"Hello This Application was Created By Gskd");
    	JOptionPane.showMessageDialog(f,"Gskd:G Sri Krishna Devarayulu");

    	f.setLayout(new GridLayout(1,1));
    	JSeparator jsp=new JSeparator();
    	f.add(jsp);

    	JProgressBar jpb=new JProgressBar(0,2000);
		jpb.setBounds(300,250,120,30);
		jpb.setValue(0);
		jpb.setStringPainted(true);
		f.add(jpb);
		int i=0;
			while(i<=2000)
			{
				jpb.setValue(i);
				i=i+20;
			}

    	// DefaultListModel<String> l=new DefaultListModel<String>();
    	// l.addElement("Gskd");
    	// l.addElement("Bhuvaneswari");
    	// l.addElement("Viajy");
    	// l.addElement("Bhuvana");
    	// l.addElement("Indu");
    	// JList<String> list=new JList<String>(l);
    	// list.setBounds(250,360,100,20);
    	// f.add(list);

    	DefaultMutableTreeNode style=new DefaultMutableTreeNode("Style");  
    	DefaultMutableTreeNode color=new DefaultMutableTreeNode("color");  
    	DefaultMutableTreeNode font=new DefaultMutableTreeNode("font");  
    	style.add(color);  
    	style.add(font);  
    	DefaultMutableTreeNode red=new DefaultMutableTreeNode("red");  
    	DefaultMutableTreeNode blue=new DefaultMutableTreeNode("blue");  
    	DefaultMutableTreeNode black=new DefaultMutableTreeNode("black");  
    	DefaultMutableTreeNode green=new DefaultMutableTreeNode("green");  
    	color.add(red); color.add(blue); color.add(black); color.add(green);      
    	JTree jtr=new JTree(style);  
    	jtr.setBounds(380,20,80,20);
    	f.add(jtr);

 
        final JPopupMenu popupmenu=new JPopupMenu("Edit");   
        JMenuItem cut=new JMenuItem("Cut");  
        JMenuItem copy=new JMenuItem("Copy");  
        JMenuItem paste=new JMenuItem("Paste");  
        JMenuItem save=new JMenuItem("Save"); 
        JMenuItem saveas=new JMenuItem("Save as"); 
        popupmenu.add(cut); popupmenu.add(copy); popupmenu.add(paste); 
        popupmenu.add(save); popupmenu.add(saveas);
        f.addMouseListener(new MouseAdapter() 
        {  
            public void mouseClicked(MouseEvent e) 
            {              
                popupmenu.show(f , e.getX(), e.getY());  
            }                 
        });  
        f.add(popupmenu); 

        f.addWindowListener(new WindowAdapter()
        {
        	public void windowClosing(WindowEvent we)
        	{
        		int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
        		if(a==JOptionPane.YES_OPTION)
        		{
        			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		}
        	}
        });
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);


    	cb1=new JCheckBox("Male",true);
    	cb2=new JCheckBox("Female");
    	cb1.setBounds(120,260,80,20);
    	cb2.setBounds(120,280,80,20);
    	f.add(cb1); f.add(cb2);

    	r1=new JRadioButton("Male",true);
    	r2=new JRadioButton("Female");
    	r1.setBounds(120,310,80,20);
    	r2.setBounds(120,330,80,20);
    	f.add(r1); f.add(r2);

    	b8=new JButton("Click");
    	b8.setBounds(220,320,80,20);
    	f.add(b8);
    	bg=new ButtonGroup();
    	bg.add(r1); bg.add(r2);
    	b8.addActionListener(this);

    	a1=new JTextArea();
    	a1.setBounds(120,110,150,20);
    	a2=new JTextArea();
    	a2.setBounds(120,140,150,20);
    	a3=new JTextArea();
    	a3.setBounds(120,170,150,20);
    	a4=new JTextArea();
    	p1.setBounds(120,230,150,20);
    	f.add(a1); f.add(a2); f.add(a3);
    	f.add(a4); f.add(p1);

    	l1=new JLabel("Name 1:");
    	l1.setBounds(20,20,80,20);
    	l2=new JLabel("Name 2:");
    	l2.setBounds(20,40,80,20);
    	l3=new JLabel("Name 3:");
    	l3.setBounds(20,60,80,20);
    	l4=new JLabel("Name 4:");
    	l4.setBounds(20,80,80,20);
    	l5=new JLabel("Student Name:");
    	l5.setBounds(20,110,100,20);
    	l6=new JLabel("Father Name:");
    	l6.setBounds(20,140,100,20);
    	l7=new JLabel("Mother Name:");
    	l7.setBounds(20,170,100,20);
    	l8=new JLabel("Gmail:");
    	l8.setBounds(20,200,100,20);
    	l9=new JLabel("Password:");
    	l9.setBounds(20,230,100,20);

    	f.add(l1); f.add(l2); f.add(l3); f.add(l4); f.add(l5); 
    	f.add(l6); f.add(l7); f.add(l8); f.add(l9); 

    	b1.addActionListener(new ActionListener()
    	{  
			public void actionPerformed(ActionEvent e)
			{  
            	t1.setText("Vijay"); 
        	}  
    	}); 
    	b2.addActionListener(new ActionListener()
    	{  
			public void actionPerformed(ActionEvent e)
			{  
            	t2.setText("Bhuvaneswari"); 
        	}  
    	}); 
    	b3.addActionListener(new ActionListener()
    	{  
			public void actionPerformed(ActionEvent e)
			{  
            	t3.setText("Indu"); 
        	}  
    	}); 
    	b4.addActionListener(new ActionListener()
    	{  
			public void actionPerformed(ActionEvent e)
			{  
            	t4.setText("Sri Krishna"); 
        	}  
    	}); 

    	f.add(b1); f.add(b2); f.add(b3); f.add(b4);
    	f.add(t1); f.add(t2); f.add(t3); f.add(t4); f.add(t5); f.add(t6);

    	b5=new JButton("Click");
    	b5.setBounds(290,110,80,20);
    	b6=new JButton("Click");
    	b6.setBounds(290,140,80,20);
    	b7=new JButton("Click");
    	b7.setBounds(290,170,80,20);
    	f.add(b5); f.add(b6); f.add(b7);

    	f.setSize(750,650); 
    	f.setLayout(null);  
    	f.setVisible(true);

    	}
		else
		{
			JOptionPane.showMessageDialog(f,"Not Correct","Alert",JOptionPane.WARNING_MESSAGE);
		}    

	}  
	public void actionPerformed(ActionEvent ae)
    {
    	String text1=a1.getText();
    	String text2=a2.getText();
    	String test3=a3.getText();
    	String text4=a4.getText();

    	Color c=JColorChooser.showDialog(null,"Choose",Color.CYAN);
    	a5.setBackground(c);

    	if(r1.isSelected())
    	{
    		JOptionPane.showMessageDialog(null,"You are Male");
    		JOptionPane.showMessageDialog(f,"Successfully Updated","Alert",JOptionPane.WARNING_MESSAGE);
    	}
    	if(r2.isSelected())
    	{
    		JOptionPane.showMessageDialog(null,"You are Female");
    		JOptionPane.showMessageDialog(f,"Successfully Updated","Alert",JOptionPane.WARNING_MESSAGE);
    	}

		if(ae.getSource()==cut)    
		ta.cut();    
		if(ae.getSource()==paste)    
		ta.paste();    
		if(ae.getSource()==copy)    
		ta.copy();    
		if(ae.getSource()==selectAll)    
		ta.selectAll();    
    }

// public class Gskd3 extends Gskd2 implements WindowAdapter
// {

// 	f.addWindowListener(this);
// 	f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
// }
// 	public void windowClosing(WindowEvent we)
//     {
//     	int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
//     	if(a==JOptionPane.YES_OPTION)
//     	{
//     		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     	}
//     }


	public static void main(String args[])
	{
		Gskd2 sk=new Gskd2();
	}
}  