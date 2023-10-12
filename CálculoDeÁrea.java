import javax.swing.*;
public class retangulo {

    public static void main(String[] args) {
         int base, altura, area;

         base= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base"));
         altura= Integer.parseInt(JOptionPane.showInputDialog("Digite a altura"));
         area=(base*altura);

         System.out.println("A area é " +area);
         JOptionPane.showMessageDialog(null,"A area é: "+area);

    }

}
//Programa para cálculo de área, Base * Altura.