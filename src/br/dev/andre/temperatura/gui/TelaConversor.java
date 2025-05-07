package br.dev.andre.temperatura.gui;
import br.dev.andre.temperatura.*;
import br.dev.andre.temperatura.model.Temperatura;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
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
		
		// Obtendo a referência do painel de conteúdo da tela

		Container container = tela.getContentPane();
		
		//Criando a fonte para utilizar no resultado e no erro
		
		Font fonteResultado = new Font ("Arial black", Font.BOLD, 20);
		Font fonteErro = new Font("Arial", Font.ITALIC, 15);
		
		// criando o label Celsius

		labelCelsius = new JLabel();
		labelCelsius.setText("Temperatura em graus celsius:");
		labelCelsius.setBounds(20, 20, 200, 30);
		
		// criando o textfield Celsius

		textCelsius = new JTextField();
		textCelsius.setBounds(20, 50, 410, 35);
		
		// criando o label Resultados

		labelResultado = new JLabel();
		labelResultado.setFont(fonteResultado);
		labelResultado.setText("Resultado: ");
		labelResultado.setBounds(150, 120,  410, 50);

		// criando o label Mensagem para erros

		labelMensagemErro = new JLabel();
		labelMensagemErro.setFont(fonteErro);
		labelMensagemErro.setText("Digite apenas números!");
		labelMensagemErro.setForeground(Color.red);
		labelMensagemErro.setBounds(160, 150,  410, 80);
		
		// criando o botão para converter para kelvin
		buttonKelvin = new JButton();
		buttonKelvin.setText(" Kelvin");
		buttonKelvin.setBounds(20, 90, 200, 40);
		
		// criando o botão para converter para Fahrenheit 

		buttonFahrenheit = new JButton();
		buttonFahrenheit.setBackground(Color.blue);
		buttonFahrenheit.setText("Fahrenheit");
		buttonFahrenheit.setBounds(230, 90, 200, 40); 
		
		// Adicionando os componentes no painel de conteúdo do Jframe

		container.add(labelCelsius);
		container.add(textCelsius);
		container.add(labelResultado);
		container.add(labelMensagemErro);
		container.add(buttonFahrenheit);
		container.add(buttonKelvin);
		
		labelResultado.setVisible(false);
        labelMensagemErro.setVisible(false);

		// criando as funcionalidades do botãp do Kelvin / adicionando ouvintes de ação ao botào Kelvin

	buttonKelvin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
	                String celsius = textCelsius.getText();
	                labelMensagemErro.setVisible(false);

	                double celsiusDouble = Double.parseDouble(celsius);

	                Temperatura temperatura = new Temperatura();
	                temperatura.setCelsius(celsiusDouble);
	                double kelvin = temperatura.converterKelvin();
	                String resultado = kelvin + " Kelvin ";
	                
	                labelResultado.setText(String.format("%.2f", kelvin) + " Kelvin");
	                labelResultado.setVisible(true);
	                
	            } 
					// Para caso o usuário digitar algo que não seja um número irá aparecer uma mensagem de erro

					catch (NumberFormatException ex) {
	                labelMensagemErro.setVisible(true);
	                labelResultado.setVisible(false);
	            }
			}
		
		});
	//Criando as funcionalidades do botãp do Fahrenheit / adicionando ouvintes de ação ao botào Fahrenheit

	buttonFahrenheit.addActionListener(new ActionListener() {
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
                String celsius = textCelsius.getText();

                double celsiusDouble = Double.parseDouble(celsius);

                Temperatura temperatura = new Temperatura();
                temperatura.setCelsius(celsiusDouble);
                double fahrenheit = temperatura.converterFahrenheit();
                String resultado = fahrenheit + " Fahrenheit";
                
                labelMensagemErro.setVisible(false);
                labelResultado.setText(String.format("%.2f", fahrenheit)+ " Fahrenheit");
                labelResultado.setVisible(true);
            } 
				// Para caso o usuário digitar algo que não seja um número irá aparecer uma mensagem de erro
				catch (NumberFormatException ex) {
                labelMensagemErro.setVisible(true);
                labelResultado.setVisible(false);
            }
        }
    });
	
		tela.setVisible(true);
	}
	




}
