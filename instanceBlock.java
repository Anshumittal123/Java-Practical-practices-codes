class instanceBlock {
    int a, b;
    instanceBlock(){
        a = 20; b = 40;
        System.out.println(a+" "+b);
    }
    {
        a = 10; b = 30;
        System.out.println(a+" "+b);
    }
    void show(){
        a = 50; b = 60;
        System.out.println(a+" "+b);
    }

    static void display(){
        System.out.println("Hello learners");
    }

    public static void main(String[] args) {
        instanceBlock.display();
        instanceBlock r = new instanceBlock();
        r.show();
    }
}

// OUTPUT:
// Hello learners (static method )
// 10 30 (Firstly instance block called)
// 20 40
// 50 60
