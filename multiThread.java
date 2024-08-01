public class multiThread extends Thread {
    public void run(){
        try {
            String n = Thread.currentThread().getName();
            for(int i = 0; i <= 10; i++){
                System.out.println(n);
            }
        } catch (Exception e) {
            System.out.println("e");
        }
    }
}

class test{
    public static void main(String[] args) throws InterruptedException {
        multiThread MyThread = new multiThread();
        multiThread YourThread = new multiThread();

        MyThread.setName("Java");
        YourThread.setName("Programming");

        MyThread.setPriority(7);

        MyThread.start();
        YourThread.start();

     }
}
