package Principal;
import javax.swing.JOptionPane;

import com.conversor.ConversorMedida;
import com.conversor.ConversorMoneda;

public class Main {

	public static void main(String[] args) {
		
		Object[] possibleOpciones = { "Conversor de Monedas", "Conversor de Medidas"};
		boolean continuar=true;
		ConversorMoneda moneda=new ConversorMoneda();
		ConversorMedida medida=new ConversorMedida();
		
		do{
			
			try {
				String opcion = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.INFORMATION_MESSAGE, null, 
						possibleOpciones,possibleOpciones[0]).toString();				
				switch(opcion) {
				case "Conversor de Monedas":
					try {
						double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir: "));
						moneda.Convertir(valor);										
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Ingrese solo numeros decimales con (.)");
					}catch(NullPointerException err) {
						
					}
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?","",JOptionPane.YES_NO_OPTION);
					if(JOptionPane.OK_OPTION != respuesta) {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						continuar=false;
					}
					break;
					
				case "Conversor de Medidas":
					try {
						double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a convertir: "));
						medida.Convertir(valor);										
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Ingrese solo numeros decimales con (.)");
					}catch(NullPointerException err) {
						
					}
					int res = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra Conversión?","",JOptionPane.YES_NO_OPTION);
					if(JOptionPane.OK_OPTION != res) {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
						continuar=false;
					}
					break;
				
				}
			} catch (NullPointerException e) {
				continuar=false;
			}
			
		}while(continuar==true);
		System.out.println("Tarea Finalizada");

	}

}
