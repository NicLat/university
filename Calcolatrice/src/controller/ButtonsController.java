package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Calculator;
import model.CalculatorException;
import model.Divide;
import model.Multiply;
import model.ScreenStr;
import model.Subtract;
import model.Sum;

public class ButtonsController {

	Calculator calcolatrice;
	ButtonPanel bottoni;
	ScreenStr schermo;
	
	public ButtonsController(Calculator calcolatrice, ButtonPanel bottoni, ScreenStr schermo) {
		super();
		this.calcolatrice = calcolatrice;
		this.bottoni = bottoni;
		this.schermo = schermo;
	}
	
	public void setListeners(){
		
		bottoni.getEqual().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					calcolatrice.calculate(schermo.getScreen());
				} catch (CalculatorException e1) {
					schermo.clearScreen();
					schermo.setScreen(e1.getMessage());
				}
				calcolatrice.setOperator(null);
			}
		});
		
		bottoni.getC().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				schermo.clearScreen();
				calcolatrice.setOperator(null);
			}
		});
		
		
		bottoni.getOperators()[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcolatrice.setOperator(new Sum());
				schermo.appendScreen(" + ");
			}
		});
		bottoni.getOperators()[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (calcolatrice.getOperator() != null || schermo.isEmpty()){
					schermo.appendScreen("-");
				}else{
					calcolatrice.setOperator(new Subtract());
					schermo.appendScreen(" - ");
				}
			}
		});
		bottoni.getOperators()[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcolatrice.setOperator(new Multiply());
				schermo.appendScreen(" * ");
			}
		});
		bottoni.getOperators()[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calcolatrice.setOperator(new Divide());
				schermo.appendScreen(" / ");
			}
		});
	
		
		bottoni.getNumbers()[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				schermo.appendScreen("0");
			}
		});	
		bottoni.getNumbers()[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				schermo.appendScreen("1");
			}
		});	
		bottoni.getNumbers()[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				schermo.appendScreen("2");
			}
		});	
		bottoni.getNumbers()[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				schermo.appendScreen("3");
			}
		});	
		bottoni.getNumbers()[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				schermo.appendScreen("4");
			}
		});	
		bottoni.getNumbers()[5].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				schermo.appendScreen("5");
			}
		});	
		bottoni.getNumbers()[6].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				schermo.appendScreen("6");
			}
		});	
		bottoni.getNumbers()[7].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				schermo.appendScreen("7");
			}
		});	
		bottoni.getNumbers()[8].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				schermo.appendScreen("8");
			}
		});	
		bottoni.getNumbers()[9].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				schermo.appendScreen("9");
			}
		});	
		
	}
}
