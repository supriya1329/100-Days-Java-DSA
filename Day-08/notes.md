# 📘 Day 08 - Methods (Functions) in Java

## 🎯 Topics Covered

- What is a Method?
- Why Methods are Used
- Method Declaration
- Method Calling
- Method Parameters
- Method Arguments
- Return Type
- Void Methods
- Static Methods
- Method Overloading

---

# 📌 What is a Method?

A **method** is a block of code that performs a specific task.

Instead of writing the same code multiple times, we can write it once inside a method and call it whenever needed.

### Example

```java
public class Example {

    static void greet() {
        System.out.println("Hello Java!");
    }

    public static void main(String[] args) {

        greet();
        greet();
    }
}
```

### Output

```
Hello Java!
Hello Java!
```

---

# 📌 Advantages of Methods

- Reusability
- Reduces Code Duplication
- Improves Readability
- Easy to Debug
- Easy to Maintain
- Makes Programs Modular

---

# 📌 Syntax of a Method

```java
returnType methodName(parameters) {

    // Method Body

}
```

Example

```java
static int add(int a, int b) {

    return a + b;

}
```

---

# 📌 Parts of a Method

```java
static int add(int a, int b)
```

| Part | Meaning |
|------|---------|
| static | Method belongs to the class |
| int | Return Type |
| add | Method Name |
| int a, int b | Parameters |

---

# 📌 Calling a Method

```java
int sum = add(10,20);

System.out.println(sum);
```

Output

```
30
```

---

# 📌 Parameters vs Arguments

### Parameters

Variables declared inside the method definition.

```java
static int add(int a,int b)
```

Here,

```
a
b
```

are Parameters.

---

### Arguments

Actual values passed while calling the method.

```java
add(10,20);
```

Here,

```
10
20
```

are Arguments.

---

# 📌 Return Type

A return type specifies what value a method gives back.

Example

```java
static int square(int n){

    return n*n;

}
```

---

# 📌 Void Method

A void method does not return any value.

Example

```java
static void message(){

    System.out.println("Welcome");

}
```

---

# 📌 Static Method

A static method belongs to the class and can be called directly inside `main()`.

Example

```java
public class Demo{

    static void display(){

        System.out.println("Hello");

    }

    public static void main(String[] args){

        display();

    }
}
```

---

# 📌 Method Overloading

Method Overloading means creating multiple methods with the same name but different parameter lists.

Example

```java
static int add(int a,int b){

    return a+b;

}

static int add(int a,int b,int c){

    return a+b+c;

}

static double add(double a,double b){

    return a+b;

}
```

---

# 📌 Rules of Method Overloading

✔ Same Method Name

✔ Different Number of Parameters

OR

✔ Different Data Types

Return type alone cannot overload a method.

❌ Invalid

```java
int add(int a,int b)

double add(int a,int b)
```

---

# 📌 Types of Methods

### 1. Method with No Parameters and No Return Value

```java
static void greet(){

    System.out.println("Hello");

}
```

---

### 2. Method with Parameters and No Return Value

```java
static void display(int age){

    System.out.println(age);

}
```

---

### 3. Method with Parameters and Return Value

```java
static int add(int a,int b){

    return a+b;

}
```

---

# 📌 Flow of Method Execution

```
main()

↓

Method Call

↓

Method Executes

↓

Returns Value (if any)

↓

Back to main()
```

---

# 📌 Programs Practiced Today

✅ Print Welcome Message

✅ Add Two Numbers

✅ Even or Odd using Method

✅ Factorial using Method

✅ Prime Number using Method

✅ Maximum of Three Numbers

✅ Power of a Number

✅ Palindrome Number using Method

✅ Fibonacci Series using Method

✅ Method Overloading

---

# 📌 Real-Life Examples of Methods

- ATM → Withdraw Money
- Mobile → Make a Call
- Calculator → Add Numbers
- Instagram → Send Message
- Camera → Capture Photo

Each task is performed by a separate method.

---

# 💡 Key Takeaways

- A method is used to perform a specific task.
- Methods make code reusable and organized.
- `void` methods do not return a value.
- `return` sends a value back to the caller.
- Parameters receive values; arguments pass values.
- `static` methods can be called directly from `main()`.
- Method overloading allows the same method name with different parameter lists.

---

# 📝 Summary

- Learned how to create and call methods.
- Understood parameters, arguments, and return values.
- Practiced writing reusable Java programs.
- Explored method overloading for different input types.
- Improved code organization using functions.

---

# 🚀 Progress

✔ Day 08 Completed

📂 Programs Added: **10**

📝 Notes Added: **Methods (Functions) in Java**

🎯 **Next Topic:** Arrays (One-Dimensional Arrays)