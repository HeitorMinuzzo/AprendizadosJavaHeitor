import javax.swing.*; 
public class medias {
    public static void main(String[] args) {
    int num1, num2, num3, media;
    num1= Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro valor"));
    num2= Integer.parseInt(JOptionPane.showInputDialog("insira o segundo valor"));
    num3= Integer.parseInt(JOptionPane.showInputDialog("insira o terceiro valor"));
    media=(num1+num2+num3/3);
    System.out.println("Sua média é: "+media);
    JOptionPane.showMessageDialog(null,"Sua média é: "+media);
    }

}
//O usuario insere 3 valores, após isso acontece a soma desses números, o resultado da soma é dividido por 3, assim, mostrado a média...
