package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import model.GrayShades;
import model.Icon;

public class GrayPanel extends JPanel implements Observer{
	
	private static final long serialVersionUID = 1L;
	
	Icon icon;
	GrayShades shades;
	JLabel min,max,avg;
	
	public GrayPanel(Icon icon) {
		this.icon = icon;
		icon.addObserver(this);
		
		shades = new GrayShades(icon);
		
		setLayout(new BorderLayout());
		add(new JLabel("Intensità di grigio:", JLabel.CENTER), BorderLayout.CENTER);
		JPanel p = new JPanel();
		add(p, BorderLayout.SOUTH);
		p.setLayout(new GridLayout(1,6));
		p.add(new JLabel("Min:", JLabel.RIGHT));
		min = new JLabel(String.valueOf(shades.getMin()));
		p.add(min);
		p.add(new JLabel("Max:", JLabel.RIGHT));
		max = new JLabel(String.valueOf(shades.getMax()));
		p.add(max);
		p.add(new JLabel("Avg:", JLabel.RIGHT));
		avg = new JLabel(String.valueOf(shades.getAvg()));
		p.add(avg);
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		min.setText(String.valueOf(shades.getMin()));
		max.setText(String.valueOf(shades.getMax()));
		avg.setText(String.valueOf(shades.getAvg()));
	}

}
