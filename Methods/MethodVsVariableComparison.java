// DETAILED COMPARISON: WHY VARIABLES ≠ METHOD OVERRIDING

// ============ EXAMPLE 1: METHOD OVERRIDING (Dynamic Binding) ============
class AnimalParent {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class DogChild extends AnimalParent {
    @Override
    void sound() {
        System.out.println("Dog barks");  // OVERRIDDEN
    }
}

// ============ EXAMPLE 2: VARIABLE SHADOWING (Static Binding) ============
class VehicleParent {
    int speed = 50;
}

class CarChild extends VehicleParent {
    int speed = 100;  // SHADOWED (not overridden)
}

// ============ COMPARISON CLASS ============
public class MethodVsVariableComparison {
    public static void main(String[] args) {
        
        System.out.println("========== METHODS: Dynamic Binding ==========\n");
        
        AnimalParent animalRef = new DogChild();
        animalRef.sound();  // Prints "Dog barks"
                            // REASON: Actual object is Dog, so Dog's method executes
                            // Method call resolves at RUNTIME based on ACTUAL object type
        
        System.out.println("\n========== VARIABLES: Static Binding ==========\n");
        
        VehicleParent vehicleRef = new CarChild();
        System.out.println("vehicleRef.speed = " + vehicleRef.speed);  // Prints 50
                                                                        // REASON: Reference is Vehicle
                                                                        // Variable access resolves at COMPILE-TIME
                                                                        // based on REFERENCE type
        
        System.out.println("\n========== WHY THE DIFFERENCE? ==========\n");
        
        System.out.println("METHODS:");
        System.out.println("- Methods are looked up at RUNTIME");
        System.out.println("- JVM checks: What is the ACTUAL object type?");
        System.out.println("- Result: Uses the child's overridden method");
        
        System.out.println("\nVARIABLES:");
        System.out.println("- Variables are resolved at COMPILE-TIME");
        System.out.println("- Compiler checks: What is the REFERENCE type?");
        System.out.println("- Result: Uses the parent's variable");
        System.out.println("- No runtime lookup mechanism like methods");
    }
}

/*
============================================================================
IMPORTANT INSIGHT: Why are variables treated differently?
============================================================================

EFFICIENCY & DESIGN:
1. Variables are direct memory access (field offsets)
2. Compiler can calculate memory location at compile-time
3. No need for runtime lookup (would be slower)
4. JVM optimizations depend on compile-time resolution

METHOD CALLS:
1. Use virtual method table (vtable) lookup
2. Runtime polymorphism enables correct method selection
3. Slightly slower but provides flexibility
4. This is the whole point of inheritance!

DESIGN PHILOSOPHY:
- Variables are DATA - simple memory locations
- Methods are BEHAVIOR - behavior CAN be overridden
- Only behavior (methods) should be polymorphic
- Variables should be deterministic based on reference type

============================================================================
EXAMPLE: How this prevents bugs:
============================================================================

If variables used runtime polymorphism like methods:

Wrong behavior example:
    Parent ref = new Child();
    ref.x = 50;  // Which x? Parent's or Child's? AMBIGUOUS!

With static binding:
    Parent ref = new Child();
    ref.x = 50;  // CLEAR: Sets Parent's x, not Child's x
    
This prevents confusion and accidental data overwrites.

============================================================================
*/
