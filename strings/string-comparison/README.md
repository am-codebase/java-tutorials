
# Java == vs .equals() — Explained for Beginners

Learn the difference between comparing object references and comparing String contents in Java.

## What You'll Learn

- How Java String objects work
- What the `==` operator compares
- What the `.equals()` method compares
- Why two Strings can contain identical text but be different objects

## Example

```java
String a = new String("Java");
String b = new String("Java");

System.out.println(a == b);      // false
System.out.println(a.equals(b)); // true
```

## Expected Output

```text
false
true
```

## Video Tutorial

🎥 Coming soon!

[Visit AM Codebase on YouTube](https://www.youtube.com/@am_codebase)

## Source Code

The complete runnable example is available in:

`src/StringComparisonDemo.java`

## How to Run

1. Install Java JDK 17 or later.
2. Download or clone this repository.
3. Open a terminal in this tutorial's folder.
4. Compile and run:

```bash
javac src/StringComparisonDemo.java
java -cp src StringComparisonDemo
```

## Key Takeaway

- `==` checks whether two object references refer to the same object.
- For Strings, `.equals()` compares their contents.

Use `.equals()` when you want to compare the actual text of two Strings.
