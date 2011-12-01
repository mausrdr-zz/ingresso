/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.model;

/**
 * @author mauro
 *
 */
public class CPF {
	
	public static boolean validaCPF(String numero) throws Exception {
		if(numero.length() == 11)
			return validaCPFNumero(numero);
		return false;
	}

	private static boolean validaCPFNumero(String n) {
		try {
			int j = n.length();
			String [] s1 = new String[j];
			int [] nCPF = new int[j];
			int somatorio1 = 0;
			int somatorio2 = 0;
			
			for(int i=0; i < n.length(); i++) {
				s1[i] = "" + n.charAt(i);
				nCPF[i] = Integer.valueOf(s1[i]).intValue();
				if(i < 9){
					somatorio1 += nCPF[i] * (i+1);
					somatorio2 += nCPF[i] * (9-i);
				}
			}
			
			int verificador1 = (somatorio1 % 11 == 10)? 0 : somatorio1 % 11;
			int verificador2 = (somatorio2 % 11 == 10)? 0 : somatorio2 % 11;
			
			return(verificador1 == nCPF[9] && verificador2 == nCPF[10]);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
