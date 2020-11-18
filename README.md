# WritingClasses

A Class provides a blueprint for an object, which has fields (data) and behavior (methods).  A class also allows abstracts out the ideas from the details.  This allows for a class to be used without knowing how it's implemented.  All of the other Java classes we've used, implement abstraction.  We can use the `String` or `Random` class, but we don't know exactly how its methods are implemented.  

## Properties of Classes

1. Fields: variables inside the object.  Each object has its **own copy** of the fields and contribute to its state.  
    Fields can be accessed/modified by other classes (what we are doing in our main method ... which is part of another class: `ClassRunner`.  
2. Instance Methods (Behavior): exist inside each object and give behavior to it.  Each object has its own copy of the classes methods to use on that object.  

## Types of Methods  

1. Mutators (Setters): A method that modifies an object's state.  Often has a void return type.  
2. Accessors (Getters): A method that lets the client examine object state.  Often has a non-void return type.  

