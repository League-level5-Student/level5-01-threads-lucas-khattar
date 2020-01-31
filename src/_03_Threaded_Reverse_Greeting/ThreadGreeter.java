package _03_Threaded_Reverse_Greeting;

public class ThreadGreeter implements Runnable{
	int number;
	public ThreadGreeter(int num) {
		number = num;
	}
	
	@Override
	public void run() {
		System.out.println("Hello from thread number: "+number);
		if(number < 50) {
			Thread th = new Thread(new ThreadGreeter(number+1));
			th.start();
			try {
				th.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
