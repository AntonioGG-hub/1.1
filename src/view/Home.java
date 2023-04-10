package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import java.awt.Cursor;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setResizable(false);
		setBackground(new Color(255, 255, 255));
		setTitle("Conversor de unidades");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		BorderLayout bl_contentPane = new BorderLayout();
		bl_contentPane.setVgap(50);
		contentPane.setLayout(bl_contentPane);
		
		JLabel lblTitulo = new JLabel("Bienvenido al conversor de unidades");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Monospaced", Font.PLAIN, 14));
		lblTitulo.setBorder(new EmptyBorder(50, 0, 0, 0));
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(20, 70, 20, 70));
		panel.setSize(new Dimension(100, 100));
		panel.setLayout(new GridLayout(2, 1, 10, 10));
		
		contentPane.add(panel, BorderLayout.CENTER);
		
		
		JButton btnConvertirMonedas = new JButton("Convertir monedas");
		btnConvertirMonedas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnConvertirMonedas.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnConvertirMonedas.setPreferredSize(new Dimension(20, 20));
		panel.add(btnConvertirMonedas);
		
		
		JButton btnConvertirLongitudes = new JButton("Convertir longitudes");
		btnConvertirLongitudes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnConvertirLongitudes.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnConvertirMonedas.setPreferredSize(new Dimension(20, 20));
		panel.add(btnConvertirLongitudes);
        
        
		
	}

}
