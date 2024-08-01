class exampleThread extends Thread{
    public void run(){
        try {
            for(int i=0; i<=5; i++){
                System.out.println("Hello Everyone!!");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class test{
    public static void main(String[] args) throws InterruptedException {
        exampleThread t = new exampleThread();
        t.start();

        for(int i=0; i<=5; i++){
            System.out.println("Anshu Mittal!!");
            Thread.sleep(1000);
        }
    }
}