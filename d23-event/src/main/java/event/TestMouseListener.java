package com.event;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class TestMouseListener {

	private Frame f = new Frame();
	
	
	public TestMouseListener(){
		
		f.addMouseListener(new MouseAdapter(){

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseEntered(e);
				f.setBackground(Color.red);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseExited(e);
				
				f.setBackground(Color.BLUE);
			}
			
			
		});
		
		f.setSize(200, 200);
		f.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		TestMouseListener t = new TestMouseListener();
	}
}
