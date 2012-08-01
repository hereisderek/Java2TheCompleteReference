class NewThread implements Runnable{
	String name;
	Thread t;
	
	NewThread(String threadName){
		name = threadName;
		// todo   what is this ?
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}
	
	public void run(){
		try{
			for (int i = 5; i > 0; i--){
				System.out.println("Child thread: " + name + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e){
			System.out.println(name + " Interrupted");
		}
		System.out.println(name + "Child Exiting");
	}
}

class MultiThreadDemo{
	public static void main(String args[]){
		new NewThread("T ONE");
		new NewThread("T TWO");
		new NewThread("T THREE");
		
		try{
			for (int i = 5; i > 0; i--){
				System.out.println("main thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e){
			System.out.println("main Interrupted");
		}
		System.out.println("mian Exiting");
	}
}