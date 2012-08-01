// Page 281
class NewThread extends Thread{
	NewThread(){
		super("Demo Thread");
		System.out.println("Child Thread: " + this);
		start();
	}
	public void run(){
		try{
			for (int i = 15; i > 0; i--){
				System.out.println("Child Thread: " + i);
				Thread.sleep(1000);
				} 
		}catch (InterruptedException e){
			System.err.println("Interrupted");
		}
		System.out.println("Child exiting");
	}
}

class ExtendThread{
	public static void main(String[] args){
		new NewThread();
		
		try{
			for (int i = 5; i > 0; i--){
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			} 
		} catch (InterruptedException e){
			System.err.println("Main Interrupted");
		}
		System.out.println("Main Exiting");
	}
}