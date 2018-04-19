package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldProdajniKurs;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldSrednjiKurs;
	private JTextField textFieldSkraceniNaziv;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JLabel lblSrednjiKurs;
	private JLabel lblSkraceniNaziv;
	private JButton btnObrisi;
	private JButton btnOdustani;
	private MenjacnicaGUI gl;
	private JCheckBox checkBox;

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI gl) {
		setResizable(false);
		setPreferredSize(new Dimension(300, 60));
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
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getTextFieldSrednjiKurs());
		contentPane.add(getTextFieldSkraceniNaziv());
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
		contentPane.add(getCheckBox());
		this.gl = gl;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setColumns(10);
			textFieldSifra.setBounds(33, 56, 161, 20);
		}
		return textFieldSifra;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setColumns(10);
			textFieldNaziv.setBounds(247, 56, 161, 20);
		}
		return textFieldNaziv;
	}
	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setColumns(10);
			textFieldProdajniKurs.setBounds(33, 108, 161, 20);
		}
		return textFieldProdajniKurs;
	}
	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setColumns(10);
			textFieldKupovniKurs.setBounds(247, 108, 161, 20);
		}
		return textFieldKupovniKurs;
	}
	private JTextField getTextFieldSrednjiKurs() {
		if (textFieldSrednjiKurs == null) {
			textFieldSrednjiKurs = new JTextField();
			textFieldSrednjiKurs.setColumns(10);
			textFieldSrednjiKurs.setBounds(33, 159, 161, 20);
		}
		return textFieldSrednjiKurs;
	}
	private JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setColumns(10);
			textFieldSkraceniNaziv.setBounds(247, 159, 161, 20);
		}
		return textFieldSkraceniNaziv;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(34, 31, 46, 14);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(247, 31, 46, 14);
		}
		return lblNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(33, 83, 120, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(247, 83, 74, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(33, 139, 86, 14);
		}
		return lblSrednjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("SkraceniNaziv");
			lblSkraceniNaziv.setBounds(247, 139, 96, 14);
		}
		return lblSkraceniNaziv;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String kurs = "Sifra: "+ textFieldSifra.getText() + ", valuta: " + textFieldNaziv.getText() + ", prodajni kurs: " + textFieldProdajniKurs.getText() + 
							", kupovni kurs: " +getTextFieldKupovniKurs().getText() + ", srednji kurs: " + textFieldSrednjiKurs.getText() + ", skraceni naziv valute: " +
							textFieldSkraceniNaziv.getText() + "\n";
					gl.dodajText(kurs);
					dispose();
				}
			});
			btnObrisi.setEnabled(false);
			
			btnObrisi.setBounds(33, 217, 161, 23);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(247, 217, 161, 23);
		}
		return btnOdustani;
	}
	private JCheckBox getCheckBox() {
		if (checkBox == null) {
			checkBox = new JCheckBox("Zaista obrisi kurs");
			checkBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean cek = checkBox.isSelected();
					if(cek)
						btnObrisi.setEnabled(true);
					else
						btnObrisi.setEnabled(false);
				}
			});
			checkBox.setBounds(33, 186, 161, 23);
		}
		return checkBox;
	}
}
