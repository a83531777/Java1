package swtingtry;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.awt.Color;

public class T1done extends JFrame {
	// �����齨
	JPanel jp1;
	JButton jb1,jb2;
	JTextField jtf1;
	//�����˵���
	JMenuBar jmb;
	JMenu jm1,jm2;
	JMenuItem item1,item2,item3,item4;//�����˵�
	

	public static void main(String[] args) {
		T1done g1 = new T1done();
	}

	// ���캯��
	public T1done() {
		jp1 = new JPanel();
		jtf1 = new JTextField(30);
		jb1 = new JButton("��ȡ"); //��ȡ�ı�
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url=jtf1.getText();
				BufferedReader br;
				JFrame jp=new JFrame(url);
				JTextArea ja=new JTextArea();
				try {
					br=new BufferedReader(new FileReader(url));
					String s=null,str="";
					while((s=br.readLine())!=null) {
						str+=s+"\r\n";
					}
					System.out.println(str);
					br.close();
					ja.setText(str);
				}
				catch(Exception et) {
					et.printStackTrace();
				}
				jp.add(ja);
				jp.setVisible(true);
				jp.setSize(500,500);
				jp.setLocationRelativeTo(null);
			}
		});
		jb2=new JButton("����");
		
		//�¼�����
		jb2.addActionListener(new ActionListener() {
            // �¼�����
            @Override
            public void actionPerformed(ActionEvent e) {
                //�������ķ�Ӧ
            	JFrame jf2 = new JFrame("δ֪����");
            	JTextArea  jt2 = new JTextArea("\r\n" + 
            			"\r\n" + 
            			"����\r\n" + 
            			"\r\n" + 
            			"���ߣ���ʫ����\r\n" + 
            			"\n"+
            			"�ع���𣚣�ں�֮�ޡ�\r\n" + 
            			"����Ů�����Ӻ��ϡ�\r\n" + 
            			"�β����ˣ�������֮��\r\n" + 
            			"����Ů�������֮��\r\n" + 
            			"��֮���ã����˼����\r\n" + 
            			"�������գ�շת���ࡣ\r\n" + 
            			"�β����ˣ����Ҳ�֮��\r\n" + 
            			"����Ů����ɪ��֮��\r\n" + 
            			"�β����ˣ������d֮��\r\n" + 
            			"����Ů���ӹ���֮��\r\n" + 
            			"");
            	//jt2.setAlignmentX((float) 0.5);
            	jf2.add(jt2);
            	jf2.setSize(500, 500);
            	jf2.setLocationRelativeTo(null);// ���������ʾ
            	jf2.setVisible(true);
              
             }
        });
			
		
		//�˵������
		jmb = new JMenuBar();
		jm1 = new JMenu("�ļ�");
		jm2 = new JMenu("����");
		item1 = new JMenuItem("��");
		item2 = new JMenuItem("����");
		item3 = new JMenuItem("���ⷴ��");
		item4 = new JMenuItem("��ϵ����");
		item4.addActionListener(new ActionListener() {
			@Override
			 public void actionPerformed(ActionEvent e) {
				JFrame jf=new JFrame("����ʱ��");
				JTextArea ja=new JTextArea("������С�ϵ�");
				jf.add(ja);
				jf.setSize(500, 70);
				jf.setLocationRelativeTo(null);
				jf.setVisible(true);
			}
		});
		//���Ӳ˵������
		jmb.add(jm1);
		jmb.add(jm2);
		//���Ӷ����˵����
		jm1.add(item1);
		jm1.add(item2);
		jm2.add(item3);
		jm2.add(item4);
		
		// ����������
		jp1.add(new JLabel("URL"));
		jp1.add(jtf1);
		jp1.add(jb1);
		jp1.add(jb2);
		//�����������Ӳ˵���
		this.setJMenuBar(jmb);
		//���������������
		this.add(jp1);
		this.setSize(500, 200);
		this.setTitle("�ļ�����");
		this.setLocationRelativeTo(null);// ���������ʾ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}