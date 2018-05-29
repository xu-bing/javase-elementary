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
	// 1. 创建窗口及容器
	private Frame f = new Frame("常用AWT组件");
	private Panel p = new Panel();
	
	// 2. 创建组件
	// 复选框
	private Checkbox c1 = new Checkbox("篮球");
	private Checkbox c2 = new Checkbox("足球");
	
	private Button submitButton = new Button("提交");
	
	private Label messageLabel = new Label("        ");
	
	// 单选框分组
	private CheckboxGroup cbg = new CheckboxGroup();
	// 单选框
	private Checkbox c3 = new Checkbox("男", true, cbg);
	private Checkbox c4 = new Checkbox("女", false, cbg);

	// choice
	private Choice cityChoice = new Choice();
	
	// 列表框 
	private List friendList = new List();
	
	// 多行文本框
	private TextArea ta = new TextArea(5,20);
	
	// 菜单栏
	private MenuBar mb = new MenuBar();
	// 菜单
	private Menu fileMenu = new Menu("File");
	private Menu helpMenu = new Menu("Help");
	
	// 对话框
	private Dialog aboutDialog = new Dialog(f, "About me", false);
	
	public TestAwt(){
		init();
	}
	
	/**
	 * 组件初始化
	 */
	public void init(){
		// ------------------------------------------------
		// checkbox
		// 给submit按钮增加鼠标单击事件的处理
		submitButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = "";
				
				// 根据checkbox的选中状态，获得label的内容
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
		// 给choice添加元素
		cityChoice.add("南通");
		cityChoice.add("南京");
		cityChoice.add("上海");
		cityChoice.add("宁波");
		
		// 给元素增加状态切换事件的处理方法
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
		
		// 给列表项增加鼠标双击事件的处理
		friendList.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent e) {
				
				// 通过鼠标连续点击的次数来判断是否为双击
				if (e.getClickCount() == 2){
					String item = friendList.getSelectedItem();
					
					System.out.println(item);
				}		
			}
			
		});
		
		// ------------------------------------------------
		// Menu
		// 菜单选项
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
		
		// 将菜单项加入到菜单中
		fileMenu.add(m1);
		fileMenu.add(m2);
		fileMenu.add(m3);
		
		helpMenu.add(m4);
		
		// 将菜单加入到菜单栏中
		mb.add(fileMenu);
		mb.add(helpMenu);
		
		// 把菜单栏填入到窗口中
		f.setMenuBar(mb);
		
		// ------------------------------------------------
		// dialog
		Label msgLabel = new Label("about me.....");
		aboutDialog.add(msgLabel);
		
		aboutDialog.setSize(150,150);
		
		
		// 3. 组装
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
		
		// 4. 设置窗口属性，并显示窗口
		// 给窗口增加关闭事件处理
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
