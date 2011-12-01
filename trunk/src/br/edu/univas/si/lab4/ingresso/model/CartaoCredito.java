/**
 * 
 */
package br.edu.univas.si.lab4.ingresso.model;

/**
 * @author mauro
 *
 */
public class CartaoCredito {
	public static final int INVALID = -1; 
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;
	public static final int AMERICAN_EXPRESS = 2;
	public static final int EN_ROUTE = 3;
	public static final int DINERS_CLUB = 4;

	private static final String [] nomesCartao =
	{ "Visa" ,
	"Mastercard",
	"American Express",
	"En Route",
	"Diner's CLub/Carte Blanche",
	};

	/**
	* Valida um número de Cartão de Crédito
	*/
	public static boolean validaCC(String numero) throws Exception { 
		@SuppressWarnings("unused")
		int cartaoID;
		if ( (cartaoID = getCartaoID(numero)) != -1)
			return validaCCNumero(numero);
		return false;
	}

	/**
	* Pega o tipo da bandeira do Cartão
	* e retorna a bandeira do cartão de credito
	* INVALID = -1; 
	* VISA = 0;
	* MASTERCARD = 1;
	* AMERICAN_EXPRESS = 2;
	* EN_ROUTE = 3;
	* DINERS_CLUB = 4;
	*/
	public static int getCartaoID(String numero) {
		int valida = INVALID;

		String digito1 = numero.substring(0,1);
		String digito2 = numero.substring(0,2);
		String digito3 = numero.substring(0,3);
		String digito4 = numero.substring(0,4);
		if (isNumber(numero)) {
			/* ----
			 ** prefixo do VISA =4
			 ** ---- length=13 ou 16 (pode ser 15 também!?! talvez, mas não vem ao caso)
			 */
			if (digito1.equals("4")) { 
				if (numero.length() == 13 || numero.length() == 16)
					valida = VISA;
			}
			/* ----------
			** prefixo MASTERCARD = 51 ... 55
			** ---------- length= 16
			*/
			else if (digito2.compareTo("51")>=0 && digito2.compareTo("55")<=0) {
				if (numero.length() == 16)
					valida = MASTERCARD;
			}
			/* ----
			** prefixo AMEX =34 ou 37
			** ---- length=15
			*/
			else if (digito2.equals("34") || digito2.equals("37")) {
				if (numero.length() == 15)
					valida = AMERICAN_EXPRESS;
			}
			/* -----
			** prefixo ENROU =2014 ou 2149
			** ----- length=15
			*/
			else if (digito4.equals("2014") || digito4.equals("2149")) {
				if (numero.length() == 15)
					valida = EN_ROUTE;
			}
			/* -----
			** prefixo DCLUB =300 ... 305 ou 36 ou 38
			** ----- length=14
			*/
			else if (digito2.equals("36") || digito2.equals("38") || (digito3.compareTo("300")>=0 && digito3.compareTo("305")<=0)) {
				if (numero.length() == 14)
					valida = DINERS_CLUB;
			}
		} 
		return valida;
	}

	public static boolean isNumber(String n) {
		try {
			@SuppressWarnings("unused")
			double d = Double.valueOf(n).doubleValue();
			return true;
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static String getNomeCartao(int id) {
		return (id > -1 && id < nomesCartao.length ? nomesCartao[id] : "");
	}

	public static boolean validaCCNumero(String n) {
		try {
			/*
			 ** Usando o algoritmo de Luhn
			 */
			int j = n.length();

			String [] s1 = new String[j];
			int [] nCartao = new int[j];
			for (int i=0; i < n.length(); i++) {
				s1[i] = "" + n.charAt(i);
				nCartao[i] = Integer.valueOf(s1[i]).intValue();
			}
			int somatorio = 0; 

			for (int i=nCartao.length-1; i >= 0; i-= 2) {
				int k = 0;

				if (i > 0) {
					k = nCartao[i-1] * 2;
					if (k > 9) {
						k -=9;
					}
					somatorio += nCartao[i] + k;
				}
				else{
					somatorio += nCartao[0];
				}
			}
			return ((somatorio % 10) == 0);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}