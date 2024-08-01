class ThrowAndThrows{
    void div(int a, int b){
        if(b == 0){
            throw new ArithmeticException();
        }else{
            int c = a / b;
            System.out.println(c);
        }
    }
    public static void main(String args[]) throws InterruptedException { 
        ThrowAndThrows t = new ThrowAndThrows();
        t.div(20, 2);

        for(int i = 1; i<=10; i++){
            System.out.println(i);
            Thread.sleep(1000);
            // try {
            //     System.out.println(i);
            //     Thread.sleep(1000);
            // } catch (Exception e) {
            //     System.out.println(e);
            // }
        }
    }
}