final class FinalClass {
    // Final method in the final class
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }
}

// Uncomment the following code to observe compiler error when attempting to extend FinalClass

//class Subclass extends FinalClass {
//    // Error: Cannot inherit from final 'FinalClass'
//}


class AnotherClass {
    // Attempt to override a final method (will result in a compilation error)
    // Uncomment the following code to observe the compilation error
    /*
    public final void finalMethod() {
        System.out.println("Attempting to override a final method.");
    }
    */
}


