package br.pro.hashi.ensino.desagil.tequilada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
	    System.out.println("Projeto 1");
	    BufferedReader br = null;
	    String line;
	    
	    
	    try {
	    	br = new BufferedReader(new FileReader("C:\\Users\\Nicolas Stegmann\\Documents\\GitHub\\Des-Colab-Agil\\NicolasStegmann\\src\\main\\java\\br\\pro\\hashi\\ensino\\desagil\\tequilada\\labirinto.txt"));
	    } catch (FileNotFoundException fnfex) {
	    	System.out.println(fnfex.getMessage() + "Arquivo nao encontrado");
	    }
	    
	    try {
	    	while ((line = br.readLine()) != null) {
	    		StringBuilder newline = new StringBuilder(line);
	        	for (int i = 0; i < newline.length(); i++) {
	  	        	if (newline.charAt(i) == '#') {
	        		newline.setCharAt(i, 'X');
	    		}
	    	}
	        System.out.println(newline);
	    }
	    		
	    	
	    } catch (IOException ioex) {
	    	System.out.println(ioex.getMessage() + "Erro na leitura do aqruivo");
	    } finally {
	    	System.exit(0);
	    }
		

	}
}
