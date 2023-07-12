package com.conversor;

import javax.swing.JOptionPane;

public class Moneda {
	
	private double cantidad;
	private String tipoMoneda;
	private double moneda;
	
	public Moneda () {}	
	
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	public void setMoneda(double moneda) {
		this.moneda = moneda;
	}


	public void conversorMoneda() {
		
		double resultado = this.cantidad / this.moneda;
		resultado = (double)Math.round(resultado * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Son: "+ this.tipoMoneda + resultado);
		
	}

}
