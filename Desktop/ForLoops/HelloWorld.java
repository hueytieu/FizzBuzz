public class HelloWorld
{
    public void run() {
        for (int a = 1; a == 100; a = a + 1) {
            System.out.println(a);
        }
    }

    public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }
}

