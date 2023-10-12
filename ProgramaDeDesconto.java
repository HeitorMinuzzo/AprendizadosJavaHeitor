import javax.swing.*;
public class desconto {

    public static void main(String[] args) {
        int valor, tot;
        valor= Integer.parseInt(JOptionPane.showInputDialog("O valor do produto"));
        int desconto;
        int sistema;
        desconto= Integer.parseInt(JOptionPane.showInputDialog("Desconto"));
        sistema=(valor*desconto/100);
        tot=(valor-sistema);
        System.out.println("Sua compra deu: "+tot);
        JOptionPane.showMessageDialog(null,"Sua compra deu: "+tot);
    }

}
