package swtingtry;

import java.awt.color.*;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;


import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;


public class T1done2 extends JFrame {
	// �������
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	JLabel user = new JLabel("�˺�");
	JLabel key = new JLabel("����");
	JButton register=new JButton("ע��"); 
	JTextField InUser = new JTextField(10);
	JPasswordField InKey = new JPasswordField(10);
	JButton conforim = new JButton("ȷ��");
	JButton reset = new JButton("����");
	
	// ���캯��
	public  T1done2() {
		this.setLayout(new GridLayout(3, 1));//���ò��ַ�ʽ
		this.setTitle("��¼");
		//�������
		jp1.add(user);
		jp1.add(InUser);
		jp2.add(key);
		jp2.add(InKey);
		jp3.add(conforim);
		jp3.add(register);
		register.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame jf=new JFrame("ע��");
				JPanel jp=new JPanel();
				JButton jb=new JButton("ע��");
				JTextField jt1=new JTextField(10);
				JPasswordField jt2=new JPasswordField(10);
				jb.addActionListener(new ActionListener() { //ע��
					@Override
					public void actionPerformed(ActionEvent arg0) {
						// TODO Auto-generated method stub
						try {
							String dr="com.mysql.jdbc.Driver";
							Class.forName(dr);
							String url="jdbc:mysql://localhost:3306/stu?useSSL=false";
							String u=jt1.getText();
							String p=String.valueOf(jt2.getPassword());
							Connection con=DriverManager.getConnection(url,"root" ,"13868588663" );
							Statement s=con.createStatement();
							ResultSet rs=null;
							if(!u.equals("")||!p.equals("")) {
								rs=s.executeQuery("select username from usertable where username='"+u+"';");
								if(!rs.next()) {
									s.executeUpdate("insert into usertable(ID,username,password) "
											+ "values(null,'"+u+"','"+p+"')");
									JFrame jf=new JFrame();
									JTextArea jt=new JTextArea("ע��ɹ�");
									jf.add(jt);
									jf.setSize(80,80);
									jf.setLocationRelativeTo(null);
									jf.setVisible(true);
									jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
								}
								rs.close();
								con.close();
							}
						}
						catch(Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				JLabel jl1=new JLabel("�û���");
				JLabel jl2=new JLabel("����");
				jp.add(jl1);
				jp.add(jt1);
				jp.add(jl2);
				jp.add(jt2);
				jp.add(jb);
				jf.add(jp);
				jf.setSize(500, 80);
				jf.setLocationRelativeTo(null);
				jf.setVisible(true);
				jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
			}
			
		});
		reset.addActionListener(new ActionListener() { //���
			public void actionPerformed(ActionEvent e) {
				InUser.setText("");
				InKey.setText("");
			}
		});
		conforim.addActionListener(new ActionListener() { //��½����

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFrame a=new JFrame();
				JTextArea JT=new JTextArea();
				a.add(JT);
				a.setSize(500, 70);
				a.setLocationRelativeTo(null);
				a.setVisible(true);
				if(check(InUser.getText(),String.valueOf(InKey.getPassword()))) {
					JT.setText("��½�ɹ�");
				}
				else {
					JT.setText("�û������������");
				}
			}
		});
		jp3.add(reset);
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		this.setSize(250,150);//���ô��ڴ�С
		this.setLocationRelativeTo(null);//������ʾʱ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public boolean check(String username,String password) {
		try {
			if(password.equals("' or '1' = '1")) {
				return false;
			}
			String dr="com.mysql.jdbc.Driver";
			Class.forName(dr);
			String url= "jdbc:mysql://localhost:3306/stu?useSSL=false";
			Connection con=DriverManager.getConnection(url,"root","13868588663");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select username,password from usertable where username='"+username+"'"
					+ "and password='"+password+"';");
			if(rs.next()) {
				con.close();
				return true;
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new T1done2();//��������
	}

}