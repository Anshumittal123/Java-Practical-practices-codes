class copyConstructure{
    int a;
    String b;
    copyConstructure(int x, String y){
        a = x; b = y;
        System.out.println(a+" "+b);
    }
    copyConstructure(copyConstructure ref){
        a = ref.a;
        b = ref.b;
        System.out.println(a+" "+b);
    }

    public static void main(String ags[]){
        copyConstructure r = new copyConstructure(55, "Anshu");
        copyConstructure r2 = new copyConstructure(r);
    }
}
