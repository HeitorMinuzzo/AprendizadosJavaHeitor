import javax.swing.*;
public class meses {

	public static void main(String[] args) {
		int mes;
		mes=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do mês (de 1 a 12)"));
		if(mes==1) {
            JOptionPane.showMessageDialog(null,"O mês é janeiro");
            System.out.println("O mes é janeiro");
		}
		else if (mes==2){
            System.out.println("O mes é fevereiro");
            JOptionPane.showMessageDialog(null,"O mês é fevereiro");
		}
		else if (mes==3){
			System.out.println("O mes é março");
			JOptionPane.showMessageDialog(null,"O mês é março");
		}
		else if (mes==4){
			System.out.println("O mes é abril");
			JOptionPane.showMessageDialog(null,"O mês é abril");
		}
		else if (mes==5){
			System.out.println("O mes é maio");
			JOptionPane.showMessageDialog(null,"O mês é maio");
		}
		else if (mes==6){
			System.out.println("O mes é junho");
			JOptionPane.showMessageDialog(null,"O mês é junho");
		}
		else if (mes==7){
			System.out.println("O mes é julho");
			JOptionPane.showMessageDialog(null,"O mês é julho");
		}
		else if (mes==8){
			System.out.println("O mes é agosto");
			JOptionPane.showMessageDialog(null,"O mês é agosto");
		}
		else if (mes==9){
			System.out.println("O mes é setembro");
			JOptionPane.showMessageDialog(null,"O mês é setembro");
		}
		else if (mes==10){
			System.out.println("O mes é outubro");
			JOptionPane.showMessageDialog(null,"O mês é outubro");
		}
		else if (mes==11){
			System.out.println("O mes é novembro");
			JOptionPane.showMessageDialog(null,"O mês é novembro");
		}
		else if (mes==12){
			System.out.println("O mes é dezembro");
			JOptionPane.showMessageDialog(null,"O mês é dezembro");
		}
		else {
            System.out.println("o numero nao corresponde a nenhum mês");
            JOptionPane.showMessageDialog(null,"o numero nao corresponde a nenhum mês");
        }
	}
}
//Programa mostra o mês do ano de acordo com o número que o usúario digita