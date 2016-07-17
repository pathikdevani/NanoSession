package com.spidren.main;

import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException{
		System.out.println("start");
		Server server = new Server(8080);
		server.start(0,false);
		System.out.println("complete");
	}
}	
