package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ArchivioPianeti {
	
	HashMap<String, Pianeta> archivio;

	public ArchivioPianeti() {
		super();
		archivio = new HashMap<String, Pianeta>();
	}
	
	public void addPianeta(String nome, Pianeta p){
		archivio.put(nome, p);		
	}
	
	public Pianeta trovaPianeta(String nome){
		return archivio.get(nome);		
	}
	
	public ArchivioPianeti cercaPianetiAffini(String nome){
		Pianeta p = trovaPianeta(nome);
		if( p == null )
			return null;
		
		ArchivioPianeti coll = new ArchivioPianeti();
		for (Entry<String, Pianeta> temp  : archivio.entrySet()) {
			if( p.isAffine(temp.getValue()) )
				coll.addPianeta(temp.getKey(), temp.getValue());
		}
			
		return coll;
	}
	
	
	public void stampaElenco(){
		
		System.out.println("Nome\tDiam\tMinTem\tMaxTem\tElementi");
		for (Entry<String, Pianeta> temp  : archivio.entrySet()) {
			System.out.print(	temp.getKey()+"\t"+temp.getValue().getDiametro()+"\t"+temp.getValue().getMinTemp()+"\t"
								+temp.getValue().getMaxTemp()+"\t"
							);
			ArrayList<Elemento> elementi = new ArrayList<Elemento>();
			elementi.addAll(0, temp.getValue().getElementi());
			for (Elemento elemento : elementi) {
				System.out.print(elemento.getNome()+" "+elemento.getConcentrazione()+"\t");
			}
			System.out.print("\n");
		}

	}
	
	

}
