class Shape
{
    String colour="red";
}
class Sqr extends Shape
{
    String colour="blue";
    void display()
    {
        System.out.println(super.colour);
        System.out.println(colour);
    }
}
class SuperDemo
{
    public static void main(String... args)
    {
        Sqr s = new Sqr(); 
        s.display();
    }
}