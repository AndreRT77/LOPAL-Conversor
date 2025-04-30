package br.dev.andre.temperatura.gui;
import br.dev.andre.temperatura.*;
import br.dev.andre.temperatura.model.Temperatura;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		labelResultado = new JLabel();
		labelResultado.setText("Resultado");
		labelResultado.setBounds(150, 120, 240, 50);
//		
		labelMensagemErro = new JLabel();
		labelMensagemErro.setText("ERRO");
		labelMensagemErro.setForeground(Color.red);
		labelMensagemErro.setBounds(150, 140, 150, 80);
		
		buttonKelvin = new JButton();
		buttonKelvin.setText(" Kelvin");
		buttonKelvin.setBounds(230, 90, 200, 40);
		
		buttonFahrenheit = new JButton();
		buttonFahrenheit.setText("Fahrenheit");
		buttonFahrenheit.setBounds(20, 90, 200, 40);
		
		container.add(labelCelsius);
		container.add(textCelsius);
		container.add(labelResultado);
		container.add(labelMensagemErro);
		container.add(buttonFahrenheit);
		container.add(buttonKelvin);
		
	buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String Celsius= textCelsius.getText();
				
				
				double celsiusdouble = Double.parseDouble(Celsius);


				Temperatura temperatura   = new Temperatura();
				double temperaturaKelvin = temperatura.converterKelvin();
				temperatura.getCelsius();
				temperatura.setKelvin();
				
				String[] temperaturaResult = temperatura.mostrarTemperatura();
				
				listTemperatura.setListData(temperaturaResult);
				
				temperatura.mostrarTemperatura();
			}
		
		});
	
		
		tela.setVisible(true);
	}
	




}
