import javax.swing.*;
import java.text.DecimalFormat;
public class aula {

    public static void main(String[] args) {
     double nota1, nota2, nota3, media;
        nota1=Double.parseDouble(JOptionPane.showInputDialog("Digite a primeria nota"));
        nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        nota3=Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));
        media=(nota1+nota2+nota3)/3;
         DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
         System.out.println("A média do aluno é: "+decimalFormat.format(media));
         JOptionPane.showMessageDialog(null,"A média do aluno é "+decimalFormat.format(media));
         
          if(media >= 7) {
             JOptionPane.showMessageDialog(null,"O Aluno está Aprovado");
             System.out.println("O aluno está Aprovado");
          }
             else {
             JOptionPane.showMessageDialog(null,"O aluno está Reprovado");
             System.out.println("O aluno está Reprovado");

    }
    
   }
}
//Mostra a média do Aluno e fala se ele foi aprovado ou não, utilizei o decimal format para deixar apenas 2 casas depois da ",".