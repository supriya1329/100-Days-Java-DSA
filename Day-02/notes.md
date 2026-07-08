# 📘 Day 02 - Variables, Data Types & User Input in Java

## 🎯 Topics Covered
- Variables
- Primitive Data Types
- Non-Primitive Data Types
- User Input using Scanner Class
- Arithmetic Operations
- Type Casting
- Swapping Variables
- Simple Interest Calculation
- Average Calculation

---

# 📌 Variables

A variable is a named memory location used to store data.

### Syntax
```java
dataType variableName = value;
```

### Example
```java
int age = 18;
double salary = 50000.50;
char grade = 'A';
boolean isStudent = true;
```

---

# 📌 Primitive Data Types

| Data Type | Size | Example |
|-----------|------|---------|
| byte | 1 byte | 100 |
| short | 2 bytes | 30000 |
| int | 4 bytes | 500 |
| long | 8 bytes | 100000L |
| float | 4 bytes | 5.5f |
| double | 8 bytes | 99.99 |
| char | 2 bytes | 'A' |
| boolean | 1 bit | true / false |

---

# 📌 Non-Primitive Data Types

Examples:
- String
- Arrays
- Classes
- Objects

Example:
```java
String name = "Supriya";
```

---

# 📌 Scanner Class

The `Scanner` class is used to take input from the user.

Import it using:

```java
import java.util.Scanner;
```

Create Scanner object:

```java
Scanner sc = new Scanner(System.in);
```

Methods:

```java
nextInt();
nextDouble();
nextFloat();
next();
nextLine();
nextBoolean();
```

Always close the scanner after use.

```java
sc.close();
```

---

# 📌 Type Casting

## Implicit Type Casting (Widening)

Smaller data type → Larger data type

```java
int a = 10;
double b = a;
```

Output:

```
10.0
```

---

## Explicit Type Casting (Narrowing)

Larger data type → Smaller data type

```java
double num = 12.75;
int value = (int) num;
```

Output

```
12
```

---

# 📌 Swap Using Third Variable

```java
int temp = a;
a = b;
b = temp;
```

---

# 📌 Swap Without Third Variable

```java
a = a + b;
b = a - b;
a = a - b;
```

---

# 📌 Formula Used

### Simple Interest

```
SI = (P × R × T) / 100
```

### Average

```
Average = (a + b + c) / 3
```

---

# 📌 Problems Solved

✅ Variables

✅ Data Types

✅ User Input

✅ Sum of Two Numbers

✅ Simple Interest

✅ Average of Three Numbers

✅ Swap Using Third Variable

✅ Swap Without Third Variable

✅ Student Details

✅ Type Casting

---

# 📚 What I Learned Today

- How variables store different types of data.
- Difference between primitive and non-primitive data types.
- Taking user input using the Scanner class.
- Performing arithmetic operations.
- Swapping values using two different approaches.
- Understanding implicit and explicit type casting.
- Writing clean Java programs with proper input and output.

---

## 🚀 Progress

✔ Day 02 Completed

📂 Programs Added: **10**

🎯 Next Topic: **Operators & Expressions**