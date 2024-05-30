import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);

		System.out.print("Digite o primeiro par�metro: ");
		int parametroUm = terminal.nextInt();
		
		System.out.print("Digite o primeiro par�metro: ");
		int parametroDois = terminal.nextInt();
		
		terminal.close();
		
		try {
		
			contar(parametroUm, parametroDois);
		
		} catch (ParametrosInvalidosException e) {
		
			System.err.println("O primeiro par�metro n�o pode ser maior que o segundo.");
		
		}
		
		
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{

		if(parametroUm > parametroDois){
		
			throw new ParametrosInvalidosException();
		
		}else{
			
			int contagem = parametroDois - parametroUm;

			for (int i = 1; i <= contagem; i++) {
				System.out.println("Imprimindo o n�mero: " + i);
			}
			
		}
		

		
	}

}
