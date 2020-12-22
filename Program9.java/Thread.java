class NewThread implements Runnable 
{
	String name; // name of thread
	int no; //thread no
	Thread t;
	NewThread(String threadname,int x)
	{
		name=threadname;
		no=x;
		t = new Thread(this, name);
		System.out.println("thread" + no +" created" );
		t.start(); //start the thread
	}
	public void run()
	{
		try
		{
			for(int i = 5; i > 0; i--)
			{
				System.out.println(name + ": " + i);
				if(no==1)
					Thread.sleep(10000);
				else 
					Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}


class threadmain 
{
	public static void main(String args[])
	{
		new NewThread("BMS College of Engineering",1);
		new NewThread("CSE",2);
	}
}
