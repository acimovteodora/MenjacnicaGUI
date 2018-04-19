package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldProdajniKurs;
	private JTextField textFieldIznos;
	private JLabel lblKupovniKurs;
	private JLabel lblProdajniKurs;
	private JLabel lblValuta;
	private JLabel lblIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnProdaja;
	private JButton btnIzvrsitiZamenu;
	private JButton btnOdustani;
	private JSlider slider;
	private JComboBox comboBoxValuta;
	private MenjacnicaGUI gl;
	private String transakcija;
	private JRadioButton rdbtnKupovina;
	

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI gl) {
		setFocusTraversalPolicyProvider(true);
		setResizable(false);
		setPreferredSize(new Dimension(300, 60));
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getLblIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getBtnIzvrsitiZamenu());
		contentPane.add(getBtnOdustani());
		contentPane.add(getSlider());
		contentPane.add(getComboBoxValuta());
		contentPane.add(getRdbtnKupovina());
		this.gl = gl;
	}

	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setEditable(false);
			textFieldKupovniKurs.setBounds(20, 36, 114, 20);
			textFieldKupovniKurs.setColumns(10);
		}
		return textFieldKupovniKurs;
	}
	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setEditable(false);
			textFieldProdajniKurs.setText("");
			textFieldProdajniKurs.setBounds(299, 36, 114, 20);
			textFieldProdajniKurs.setColumns(10);
		}
		return textFieldProdajniKurs;
	}
	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setBounds(20, 113, 114, 20);
			textFieldIznos.setColumns(10);
		}
		return textFieldIznos;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(20, 11, 114, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(299, 11, 114, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(170, 11, 46, 14);
		}
		return lblValuta;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(20, 88, 46, 14);
		}
		return lblIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(251, 88, 114, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.setBounds(251, 137, 109, 23);
			rdbtnProdaja.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(rdbtnProdaja.isSelected()) {
						transakcija = "prodaja";
						rdbtnKupovina.setSelected(false);
					}
				}
			});
		}
		return rdbtnProdaja;
	}
	private JButton getBtnIzvrsitiZamenu() {
		if (btnIzvrsitiZamenu == null) {
			btnIzvrsitiZamenu = new JButton("Izvrsiti zamenu");
			btnIzvrsitiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String valuta ="";
					int broj = comboBoxValuta.getSelectedIndex();
					if(broj==0)
						valuta = "EUR";
					if(broj==1)
						valuta = "USD";
					if(broj==2)
						valuta = "CHF";						
					String txt = "Valuta: " + valuta + ", iznos: " + textFieldIznos.getText() + ", vrsta transakcije: " + transakcija + "\n";
					gl.dodajText(txt);
					dispose();
				}
			});
			btnIzvrsitiZamenu.setBounds(21, 237, 113, 23);
		}
		return btnIzvrsitiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(299, 237, 114, 23);
		}
		return btnOdustani;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.setPaintLabels(true);
			slider.setSnapToTicks(true);
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					textFieldIznos.setText(slider.getValue()+"");
				}
			});
			slider.setPaintTicks(true);
			slider.setBounds(20, 163, 393, 63);
		}
		return slider;
	}
	private JComboBox getComboBoxValuta() {
		if (comboBoxValuta == null) {
			comboBoxValuta = new JComboBox();
			comboBoxValuta.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBoxValuta.setBounds(170, 36, 86, 20);
		}
		return comboBoxValuta;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rdbtnKupovina.isSelected()) {
						transakcija = "kupovina";
						rdbtnProdaja.setSelected(false);
					}
				}
			});
			rdbtnKupovina.setBounds(251, 112, 109, 23);
		}
		return rdbtnKupovina;
	}
}
