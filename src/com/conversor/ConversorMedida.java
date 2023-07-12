package com.conversor;

import javax.swing.JOptionPane;

public class ConversorMedida {
	
	// 1km = 1000m
	double unKilometro=1000;
	// 1mi = 1.60934Km
	double unaMilla=1.60934;
	// 1yd = 0.9144m
	double unaYarda=0.9144;
	// 1in = 2.54cm
	double unaPulgada=2.54;
	
	Medida medida = new Medida();
	Object[] possibleOpciones = {"De Kilometro a Metro", "De Metro a Kilometro", 
								 "De Milla a Kilometro", "De Kilometro a Milla", 
								 "De Yarda a Metro", "De Metro a Yarda", 
								 "De Pulgada a Centimetro", "De Centimetro a Pulgada"};
	
	public void Convertir(double valor) {
	
		String opcion = (JOptionPane.showInputDialog(null,"Elije la moneda a convertir",  "Medidas",
				JOptionPane.INFORMATION_MESSAGE, null, possibleOpciones,possibleOpciones[0])).toString();
		
		switch (opcion) {
		case "De Kilometro a Metro":
			medida.setCantidad(valor);
			medida.setTipoMedida("m");
			medida.setMedida(unKilometro);
			medida.conversorMedida();
			break;
		
		case "De Metro a Kilometro": 
			medida.setCantidad(valor);
			medida.setTipoMedida("km");
			medida.setMedida(unKilometro);
			medida.conversorMedida();
			break;
			
		case "De Milla a Kilometro":
			medida.setCantidad(valor);
			medida.setTipoMedida("km");
			medida.setMedida(unaMilla);
			medida.conversorMedida();
			break;
			
		case "De Kilometro a Milla":
			medida.setCantidad(valor);
			medida.setTipoMedida("mi");
			medida.setMedida(unaMilla);
			medida.conversorMedida();
			break;
			
		case "De Yarda a Metro":
			medida.setCantidad(valor);
			medida.setTipoMedida("m");
			medida.setMedida(unaYarda);
			medida.conversorMedida();
			break;
		
		case "De Metro a Yarda":
			medida.setCantidad(valor);
			medida.setTipoMedida("yd");
			medida.setMedida(unaYarda);
			medida.conversorMedida();
			break;
			
		case "De Pulgada a Centimetro":
			medida.setCantidad(valor);
			medida.setTipoMedida("cm");
			medida.setMedida(unaPulgada);
			medida.conversorMedida();
			break;
			
		case "De Centimetro a Pulgada":
			medida.setCantidad(valor);
			medida.setTipoMedida("in");
			medida.setMedida(unaPulgada);
			medida.conversorMedida();
			break;
		}
	
	}
	
}
