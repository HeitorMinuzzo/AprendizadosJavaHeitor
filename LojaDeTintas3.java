import javax.swing.JOptionPane;

public class tinta2 {

    public static void main(String[] args) {
         double metroqua, total, latas, rendimento;
            rendimento=Double.parseDouble(JOptionPane.showInputDialog("Insira o rendimento da tinta:"));
            metroqua=Double.parseDouble(JOptionPane.showInputDialog("Insira os m² a ser pintado:"));
            total=(metroqua/rendimento);
            latas=(total/1);
            System.out.println("Latas: "+Math.ceil(total));
            JOptionPane.showMessageDialog(null,"Latas: "+Math.ceil(total));
    }

}