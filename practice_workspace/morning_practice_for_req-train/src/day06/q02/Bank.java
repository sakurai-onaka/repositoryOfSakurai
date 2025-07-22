package day06.q02;

public class Bank {
	private String bankCode = "000111";
	private String bankName = "シェアード銀行";
	private Depositor depositor;
	
	public Depositor getDepositor() {
		return depositor;
	}
	
	public void setDepositor(Depositor depositor) {
		this.depositor = depositor;
	}
	public void showData() {
		System.out.println(this.bankCode);
		System.out.println(this.bankName);
		depositor.showData();
	}
	
	/*	public String getDepositorName() {
			return depositor.getName();
		}
		
		public int getDepositorMoney() {
			return depositor.getMoney();
		}
		
		public void setDepositorName(String name) {
			depositor.setName(name);
		}
		
		public void setDepositorMoney(int money) {
			depositor.setMoney(money);
		}
		*/

}
