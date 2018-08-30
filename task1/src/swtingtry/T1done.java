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
	// 定义组建
	JPanel jp1;
	JButton jb1,jb2;
	JTextField jtf1;
	//创建菜单栏
	JMenuBar jmb;
	JMenu jm1,jm2;
	JMenuItem item1,item2,item3,item4;//二级菜单
	

	public static void main(String[] args) {
		T1done g1 = new T1done();
	}

	// 构造函数
	public T1done() {
		jp1 = new JPanel();
		jtf1 = new JTextField(30);
		jb1 = new JButton("读取"); //读取文本
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
		jb2=new JButton("保存");
		
		//事件处理
		jb2.addActionListener(new ActionListener() {
            // 事件处理
            @Override
            public void actionPerformed(ActionEvent e) {
                //点击保存的反应
            	JFrame jf2 = new JFrame("未知领域");
            	JTextArea  jt2 = new JTextArea("\r\n" + 
            			"\r\n" + 
            			"关雎\r\n" + 
            			"\r\n" + 
            			"作者：《诗经》\r\n" + 
            			"\n"+
            			"关关雎鸠，在河之洲。\r\n" + 
            			"窈窕淑女，君子好逑。\r\n" + 
            			"参差荇菜，左右流之。\r\n" + 
            			"窈窕淑女，寤寐求之。\r\n" + 
            			"求之不得，寤寐思服。\r\n" + 
            			"悠哉悠哉，辗转反侧。\r\n" + 
            			"参差荇菜，左右采之。\r\n" + 
            			"窈窕淑女，琴瑟友之。\r\n" + 
            			"参差荇菜，左右芼之。\r\n" + 
            			"窈窕淑女，钟鼓乐之。\r\n" + 
            			"");
            	//jt2.setAlignmentX((float) 0.5);
            	jf2.add(jt2);
            	jf2.setSize(500, 500);
            	jf2.setLocationRelativeTo(null);// 窗体居中显示
            	jf2.setVisible(true);
              
             }
        });
			
		
		//菜单栏组件
		jmb = new JMenuBar();
		jm1 = new JMenu("文件");
		jm2 = new JMenu("帮助");
		item1 = new JMenuItem("打开");
		item2 = new JMenuItem("保存");
		item3 = new JMenuItem("问题反馈");
		item4 = new JMenuItem("联系作者");
		item4.addActionListener(new ActionListener() {
			@Override
			 public void actionPerformed(ActionEvent e) {
				JFrame jf=new JFrame("激情时刻");
				JTextArea ja=new JTextArea("走心吗，小老弟");
				jf.add(ja);
				jf.setSize(500, 70);
				jf.setLocationRelativeTo(null);
				jf.setVisible(true);
			}
		});
		//添加菜单栏组件
		jmb.add(jm1);
		jmb.add(jm2);
		//添加二级菜单组件
		jm1.add(item1);
		jm1.add(item2);
		jm2.add(item3);
		jm2.add(item4);
		
		// 加入各个组件
		jp1.add(new JLabel("URL"));
		jp1.add(jtf1);
		jp1.add(jb1);
		jp1.add(jb2);
		//往窗体中添加菜单栏
		this.setJMenuBar(jmb);
		//往窗体中添加面板
		this.add(jp1);
		this.setSize(500, 200);
		this.setTitle("文件下载");
		this.setLocationRelativeTo(null);// 窗体居中显示
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}