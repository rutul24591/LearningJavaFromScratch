package Packages;

/*
        A package in Java is used to group related classes. Think of it as a folder in a file directory.
        We use packages to avoid name conflicts, and to write a better maintainable code.
        Packages are divided into two categories:

            Built-in Packages (packages from the Java API)
            User-defined Packages (create your own packages)

        To use a class or a package from the library, you need to use the `import` keyword

        Built-in Packages
        Builtin packages are the packages provided by java itself.

        SYNTAX

            import package.name.Class;   // Import a single class of name `Class`
            import package.name.*;   // Import the whole package


        User-defined Packages
        To create your own package, you need to understand that Java uses a file system directory to store them.

        Example
         └── root
          └── mypack
            └── MyPackageClass.java

          To create a package, use the `package` keyword.

          MyPackageClass.java

            package mypack;
            class MyPackageClass {
              public static void main(String[] args) {
                System.out.println("This is my package!");
              }
            }

            To compile on terminal use:

                javac -d . MyPackageClass.java

                When we compiled the package in the example above, a new folder was created, called "mypack".

            To run:

                java mypack.MyPackageClass

          Note: The package name should be written in lower case to avoid conflict with class names.
*/

import java.util.Scanner;

// Here we are importing `Scanner` class from the `java.util` package
// To use the Scanner class, create an object of the class
// and use any of the available methods found in the Scanner class documentation.
// In our example, we will use the nextLine() method.

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);
    }
}
