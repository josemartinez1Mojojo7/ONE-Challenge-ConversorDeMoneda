package com.conversor;

import javax.swing.JOptionPane;

public class Medida {
	
	private double cantidad;
	private String tipoMedida;
	private double medida;
	
	public Medida () {}	

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public void setTipoMedida(String tipoMedida) {
		this.tipoMedida = tipoMedida;
	}
	public void setMedida(double medida) {
		this.medida = medida;
	}


	public void conversorMedida() {
		double resultado = this.cantidad * this.medida;
		resultado = (double)Math.round(resultado * 1000d) /1000 ;
		JOptionPane.showMessageDialog(null, "Son: " + resultado + this.tipoMedida);	
	}

	
	public void desconversorMedida() {
		double resultado = this.cantidad / this.medida;
		resultado = (double)Math.round(resultado * 1000d) /1000 ;
		JOptionPane.showMessageDialog(null, "Son: " + resultado + this.tipoMedida);		
	}

	
}
