public class methodsThread extends Thread {
    public void run(){
        String n = Thread.currentThread().getName();
        for(int i=0; i<=5; i++){
            System.out.println(n);
        }
    }
}

class test{
    public static void main(String[] args) throws InterruptedException {
        methodsThread t1 = new methodsThread();
        methodsThread t2 = new methodsThread();
        methodsThread t3 = new methodsThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");

        // t2.start();
        // try{
        //     t2.join();
        // }catch(Exception e){
        //     System.out.println(e);
        // } 
        // t1.start();
        // t3.start();

        t1.start();

        t2.start();
        t2.suspend(); // pause

        t3.start();

        t2.resume();
    }
}
