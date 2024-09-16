public class Person implements Introducible, Informational
{
    public void hello()
    {
        Introducible.super.hello();
    }
}