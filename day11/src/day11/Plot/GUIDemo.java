package day11.Plot;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.LayoutManager;

public class GUIDemo {
	public static void main(String[] args) {
		Frame f = new Frame("GUI界面");
		f.setLocation(500, 500);
		f.setSize(666, 666);

		//创建一个文本框
		TextField textField = new TextField(30);
		//把文本框存放在窗口f的北部
		f.add(textField, BorderLayout.NORTH);
		//创建一个按钮：Button
		Button btn = new Button("点秋香");
		f.add(btn); //将按钮加入到文本框中去
		btn.addActionListener(new ActionListener() {
			//这里实现了一个匿名类，注意
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String info = textField.getText();//得到我们输入框中的信息

				f.setTitle(info);//将获取的信息，用于更改窗口标题
			}

		});
		f.pack();//自己调节窗口大小
		f.setVisible(true);//显示组件

		//设置一个事件
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {//采用了适配器模式
				System.out.println("退出程序");
				System.exit(0);//推出JVM
			}
		});
	}
}
