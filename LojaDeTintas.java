import javax.swing.JOptionPane;

public class loja {

    public static void main(String[] args) {
         double metroqua, total, latas, rendimento;
            rendimento=Double.parseDouble(JOptionPane.showInputDialog("Insira o rendimento da tinta:"));
            metroqua=Double.parseDouble(JOptionPane.showInputDialog("Insira os m² a ser pintado:"));
            total=(metroqua/rendimento);
            latas=(total/1);

            System.out.println("ira precisar de "+latas+ "latas para pintar "+metroqua+" m²");
            JOptionPane.showMessageDialog(null,"Voce precisara de "+latas+" latas");
    }

}
//Simula uma loja de tintas, mostra quantas latas será necessário para pintar o local desejado, com base no rendimento da tinta e o m².