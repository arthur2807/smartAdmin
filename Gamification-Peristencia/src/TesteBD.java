
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;



public class TesteBD {
public static void main(String[] args) {
	ConexaoBD bd = new ConexaoBD() ;
	try {
		bd.getConexao();
		System.out.println("Conectado!");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Erro!");

	}}
	
	//System.out.println(fc.buscaDemandas(u).size());
	
	
}
