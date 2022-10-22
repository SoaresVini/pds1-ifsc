package pratica03;

import javax.swing.JOptionPane;

/***
 * 
 * @author Vinicius
 * @date 30/09/2022
 * @version 1.0
 *
 */
public class pratica03 {

	public static void main(String[] args) {

		Double[] vet = new Double[3];

		for (int i = 0; i < vet.length; i++) {

			String numS = JOptionPane.showInputDialog("Leia essa merda");

			Double num = Double.valueOf(numS);

			vet[i] = num;
		}

		
		Double[] mulVet = multiVetor(vet);
		
	}

	private static Double [] multiVetor(Double[] vet ) {
		
		Double [] nvVetor = new Double[vet.length];
		
		for (int i = 0; i < nvVetor.length; i++) {
			
			nvVetor[i] = vet[i] * ve[i] ;
		}
		return nvVetor;
		
	} 
	
}
