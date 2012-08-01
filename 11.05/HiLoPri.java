class clicker implements Runnable{
	int click = 0;
	Thread t;
	private volatile boolean running = true;
	
	public clicker (int p){
		t = new Thread(this);
		t.setPriority(p);
	}
	
	public void run(){
		while (running){
			// try{
				// System.out.println("Running Thread: " + t);
				// Thread.sleep(100);
			// } catch (Exception e){
				// System.out.println("Error happened");
			// }
			click++;
		}
	}
	
	public void stop(){
		running = false;
	}
	
	public void start(){
		t.start();
	}
}

class HiLoPri{
	public static void main(String[] args){
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		clicker hi = new clicker(Thread.NORM_PRIORITY + 4);
		clicker lo = new clicker(Thread.NORM_PRIORITY - 4);
		
		lo.start();
		hi.start();
		try{
			Thread.sleep(10000);
		} catch (InterruptedException e){
			System.out.println("Main thread interrupted.");
		}
		
		lo.stop();
		hi.stop();
		
		// wait for child threads to terminate.
		try{
			hi.t.join();
			lo.t.join();
		} catch(InterruptedException e){
			System.out.println("Interrupted");
		}
		
		System.out.println("LOW: " + lo.click + "\nhigh: " + hi.click);
	}
}