package controllo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;

import modello.CatalogoDigitale;
import modello.Pezzo;
import vista.BarraMenu;
import vista.LeggiCatalogo;
import files.loader.CaricaRiga;

public class MenuController {
	
	private CatalogoDigitale catalogoDigitale;
	private BarraMenu bar;
	private LeggiCatalogo vistaCata;
		

	public MenuController(CatalogoDigitale catalogoDigitale, BarraMenu bar,
			LeggiCatalogo vistaCata) {
		super();
		this.catalogoDigitale = catalogoDigitale;
		this.bar = bar;
		this.vistaCata = vistaCata;
	}

	public void setListeners(){

		bar.getInserisci().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser filechooser = new JFileChooser();
				if (filechooser.showOpenDialog(bar) == JFileChooser.APPROVE_OPTION){
					File f = filechooser.getSelectedFile();
					String nomefile = f.getAbsolutePath();
					//System.out.println(nomefile);
					catalogoDigitale.caricaPezzi(nomefile, new CaricaRiga(catalogoDigitale));
				}
			}
		});
		
		bar.getFiltri()[0].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {			 
				vistaCata.setFiltro(Pezzo.SALE[0]);				
			}
		});
		bar.getFiltri()[1].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {			 
				vistaCata.setFiltro(Pezzo.SALE[1]);				
			}
		});
		bar.getFiltri()[2].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {			 
				vistaCata.setFiltro(Pezzo.SALE[2]);				
			}
		});
		bar.getFiltri()[3].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {			 
				vistaCata.setFiltro(Pezzo.SALE[3]);				
			}
		});
		bar.getFiltri()[4].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {			 
				vistaCata.setFiltro(Pezzo.SALE[4]);				
			}
		});
		bar.getFiltri()[5].addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {			 
				vistaCata.setFiltro("Tutti");				
			}
		});
		
		bar.getEsporta().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				catalogoDigitale.esportaCatalogo();
			}
		});
				
	}
	

}
