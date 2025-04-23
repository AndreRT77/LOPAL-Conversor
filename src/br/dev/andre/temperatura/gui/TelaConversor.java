package br.dev.andre.temperatura.gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaConversor {
	
	public  String tituloDaTela;
	private JLabel labelCelsius;
	private JLabel labelResultado;
	private JLabel labelMensagemErro;
	private JTextField textCelsius;
	private JButton buttonKelvin;
	private JButton buttonFahrenheit;

	public void criarTelaConversor(String tituloDaTela){
		
		this.tituloDaTela = tituloDaTela;
		JFrame tela = new JFrame();
		tela.setTitle("Conversor");
		tela.setSize(460, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setResizable(false);
		tela.setLayout(null);
		
		Container container = tela.getContentPane();
		
		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius");
		labelCelsius.setBounds(20, 20, 200, 30);
		
		textCelsius = new JTextField();
		textCelsius.setBounds(20, 50, 410, 35);
		
//		labelResultado = new JLabel();
//		labelResultado.setText("Resultado");
//		labelResultado.setBounds(20, 60, 11, 50);
//		
//		labelMensagemErro = new JLabel();
//		labelMensagemErro.setText("ERRO");
//		labelMensagemErro.setBounds(20, 100, 150, 80);
		
		buttonKelvin = new JButton();
		buttonKelvin.setText(" Kelvin");
		buttonKelvin.setBounds(20, 90, 200, 40);
		
		buttonFahrenheit = new JButton();
		buttonFahrenheit.setText("Fahrenheit");
		buttonFahrenheit.setBounds(230, 90, 200, 40);
		
		container.add(labelCelsius);
		container.add(textCelsius);
//		container.add(labelResultado);
//		container.add(labelMensagemErro);
		container.add(buttonFahrenheit);
		container.add(buttonKelvin);
	
		
		tela.setVisible(true);
	}
	




}
