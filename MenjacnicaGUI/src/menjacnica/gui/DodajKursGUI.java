package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	
	private JPanel contentPane;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldProdajniKurs;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldSrednjiKurs;
	private JTextField textFieldSkraceniNaziv;
	private JLabel lblSkraceniNaziv;
	private JLabel lblSrednjiKurs;
	private JLabel lblKupovniKurs;
	private JLabel lblProdajniKurs;
	private JLabel lblNaziv;
	private JLabel lblSifra;
	private JButton btnDodaj;
	private JButton btnOdustani;
	private MenjacnicaGUI gl;


	/**
	 * Create the frame.
	 */
	public DodajKursGUI(MenjacnicaGUI gl) {
		
		
		setResizable(false);
		setPreferredSize(new Dimension(300, 60));
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getTextFieldSrednjiKurs());
		contentPane.add(getTextFieldSkraceniNaziv());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblSifra());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		this.gl = gl;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(31, 51, 161, 20);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(254, 51, 161, 20);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}
	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setBounds(31, 109, 161, 20);
			textFieldProdajniKurs.setColumns(10);
		}
		return textFieldProdajniKurs;
	}
	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setBounds(254, 109, 161, 20);
			textFieldKupovniKurs.setColumns(10);
		}
		return textFieldKupovniKurs;
	}
	private JTextField getTextFieldSrednjiKurs() {
		if (textFieldSrednjiKurs == null) {
			textFieldSrednjiKurs = new JTextField();
			textFieldSrednjiKurs.setBounds(31, 166, 161, 20);
			textFieldSrednjiKurs.setColumns(10);
		}
		return textFieldSrednjiKurs;
	}
	private JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setBounds(254, 166, 161, 20);
			textFieldSkraceniNaziv.setColumns(10);
		}
		return textFieldSkraceniNaziv;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("SkraceniNaziv");
			lblSkraceniNaziv.setBounds(253, 140, 96, 14);
		}
		return lblSkraceniNaziv;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(31, 140, 86, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(254, 84, 74, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(31, 84, 120, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(254, 26, 46, 14);
		}
		return lblNaziv;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(31, 26, 46, 14);
		}
		return lblSifra;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String kurs = "Sifra: "+ textFieldSifra.getText() + ", valuta: " + textFieldNaziv.getText() + ", prodajni kurs: " + textFieldProdajniKurs.getText() + 
							", kupovni kurs: " +getTextFieldKupovniKurs().getText() + ", srednji kurs: " + textFieldSrednjiKurs.getText() + ", skraceni naziv valute: " +
							textFieldSkraceniNaziv.getText() + "\n";
					gl.dodajText(kurs);
					dispose();
				}
			});
			btnDodaj.setBounds(31, 197, 161, 23);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(254, 197, 161, 23);
		}
		return btnOdustani;
	}
}
