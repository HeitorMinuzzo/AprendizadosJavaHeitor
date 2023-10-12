import javax.swing.JOptionPane;

public class parimpar {

    public static void main(String[] args) {
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
        if(numero % 2 == 0) {
            JOptionPane.showMessageDialog(null,"O numero "+numero+ " é Par");
            System.out.println("O numero " +numero+ " é Par");
          }
        else {
            JOptionPane.showMessageDialog(null,"O numero " +numero+ " é Impar");
            System.out.println("O numero " +numero+ " é Impar");

   }
    }

}
//Programa mostra se o número inteiro digitado pelo usuário é impar ou par.