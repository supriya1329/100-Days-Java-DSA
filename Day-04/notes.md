# 📘 Day 04 - Conditional Statements in Java

## 🎯 Topics Covered

- if Statement
- if-else Statement
- else-if Ladder
- Nested if
- switch Statement
- Ternary Operator
- Logical Operators in Conditions
- Real-world Decision Making Programs

---

# 📌 Conditional Statements

Conditional statements allow a program to make decisions based on certain conditions.

### Syntax

```java
if (condition) {
    // code to execute
}
```

---

# 📌 if Statement

Executes a block of code only if the condition is true.

### Example

```java
int age = 20;

if (age >= 18) {
    System.out.println("Eligible to Vote");
}
```

---

# 📌 if-else Statement

Executes one block if the condition is true, otherwise executes another block.

### Syntax

```java
if (condition) {
    // True block
} else {
    // False block
}
```

### Example

```java
int number = 15;

if (number % 2 == 0) {
    System.out.println("Even");
} else {
    System.out.println("Odd");
}
```

---

# 📌 else-if Ladder

Used when multiple conditions need to be checked.

### Syntax

```java
if (condition1) {

}
else if (condition2) {

}
else {

}
```

### Example

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A");
}
else if (marks >= 80) {
    System.out.println("Grade B");
}
else {
    System.out.println("Grade C");
}
```

---

# 📌 Nested if

An `if` statement inside another `if` statement.

### Example

```java
int age = 20;
boolean hasID = true;

if (age >= 18) {
    if (hasID) {
        System.out.println("Entry Allowed");
    }
}
```

---

# 📌 switch Statement

The `switch` statement is used to select one of many possible code blocks based on the value of an expression.

### Syntax

```java
switch(expression) {

    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

### Example

```java
int day = 3;

switch(day) {
    case 1:
        System.out.println("Monday");
        break;

    case 2:
        System.out.println("Tuesday");
        break;

    case 3:
        System.out.println("Wednesday");
        break;

    default:
        System.out.println("Invalid Day");
}
```

---

# 📌 Ternary Operator

A shorthand version of `if-else`.

### Syntax

```java
condition ? value_if_true : value_if_false;
```

### Example

```java
int number = 8;

String result = (number % 2 == 0) ? "Even" : "Odd";

System.out.println(result);
```

---

# 📌 Logical Operators Used

| Operator | Description |
|----------|-------------|
| && | Logical AND |
| || | Logical OR |
| ! | Logical NOT |

### Example

```java
if(age >= 18 && hasID){
    System.out.println("Allowed");
}
```

---

# 📌 Problems Solved

✅ Positive, Negative or Zero

✅ Voting Eligibility

✅ Largest of Three Numbers

✅ Leap Year Check

✅ Grade Calculator

✅ Divisible by 5 and 11

✅ Even or Odd using Ternary Operator

✅ Simple Calculator using Switch

✅ Month Name using Switch

✅ Days in a Month

---

# 📚 What I Learned Today

- How Java makes decisions using conditional statements.
- Difference between `if`, `if-else`, and `else-if`.
- How to check multiple conditions efficiently.
- How to use nested `if` statements.
- Using the `switch` statement for multiple choices.
- Simplifying simple conditions with the ternary operator.
- Building real-world programs such as grade calculators, leap year checkers, and calculators.

---

# 💡 Key Takeaways

- Use **if** for a single condition.
- Use **if-else** when there are two possible outcomes.
- Use **else-if ladder** when multiple conditions need to be checked.
- Use **switch** when comparing one variable against multiple fixed values.
- Use the **ternary operator** for short and simple decisions.

---

# 🚀 Progress

✔ **Day 04 Completed**

📂 Programs Added: **10**

📝 Notes Added: **Conditional Statements**

🎯 **Next Topic:** Loops (`for`, `while`, `do-while`)