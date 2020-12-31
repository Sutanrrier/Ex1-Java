package util;

public class Functions {

	private String acc_name;
	private char opt;
	private int acc_num;
	private double saldo;
	
	public Functions(String acc_name, char opt, int acc_num, double saldo) {
		this.acc_name = acc_name;
		this.opt = opt;
		this.acc_num = acc_num;
		this.saldo = saldo;
	}

	public Functions(String acc_name, char opt, int acc_num) {
		this.acc_name = acc_name;
		this.opt = opt;
		this.acc_num = acc_num;
	}
	
	public String getAcc_name() {
		return acc_name;
	}

	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}

	public char getOpt() {
		return opt;
	}

	public void setOpt(char opt) {
		this.opt = opt;
	}

	public int getAcc_num() {
		return acc_num;
	}

	public double getSaldo() {
		return saldo;
	}

	public void Status() {
		System.out.println("Account " + acc_num + ", Holder " + acc_name + ", Balance " + saldo);
	}
	
	public void AddSaldo(double value){
		saldo += value;
		
	}
	public void RemoveSaldo(double value){
		saldo -= value;
	}
	
}
