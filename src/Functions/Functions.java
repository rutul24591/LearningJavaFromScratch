package Functions;

/*
*   In Java, all functions definitions must be inside classes. We also call functions, methods. For Example
*
*       public class Main {
            public static void foo() {
                // Do something here
            }
        }

*       foo is a method we defined in class `Main`. Notice a few things about `foo`
*
*       `static` means this method belongs to the class `Main` and not to a specific instance of `Main`. Which means we
*       can call the method from different class like `Main.foo`.
*
*       `void` means the method doesn't return a value. Methods can return a single value in `Java` and it has to be
*        defined in the method declaration. However, you can use `return` by itself to exit the method.
*
*       This method doesn't get any arguments, but Java methods can get arguments.
*
*
*   NON-STATIC METHODS
*
*       Non-static methods in Java are more used than static ones.
*       Those methods can only be run on objects and not on the whole class.
*
*       Non-static methods can access and alter the field of the object.
*
*
            public class Student {
                private String name;

                public String getName() {
                    return name;
                }
                public void setName(String name) {
                    this.name = name;
                }
            }

       Calling the methods will require an object of type Student.

        Student s = new Student();

        s.setName("Danielle");
        String name = s.getName();

        Student.setName("Bob"); // Will not work!
        Student.getName(); // Will not work!

*
*       Summary
            Every Java method has to be within a class
            Static methods belong to a class while non-static methods belong to object
            All parameters to functions are passed by value, primitives content is copied,
               while objects are not copied and some would say 'passed by reference'
* */

/** EXERCISE
 *
 * Write the method printFullName of student which prints the full name of a student.
 * */

    public class Functions {
        public static void main(String[] args) {
            Student[] students = new Student[] {
                    new Student("Morgan", "Freeman"),
                    new Student("Brad", "Pitt"),
                    new Student("Ra", "One"),
            };
            for (Student s : students) {
                s.printFullName();
            }
        }
    }


