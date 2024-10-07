class CurrentThreadName extends Thread
{
	public void run() 
	{
		System.out.println("thread name is running");
		System.out.println(ThreadName.currentThread().getName());
	}
}

public class Ctn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	CurrentThreadName t1=new CurrentThreadName();
	CurrentThreadName t2=new CurrentThreadName();
	t1.start();
	t2.start();
	}

}