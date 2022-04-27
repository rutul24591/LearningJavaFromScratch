package HelloWorld;

// This line declares a class named HelloWorld, which is public, that means that any other class can access it.
// Notice that when we declare a public class, we must declare it inside a file with the same name (HelloWorld.java),
// otherwise we'll get an error when compiling.
public class HelloWorld {

    // This is the entry point of our Java program. The main method has to have this exact signature in order to be able to run our program.
    // `public` again means that anyone can access it.
    // `static` means that you can run this method without creating an instance of Main.
    // `void` means that this method doesn't return any value.
    // `main` is the name of the method.
    // The `arguments` we get inside the method are the arguments that we will get when running the program with parameters. It's an `array of strings`.
    public static void main(String[] args) {

        // `System` is a pre-defined class that Java provides us, and it holds some useful methods and variables.
        // `out` is a static variable within `System` that represents the output of your program (stdout).
        // `println` is a method of `out` that can be used to print a line.
        System.out.println("Hello World! This will be printed");
    }
}

