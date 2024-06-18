package Controle;

import Utilidades.Data;

public class RegistroContas {

	public static void main(String[] args) {
		Data d=new Data(17,06,2024);
		Correntista c1=new Correntista("02374139056", "Ana");
		Correntista c2=new Correntista("04569732185", "Joao");
		Correntista [] correntistas=new Correntista[2];
		correntistas[0]= c1;
		correntistas[1]= c2;
		Conta conta1=new Conta(3455, d, correntistas, 200);
		System.out.println(conta1);
		conta1.fazerDeposito(300);
		System.out.println(conta1);
		conta1.fazerSaque(150);
		System.out.println(conta1);

}
}
