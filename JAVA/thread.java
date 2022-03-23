class thread1 extends Thread{ // implements Runnable
thread1(){
    // t = new Thread(this,"Thread_name");
super("New thread");
System.out.println("Thread name "+ this);
start();//t.start();
}

public void run(){
    try{
    for(int i = 0; i < 3; i++){
        System.out.println(" Iteration " + i);
        Thread.sleep(1000);
    }
    
    }
    catch(InterruptedException e){
        System.out.println(e);
    }
}
}


class thread{
    public static void main(String args[]){
    new thread1();
    try{
    System.out.println("Main thread started");
    for(int i = 0; i < 3; i++){
        System.out.println("main iteration" + i);
        Thread.sleep(2000);
    }
    System.out.println("Finished");
    }
    catch (InterruptedException e){
        System.out.println(e);
    }
}

}