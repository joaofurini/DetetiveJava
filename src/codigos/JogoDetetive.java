package codigos;
import java.util.Scanner;

public class JogoDetetive {
	
	//Função para responder o que o jogador é
	public static void daResposta(String veredito) {
		if(veredito.contentEquals("Inocente")) {
			System.out.println("Voce é inocente");
		}
		else if (veredito.contentEquals("Cumplice")) {
			System.out.println("Voce é cumplice");
		}
		else if (veredito.contains("Assassino")) {
			
			System.out.println("Voce é assassino");
		}
	}
	
	//Função para checar o veredito final da pessoa
	public static String checaPessoa(int julgamento) {
		
		if(julgamento == 1) {
			return "Inocente";
			
		} 
		else if (julgamento == 2 ) {
			return "Cumplice";
		}
		else if (julgamento == 3) {
			return "Assassino";
		}
		else {
			return "Inocente";
		}
	}
	
//Programa principal
	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		String pergunta1 = "Mora perto da vitima? ";
		String pergunta2 = "Ja conversou com a vitima? ";
		String pergunta3 = "viu a vitma ultimamente? ";
	
		int julgamento=0;
		String pessoa = null;
		
		
		System.out.println(pergunta1);
		String resposta1 = ler.nextLine();
		if(resposta1.equals("sim")) {
			julgamento += 1;

		}
		
		System.out.println(pergunta2);
		String resposta2 = ler.nextLine();
		if(resposta2.equals("sim")) {
			julgamento += 1;
		};
		
		System.out.println(pergunta3);
		String resposta3 = ler.nextLine();
		if(resposta3.equals("sim")) {
			julgamento += 1;
		};
		
		String veredito = checaPessoa(julgamento);
		daResposta(veredito);
		
	}

}
