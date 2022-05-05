package Polymorphism;

/*
     Compile Time Polymorphism In Java is also known as Static Polymorphism.
     The call to the method is resolved at compile-time.
     Compile-Time polymorphism is achieved through `Method Overloading`.

     Method Overloading is when a class has multiple methods with the same name,
     but the number, types, and order of parameters and the return type of the methods are different.
     Java allows the user freedom to use the same name for various functions
     as long as it can distinguish between them by the type and number of parameters.
*/
class Addition
{
    void sum(int a, int b)
    {
        int c = a+b;
        System.out.println("Addition of two numbers :" +c); }
    void sum(int a, int b, int e)
    {
        int c = a+b+e;
        System.out.println("Addition of three numbers :" +c); }
    public static void main(String[] args)
    {
        Addition obj = new Addition();
        obj.sum ( 30,90);
        obj.sum(45, 80, 22);
    }
}
