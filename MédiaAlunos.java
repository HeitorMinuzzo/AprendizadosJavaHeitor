import javax.swing.*;
public class notas {

    public static void main(String[] args) {
        double a1, a2, a3, a4, a5, media, total = 0;
        a1 = Double.parseDouble(JOptionPane.showInputDialog("Nota Aluno 1"));
        a2 = Double.parseDouble(JOptionPane.showInputDialog("Nota Aluno 2"));
        a3 = Double.parseDouble(JOptionPane.showInputDialog("Nota Aluno 3"));
        a4 = Double.parseDouble(JOptionPane.showInputDialog("Nota Aluno 4"));
        a5 = Double.parseDouble(JOptionPane.showInputDialog("Nota Aluno 5"));
        media = (a1+a2+a3+a4+a5)/5;
        if(a1>media) {
            total += 1;
        }
        if(a2>media) {
            total += 1;
        }
        if(a3>media) {
            total += 1;
        }
        if(a4>media) {
            total += 1;
        }
        if(a5>media) {
            total += 1;
        }
        else {
            System.out.println("Nenhum Aluno ficou acima");
        }
        System.out.println("Total de alunos acima da media: "+total);
        JOptionPane.showMessageDialog(null,"Total de alunos acima da média: "+total);
    }

}
