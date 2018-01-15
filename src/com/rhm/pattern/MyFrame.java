package com.rhm.pattern;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyFrame extends JFrame implements IObserver {

	private static final long serialVersionUID = 7889015870903963050L;

	static final Logger logger = LogManager.getLogger("com.rhm.pattern");
	
	public MyFrame() {
		
	    this.setTitle("Trying design patterns");
	    this.setSize(400, 100);
	    this.setLocationRelativeTo(null);               
	 
	    JPanel pan = new JPanel();
	    JButton but = new JButton("Dialog with me !");
	    
	    but.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Launching JDialog
				ODialog dialog = new ODialog(null,"Opened Dialog", true);
				dialog.addObserver((IObserver)SwingUtilities.getRoot((Component) e.getSource()));
				dialog.setVisible(true);
			}
	    	
	    	
	    });
	    
	    pan.setBackground(Color.ORANGE);   
	    pan.add(but);
	    
	    this.setContentPane(pan);               
	    
	}
	
	@Override
	public void update(Object arg1) {

		logger.trace("retrieving submitted string from Dialog box : " + arg1);
		
		this.setTitle(arg1.toString());
		
	}
	
	
	
}
