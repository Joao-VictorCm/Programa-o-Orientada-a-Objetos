package Controle;

import Utilidades.Data;

public class Conta {
 private int nroConta;
 private double saldo;
 private Data dataAbertura;
 private Correntista [] correntistas;
 
 public Conta(int nroConta, Data dataAbertura,Correntista [] correntista, double monto) {
	 
	 this.nroConta= nroConta;
	 this.dataAbertura = dataAbertura;
	 this.correntistas = correntista;
	 this.saldo=monto;
 }
 
 
 public String toString() {
	 String rpta ="nroCont: " + nroConta + "saldo: " +saldo+ "data de abertura:" +dataAbertura;
	 for(int i=0; i < correntistas.length; i++) {
		 rpta = rpta+correntistas[i];
	 }
	 return rpta;
 
 }
 
 
 public boolean fazerDeposito(double monto) {
	 if(monto >= 0) {
		 saldo= saldo+monto;
				 return true;
	 }
	 else {
		 return false;
	 }
 }
 
 public boolean fazerSaque(double monto) {
	 if(saldo > monto) {
		 saldo=saldo-monto;
		 return true;
	 }
	 else {
		 return false;
	 }
 }
	 
	 public boolean fazerTransferencia(Conta destino, double monto) {
		 
		 if (this.fazerSaque(monto) == true) {
			 destino.fazerDeposito(monto);
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
 }
 
 
 
 
 
 
 

