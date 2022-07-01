class A extends Thread{
	public void run(){
		for(int i=1; i<=20; i++){
			System.out.println("Thread A");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
class B extends Thread{
	public void run(){
		for(int i=1; i<=5; i++){
			System.out.println("Thread B");
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}
class Main2{
	public static void main(String args[]) throws Exception{
		A thread1 = new A();
		B thread2 = new B();
		System.out.println("Starts Thread A for 2 seconds here: ");
		thread1.start();
		thread1.join(2000);
		System.out.println("Paused Thread A here. ");
		thread1.suspend();
			System.out.println("Starts Thread B for 5 seconds here: ");
			thread2.start();
			thread2.join(5000);
		System.out.println("Resumed Thread A for 10 seconds here. ");
		thread1.resume();
		thread1.join(10000);
		System.out.println("Dead Thread A. ");
		thread1.stop();
			System.out.println("Dead Thread B. ");
			thread2.stop();
	}
}
