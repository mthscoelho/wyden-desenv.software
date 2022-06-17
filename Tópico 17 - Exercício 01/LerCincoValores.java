package lercincovalores;
 
import javax.swing.JOptionPane;
 
/**
 *
 * @author Matheus Coelho
 */
public class LerCincoValores {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        /*Escrever um algoritmo que lê 5 valores para a, um de cada vez, 
        e conta quantos destes valores são negativos, 
        escrevendo esta informação. */
 
 
        int a;
        int  cont = 0;
 
        for (int i = 0; i < 5; i++) {
 
            System.out.println("Informe o valor:");
            a = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor: "));
 
            if(a < 0){
 
                cont = cont + 1;
 
            }
 
        }
 
        System.out.println("A quantidade de números negativos digitados são: " + cont);
    }
 
}
