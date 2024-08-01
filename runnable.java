class runnable implements Runnable{
    public void run(){
        for(int i = 0; i<=5; i++){
            System.out.println("My child thread!!!!");
        }
    }
}

class test{
    public static void main(String[] args) {
        runnable r = new runnable();

        Thread t = new Thread(r);
        t.start();

        for(int i = 0; i<=5; i++){
            System.out.println("Main thread!!!!");
        }
    }
}