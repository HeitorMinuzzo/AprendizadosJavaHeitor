import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class sorvet {

	private JFrame frame;
	private JTextField tf_peso;
	private JTextField tf_total;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sorvet window = new sorvet();
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
	public sorvet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(64, 128, 128));
		frame.getContentPane().setForeground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 571, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox ch_tipo1 = new JCheckBox("Tipo 1");
		ch_tipo1.setBounds(41, 25, 74, 23);
		frame.getContentPane().add(ch_tipo1);
		
		JCheckBox ch_tipo2 = new JCheckBox("Tipo 2");
		ch_tipo2.setBounds(41, 51, 74, 23);
		frame.getContentPane().add(ch_tipo2);
		
		JCheckBox ch_tipo3 = new JCheckBox("Tipo 3");
		ch_tipo3.setBounds(41, 77, 74, 23);
		frame.getContentPane().add(ch_tipo3);
		
		JLabel lblNewLabel = new JLabel("R$");
		lblNewLabel.setBounds(140, 29, 21, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R$");
		lblNewLabel_1.setBounds(140, 55, 21, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("R$");
		lblNewLabel_2.setBounds(140, 81, 21, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lb_tipo1 = new JLabel("4.00");
		lb_tipo1.setBounds(153, 29, 27, 14);
		frame.getContentPane().add(lb_tipo1);
		
		JLabel lb_tipo2 = new JLabel("6.00");
		lb_tipo2.setBounds(153, 55, 27, 14);
		frame.getContentPane().add(lb_tipo2);
		
		JLabel lb_tipo3 = new JLabel("8.00");
		lb_tipo3.setBounds(153, 81, 27, 14);
		frame.getContentPane().add(lb_tipo3);
		
		tf_peso = new JTextField();
		tf_peso.setBounds(141, 132, 119, 20);
		frame.getContentPane().add(tf_peso);
		tf_peso.setColumns(10);
		
		tf_total = new JTextField();
		tf_total.setBounds(303, 189, 204, 23);
		frame.getContentPane().add(tf_total);
		tf_total.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("TOTAL A PAGAR:");
		lblNewLabel_8.setBounds(361, 165, 112, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JComboBox cb_tipo1 = new JComboBox();
		cb_tipo1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb_tipo1.setBounds(180, 25, 38, 22);
		frame.getContentPane().add(cb_tipo1);
		
		JComboBox cb_tipo2 = new JComboBox();
		cb_tipo2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb_tipo2.setBounds(180, 51, 38, 22);
		frame.getContentPane().add(cb_tipo2);
		
		JComboBox cb_tipo3 = new JComboBox();
		cb_tipo3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb_tipo3.setBounds(180, 77, 38, 22);
		frame.getContentPane().add(cb_tipo3);
		
		JLabel lblNewLabel_9 = new JLabel("Sorvete");
		lblNewLabel_9.setBounds(42, 0, 46, 14);
		frame.getContentPane().add(lblNewLabel_9);
		JCheckBox ch_buffet = new JCheckBox("Buffet");
		ch_buffet.setBounds(41, 105, 74, 23);
		frame.getContentPane().add(ch_buffet);
		
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
			
				double tipo1=0, tipo2=0, tipo3=0, total=0;
				int qtdTipo1, qtdTipo2, qtdTipo3;
				double buffet=0;
				
				if (ch_tipo1.isSelected()) {
					tipo1=Double.parseDouble(lb_tipo1.getText());
					qtdTipo1=Integer.parseInt((String)cb_tipo1.getSelectedItem ());
					tipo1=tipo1*qtdTipo1;
				}
				
				if (ch_tipo2.isSelected()) {
					
		tipo2=Double.parseDouble(lb_tipo2.getText());
					qtdTipo2=Integer.parseInt((String)cb_tipo1.getSelectedItem ());
					tipo2=tipo2*qtdTipo2;
				}
				
				if (ch_tipo3.isSelected()) {
					tipo3=Double.parseDouble(lb_tipo3.getText());
					qtdTipo3=Integer.parseInt((String)cb_tipo1.getSelectedItem ());
					tipo3=tipo3*qtdTipo3;
				}
				if (ch_buffet.isSelected()) {
					buffet=Double.parseDouble(tf_peso.getText());
					buffet=(buffet*59)/1000;
					
				}
				
				
				total=tipo1+tipo2+tipo3+buffet;
				tf_total.setText(String.valueOf(total));
				
			
			
			}
		});
		btnNewButton.setBounds(368, 51, 105, 69);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\0374206.ACAD\\Desktop\\f76e3e6f8277a2ab8f5ab7d12dd32863-removebg-preview.png"));
		lblNewLabel_3.setBounds(46, 215, 461, 504);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Peso em Gramas");
		lblNewLabel_4.setBounds(28, 135, 109, 14);
		frame.getContentPane().add(lblNewLabel_4);
		JLabel lblNewLabel_5 = new JLabel("R$ 59.00 o KG");
		lblNewLabel_5.setBounds(161, 152, 84, 41);
		frame.getContentPane().add(lblNewLabel_5);
		

	}
}