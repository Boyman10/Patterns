package com.rhm.pattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * Class personalizing Dialog
 * @author John
 */
public class ODialog extends JDialog {

	private static final long serialVersionUID = 3622715224324910278L;

	private ArrayList<IObserver> lObs = new ArrayList<IObserver>();
	
	public ODialog(JFrame parent,String title, boolean modal){

	    super(parent, title, modal);
	    	    
	    this.setSize(200, 80);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    
	    JButton ok = new JButton("OK");
	    
	    this.add(ok);
	    
	    ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// We are going to close the dialog box here and send the window a text to display !
				notifyObserver();
				setVisible(false);
			}
	    	
	    	
	    	
	    });
	    	      

	  }
	
	
	
	public void addObserver(IObserver o) {
		
		lObs.add(o);
	}
	
	public void notifyObserver() {
		
	    for(IObserver obs : this.lObs )
	        obs.update("We did click on the button !!");
		
	}
	
}
