package com.scg;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerController {
	
	private static FileHandler filehandler;
	private static Logger logger;
	private static SimpleFormatter formatter;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		filehandler=new FileHandler("file.txt"); // , true- append mode
		logger=Logger.getLogger("Test");
		logger.addHandler(filehandler);
		formatter=new SimpleFormatter();
		filehandler.setFormatter(formatter);
		logger.setLevel(Level.WARNING);
		logger.info("Info");
		logger.warning("Warning");
		logger.severe("Severe");

	}

}
