package com.rhm.pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class launching Window 
 * @author John
 * @version 1.0.0
 */
public class Main {

	static final Logger logger = LogManager.getLogger("com.rhm.pattern");
			
	
	public static void main(String[] args) {

		logger.debug("Starting program...");
		
		MyFrame window = new MyFrame();
	    
		window.setVisible(true);		
	}

  

}
