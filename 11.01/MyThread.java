// Page 279
class NewThread implements Runnable{
	Thread t;
	NewThread(){
		t = new Thread(this, "Demo thread");
		System.out.println("Child thread: " + t);
		t.start();
	}
	public void run(){
		try {
			for (int i = 5; i > 0; i--){
				System.out.println("Child Thread: " + i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e) {
			System.out.println("Interupted");
		}
		System.out.println("Child Thread Exiting");
	}	
}

class MyThread{
	public static void main(String[] args){
		new NewThread(){
			// TODO 
		};
		
		try{
			for (int i = 5; i > 0; i--){
				System.out.println("Main Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e){
			System.out.println("Main Interupted");
		}
		System.out.println("Main Thread Exiting");
	}
}