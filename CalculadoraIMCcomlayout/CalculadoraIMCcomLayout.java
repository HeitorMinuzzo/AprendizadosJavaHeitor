package academia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Color;

public class imc {

	private JFrame frame;
	private JTextField tf_peso;
	private JTextField tf_altura;
	private JTextField tf_imc;
	private JTextField tf_imc2;
	private JLabel lblImc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					imc window = new imc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public imc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		tf_peso = new JTextField();
		tf_peso.setBounds(10, 61, 86, 20);
		frame.getContentPane().add(tf_peso);
		tf_peso.setColumns(10);
		
		tf_altura = new JTextField();
		tf_altura.setBounds(10, 141, 86, 20);
		frame.getContentPane().add(tf_altura);
		tf_altura.setColumns(10);
		
		tf_imc = new JTextField();
		tf_imc.setBounds(284, 61, 140, 20);
		frame.getContentPane().add(tf_imc);
		tf_imc.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular IMC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double peso,altura,imc;
				peso=Double.parseDouble(tf_peso.getText());
				altura=Double.parseDouble(tf_altura.getText());
				imc=peso/(altura*altura);
				tf_imc2.setText(String.valueOf(+imc));
				 if (imc<18.5) {
				    	tf_imc.setText(String.valueOf("Abaixo do peso"));
				    	}
				 else if (imc<24.9) {
				    	tf_imc.setText(String.valueOf("Peso normal"));
				    	}
				 else if (imc<29.9) {
				    	tf_imc.setText(String.valueOf("Sobrepeso"));
				    	}
				 else  if (imc<34.9) {
				    	tf_imc.setText(String.valueOf("Obesidade de Grau I"));
				    	}
				 else if (imc<39.9) {
				    	tf_imc.setText(String.valueOf("Obesidade Grau II"));
				    	}
				 else if (imc>=40) {
				    	tf_imc.setText(String.valueOf("Obesidade Morbida"));
				    	}			
				
			}
		});		
		btnNewButton.setBounds(148, 168, 102, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Peso");
		lblNewLabel.setBounds(10, 43, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(10, 127, 46, 14);
		frame.getContentPane().add(lblAltura);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(284, 43, 70, 14);
		frame.getContentPane().add(lblResultado);
		
		tf_imc2 = new JTextField();
		tf_imc2.setColumns(10);
		tf_imc2.setBounds(284, 141, 140, 20);
		frame.getContentPane().add(tf_imc2);
		
		lblImc = new JLabel("IMC ");
		lblImc.setBounds(284, 127, 70, 14);
		frame.getContentPane().add(lblImc);
	}
}