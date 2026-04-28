# Java Learning Codebase - AI Agent Instructions

## Overview
This is a **structured Java fundamentals learning repository** containing practice exercises covering core OOP concepts and method patterns. Files are organized by topic, not packages.

## Codebase Patterns

### Class Structure & Naming Conventions
- **Pattern**: Class name = File name (e.g., `Student.java` contains `public class Student`)
- **Private fields + Constructor + Display method**: Standard pattern for data classes
  - Example: [Student.java](../Student.java) shows instance variables declared `private`, initialized in parameterized constructor, with a `displayDetails()` method
  - Main method contains: object creation, instantiation loop (usually 3-5 sample objects), and display calls

### Method Overloading & Var-Args
- **Method overloading by parameter count**: [Method_Overloading.java](../Method_Overloading.java) demonstrates same method name with different parameter counts
- **Var-args pattern** (`int...arr`): [Var_args.java](../Var_args.java) shows variable-length argument methods as alternative to arrays

### Static Variables & Methods
- **Access patterns** ([Static_variable.java](../Static_variable.java)):
  - `ClassName.staticVar` (recommended approach)
  - Direct access within class
  - Object reference (not recommended)
- Static variables stored in method area, initialized at class load time

### Input Handling Patterns
- **BufferedReader with IOException**: [Method_1.java](../Method_1.java) uses try-throw pattern for console input
- **Scanner class**: Alternative shown in commented-out examples in [Main.java](../Main.java) for switch-case menu workflows

## File Categories
- **Data Classes**: Student.java, Laptop.java, Details.java, Product.java
- **Method Demonstrations**: Method_1.java through Method_4.java, Method_Overloading.java
- **Operators & Variables**: Addition.java, Subtraction.java, Multiplication.java, Division.java, AssignmentOperator.java
- **Concept Examples**: Static_variable.java, Instance_variables.java, Local_variable.java, Var_args.java
- **Practice Exercises**: Practice.java, Practice2.java, Practice3.java, Practice4.java, Questions1.java

## Execution & Build
- **Single file execution**: `javac ClassName.java && java ClassName`
- **No external dependencies** - pure Java SE fundamentals
- No build system (Maven/Gradle) - direct javac compilation

## Common Modifications
- Add new data class: Create Student-like structure with private fields → constructor → display method
- Add arithmetic operation: Create two-parameter method (e.g., `add(int a, int b)`) in existing Operation class
- Demonstrate new concept: Isolated class file with inline comments and 2-3 working examples

## Notes
- Comments heavily document WHY patterns exist (e.g., "Constructor has no return type", "Recommended by class name")
- Many files contain commented-out variations showing alternative approaches
- Learning-focused: Prioritize clarity and concept demonstration over optimization
