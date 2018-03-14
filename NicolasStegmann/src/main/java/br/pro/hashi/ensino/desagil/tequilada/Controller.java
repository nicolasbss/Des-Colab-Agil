package br.pro.hashi.ensino.desagil.tequilada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//A expressão "implements ActionListener" estabelece
//que objetos dessa classe podem reagir ao relógio.
public class Controller implements ActionListener, KeyListener {
	private Model model;
	private View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	// Esse método especial, que a expressão "implements ActionListener"
	// obriga a ter, é o método chamado pelo relógio a cada segundo.
	@Override
	public void actionPerformed(ActionEvent event) {
		model.update(0,0);
		view.repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
	        model.update(0,1);
	        view.repaint();
	    }
	    
	    else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
	        model.update(0,-1);
	        view.repaint();
	    }
	    
	    else if(e.getKeyCode() == KeyEvent.VK_UP) {
	        model.update(-1,0);
	        view.repaint();
	    }
	    
	    else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
	        model.update(1,0);
	        view.repaint();
	    }
	}	
		
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
