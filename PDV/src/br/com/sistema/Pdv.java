package br.com.sistema;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JSlider;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.util.Date;

public class Pdv extends JFrame {
	private JPanel contentPane;
	private JLabel lblData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pdv frame = new Pdv();
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
	public Pdv() {
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent e) {
				// evento ativar o formulario
				//
				alterarLabel();
			}
		});
		setTitle("PDV");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setForeground(new Color(0, 120, 215));
		panel.setBounds(0, 413, 420, 48);
		contentPane.add(panel);
		panel.setLayout(null);

		lblData = new JLabel("New label");
		lblData.setFont(new Font("Arial", Font.BOLD, 14));
		lblData.setBounds(165, 11, 245, 18);
		panel.add(lblData);
		lblData.setForeground(new Color(255, 255, 255));
	}

	// método para alterar a label pela data atual
	private void alterarLabel() {
		Date data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		lblData.setText(formatador.format(data));
	}
}
