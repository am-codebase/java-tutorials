# Java String vs StringBuilder — Explained for Beginners

Learn how `String` and `StringBuilder` behave in Java through small, runnable examples and real-world scenarios. This tutorial accompanies the **AM Codebase** video.

## 🎥 Video tutorial

**Coming soon.** Once the video is published, replace this line with its direct YouTube URL.

[Visit AM Codebase on YouTube](https://www.youtube.com/@am_codebase)

## What you'll learn

- What a Java `String` is and why it is **immutable**
- Why `concat()` does not change the original String
- Why reassignment makes a difference
- How `StringBuilder` changes its contents with `append()`
- How `insert()`, `replace()`, `delete()`, and `reverse()` work
- When repeated concatenation in a loop can benefit from `StringBuilder`
- How to build a shopping list and a simple receipt

## Source code by video scene

Each `.java` file has its own `main` method, so you can run examples independently.

| Topic | Java file |
|---|---|
| Your first String | [`StringBasicsDemo.java`](src/StringBasicsDemo.java) |
| Immutability, `concat()`, and reassignment | [`StringImmutabilityDemo.java`](src/StringImmutabilityDemo.java) |
| First `StringBuilder` and `append()` | [`StringBuilderBasicsDemo.java`](src/StringBuilderBasicsDemo.java) |
| Same task, different behavior | [`StringVsStringBuilderDemo.java`](src/StringVsStringBuilderDemo.java) |
| Shopping list | [`ShoppingListDemo.java`](src/ShoppingListDemo.java) |
| `append`, `insert`, `replace`, `delete`, `reverse` | [`StringBuilderMethodsDemo.java`](src/StringBuilderMethodsDemo.java) |
| Building text in loops | [`LoopComparisonDemo.java`](src/LoopComparisonDemo.java) |
| Real-world shop receipt | [`ReceiptDemo.java`](src/ReceiptDemo.java) |

## How to run

**Requirements:** A Java JDK (Java 17 or later recommended). No external dependencies or build tool required.

Open a terminal inside this tutorial folder and run:

```bash
javac src/StringVsStringBuilderDemo.java
java -cp src StringVsStringBuilderDemo
```

To run another example, replace the class name in both commands. For example:

```bash
javac src/ReceiptDemo.java
java -cp src ReceiptDemo
```

Alternatively, open the `src` folder in IntelliJ IDEA and run any class's `main` method.

## Expected output

### String basics
```text
Hello
```

### String immutability
```text
Without reassignment: Hello
With reassignment: Hello World
```

### StringBuilder basics
```text
Before: Hello
After: Hello World
```

### String vs StringBuilder
```text
String: Hello
StringBuilder: Hello World
```

### Shopping list
```text
1. Milk
2. Bread
3. Eggs
```

### StringBuilder methods
```text
Append: Hello Java
Insert: Hello Amazing Java
Replace: Hello Cool Java
Delete: Hello Java
Reverse: avaJ olleH
```

### Loop comparison
```text
String: 12345
StringBuilder: 12345
```

### Receipt
```text
MY SHOP
--------------------
Milk: $3.50
Bread: $2.25
Eggs: $4.00
--------------------
Total: $9.75
```

## Key differences

| `String` | `StringBuilder` |
|---|---|
| Immutable: the object's contents cannot be changed | Mutable: its contents can be changed |
| `concat()` returns a String result | `append()` updates the builder |
| Good for ordinary text and simple concatenation | Useful when repeatedly building or modifying text |

**Remember:** `StringBuilder` is often more efficient for repeated concatenation in loops, but it is not automatically the best choice for every operation.

> **Money example:** `ReceiptDemo` uses `double` for beginner-friendly demonstration. Real payment software should use `BigDecimal` or integer cents. The demo uses `Locale.US` to consistently display decimal points in the sample output.

## Practice

1. Change `"Hello"` to your name in the immutability example.
2. Add a fourth item to the shopping list.
3. Change the loop to count to 10.
4. Add another product to the receipt and check the total.

## Links

- [AM Codebase on YouTube](https://www.youtube.com/@am_codebase)
- [AM Codebase on GitHub](https://github.com/am-codebase)

---

**AM Codebase — Learn. Code. Build.**
