package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Calculadora extends JFrame {

	String numero1, numero2, op;
	Double resultado;
	JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n0, soma, subtracao, divisao, multiplicacao, igual, limpa;
	JLabel visor;
	Boolean operacao;
	
	
	public Calculadora(){
		
		super("Calculadora");
		
		numero1 = "0";
		numero2 = "0";
		
		n1 = new JButton("1");
		n2 = new JButton("2");
		n3 = new JButton("3");
		n4 = new JButton("4");
		n5 = new JButton("5");
		n6 = new JButton("6");
		n7 = new JButton("7");
		n8 = new JButton("8");
		n9 = new JButton("9");
		n0 = new JButton("0");
		
		n1.addActionListener(new botao1());
		n2.addActionListener(new botao2());
		n3.addActionListener(new botao3());
		n4.addActionListener(new botao4());
		n5.addActionListener(new botao5());
		n6.addActionListener(new botao6());
		n7.addActionListener(new botao7());
		n8.addActionListener(new botao8());
		n9.addActionListener(new botao9());
		n0.addActionListener(new botao0());
		
		soma = new JButton("+");
		subtracao = new JButton("-");
		divisao = new JButton("/");
		multiplicacao = new JButton("*");
		igual = new JButton("=");
		limpa = new JButton("C");
		
		soma.addActionListener(new botaooperacao());
		subtracao.addActionListener(new botaooperacao());
		divisao.addActionListener(new botaooperacao());
		multiplicacao.addActionListener(new botaooperacao());
		igual.addActionListener(new resultado());
		limpa.addActionListener(new botaoLimpa());

		visor = new JLabel();
		
		Container cTela = getContentPane();
		cTela.setLayout(new GridLayout(2, 0));
			
	   Container cPrincipal = new JPanel();	  	
	   cPrincipal.setLayout(new GridLayout(4, 4, 6, 6));	
	
	 	cTela.add(visor);
	 	cTela.add(cPrincipal);
	 	 	
	 	cPrincipal.add(n1);
	 	cPrincipal.add(n2);
	 	cPrincipal.add(n3);
	 	cPrincipal.add(soma);
	 	cPrincipal.add(n4);
	 	cPrincipal.add(n5);
	 	cPrincipal.add(n6);
	 	cPrincipal.add(subtracao);
	 	cPrincipal.add(n7);
	 	cPrincipal.add(n8);
	 	cPrincipal.add(n9);
	 	cPrincipal.add(multiplicacao);
	 	cPrincipal.add(limpa);
	 	cPrincipal.add(n0);
	 	cPrincipal.add(igual);
	 	cPrincipal.add(divisao);
	 	
	 	
	 	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	 	
	}
	
	class botao1 implements ActionListener{

		public void actionPerformed(ActionEvent e) {	
			if (operacao == null){
				numero1 += "1";
				visor.setText(numero1);
			}
			else{
				numero2 += "1";
				visor.setText(numero2);
			}
		}
	}
	
	class botao2 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {	
			if (operacao == null){
				numero1 += "2";
				visor.setText(numero1);
			}
			else{
				numero2 += "2";
				visor.setText(numero2);
			}
		
	}
	}
	
	class botao3 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {	
			if (operacao == null){
				numero1 += "3";
				visor.setText(numero1);
			}
			else{
				numero2 += "3";
				visor.setText(numero2);
			}
		}
	}
	
	class botao4 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {	
			if (operacao == null){
				numero1 += "4";
				visor.setText(numero1);
			}
			else{
				numero2 += "4";
				visor.setText(numero2);
			}
		}
	}
	
	class botao5 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {	
			if (operacao == null){
				numero1 += "5";
				visor.setText(numero1);
			}
			else{
				numero2 += "5";
				visor.setText(numero2);
			}
		}
	}
	
	class botao6 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {	
			if (operacao == null){
				numero1 += "6";
				visor.setText(numero1);
			}
			else{
				numero2 += "6";
				visor.setText(numero2);
			}
		}
	}
	
	class botao7 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {	
			if (operacao == null){
				numero1 += "7";
				visor.setText(numero1);
			}
			else{
				numero2 += "7";
				visor.setText(numero2);
			}
		}
	}
	
	class botao8 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {	
			if (operacao == null){
				numero1 += "8";
				visor.setText(numero1);
			}
			else{
				numero2 += "8";
				visor.setText(numero2);
			}
		}
	}
	
	class botao9 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {	
			if (operacao == null){
				numero1 += "9";
				visor.setText(numero1);
			}
			else{
				numero2 += "9";
				visor.setText(numero2);
			}
		}
	}
	
	class botao0 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {	
			if (operacao == null){
				numero1 += "0";
				visor.setText(numero1);
			}
			else{
				numero2 += "0";
				visor.setText(numero2);
			}
		}
	}

	class botaooperacao implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			operacao = false;
			visor.setText("");
			op = e.getActionCommand();
		}
		
	}
	
	class resultado implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			double num1, num2;
			
			num1 = Double.parseDouble(numero1);
			num2 = Double.parseDouble(numero2);
			
			if (op == "+"){
				resultado = num1 + num2;
				visor.setText(Double.toString(resultado));
			} else if (op == "-") {
				resultado = num1 - num2;
				visor.setText(Double.toString(resultado));
			} else if (op == "/"){
				resultado = num1 / num2;
				visor.setText(resultado.toString());
			} else {
				resultado = num1 * num2;
				visor.setText(resultado.toString());
			}
			
		}
		
	}
	
	class botaoLimpa implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			operacao = null;
			op =  null;
			numero1 = "0";
			numero2 = "0";
			visor.setText("");
		}
		
	}
	
	public static void main(String[] args) {
		
		new Calculadora();
		
	}

}
