class NewThread implements Runnable{
	String name;
	Thread t;
	
	NewThread(String threadName){
		name = threadName;
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

class DemoJoin{
	public static void main(String args[]){
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		NewThread ob3 = new NewThread("Three");
		NewThread ob4 = new NewThread("Four");
		
		System.out.println("Thread One is: " + ob1.t.isAlive());
		System.out.println("Thread 2 is: " + ob2.t.isAlive());
		System.out.println("Thread 3 is: " + ob3.t.isAlive());
		System.out.println("Thread 4 is: " + ob4.t.isAlive());
		
		try {
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
			ob4.t.join();
		} catch (InterruptedException e){
			System.out.println("Main Interrupted");
		}
		System.out.println("Thread One is: " + ob1.t.isAlive());
		System.out.println("Thread 2 is: " + ob2.t.isAlive());
		System.out.println("Thread 3 is: " + ob3.t.isAlive());
		System.out.println("Thread 4 is: " + ob4.t.isAlive());
	}
}