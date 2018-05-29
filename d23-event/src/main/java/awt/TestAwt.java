package com.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestAwt {
	// 1. �������ڼ�����
	private Frame f = new Frame("����AWT���");
	private Panel p = new Panel();
	
	// 2. �������
	// ��ѡ��
	private Checkbox c1 = new Checkbox("����");
	private Checkbox c2 = new Checkbox("����");
	
	private Button submitButton = new Button("�ύ");
	
	private Label messageLabel = new Label("        ");
	
	// ��ѡ�����
	private CheckboxGroup cbg = new CheckboxGroup();
	// ��ѡ��
	private Checkbox c3 = new Checkbox("��", true, cbg);
	private Checkbox c4 = new Checkbox("Ů", false, cbg);

	// choice
	private Choice cityChoice = new Choice();
	
	// �б�� 
	private List friendList = new List();
	
	// �����ı���
	private TextArea ta = new TextArea(5,20);
	
	// �˵���
	private MenuBar mb = new MenuBar();
	// �˵�
	private Menu fileMenu = new Menu("File");
	private Menu helpMenu = new Menu("Help");
	
	// �Ի���
	private Dialog aboutDialog = new Dialog(f, "About me", false);
	
	public TestAwt(){
		init();
	}
	
	/**
	 * �����ʼ��
	 */
	public void init(){
		// ------------------------------------------------
		// checkbox
		// ��submit��ť������굥���¼��Ĵ���
		submitButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = "";
				
				// ����checkbox��ѡ��״̬�����label������
				if (c1.getState()){
					message += c1.getLabel();
				} 
				
				if (c2.getState()){
					message += c2.getLabel();
				}
				
				messageLabel.setText(message);						
			}		
		});
		
		// ------------------------------------------------
		// choice
		// ��choice���Ԫ��
		cityChoice.add("��ͨ");
		cityChoice.add("�Ͼ�");
		cityChoice.add("�Ϻ�");
		cityChoice.add("����");
		
		// ��Ԫ������״̬�л��¼��Ĵ�����
		cityChoice.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				String item = cityChoice.getSelectedItem();
				System.out.println(item);
			}
			
		});
		
		
		
	
		// ------------------------------------------------
		// list
		friendList.add("tom");
		friendList.add("jerry");
		friendList.add("jack");
		friendList.add("john");
		friendList.add("hellen");
		
		// ���б����������˫���¼��Ĵ���
		friendList.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
				
				// ͨ�������������Ĵ������ж��Ƿ�Ϊ˫��
				if (e.getClickCount() == 2){
					String item = friendList.getSelectedItem();
					
					System.out.println(item);
				}		
			}
			
		});
		
		// ------------------------------------------------
		// Menu
		// �˵�ѡ��
		MenuItem m1 = new MenuItem("New...");
		MenuItem m2 = new MenuItem("Save...");
		MenuItem m3 = new MenuItem("Exit");
		
		MenuItem m4 = new MenuItem("About me");
		m4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				aboutDialog.setVisible(true);
			}		
			
		});
		
		// ���˵�����뵽�˵���
		fileMenu.add(m1);
		fileMenu.add(m2);
		fileMenu.add(m3);
		
		helpMenu.add(m4);
		
		// ���˵����뵽�˵�����
		mb.add(fileMenu);
		mb.add(helpMenu);
		
		// �Ѳ˵������뵽������
		f.setMenuBar(mb);
		
		// ------------------------------------------------
		// dialog
		Label msgLabel = new Label("about me.....");
		aboutDialog.add(msgLabel);
		
		aboutDialog.setSize(150,150);
		
		
		// 3. ��װ
		// a.
		p.add(c1);
		p.add(c2);
		p.add(submitButton);
		p.add(messageLabel);
		
		p.add(c3);
		p.add(c4);
		
		p.add(cityChoice);
		
		p.add(friendList);
		
		p.add(ta);
		// b.
		f.add(p);
		
		// 4. ���ô������ԣ�����ʾ����
		// ���������ӹر��¼�����
		f.addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(-1);
			}
			
		});
			
		f.setSize(200, 200);
		f.setLocation(200, 200);
		
		f.setVisible(true);
		
	}	// init
	
	
	public static void main(String[] args) {
		TestAwt testAwt = new TestAwt();
	}
}
