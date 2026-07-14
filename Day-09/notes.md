# 📘 Day 09 - One-Dimensional Arrays in Java

## 🎯 Topics Covered

- What is an Array?
- Declaration of an Array
- Array Initialization
- Taking Input in an Array
- Printing Array Elements
- Traversing an Array
- Finding Sum and Average
- Finding Maximum and Minimum
- Linear Search
- Reversing an Array
- Copying an Array

---

# 📌 What is an Array?

An **array** is a collection of elements of the same data type stored in contiguous memory locations.

Instead of creating multiple variables, we can store all values in a single array.

### Example

Without Array

```java
int a = 10;
int b = 20;
int c = 30;
int d = 40;
```

With Array

```java
int[] numbers = {10, 20, 30, 40};
```

---

# 📌 Advantages of Arrays

- Stores multiple values using one variable.
- Easy to access elements using an index.
- Reduces code complexity.
- Faster data access.
- Useful for sorting and searching algorithms.

---

# 📌 Array Declaration

### Syntax

```java
dataType[] arrayName;
```

Example

```java
int[] arr;
```

---

# 📌 Array Creation

### Syntax

```java
arrayName = new dataType[size];
```

Example

```java
arr = new int[5];
```

or

```java
int[] arr = new int[5];
```

---

# 📌 Array Initialization

```java
int[] arr = {10,20,30,40,50};
```

---

# 📌 Taking Input

```java
Scanner sc = new Scanner(System.in);

int[] arr = new int[5];

for(int i = 0; i < arr.length; i++){

    arr[i] = sc.nextInt();

}
```

---

# 📌 Printing Array

```java
for(int i = 0; i < arr.length; i++){

    System.out.print(arr[i] + " ");

}
```

---

# 📌 Traversing an Array

Traversing means visiting every element of the array.

```java
for(int i = 0; i < arr.length; i++){

    System.out.println(arr[i]);

}
```

---

# 📌 Array Index

Array indexing starts from **0**.

Example

```text
Index :   0   1   2   3   4

Array :  10  20  30  40  50
```

Accessing Elements

```java
System.out.println(arr[0]); //10

System.out.println(arr[3]); //40
```

---

# 📌 Finding Sum of Array

```java
int sum = 0;

for(int i = 0; i < arr.length; i++){

    sum += arr[i];

}
```

---

# 📌 Finding Average

```java
double average = (double)sum / arr.length;
```

---

# 📌 Finding Largest Element

```java
int largest = arr[0];

for(int i = 1; i < arr.length; i++){

    if(arr[i] > largest)

        largest = arr[i];

}
```

---

# 📌 Finding Smallest Element

```java
int smallest = arr[0];

for(int i = 1; i < arr.length; i++){

    if(arr[i] < smallest)

        smallest = arr[i];

}
```

---

# 📌 Linear Search

Linear Search checks every element one by one until the required element is found.

```java
boolean found = false;

for(int i = 0; i < arr.length; i++){

    if(arr[i] == key){

        found = true;
        break;

    }

}
```

Time Complexity

```
O(n)
```

---

# 📌 Counting Even and Odd Elements

```java
int even = 0;
int odd = 0;

for(int num : arr){

    if(num % 2 == 0)

        even++;

    else

        odd++;

}
```

---

# 📌 Reverse an Array

```java
for(int i = arr.length - 1; i >= 0; i--){

    System.out.print(arr[i] + " ");

}
```

---

# 📌 Copy an Array

```java
int[] copy = new int[arr.length];

for(int i = 0; i < arr.length; i++){

    copy[i] = arr[i];

}
```

---

# 📌 Second Largest Element

```java
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;

for(int num : arr){

    if(num > largest){

        secondLargest = largest;
        largest = num;

    }
    else if(num > secondLargest && num != largest){

        secondLargest = num;

    }

}
```

---

# 📌 Enhanced for Loop (For-Each Loop)

Used to access every element directly.

Syntax

```java
for(int num : arr){

    System.out.println(num);

}
```

Example

```java
int[] arr = {10,20,30};

for(int num : arr){

    System.out.print(num + " ");

}
```

Output

```
10 20 30
```

---

# 📌 Programs Practiced Today

✅ Array Input and Output

✅ Sum of Array Elements

✅ Average of Array

✅ Largest Element

✅ Smallest Element

✅ Linear Search

✅ Count Even and Odd Numbers

✅ Reverse an Array

✅ Second Largest Element

✅ Copy One Array to Another

---

# 📌 Time Complexity

| Operation | Complexity |
|-----------|------------|
| Access by Index | O(1) |
| Traverse Array | O(n) |
| Linear Search | O(n) |
| Find Maximum | O(n) |
| Find Minimum | O(n) |
| Reverse Traversal | O(n) |
| Copy Array | O(n) |

---

# 💡 Key Takeaways

- Arrays store multiple values of the same data type.
- Array indexing starts from **0**.
- Use `arr.length` to get the size of the array.
- Traversing an array is done using loops.
- Linear Search checks elements one by one.
- Arrays are the foundation for DSA topics like sorting and searching.

---

# 📝 Summary

- Learned how to declare and initialize arrays.
- Practiced taking input and displaying array elements.
- Solved problems on sum, average, maximum, and minimum.
- Implemented Linear Search.
- Learned to reverse and copy arrays.
- Found the second largest element.
- Understood the importance of arrays in DSA.

---

# 🚀 Progress

✔ **Day 09 Completed**

📂 Programs Added: **10**

📝 Notes Added: **One-Dimensional Arrays**

🎯 **Next Topic:** Strings in Java