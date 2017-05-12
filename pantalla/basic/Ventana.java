package basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.Window.Type;

public class Ventana extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int tirada;
	private int asalto = 0;
	static JTextArea taBatalla;
	private JPanel contentPane;
	private JTextField tftUno;
	private JTextField tftDos;
	private JTextField tftTres;
	private JTextField tftCuatro;
	private JTextField tftCinco;
	private JTextField tftSeis;
	private JTextField tftSiete;
	private JTextField tfdUno;
	private JTextField tfdDos;
	private JTextField tfdTres;
	private JTextField tfdCuatro;
	private JTextField tfdCinco;
	private JTextField tfdSeis;
	private JTextField tfdSiete;
	private JTextField tfjCinco;
	private JTextField tfjSeis;
	private JTextField tfjSiete;
	private JButton btnTirarDados;
	private JPanel pCombate;
	static JTextField tfAtqAtaque;
	static JTextField tfDefAtaque;
	private JTextField tfAtqAtqTirada;
	static JTextField tfDefAtqTirada;
	static JTextField tfAtqPv;
	static JTextField tfDefPv;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblAccionesPorTurno;
	private JLabel lblDao;
	static JTextField tfAtqDmg;
	private JLabel lblTa;
	static JTextField tfDefTa;
	static JTextField tfAtqAcciones;
	static JTextField tfDefAcciones;
	private JLabel lblAtaque;
	private JLabel lblDefensa;
	static JTextField tfAtqDefensa;
	static JTextField tfAtqDefTirada;
	static JTextField tfDefDmg;
	static JTextField tfAtqTa;
	static JTextField tfDefDefensa;
	private JTextField tfDefDefTirada;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JButton btnNewButton_1;
	private JButton button;
	static JTextField txtPj;
	static JTextField txtMon;
	private JScrollPane scrollPane_3;
	private JLabel lblPv;
	private JPanel panel_4;
	private JButton btnD;
	private JPanel panel_5;
	private JButton btnD_1;
	private JButton btnD_2;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JCheckBox checkBox;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2;
	private JCheckBox checkBox_3;
	private JCheckBox checkBox_4;
	private JCheckBox checkBox_5;
	private JCheckBox chckbxParlisisParcial;
	private JCheckBox checkBox_7;
	private JCheckBox checkBox_8;
	private JCheckBox checkBox_9;
	private JCheckBox checkBox_10;
	private JCheckBox checkBox_11;
	private JCheckBox checkBox_12;
	private JCheckBox checkBox_13;
	private JCheckBox checkBox_14;
	private JCheckBox checkBox_15;
	private JCheckBox checkBox_16;
	private JCheckBox checkBox_18;
	private JScrollPane scrollPane_1;
	private JPanel panel_1;
	private JCheckBox checkBox_6;
	private JCheckBox checkBox_19;
	private JCheckBox checkBox_20;
	private JCheckBox checkBox_21;
	private JCheckBox checkBox_22;
	private JCheckBox checkBox_23;
	private JCheckBox checkBox_24;
	private JCheckBox checkBox_25;
	private JCheckBox checkBox_26;
	private JCheckBox checkBox_27;
	private JCheckBox checkBox_28;
	private JCheckBox checkBox_29;
	private JCheckBox checkBox_30;
	private JCheckBox checkBox_31;
	private JCheckBox checkBox_32;
	private JCheckBox checkBox_33;
	private JCheckBox checkBox_34;
	private JCheckBox checkBox_35;
	private JCheckBox checkBox_36;
	private JScrollPane scrollPane_2;
	private JTextField tfjUno;
	private JTextField tfjDos;
	private JTextField tfjTres;
	private JTextField tfjCuatro;

	public Ventana() {
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(Color.WHITE);
		tabbedPane.setOpaque(true);
		tabbedPane.setBounds(0, 0, 800, 527);
		contentPane.add(tabbedPane);

		JPanel pTurno = new JPanel();
		pTurno.setBackground(Color.WHITE);
		tabbedPane.addTab("Turno", null, pTurno, null);
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		pTurno.setLayout(null);

		tftUno = new JTextField();
		tftUno.setHorizontalAlignment(SwingConstants.CENTER);
		tftUno.setText("0");
		tftUno.setBounds(80, 8, 30, 20);
		pTurno.add(tftUno);
		tftUno.setColumns(10);

		tftDos = new JTextField();
		tftDos.setHorizontalAlignment(SwingConstants.CENTER);
		tftDos.setText("0");
		tftDos.setBounds(80, 33, 30, 20);
		pTurno.add(tftDos);
		tftDos.setColumns(10);

		tftTres = new JTextField();
		tftTres.setHorizontalAlignment(SwingConstants.CENTER);
		tftTres.setText("0");
		tftTres.setBounds(80, 58, 30, 20);
		pTurno.add(tftTres);
		tftTres.setColumns(10);

		tftCuatro = new JTextField();
		tftCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		tftCuatro.setText("0");
		tftCuatro.setBounds(80, 83, 30, 20);
		pTurno.add(tftCuatro);
		tftCuatro.setColumns(10);

		tftCinco = new JTextField();
		tftCinco.setHorizontalAlignment(SwingConstants.CENTER);
		tftCinco.setText("0");
		tftCinco.setBounds(80, 108, 30, 20);
		pTurno.add(tftCinco);
		tftCinco.setColumns(10);

		tftSeis = new JTextField();
		tftSeis.setHorizontalAlignment(SwingConstants.CENTER);
		tftSeis.setText("0");
		tftSeis.setBounds(80, 133, 30, 20);
		pTurno.add(tftSeis);
		tftSeis.setColumns(10);

		tftSiete = new JTextField();
		tftSiete.setHorizontalAlignment(SwingConstants.CENTER);
		tftSiete.setText("0");
		tftSiete.setBounds(80, 158, 30, 20);
		pTurno.add(tftSiete);
		tftSiete.setColumns(10);

		tfdUno = new JTextField();
		tfdUno.setHorizontalAlignment(SwingConstants.CENTER);
		tfdUno.setText("0");
		tfdUno.setBounds(120, 8, 30, 20);
		pTurno.add(tfdUno);
		tfdUno.setColumns(10);

		tfdDos = new JTextField();
		tfdDos.setHorizontalAlignment(SwingConstants.CENTER);
		tfdDos.setText("0");
		tfdDos.setColumns(10);
		tfdDos.setBounds(120, 33, 30, 20);
		pTurno.add(tfdDos);

		tfdTres = new JTextField();
		tfdTres.setHorizontalAlignment(SwingConstants.CENTER);
		tfdTres.setText("0");
		tfdTres.setColumns(10);
		tfdTres.setBounds(120, 58, 30, 20);
		pTurno.add(tfdTres);

		tfdCuatro = new JTextField();
		tfdCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		tfdCuatro.setText("0");
		tfdCuatro.setColumns(10);
		tfdCuatro.setBounds(120, 83, 30, 20);
		pTurno.add(tfdCuatro);

		tfdCinco = new JTextField();
		tfdCinco.setHorizontalAlignment(SwingConstants.CENTER);
		tfdCinco.setText("0");
		tfdCinco.setColumns(10);
		tfdCinco.setBounds(120, 108, 30, 20);
		pTurno.add(tfdCinco);

		tfdSeis = new JTextField();
		tfdSeis.setHorizontalAlignment(SwingConstants.CENTER);
		tfdSeis.setText("0");
		tfdSeis.setColumns(10);
		tfdSeis.setBounds(120, 133, 30, 20);
		pTurno.add(tfdSeis);

		tfdSiete = new JTextField();
		tfdSiete.setHorizontalAlignment(SwingConstants.CENTER);
		tfdSiete.setText("0");
		tfdSiete.setColumns(10);
		tfdSiete.setBounds(120, 158, 30, 20);
		pTurno.add(tfdSiete);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(289, 6, 130, 203);
		pTurno.add(scrollPane);

		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		tfjCinco = new JTextField();
		tfjCinco.setBounds(10, 108, 60, 20);
		pTurno.add(tfjCinco);
		tfjCinco.setColumns(10);

		tfjSeis = new JTextField();
		tfjSeis.setColumns(10);
		tfjSeis.setBounds(10, 133, 60, 20);
		pTurno.add(tfjSeis);

		tfjSiete = new JTextField();
		tfjSiete.setColumns(10);
		tfjSiete.setBounds(10, 158, 60, 20);
		pTurno.add(tfjSiete);

		JButton btnTurno = new JButton("Turno");
		btnTurno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asalto++;
				textArea.setText("");
				textArea.setText("ASALTO " + asalto + "\n" + "____________\n");
				int[] v_turno = {Integer.parseInt(tftUno.getText()) + Integer.parseInt(tfdUno.getText()),
								 Integer.parseInt(tftDos.getText()) + Integer.parseInt(tfdDos.getText()),
								 Integer.parseInt(tftTres.getText()) + Integer.parseInt(tfdTres.getText()),
								 Integer.parseInt(tftCuatro.getText()) + Integer.parseInt(tfdCuatro.getText()),
								 Integer.parseInt(tftCinco.getText()) + Integer.parseInt(tfdCinco.getText()),
								 Integer.parseInt(tftSeis.getText()) + Integer.parseInt(tfdSeis.getText()),
								 Integer.parseInt(tftSiete.getText()) + Integer.parseInt(tfdSiete.getText())
								};
				
				String[] v_nombre = {tfjUno.getText(), tfjDos.getText(), tfjTres.getText(), tfjCuatro.getText(), tfjCinco.getText(), tfjSeis.getText(), tfjSiete.getText() };
				
				int aux;
				String aux_n;
				for(int i = v_turno.length; i>0; i--){
					for(int j=0; j<i-1;j++){
						if(v_turno[j]>v_turno[j+1]){
							aux = v_turno [j+1];
							aux_n = v_nombre[j+1];
							
							v_turno[j+1] = v_turno[j];
							v_nombre[j+1] = v_nombre[j];
							v_turno[j] = aux;
							
							v_nombre[j] = aux_n;
						}
					}
				}
				
				for(int i=v_turno.length-1; i>0; i--){
					if(!v_nombre[i].equals(""))
					textArea.setText(textArea.getText()+ v_nombre[i]+" "+Integer.toString(v_turno[i])+ "\n");
				}
				
				tfdUno.setText("0");
				tfdDos.setText("0");
				tfdTres.setText("0");
				tfdCuatro.setText("0");
				tfdCinco.setText("0");
				tfdSeis.setText("0");
				tfdSiete.setText("0");

			}
		});
		btnTurno.setBounds(10, 186, 80, 23);
		pTurno.add(btnTurno);

		JButton btnNewButton = new JButton("c");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				asalto = 0;
				tfdUno.setText("0");
				tfdDos.setText("0");
				tfdTres.setText("0");
				tfdCuatro.setText("0");
				tfdCinco.setText("0");
				tfdSeis.setText("0");
				tfdSiete.setText("0");
				tftCinco.setText("0");
				tftSeis.setText("0");
				tftSiete.setText("0");
				textArea.setText("ASALTO " + asalto);
				tfjCinco.setText("");
				tfjSeis.setText("");
				tfjSiete.setText("");

			}
		});
		btnNewButton.setBounds(100, 186, 50, 23);
		pTurno.add(btnNewButton);

		btnTirarDados = new JButton("tirar dados");
		btnTirarDados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (!tfjUno.getText().equals("")) {
					tirada = Pifia.pTurno(Dice.d100a());
					tfdUno.setText(String.valueOf(tirada));
				}
				if (!tfjDos.getText().equals("")) {
					tirada = Pifia.pTurno(Dice.d100a());
					tfdDos.setText(String.valueOf(tirada));
				}
				if (!tfjTres.getText().equals("")) {
					tirada = Pifia.pTurno(Dice.d100a());
					tfdTres.setText(String.valueOf(tirada));
				}
				if (!tfjCuatro.getText().equals("")) {
					tirada = Pifia.pTurno(Dice.d100a());
					tfdCuatro.setText(String.valueOf(tirada));
				}
				
				if (!tfjCinco.getText().equals("")) {
					tirada = Pifia.pTurno(Dice.d100());
					tfdCinco.setText(String.valueOf(tirada));
				}
				if (!tfjSeis.getText().equals("")) {
					tirada = Pifia.pTurno(Dice.d100());
					tfdSeis.setText(String.valueOf(tirada));
				}
				if (!tfjSiete.getText().equals("")) {
					tirada = Pifia.pTurno(Dice.d100());
					tfdSiete.setText(String.valueOf(tirada));
				}
				
			}
		});
		btnTirarDados.setBounds(10, 220, 140, 23);
		pTurno.add(btnTirarDados);

		tfjUno = new JTextField();
		tfjUno.setBounds(10, 10, 60, 20);
		pTurno.add(tfjUno);
		tfjUno.setColumns(10);

		tfjDos = new JTextField();
		tfjDos.setBounds(10, 33, 60, 20);
		pTurno.add(tfjDos);
		tfjDos.setColumns(10);

		tfjTres = new JTextField();
		tfjTres.setBounds(10, 58, 60, 20);
		pTurno.add(tfjTres);
		tfjTres.setColumns(10);

		tfjCuatro = new JTextField();
		tfjCuatro.setBounds(10, 83, 60, 20);
		pTurno.add(tfjCuatro);
		tfjCuatro.setColumns(10);

		pCombate = new JPanel();
		pCombate.setBackground(new Color(0, 204, 204));
		tabbedPane.addTab("Combate", null, pCombate, null);
		pCombate.setLayout(null);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new LineBorder(Color.BLACK));
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_1.setBounds(10, 255, 200, 240);
		pCombate.add(scrollPane_1);

		JPanel panel = new JPanel();
		scrollPane_1.setViewportView(panel);
		panel.setAutoscrolls(true);

		JCheckBox cbFlanco1 = new JCheckBox("Flanco");
		cbFlanco1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			/*	if(.equals("<<<")){
					tfAtq
				}*/
				
			}
		});
		cbFlanco1.setToolTipText("Atq -10 Par +30 Esq -30");

		checkBox_18 = new JCheckBox("Espalda");
		checkBox_18.setToolTipText("Atq -30 Par -80 Esq -80");

		checkBox_2 = new JCheckBox("Sorpresa");
		checkBox_2.setToolTipText("Par -80 Esq -80");

		checkBox_3 = new JCheckBox("Ceguera parcial");
		checkBox_3.setToolTipText("Atq -30 Par -30 Esq -15");

		checkBox_4 = new JCheckBox("Ceguera absoluta");
		checkBox_4.setToolTipText("Atq -100 Par -80 Esq -80");

		checkBox = new JCheckBox("Posición superior");
		checkBox.setToolTipText("Atq +20");

		checkBox_1 = new JCheckBox("Derribado");
		checkBox_1.setToolTipText("Atq -30 Par -30 Esq -30");

		checkBox_5 = new JCheckBox("Parálisis menor");
		checkBox_5.setToolTipText("Atq -20 Par -20 Esq -40");

		chckbxParlisisParcial = new JCheckBox("Parálisis parcial");
		chckbxParlisisParcial.setToolTipText("Atq -80 Par -80 Esq -80");

		checkBox_7 = new JCheckBox("Parálisis completa");
		checkBox_7.setToolTipText("Atq -200 Par -200 Esq -200");

		checkBox_8 = new JCheckBox("Amenazado");
		checkBox_8.setToolTipText("Atq -20 Par -120 Esq -120");

		checkBox_9 = new JCheckBox("Levitando");
		checkBox_9.setToolTipText("Atq -20 Par -20 Esq -40");

		checkBox_10 = new JCheckBox("Vuelo 7-14");
		checkBox_10.setToolTipText("Atq +10 Par +10 Esq +10");

		checkBox_11 = new JCheckBox("Vuelo >= 15");
		checkBox_11.setToolTipText("Atq +15 Par +10 Esq +20");

		checkBox_12 = new JCheckBox("Cargando");
		checkBox_12.setToolTipText("Atq +10 Par -10 Esq -20");

		checkBox_13 = new JCheckBox("Desenfundar");
		checkBox_13.setToolTipText("Atq -25 Par -25");

		checkBox_14 = new JCheckBox("Espacio reducido");
		checkBox_14.setToolTipText("Atq -40 Par -40 Esq -40");

		checkBox_15 = new JCheckBox("Adversario pequeño");
		checkBox_15.setToolTipText("Atq -10");

		checkBox_16 = new JCheckBox("Adversario diminuto");
		checkBox_16.setToolTipText("Atq -20 Par -10");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(cbFlanco1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				.addComponent(checkBox_18, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				.addComponent(checkBox_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				.addComponent(checkBox_1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				.addComponent(checkBox_8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				.addComponent(checkBox_9, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				.addComponent(checkBox_10, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				.addComponent(checkBox_11, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				.addComponent(checkBox_12, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				.addComponent(checkBox_13, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup().addGroup(gl_panel
						.createParallelGroup(Alignment.TRAILING)
						.addComponent(checkBox_7, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(chckbxParlisisParcial, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175,
								Short.MAX_VALUE)
						.addComponent(checkBox, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_14, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_15, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_16, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_3, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)).addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addComponent(cbFlanco1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkBox_18, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkBox_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(chckbxParlisisParcial, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkBox_9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkBox_10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkBox_11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkBox_12, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(checkBox_13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_15, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_16, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		panel.setLayout(gl_panel);

		scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(420, 10, 365, 210);
		pCombate.add(scrollPane_3);

		taBatalla = new JTextArea();
		scrollPane_3.setViewportView(taBatalla);
		taBatalla.setBorder(new LineBorder(new Color(0, 0, 0)));

		JButton btnCombate = new JButton("Combatir");
		btnCombate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int atq, def;
				taBatalla.setText(taBatalla.getText() + "_______________\n");

				if (button.getText().equals(">>>")) {
					atq = Integer.parseInt(tfAtqAtaque.getText()) + Integer.parseInt(tfAtqAtqTirada.getText());
					def = Integer.parseInt(tfDefDefensa.getText()) + Integer.parseInt(tfDefDefTirada.getText());
					Batalla.PjAtaque(Batalla.Ataque(atq, def));
				} else {
					atq = Integer.parseInt(tfDefAtaque.getText()) + Integer.parseInt(tfDefAtqTirada.getText());
					def = Integer.parseInt(tfAtqDefensa.getText()) + Integer.parseInt(tfAtqDefTirada.getText());
					Batalla.mAtaque(Batalla.Ataque(atq, def));
				}
				tfAtqAcciones.setText("1");
				tfDefAcciones.setText("1");

			}
		});
		btnCombate.setBounds(490, 230, 90, 20);
		pCombate.add(btnCombate);

		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				taBatalla.setText("");
			}
		});
		btnC.setBounds(735, 230, 50, 20);
		pCombate.add(btnC);

		button = new JButton(">>>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (button.getText().equals(">>>")) {
					button.setText("<<<");
				} else {
					button.setText(">>>");
				}
			}
		});
		button.setBounds(420, 230, 60, 20);
		pCombate.add(button);

		panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(10, 10, 200, 240);
		pCombate.add(panel_4);
		panel_4.setLayout(null);

		txtPj = new JTextField();
		txtPj.setBounds(10, 10, 115, 20);
		panel_4.add(txtPj);
		txtPj.setText("Pj");
		txtPj.setColumns(10);

		tfAtqAtaque = new JTextField();
		tfAtqAtaque.setHorizontalAlignment(SwingConstants.CENTER);
		tfAtqAtaque.setBounds(60, 35, 30, 20);
		panel_4.add(tfAtqAtaque);
		tfAtqAtaque.setText("80");
		tfAtqAtaque.setColumns(10);

		tfAtqAtqTirada = new JTextField();
		tfAtqAtqTirada.setHorizontalAlignment(SwingConstants.CENTER);
		tfAtqAtqTirada.setBounds(95, 35, 30, 20);
		panel_4.add(tfAtqAtqTirada);
		tfAtqAtqTirada.setText("0");
		tfAtqAtqTirada.setColumns(10);

		btnNewButton_1 = new JButton("d100");
		btnNewButton_1.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		btnNewButton_1.setBounds(130, 35, 60, 20);
		panel_4.add(btnNewButton_1);

		btnD = new JButton("d100");
		btnD.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		btnD.setBounds(130, 60, 60, 20);
		panel_4.add(btnD);

		tfAtqDefensa = new JTextField();
		tfAtqDefensa.setHorizontalAlignment(SwingConstants.CENTER);
		tfAtqDefensa.setBounds(60, 60, 30, 20);
		panel_4.add(tfAtqDefensa);
		tfAtqDefensa.setText("90");
		tfAtqDefensa.setColumns(10);

		tfAtqDefTirada = new JTextField();
		tfAtqDefTirada.setHorizontalAlignment(SwingConstants.CENTER);
		tfAtqDefTirada.setBounds(95, 60, 30, 20);
		panel_4.add(tfAtqDefTirada);
		tfAtqDefTirada.setText("0");
		tfAtqDefTirada.setColumns(10);

		tfAtqPv = new JTextField();
		tfAtqPv.setHorizontalAlignment(SwingConstants.CENTER);
		tfAtqPv.setBounds(130, 10, 30, 20);
		panel_4.add(tfAtqPv);
		tfAtqPv.setText("125");
		tfAtqPv.setColumns(10);

		JRadioButton rdbtnEsquiva = new JRadioButton("Esquiva");
		rdbtnEsquiva.setHorizontalTextPosition(SwingConstants.LEADING);
		rdbtnEsquiva.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		rdbtnEsquiva.setBounds(10, 85, 70, 20);
		panel_4.add(rdbtnEsquiva);
		buttonGroup.add(rdbtnEsquiva);

		JRadioButton rdbtnParada = new JRadioButton("Parada");
		rdbtnParada.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		rdbtnParada.setBounds(120, 85, 70, 20);
		panel_4.add(rdbtnParada);
		rdbtnParada.setSelected(true);
		buttonGroup.add(rdbtnParada);

		tfAtqDmg = new JTextField();
		tfAtqDmg.setBounds(60, 110, 30, 20);
		panel_4.add(tfAtqDmg);
		tfAtqDmg.setHorizontalAlignment(SwingConstants.CENTER);
		tfAtqDmg.setText("0");
		tfAtqDmg.setColumns(10);

		tfAtqTa = new JTextField();
		tfAtqTa.setHorizontalAlignment(SwingConstants.CENTER);
		tfAtqTa.setBounds(60, 135, 30, 20);
		panel_4.add(tfAtqTa);
		tfAtqTa.setText("0");
		tfAtqTa.setColumns(10);

		tfAtqAcciones = new JTextField();
		tfAtqAcciones.setHorizontalAlignment(SwingConstants.CENTER);
		tfAtqAcciones.setBounds(60, 160, 30, 20);
		panel_4.add(tfAtqAcciones);
		tfAtqAcciones.setText("1");
		tfAtqAcciones.setColumns(10);

		lblAtaque = new JLabel("Ataque");
		lblAtaque.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		lblAtaque.setBounds(10, 35, 45, 20);
		panel_4.add(lblAtaque);

		lblDefensa = new JLabel("Defensa");
		lblDefensa.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		lblDefensa.setBounds(10, 60, 45, 20);
		panel_4.add(lblDefensa);

		lblPv = new JLabel("PV");
		lblPv.setBounds(165, 10, 25, 20);
		panel_4.add(lblPv);
		lblPv.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		lblPv.setHorizontalAlignment(SwingConstants.CENTER);
		lblPv.setFocusable(false);

		lblDao = new JLabel("Daño");
		lblDao.setBounds(10, 110, 45, 20);
		panel_4.add(lblDao);
		lblDao.setFont(new Font("Sylfaen", Font.PLAIN, 11));

		lblTa = new JLabel("TA");
		lblTa.setBounds(10, 135, 45, 20);
		panel_4.add(lblTa);
		lblTa.setFont(new Font("Sylfaen", Font.PLAIN, 11));

		lblAccionesPorTurno = new JLabel("Acciones");
		lblAccionesPorTurno.setBounds(10, 160, 45, 20);
		panel_4.add(lblAccionesPorTurno);
		lblAccionesPorTurno.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfAtqDefTirada.setText(String.valueOf(Dice.d100a()));
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfAtqAtqTirada.setText(String.valueOf(Dice.d100a()));
			}
		});

		panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setLayout(null);
		panel_5.setBounds(215, 10, 200, 240);
		pCombate.add(panel_5);

		btnD_1 = new JButton("d100");
		btnD_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfDefAtqTirada.setText(String.valueOf(Dice.d100a()));
			}
		});
		btnD_1.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		btnD_1.setBounds(130, 35, 60, 20);
		panel_5.add(btnD_1);

		btnD_2 = new JButton("d100");
		btnD_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfDefDefTirada.setText(String.valueOf(Dice.d100a()));
			}
		});
		btnD_2.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		btnD_2.setBounds(130, 60, 60, 20);
		panel_5.add(btnD_2);

		txtMon = new JTextField();
		txtMon.setBounds(10, 10, 115, 20);
		panel_5.add(txtMon);
		txtMon.setText("Enemigo");
		txtMon.setColumns(10);

		tfDefPv = new JTextField();
		tfDefPv.setHorizontalAlignment(SwingConstants.CENTER);
		tfDefPv.setBounds(130, 10, 30, 20);
		panel_5.add(tfDefPv);
		tfDefPv.setText("100");
		tfDefPv.setColumns(10);

		tfDefAtaque = new JTextField();
		tfDefAtaque.setHorizontalAlignment(SwingConstants.CENTER);
		tfDefAtaque.setBounds(60, 35, 30, 20);
		panel_5.add(tfDefAtaque);
		tfDefAtaque.setText("80");
		tfDefAtaque.setColumns(10);

		tfDefAtqTirada = new JTextField();
		tfDefAtqTirada.setHorizontalAlignment(SwingConstants.CENTER);
		tfDefAtqTirada.setBounds(95, 35, 30, 20);
		panel_5.add(tfDefAtqTirada);
		tfDefAtqTirada.setText("0");
		tfDefAtqTirada.setColumns(10);

		JRadioButton radioButton_1 = new JRadioButton("Esquiva");
		radioButton_1.setHorizontalTextPosition(SwingConstants.LEADING);
		radioButton_1.setToolTipText("");
		radioButton_1.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		radioButton_1.setBounds(10, 85, 70, 20);
		panel_5.add(radioButton_1);
		buttonGroup_1.add(radioButton_1);

		JRadioButton radioButton = new JRadioButton("Parada");
		radioButton.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		radioButton.setBounds(120, 85, 70, 20);
		panel_5.add(radioButton);
		radioButton.setSelected(true);
		buttonGroup_1.add(radioButton);

		tfDefDmg = new JTextField();
		tfDefDmg.setBounds(60, 110, 30, 20);
		panel_5.add(tfDefDmg);
		tfDefDmg.setHorizontalAlignment(SwingConstants.CENTER);
		tfDefDmg.setText("0");
		tfDefDmg.setColumns(10);

		tfDefTa = new JTextField();
		tfDefTa.setHorizontalAlignment(SwingConstants.CENTER);
		tfDefTa.setBounds(60, 135, 30, 20);
		panel_5.add(tfDefTa);
		tfDefTa.setText("0");
		tfDefTa.setColumns(10);

		tfDefAcciones = new JTextField();
		tfDefAcciones.setHorizontalAlignment(SwingConstants.CENTER);
		tfDefAcciones.setBounds(60, 160, 30, 20);
		panel_5.add(tfDefAcciones);
		tfDefAcciones.setText("1");
		tfDefAcciones.setColumns(10);

		tfDefDefensa = new JTextField();
		tfDefDefensa.setHorizontalAlignment(SwingConstants.CENTER);
		tfDefDefensa.setBounds(60, 60, 30, 20);
		panel_5.add(tfDefDefensa);
		tfDefDefensa.setText("75");
		tfDefDefensa.setColumns(10);

		tfDefDefTirada = new JTextField();
		tfDefDefTirada.setHorizontalAlignment(SwingConstants.CENTER);
		tfDefDefTirada.setBounds(95, 60, 30, 20);
		panel_5.add(tfDefDefTirada);
		tfDefDefTirada.setText("0");
		tfDefDefTirada.setColumns(10);

		JLabel label = new JLabel("Ataque");
		label.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		label.setBounds(10, 35, 45, 20);
		panel_5.add(label);

		label_1 = new JLabel("PV");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		label_1.setFocusable(false);
		label_1.setBounds(165, 10, 25, 20);
		panel_5.add(label_1);

		label_2 = new JLabel("Defensa");
		label_2.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		label_2.setBounds(10, 60, 45, 20);
		panel_5.add(label_2);

		label_3 = new JLabel("Daño");
		label_3.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		label_3.setBounds(10, 110, 45, 20);
		panel_5.add(label_3);

		label_4 = new JLabel("TA");
		label_4.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		label_4.setBounds(10, 135, 45, 20);
		panel_5.add(label_4);

		label_5 = new JLabel("Acciones");
		label_5.setFont(new Font("Sylfaen", Font.PLAIN, 11));
		label_5.setBounds(10, 160, 45, 20);
		panel_5.add(label_5);

		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(215, 255, 200, 240);
		pCombate.add(scrollPane_2);

		panel_1 = new JPanel();
		scrollPane_2.setViewportView(panel_1);
		panel_1.setAutoscrolls(true);

		checkBox_6 = new JCheckBox("Flanco");
		checkBox_6.setToolTipText("Atq -10 Par +30 Esq -30");

		checkBox_19 = new JCheckBox("Espalda");
		checkBox_19.setToolTipText("Atq -30 Par -80 Esq -80");

		checkBox_20 = new JCheckBox("Sorpresa");
		checkBox_20.setToolTipText("Par -80 Esq -80");

		checkBox_21 = new JCheckBox("Derribado");
		checkBox_21.setToolTipText("Atq -30 Par -30 Esq -30");

		checkBox_22 = new JCheckBox("Amenazado");
		checkBox_22.setToolTipText("Atq -20 Par -120 Esq -120");

		checkBox_23 = new JCheckBox("Levitando");
		checkBox_23.setToolTipText("Atq -20 Par -20 Esq -40");

		checkBox_24 = new JCheckBox("Vuelo 7-14");
		checkBox_24.setToolTipText("Atq +10 Par +10 Esq +10");

		checkBox_25 = new JCheckBox("Vuelo >= 15");
		checkBox_25.setToolTipText("Atq +15 Par +10 Esq +20");

		checkBox_26 = new JCheckBox("Cargando");
		checkBox_26.setToolTipText("Atq +10 Par -10 Esq -20");

		checkBox_27 = new JCheckBox("Desenfundar");
		checkBox_27.setToolTipText("Atq -25 Par -25");

		checkBox_28 = new JCheckBox("Parálisis completa");
		checkBox_28.setToolTipText("Atq -200 Par -200 Esq -200");

		checkBox_29 = new JCheckBox("Parálisis menor");
		checkBox_29.setToolTipText("Atq -20 Par -20 Esq -40");

		checkBox_30 = new JCheckBox("Parálisis parcial");
		checkBox_30.setToolTipText("Atq -80 Par -80 Esq -80");

		checkBox_31 = new JCheckBox("Posición superior");
		checkBox_31.setToolTipText("Atq +20");

		checkBox_32 = new JCheckBox("Espacio reducido");
		checkBox_32.setToolTipText("Atq -40 Par -40 Esq -40");

		checkBox_33 = new JCheckBox("Adversario pequeño");
		checkBox_33.setToolTipText("Atq -10");

		checkBox_34 = new JCheckBox("Adversario diminuto");
		checkBox_34.setToolTipText("Atq -20 Par -10");

		checkBox_35 = new JCheckBox("Ceguera absoluta");
		checkBox_35.setToolTipText("Atq -100 Par -80 Esq -80");

		checkBox_36 = new JCheckBox("Ceguera parcial");
		checkBox_36.setToolTipText("Atq -30 Par -30 Esq -15");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup().addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(checkBox_28, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_29, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_30, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_31, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_32, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_33, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_34, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_35, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
						.addComponent(checkBox_36, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)).addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_panel_1.createSequentialGroup()
								.addComponent(checkBox_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_panel_1.createSequentialGroup()
								.addComponent(checkBox_19, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_panel_1.createSequentialGroup()
								.addComponent(checkBox_20, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_panel_1.createSequentialGroup()
								.addComponent(checkBox_21, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_panel_1.createSequentialGroup()
								.addComponent(checkBox_22, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addGroup(Alignment.LEADING,
						gl_panel_1.createSequentialGroup()
								.addComponent(checkBox_23, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
				.addComponent(checkBox_27, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
				.addComponent(checkBox_26, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
				.addComponent(checkBox_25, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
				.addComponent(checkBox_24, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
						.addComponent(checkBox_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_19, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_20, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_36, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_35, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_31, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_21, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_29, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_30, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_28, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_22, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_23, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_24, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_25, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_26, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_27, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_32, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_33, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(checkBox_34, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addContainerGap()));
		panel_1.setLayout(gl_panel_1);
	}
}
