package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame {

	private JPanel contentPane;
	public static JTextField textField;
	public static JTextField tf_FUE;
	private JButton btnGuardar;
	private JLabel lblNewLabel;
	private static int contador = 0, codigo;
	private static String nombre;
	private static File f = new File("datos.obj");
	private static FileOutputStream fos;
	private static ObjectOutputStream oos;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @throws Exception
	 */
	public Ventana1() throws Exception {
		fos = new FileOutputStream(f, true);
		oos = new ObjectOutputStream(fos);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 46, 14);
		contentPane.add(lblNombre);

		textField = new JTextField();
		textField.setBounds(66, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblCodigo = new JLabel("FUE");
		lblCodigo.setBounds(10, 42, 46, 14);
		contentPane.add(lblCodigo);

		tf_FUE = new JTextField();
		tf_FUE.setBounds(66, 39, 86, 20);
		contentPane.add(tf_FUE);
		tf_FUE.setColumns(10);

		JButton btnObtenerRegistro = new JButton("Obtener Registro");
		btnObtenerRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador++;
				try {
					File f = new File("datos.obj");
					FileInputStream fe = new FileInputStream(f);
					ObjectInputStream ois = new ObjectInputStream(fe);
					for(int i = 0; i<contador;i++){
						Registro jugador = (Registro) ois.readObject();
						nombre=jugador.getNombre();
						codigo=jugador.getCodigo();
					}
					ois.close();
					fe.close();
					textField.setText(nombre);
					tf_FUE.setText(String.valueOf(codigo));
				} catch (Exception ex) {
					ex.printStackTrace();
				}

			}
		});
		btnObtenerRegistro.setBounds(10, 496, 89, 23);
		contentPane.add(btnObtenerRegistro);

		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				nombre = textField.getText();
				codigo = Integer.parseInt(tf_FUE.getText());
				try{
					
					oos.writeObject(new Registro(nombre, codigo));
				}catch(IOException e){
					System.out.println("Algo ha salido mal");
				}
				textField.setText("");
				tf_FUE.setText("");
				lblNewLabel.setText("Guardado con éxito");

			}
		});
		btnGuardar.setBounds(411, 496, 89, 23);
		contentPane.add(btnGuardar);

		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(77, 138, 185, 14);
		contentPane.add(lblNewLabel);
	}
}
