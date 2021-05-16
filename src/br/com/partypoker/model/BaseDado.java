package br.com.partypoker.model;

import java.util.ArrayList;

public class BaseDado {
	
	private static ArrayList<Mesa> listaMesas = new ArrayList<>();
	
	public static void createMesa(Mesa mesa) {
		if (reatriveMesa(mesa) == null) {
			listaMesas.add(mesa);
			System.out.println("Criou");
		}
	}
	
	public static Mesa reatriveMesa(Mesa mesa) { //Retornando um bool,X indice e usuario (FAÇA COM ESSES DOIS)
		for (Mesa mesas : listaMesas) {
			if (mesa.getId().equals(mesas.getId())){
				return mesas;					
			}
		}
		return null;
	}
	
	public static boolean updateMesa(Mesa mesa) { //Atualizar
		Mesa m = reatriveMesa(mesa);
		if(m != null) 
			return true;
		return false;
	}
}
