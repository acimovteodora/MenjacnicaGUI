package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class MenjacnicaGUI extends JFrame {

	private MenjacnicaGUI glavni;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmAbout;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollPane scrollPane_1;
	private JTextPane textPane;
	private JPanel panelEast;
	private JButton btnDodajKurs;
	private JButton btnIzvrsiZamenu;
	private JButton btnObrisiKurs;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmIzvrsiZamenu;
	private JMenuItem mntmObrisiKurs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenjacnicaGUI() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/icons/menjacnica.jpg")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 700, 400);
		setLocationRelativeTo(null);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1(), BorderLayout.SOUTH);
		contentPane.add(getPanelEast(), BorderLayout.EAST);
		
		glavni = this;
		
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(glavni, "Teodora Acimov - MenjacnicaGUI", "Autor programa", JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmAbout;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser filec = new JFileChooser();
					int option = filec.showOpenDialog(null);

					if (option == JFileChooser.APPROVE_OPTION) {
						File file = filec.getSelectedFile();
						textPane.setText(textPane.getText().concat("Ucitan fajl: " + file.toString() + "\n"));
					}
				}
			});
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
			mntmOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser filec = new JFileChooser();
					int option = filec.showSaveDialog(null);

					if (option == JFileChooser.APPROVE_OPTION) {
						File file = filec.getSelectedFile();
						textPane.setText(textPane.getText().concat("Sacuvan fajl: " + file.toString() + "\n"));
					}
				}
			});
			
			mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int izlaz = JOptionPane.showConfirmDialog(glavni, "Da li zelite da izadjete?", "Exit", JOptionPane.YES_NO_OPTION);
					if (izlaz == JOptionPane.YES_OPTION)
						System.exit(0);
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"\u0160ifra", "Skra\u0107eni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
				}
			) {
				Class[] columnTypes = new Class[] {
					Long.class, Object.class, Object.class, Object.class, Object.class, Object.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			});
			table.getColumnModel().getColumn(0).setPreferredWidth(80);
			table.getColumnModel().getColumn(1).setPreferredWidth(80);
			table.getColumnModel().getColumn(2).setPreferredWidth(80);
			table.getColumnModel().getColumn(3).setPreferredWidth(80);
			table.getColumnModel().getColumn(4).setPreferredWidth(80);
			table.getColumnModel().getColumn(5).setPreferredWidth(80);
			addPopup(table, getPopupMenu());
		}
		return table;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getTextPane());
		}
		return scrollPane_1;
	}
	private JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setPreferredSize(new Dimension(6, 100));
			textPane.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		}
		return textPane;
	}
	private JPanel getPanelEast() {
		if (panelEast == null) {
			panelEast = new JPanel();
			panelEast.setPreferredSize(new Dimension(135,10));
			panelEast.setLayout(null);
			panelEast.add(getBtnDodajKurs());
			panelEast.add(getBtnIzvrsiZamenu());
			panelEast.add(getBtnObrisiKurs());
		}
		return panelEast;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKursGUI dodaj = new DodajKursGUI(glavni);
					dodaj.setVisible(true);
				}
			});
			btnDodajKurs.setBounds(10, 11, 115, 23);
		}
		return btnDodajKurs;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.setBounds(10, 45, 115, 23);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnObrisiKurs() {
		if (btnObrisiKurs == null) {
			btnObrisiKurs = new JButton("Obrisi kurs");
			btnObrisiKurs.setBounds(10, 79, 115, 23);
		}
		return btnObrisiKurs;
	}
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmIzvrsiZamenu());
			popupMenu.add(getMntmObrisiKurs());
		}
		return popupMenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKursGUI dodaj = new DodajKursGUI(glavni);
					dodaj.setVisible(true);
				}
			});
		}
		return mntmDodajKurs;
	}
	private JMenuItem getMntmIzvrsiZamenu() {
		if (mntmIzvrsiZamenu == null) {
			mntmIzvrsiZamenu = new JMenuItem("Izvrsi zamenu");
		}
		return mntmIzvrsiZamenu;
	}
	private JMenuItem getMntmObrisiKurs() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obrisi kurs");
		}
		return mntmObrisiKurs;
	}
	
	public void dodajText(String t) {
		textPane.setText(textPane.getText().concat(t));
	}
}
