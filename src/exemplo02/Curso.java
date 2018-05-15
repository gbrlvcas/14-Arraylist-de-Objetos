package exemplo02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Curso {
	
	//Atributos
    private String nome, segmento;
    private int cargaHoraria;
	private double valor;
	
	//ArrayList
	ArrayList<Curso> dados = new ArrayList<>();
	
	//Menu
	public void menu() {
		
		//Opções do menu
		String estruturaMenu = "***MENU***\n\n";
			   estruturaMenu+= "1) Cadastrar curso\n";
			   estruturaMenu+= "2) Listar\n";
			   estruturaMenu+= "3) Sair";
			   
	    //Obter a opção selecionada
			   int opcao;
			   
		//Exibir o menu
			   
			   do{
				   
				   opcao = Integer.parseInt(JOptionPane.showInputDialog(estruturaMenu));
				   
				   switch (opcao) {
				   
				   case 1:
					   JOptionPane.showMessageDialog(null, "Cadastrar");
					   break;
				   case 2:
					   JOptionPane.showMessageDialog(null, "Listar");
					   break;
				   case 3:
					   JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema");
					   break;
				   default:
					   JOptionPane.showMessageDialog(null, "Opção inválida");
					   break;
				   }
				   
			   }while(opcao != 3);
		
	}
}
