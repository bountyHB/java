package jungsuk;

class Account2 {
	private int balance = 1000; // private으로 해야 동기화가 의미가 있다.
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {// synchronized로 메서드를 동기화
		if(balance >= money) {
			try {Thread.sleep(1000);} catch (InterruptedException e) { }
			balance -= money;
		}
	} //withdraw
}

class RunnableEx22 implements Runnable {
	Account2 acc = new Account2();
	
	public void run() {
		while (acc.getBalance() > 0) {
			// 100, 200, 300중의 한 값을 임의로 선택해서 출금 (withdraw)
			int money = (int)(Math.random() * 3 + 1)*100;
			acc.withdraw(money);
			System.out.println("balance:" + acc.getBalance());
		}
	} //run()
}

class ThreadEx22 {
	public static void main(String args[]) {
		Runnable r = new RunnableEx22();
		new Thread(r).start();
		new Thread(r).start();
	}
}

/* synchronized를 붙이지 않았을 때의 출력 
* balance:900
* balance:700
* balance:600
* balance:400
* balance:200
* balance:-100
* 계속하려면 아무 키나 누르세요. 
*/

/*synchronized를 붙이고 나서의 출 력 
 * balance:800
 * balance:500
 * balance:200
 * balance:0
 * balance:0
 *  계속하려면 아무 키나 누르세요. 
*/

