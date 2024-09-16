public interface Introducible
{
    default void hello()
    {
        System.out.println("Hello, my name is Bartek");
    }
}