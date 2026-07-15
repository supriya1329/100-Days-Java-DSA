# 📘 Day 10 - Strings in Java

## 🎯 Topics Covered

- What is a String?
- String Declaration
- String Creation
- String Input
- String Methods
- String Traversal
- Reverse a String
- Palindrome String
- Count Vowels and Consonants
- Count Words
- Character Frequency
- Remove Spaces
- Compare Strings

---

# 📌 What is a String?

A **String** is a sequence of characters used to store text.

Examples:

```java
"Hello"
"Java"
"Programming"
"100 Days Challenge"
```

Unlike primitive data types, **String is a class in Java**.

---

# 📌 Why Do We Use Strings?

Strings are used to store:

- Names
- Addresses
- Emails
- Passwords
- Sentences
- Messages

Example

```java
String name = "Supriya";
String college = "XYZ Engineering College";
```

---

# 📌 Ways to Create a String

### 1. Using String Literal

```java
String name = "Java";
```

---

### 2. Using new Keyword

```java
String name = new String("Java");
```

---

# 📌 Taking String Input

### Single Word

```java
Scanner sc = new Scanner(System.in);

String name = sc.next();
```

Example

Input

```
Java Programming
```

Output

```
Java
```

`next()` reads only the first word.

---

### Complete Sentence

```java
Scanner sc = new Scanner(System.in);

String sentence = sc.nextLine();
```

Input

```
I Love Java Programming
```

Output

```
I Love Java Programming
```

`nextLine()` reads the entire line.

---

# 📌 String Length

The `length()` method returns the total number of characters.

Example

```java
String str = "Programming";

System.out.println(str.length());
```

Output

```
11
```

---

# 📌 Access Characters

Use `charAt(index)`.

Example

```java
String str = "Java";

System.out.println(str.charAt(0));
System.out.println(str.charAt(2));
```

Output

```
J
v
```

---

# 📌 Convert to Uppercase

```java
String str = "java";

System.out.println(str.toUpperCase());
```

Output

```
JAVA
```

---

# 📌 Convert to Lowercase

```java
String str = "JAVA";

System.out.println(str.toLowerCase());
```

Output

```
java
```

---

# 📌 Compare Strings

Always use `.equals()` instead of `==`.

Correct

```java
String s1 = "Java";
String s2 = "Java";

System.out.println(s1.equals(s2));
```

Output

```
true
```

---

Incorrect

```java
System.out.println(s1 == s2);
```

`==` compares memory references, not the actual text.

---

# 📌 equalsIgnoreCase()

Ignores uppercase and lowercase differences.

```java
String s1 = "JAVA";
String s2 = "java";

System.out.println(s1.equalsIgnoreCase(s2));
```

Output

```
true
```

---

# 📌 Reverse a String

```java
String reverse = "";

for(int i = str.length()-1; i>=0; i--){

    reverse += str.charAt(i);

}
```

Example

Input

```
Java
```

Output

```
avaJ
```

---

# 📌 Palindrome String

A palindrome reads the same forward and backward.

Examples

```
madam
level
racecar
```

Logic

- Reverse the string.
- Compare the original and reversed strings.

```java
if(str.equalsIgnoreCase(reverse))
```

---

# 📌 Count Vowels and Consonants

Vowels

```
a
e
i
o
u
```

Logic

```java
char ch = str.charAt(i);

if(Character.isLetter(ch)){

    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')

        vowels++;

    else

        consonants++;

}
```

---

# 📌 Count Words

Split the sentence using spaces.

```java
String[] words = str.trim().split("\\s+");

System.out.println(words.length);
```

Example

Input

```
I Love Java
```

Output

```
3
```

---

# 📌 Character Frequency

Example

Input

```
banana
```

Output

```
b = 1

a = 3

n = 2
```

Logic

Compare every character with the remaining characters and count occurrences.

---

# 📌 Remove Spaces

```java
String result = str.replace(" ", "");
```

Example

Input

```
I Love Java
```

Output

```
ILoveJava
```

---

# 📌 Common String Methods

| Method | Description |
|----------|-------------|
| length() | Returns string length |
| charAt() | Returns character at index |
| toUpperCase() | Converts to uppercase |
| toLowerCase() | Converts to lowercase |
| equals() | Compares two strings |
| equalsIgnoreCase() | Compares ignoring case |
| replace() | Replaces characters |
| split() | Splits a string |
| trim() | Removes leading and trailing spaces |
| contains() | Checks if substring exists |
| substring() | Extracts part of a string |

---

# 📌 Programs Practiced Today

✅ String Input and Output

✅ String Length

✅ Uppercase and Lowercase Conversion

✅ Reverse a String

✅ Palindrome String

✅ Count Vowels and Consonants

✅ Count Words

✅ Character Frequency

✅ Remove Spaces

✅ Compare Two Strings

---

# 📌 Time Complexity

| Operation | Complexity |
|-----------|------------|
| length() | O(1) |
| charAt() | O(1) |
| Reverse String | O(n) |
| Palindrome Check | O(n) |
| Count Vowels | O(n) |
| Count Words | O(n) |
| Character Frequency | O(n²) |
| Remove Spaces | O(n) |

---

# 💡 Key Takeaways

- String is a class in Java.
- Use `nextLine()` to read complete sentences.
- Use `charAt()` to access characters.
- Use `length()` to find the number of characters.
- Always use `.equals()` to compare strings.
- `equalsIgnoreCase()` ignores letter case.
- Use `replace()` to remove spaces.
- `split()` helps count words.
- Strings are immutable (their contents cannot be changed; operations create a new string).

---

# 📝 Summary

- Learned how to create and use strings.
- Practiced important String methods.
- Reversed strings using loops.
- Checked palindrome strings.
- Counted vowels, consonants, and words.
- Found character frequencies.
- Compared strings correctly using `.equals()`.

---

# 🚀 Progress

✔ **Day 10 Completed**

📂 Programs Added: **10**

📝 Notes Added: **Strings in Java**

🎯 **Next Topic:** Two-Dimensional Arrays (Matrices)