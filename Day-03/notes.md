# 📘 Day 03 - Operators & Expressions in Java

## 🎯 Topics Covered

- Arithmetic Operators
- Relational Operators
- Logical Operators
- Assignment Operators
- Unary Operators
- Ternary Operator
- Mathematical Expressions
- Area & Percentage Calculations
- Temperature Conversion
- Even/Odd Number Check

---

# 📌 Operators

Operators are special symbols used to perform operations on variables and values.

Example:

```java
int sum = 10 + 20;
```

---

# 📌 Arithmetic Operators

Used to perform mathematical operations.

| Operator | Description | Example |
|----------|-------------|---------|
| + | Addition | a + b |
| - | Subtraction | a - b |
| * | Multiplication | a * b |
| / | Division | a / b |
| % | Modulus (Remainder) | a % b |

Example:

```java
int a = 15;
int b = 4;

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a * b);
System.out.println(a / b);
System.out.println(a % b);
```

---

# 📌 Relational Operators

Used to compare two values.

| Operator | Description |
|----------|-------------|
| > | Greater Than |
| < | Less Than |
| >= | Greater Than or Equal To |
| <= | Less Than or Equal To |
| == | Equal To |
| != | Not Equal To |

Example:

```java
int a = 10;
int b = 20;

System.out.println(a > b);
System.out.println(a < b);
System.out.println(a == b);
```

Output

```
false
true
false
```

---

# 📌 Logical Operators

Used to combine multiple conditions.

| Operator | Meaning |
|----------|---------|
| && | Logical AND |
| \|\| | Logical OR |
| ! | Logical NOT |

Example

```java
boolean a = true;
boolean b = false;

System.out.println(a && b);
System.out.println(a || b);
System.out.println(!a);
```

Output

```
false
true
false
```

---

# 📌 Assignment Operators

Used to assign or update values.

| Operator | Example |
|----------|---------|
| = | a = 10 |
| += | a += 5 |
| -= | a -= 5 |
| *= | a *= 5 |
| /= | a /= 5 |
| %= | a %= 5 |

Example

```java
int num = 10;

num += 5;
num -= 2;
num *= 3;
```

---

# 📌 Unary Operators

Unary operators work on a single operand.

| Operator | Description |
|----------|-------------|
| ++ | Increment |
| -- | Decrement |

## Pre Increment

```java
++a;
```

Value is increased first.

## Post Increment

```java
a++;
```

Value is used first, then increased.

The same concept applies to decrement (`--`).

---

# 📌 Ternary Operator

A shorthand for simple `if-else` conditions.

### Syntax

```java
condition ? value1 : value2;
```

Example

```java
int largest = (a > b) ? a : b;
```

---

# 📌 Formula Used

## Celsius to Fahrenheit

```
F = (C × 9 / 5) + 32
```

---

## Area of Circle

```
Area = π × r × r
```

In Java

```java
Math.PI
```

---

## Percentage

```
Percentage = Total Marks / Number of Subjects
```

---

# 📌 Problems Solved

✅ Arithmetic Operators

✅ Relational Operators

✅ Logical Operators

✅ Assignment Operators

✅ Unary Operators

✅ Even or Odd

✅ Largest of Two Numbers

✅ Temperature Converter

✅ Area of Circle

✅ Percentage Calculator

---

# 📚 What I Learned Today

- How different operators work in Java.
- Performing arithmetic calculations.
- Comparing values using relational operators.
- Combining conditions with logical operators.
- Updating values using assignment operators.
- Difference between pre and post increment/decrement.
- Using the ternary operator for simple decision-making.
- Applying mathematical formulas in Java programs.

---

# 🚀 Progress

✔ **Day 03 Completed**

📂 Programs Added: **10**

📝 Notes Added: **Operators & Expressions**

🎯 **Next Topic:** Conditional Statements (`if`, `if-else`, `nested if`, `switch`)