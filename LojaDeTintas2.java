import javax.swing.JOptionPane;

public class tinta {

    public static void main(String[] args) {
         double metroqua, total, latas, rendimento;
            rendimento=Double.parseDouble(JOptionPane.showInputDialog("Insira o rendimento da tinta:"));
            metroqua=Double.parseDouble(JOptionPane.showInputDialog("Insira os m² a ser pintado:"));
            total=(metroqua/rendimento);
            latas=(total/1);
            
            if(latas % 2 > 0) {
               int inteiro = (int)latas;
               inteiro=(inteiro+1);
               System.out.println("Latas: "+inteiro);
               JOptionPane.showMessageDialog(null,"Latas: "+inteiro);
            
            }
            else {
                System.out.println("latas: "+latas);
                JOptionPane.showMessageDialog(null,"latas: "+latas);
            }
    }

}