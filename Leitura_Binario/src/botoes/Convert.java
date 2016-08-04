package botoes;

import java.util.ArrayList;
import java.util.List;


public class Convert {
	
	private List<String>listaBinarios = new ArrayList<String>();
	private String auxiliar;
	
	public String conversaoParaBinario(String texto) {
		
		for(int i = 0;  i < texto.length(); i++){
			if (listaBinarios == null) {
				if(Integer.toBinaryString((int)texto.charAt(i)).length() < 8) {
					String aux = Integer.toBinaryString((int)texto.charAt(i));
					while(aux.length() < 8) {
						aux = 0 + aux;
					}
					listaBinarios.add(i, aux);
				} else {
					listaBinarios.add(i, Integer.toBinaryString((int)texto.charAt(i)));
				}
			} else {
				if(Integer.toBinaryString((int)texto.charAt(i)).length() < 8) {
					String aux = Integer.toBinaryString((int)texto.charAt(i));
					while(aux.length() < 8) {
						aux = 0 + aux;
					}
					listaBinarios.add(i, aux);
				} else {
					listaBinarios.add(i, Integer.toBinaryString((int)texto.charAt(i)));
				}
			}
		}
		auxiliar = listaBinarios.get(0);
		for(int i = 1;  i < texto.length(); i++){
			auxiliar = auxiliar.concat(listaBinarios.get(i));
		}
		listaBinarios.clear();
		
		return auxiliar;
	}
	
	public String conversaoParaPalavra(String texto) {
		String auxBinario = null;
		if(texto.length() % 8 != 0) {
			System.out.println("Valor binário inválido para conversão");
			return "Valor binário inválido para conversão";
		} else {
			for(int i = 0; i < texto.length()/8; i++) {
				auxBinario = texto.substring(i * 8, (i * 8) + 8);
				listaBinarios.add(i, String.valueOf((char)Integer.parseInt(auxBinario, 2)));
				System.out.println(auxBinario + "->" + String.valueOf((char)Integer.parseInt(auxBinario, 2)));
			}
			auxiliar = listaBinarios.get(0);
			for(int i = 1;  i < texto.length()/8; i++){
				auxiliar = auxiliar.concat(listaBinarios.get(i));
			}
			System.out.println(auxiliar);
		}
		listaBinarios.clear();
		
		return auxiliar;
	}

}
