import javax.swing.*;
public class aula {

    public static void main(String[] args) {
        double peso, altura, imc;
        peso=Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
        altura=Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
        imc=peso/(altura*altura);
        
        System.out.println("O seu imc é: " +imc);
        
        if(imc<18.5) {
            JOptionPane.showMessageDialog(null,"Abaixo do peso");
            System.out.println("Abaixo do peso");
        }
        else if (imc<24.9){
            System.out.println("peso normal");
            JOptionPane.showMessageDialog(null,"Peso Normal");
        }
        else if(imc<29.9) {
            JOptionPane.showMessageDialog(null,"Sobrepeso");
            System.out.println("Sobrepeso");        
        }
        else if(imc<34.9) {
            JOptionPane.showMessageDialog(null,"Obesidade grau 1");
            System.out.println("Obesidade grau 1");
        }
         else if(imc<39.9) {
            JOptionPane.showMessageDialog(null,"Obesidade grau 2");
            System.out.println("Obesidade grau 2");
         }
         else if(imc>=40) {
             JOptionPane.showMessageDialog(null,"Obesidade grau 3");
             System.out.println("Obesidade grau 3");
         }
       
    }

}
//Calculadora IMC, com base no peso e na altura que o usúario insere, o programa mostra o IMC da pessoa e a classe que ela se encaixa, como: Abaixo do peso, peso normal, sobrepeso, obesidade grau 1, obesidade grau 2 e obesidade grau 3.
