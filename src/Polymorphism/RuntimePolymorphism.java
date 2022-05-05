package Polymorphism;

/*
    Runtime polymorphism in Java is also popularly known as Dynamic Binding or Dynamic Method Dispatch.

    In this process, the call to an overridden method is resolved dynamically at runtime rather than at compile-time.

    You can achieve Runtime polymorphism via `Method Overriding`.

    Method Overriding is done when a child or a subclass has a method with the same name, parameters, and
    return type as the parent or the superclass;
    then that function overrides the function in the superclass.
    In simpler terms, if the subclass provides its definition to a method already present in the superclass;
    then that function in the base class is said to be overridden.

    NOTE: Also, it should be noted that runtime polymorphism can only be achieved through functions and not data members.

    Overriding is done by using a reference variable of the superclass.
    The method to be called is determined based on the object which is being referred to by the reference variable.
    This is also known as `Upcasting`.
*/

class Animals{
    void eat(){
        System.out.println("Animals Eat");
    }
}
class herbivores extends Animals{
    void eat(){
        System.out.println("Herbivores Eat Plants");
    }
}
class omnivores extends Animals{
    void eat(){
        System.out.println("Omnivores Eat Plants and meat");
    }
}
class carnivores extends Animals{
    void eat(){
        System.out.println("Carnivores Eat meat");
    }
}

class RuntimePolymorphismMain{
    public static void main(String args[]){
        Animals A = new Animals();
        Animals h = new herbivores(); //upcasting i.e using Animals instead of herbivores to create instance
        Animals o = new omnivores(); //upcasting i.e using Animals instead of omnivores to create instance
        Animals c = new carnivores(); //upcasting i.e using Animals instead of carnivores to create instance
        A.eat();
        h.eat();
        o.eat();
        c.eat();

    }
}
