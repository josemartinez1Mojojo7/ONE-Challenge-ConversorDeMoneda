package com.conversor;

import javax.swing.JOptionPane;

public class ConversorMoneda {
	
	//Moneda estimado en Arg del mes de Julio, 2023
	double MONEDA_DOLAR=261.520;
	double MONEDA_EUROS=287.820;
	double MONEDA_LIBRAS_ESTERLINAS=336.574;
	double MONEDA_YEN_JAPONES=1.85741;
	double MONEDA_WON_SURCOREA=0.202216;
	
	//Moneda estimado en DOLAR
	double DOLAR_PESOS=0.00380951;
	//Moneda estimado en EURO
	double EURO_PESOS=0.00346232;
	//Moneda estimado en LIBRAS
	double LIBRAS_ESTERLINAS_PESOS=0.00296271;
	//Moneda estimado en YEN
	double YEN_JAPONES_PESOS=0.538401;
	//Moneda estimado en WON
	double WON_SURCOREA_PESOS=4.94623;
	
	Moneda moneda = new Moneda();
	Object[] possibleOpciones = {"De Pesos(Arg) a Dólar", "De Pesos(Arg) a Euro", 
								 "De Pesos(Arg) a Libras Esterlinas", "De Pesos(Arg) a Yen Japonés", 
								 "De Pesos(Arg) a Won SurCoreano", "De Dólar a Pesos(Arg)", 
								 "De Euro a Pesos(Arg)", "De Libras Esterlinas a Pesos(Arg)", 
								 "De Yen Japonés a Pesos(Arg)", "De Won SurCoreano a Pesos(Arg)"};
	
	public void Convertir(double valor) {
	
		String opcion = (JOptionPane.showInputDialog(null,"Elije la moneda a convertir",  "Monedas",
				JOptionPane.INFORMATION_MESSAGE, null, possibleOpciones,possibleOpciones[0])).toString();
		
		switch (opcion) {
		case "De Pesos(Arg) a Dólar": 
			moneda.setCantidad(valor);
			moneda.setTipoMoneda("$");
			moneda.setMoneda(MONEDA_DOLAR);
			moneda.conversorMoneda();
			break;
		
		case "De Pesos(Arg) a Euro": 
			moneda.setCantidad(valor);
			moneda.setTipoMoneda("€");
			moneda.setMoneda(MONEDA_EUROS);
			moneda.conversorMoneda();
			break;
			
		case "De Pesos(Arg) a Libras Esterlinas":
			moneda.setCantidad(valor);
			moneda.setTipoMoneda("£");
			moneda.setMoneda(MONEDA_LIBRAS_ESTERLINAS);
			moneda.conversorMoneda();
			break;
			
		case "De Pesos(Arg) a Yen Japonés":
			moneda.setCantidad(valor);
			moneda.setTipoMoneda("¥");
			moneda.setMoneda(MONEDA_YEN_JAPONES);
			moneda.conversorMoneda();
			break;
			
		case "De Pesos(Arg) a Won SurCoreano":
			moneda.setCantidad(valor);
			moneda.setTipoMoneda("₩");
			moneda.setMoneda(MONEDA_WON_SURCOREA);
			moneda.conversorMoneda();
			break;
		
		case "De Dólar a Pesos(Arg)":
			moneda.setCantidad(valor);
			moneda.setTipoMoneda("$");
			moneda.setMoneda(DOLAR_PESOS);
			moneda.conversorMoneda();
			break;
			
		case "De Euro a Pesos(Arg)":
			moneda.setCantidad(valor);
			moneda.setTipoMoneda("$");
			moneda.setMoneda(EURO_PESOS);
			moneda.conversorMoneda();
			break;
			
		case "De Libras Esterlinas a Pesos(Arg)":
			moneda.setCantidad(valor);
			moneda.setTipoMoneda("$");
			moneda.setMoneda(LIBRAS_ESTERLINAS_PESOS);
			moneda.conversorMoneda();
			break;
		 
		case "De Yen Japonés a Pesos(Arg)":
			moneda.setCantidad(valor);
			moneda.setTipoMoneda("$");
			moneda.setMoneda(YEN_JAPONES_PESOS);
			moneda.conversorMoneda();
			break;
			
		case "De Won SurCoreano a Pesos(Arg)":
			moneda.setCantidad(valor);
			moneda.setTipoMoneda("$");
			moneda.setMoneda(WON_SURCOREA_PESOS);
			moneda.conversorMoneda();
			break;
		}
	
	}
	
}
