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
		Frame f = new Frame("GUI����");
		f.setLocation(500, 500);
		f.setSize(666, 666);

		//����һ���ı���
		TextField textField = new TextField(30);
		//���ı������ڴ���f�ı���
		f.add(textField, BorderLayout.NORTH);
		//����һ����ť��Button
		Button btn = new Button("������");
		f.add(btn); //����ť���뵽�ı�����ȥ
		btn.addActionListener(new ActionListener() {
			//����ʵ����һ�������࣬ע��
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String info = textField.getText();//�õ�����������е���Ϣ

				f.setTitle(info);//����ȡ����Ϣ�����ڸ��Ĵ��ڱ���
			}

		});
		f.pack();//�Լ����ڴ��ڴ�С
		f.setVisible(true);//��ʾ���

		//����һ���¼�
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {//������������ģʽ
				System.out.println("�˳�����");
				System.exit(0);//�Ƴ�JVM
			}
		});
	}
}
