## 1. Boolean Type and Operators

At the core of decision-making in Java is the **boolean data type**.  
This type can take only two possible values:
- **true** → True
- **false** → False

These values are especially used in **conditional statements (if, while, for)**.  
Programs follow different paths depending on whether a given condition is **true** or **false**.

---

### 🔹 1. What is the Boolean Type?

**boolean** is Java's logical data type.  
The result of a comparison, a logical test, or the truth value of a condition is expressed as the `boolean` type.

**Example Questions:**
- “Is a number positive?”
- “Did the user log in?”
- “Is the age greater than 18?”

The answers to such questions are always **yes/no**, i.e. **true/false**.

**Declaration Examples:**

-  boolean durum = true;
-  boolean aktifMi = false;
---

### 🔹 2. Comparison (Relational) Operators

Comparison operators compare two values and return the result as a **boolean**.  
That means the result of any comparison is either **true** or **false**.

| Operator | Meaning | Example | Result |
|-----------|---------|--------|--------|
| `==` | Equal to | `5 == 5` | true |
| `!=` | Not equal | `5 != 3` | true |
| `>` | Greater than | `8 > 4` | true |
| `<` | Less than | `2 < 7` | true |
| `>=` | Greater than or equal to | `10 >= 10` | true |
| `<=` | Less than or equal to | `5 <= 3` | false |

**Example:**

```java
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.println(x > y); // true
        System.out.println(x == y); // false
        System.out.println(x != y); // true
    }
}
```

---


## 3. Logical Operators

In Java, **logical operators** combine multiple boolean expressions to produce a **true** or **false** result.  
These operators are commonly used in conditional statements such as `if`, `while`, and `for`.

---

### 🔹 1. Logical Operators Table

| Operator | Meaning | Description | Example |
|-----------|--------|-----------|--------|
| `&&` | **AND** | The result is `true` if all conditions are `true`. | `(5 > 2 && 8 > 4)` |
| `||` | **OR** | The result is `true` if at least one of the conditions is `true`. | `(5 < 2 || 8 > 4)` |
| `!` | **NOT** | Reverses the result (`true → false`, `false → true`). | `!(5 > 2)` |
| `^` | **XOR (exclusive OR)** | `true` if the expressions differ, `false` if they are the same. | `(true ^ false)` |

---

### 🔹 Additional Notes (short additions that help understanding)

#### Short-circuit evaluation (`&&` and `||`)
Both `&&` and `||` perform short-circuit evaluation:
- For `&&`: if the left operand is `false`, the right operand is not evaluated because the whole expression cannot become `true`.
- For `||`: if the left operand is `true`, the right operand is not evaluated because the whole expression is already `true`.

This matters when the right operand has side effects (method calls, increments) or is expensive to compute.

Example:

```java
public class ShortCircuitExample {
    public static void main(String[] args) {
        int i = 0;
        boolean result = (i > 0) && (i++ > 0); // i++ is not executed because i > 0 is false
        System.out.println(i); // 0

        result = (i == 0) || (i++ > 0); // i++ is not executed because i == 0 is true
        System.out.println(i); // 0
    }
}
```

#### XOR truth table
XOR (`^`) is `true` only when exactly one operand is `true`:
- true ^ true = false
- true ^ false = true
- false ^ true = true
- false ^ false = false

#### String equality
Do not use `==` to compare `String` contents; `==` checks reference equality. Use `equals()` or `equalsIgnoreCase()` for content equality.

Example:
```java
public class StringEqualityExample {
    public static void main(String[] args) {
        String a = new String("hello");
        String b = new String("hello");
        System.out.println(a == b); // usually false
        System.out.println(a.equals(b)); // true
    }
}
```

#### Boolean wrapper and nulls
`Boolean` (capital B) can be `null`; primitive `boolean` cannot. Be careful when unboxing `Boolean` values as they may cause `NullPointerException`.

```java
public class BooleanWrapperExample {
    public static void main(String[] args) {
        Boolean flag = null;
        // boolean safe = flag; // throws NullPointerException at runtime when unboxed
        System.out.println("flag is null: " + (flag == null));
    }
}
```

#### Operator precedence (short)
Some operators bind tighter than others. A few important points:
- Comparison operators (`>`, `<`, `==`, etc.) have lower precedence than arithmetic operators (`+`, `-`, `*`, `/`).
- Logical NOT (`!`) has higher precedence than `&&` and `||`.
- Use parentheses to make intent clear: `(a > b) && (c < d)`.

---

### 🔹 2. How Logical Operators Work

#### `&&` (AND)
The result is `true` only if both conditions are **true**.

```java
public class Main {
    public static void main(String[] args) {
        int aInt = 10, bInt = 5;
        System.out.println(aInt > 0 && bInt < 10); // true
        System.out.println(aInt > 0 && bInt > 10); // false

        int x = 8, y = 20;
        System.out.println(x > 10 || y == 20); // true
        System.out.println(x > 10 || y < 10);  // false

        boolean aktif = true;
        System.out.println(!aktif); // false

        boolean aBool = true;
        boolean bBool = false;
        System.out.println(aBool ^ bBool); // true
        System.out.println(aBool ^ aBool); // false
    }
}
```
## 4. One-way if Statements (Tek Yönlü if Yapısı)

In programming, we sometimes check whether a condition is **true** and want to run some code only when it is true. This is called a one-way `if` statement.

---

### 🔹 Syntax

```text
if (boolean_condition) {
    // code that runs only when the condition is true
}
```

If `boolean_condition` is `true`, the block inside the braces executes. If it is `false`, Java skips the block and continues.

Example:

```text
public class IfExample {
    public static void main(String[] args) {
        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive.");
        }
    }
}
```

```text
Output: Number is positive.
```

Because the condition `number > 0` is `true`, the code inside the block runs. If `number` were negative, nothing would be printed.

---

Example 2 — Using in a calculation

A common use of a one-way `if` is to perform a calculation only when input is valid. For example, calculate the area of a circle only if the radius is non-negative.

```java
public class AreaExample {
    public static void main(String[] args) {
        int radius = 5;
        double area;

        if (radius >= 0) {
            area = radius * radius * 3.14159;
            System.out.println("Circle area: " + area);
        }
    }
}
```

If the condition `radius >= 0` is true, the area is computed and printed. If a negative radius were provided, the `if` block would be skipped and nothing would be printed.

---
## 5. The Two-way if Statement (If-else)

Sometimes we want to perform a different action not only when a condition is **true** but also when it is **false**. In such cases we use the **if-else** structure.

---

### 🔹 1. Structure (Syntax)

```java
// General form
// if (boolean_condition) {
//     // code that runs when the condition is true
// } else {
//     // code that runs when the condition is false
// }
```

If the condition is `true` the `if` block runs; otherwise the `else` block runs.

---

### 🔹 Example 1 — Simple usage

The following example checks whether a number is positive and prints an appropriate message.

```java
public class IfElseExample1 {
    public static void main(String[] args) {
        int number = -3;

        if (number > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is negative or zero.");
        }
    }
}
```

```text
Output: Number is negative or zero.
```

---

### 🔹 Example 2 — Usage with calculation

Below is an example that prints an error message for a negative radius and computes the area if the radius is non-negative.

```java
public class IfElseExample2 {
    public static void main(String[] args) {
        int radius = -5;
        double area;

        if (radius >= 0) {
            area = radius * radius * 3.14159;
            System.out.println("Area: " + area);
        } else {
            System.out.println("Invalid radius: negative value!");
        }
    }
}
```

---

### 🔹 Example 3 — Practical usage (Age check)

Practical example: checks if age is 18 or older and reports whether the person is of legal age.

```java
public class IfElseExample3 {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("You are of legal age.");
        } else {
            System.out.println("You are not of legal age yet.");
        }
    }
}
```

---
## 6. Multiple Alternative if Statements (if - else if - else)

Sometimes two options are not enough. If we want to check multiple conditions, we use the **if - else if - else** structure.

This structure allows the program to perform different actions depending on which condition is true.

---

### 🔹 1. Structure (Syntax)

```java
public class main{
    public static void main(String[] args) {
        if (condition1) {
            // code block for condition1
        } else if (condition2) {
            // code block for condition2
        } else if (condition3) {
            // code block for condition3
        } else {
            // code block if none of the above conditions are true
        }
    }
}
```

Note: the program executes the first matching block and skips the remaining checks.

---

Example 1 — Grading system

```java
public class GradeExample {
    public static void main(String[] args) {
        int grade = 85;

        if (grade >= 90) {
            System.out.println("Your grade: A");
        } else if (grade >= 80) {
            System.out.println("Your grade: B");
        } else if (grade >= 70) {
            System.out.println("Your grade: C");
        } else if (grade >= 60) {
            System.out.println("Your grade: D");
        } else {
            System.out.println("Your grade: F");
        }
    }
}
```

```text
Output: Your grade: B
```

Conditions are checked in order:

`grade >= 90` → false

`grade >= 80` → true

Therefore only this block runs and the rest are skipped.
---
## 7. Multi-Way if-else Statements

Sometimes a program needs to perform different actions depending on several different conditions. For that we use a multi-way `if - else if - else` structure. This is the general form of multiple alternative decision branches.

---

### 🔹 1. Structure (Syntax)

```java
public class main{
    public static void main(String[] args) {
        if (condition1) {
            // code block for condition1
        } else if (condition2) {
            // code block for condition2
        } else if (condition3) {
            // code block for condition3
        } else {
            // code block if none of the above conditions are true
        }
    }
}
```

The program checks conditions in order and executes the block for the first matching condition. Once a condition is satisfied, the remaining checks are skipped.

---

### 🔹 Example — Grade evaluation

Below is an example that maps a numeric score to a letter grade. The program checks the conditions top-to-bottom and prints the first matching grade.

```java
public class main {
    public static void main(String[] args) {
        int score = 72;

        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
```

```text
Output: C
```

Explanation of the checks:

`score >= 90` → false

`score >= 80` → false

`score >= 70` → true

Therefore only this block runs and the remaining branches are skipped.

---

### 🔹 Characteristics of an else-if chain
- Order matters: conditions are evaluated from top to bottom.
- First matching condition executes: the rest are ignored.
- `else` is optional: it runs only if none of the previous conditions match.
- Keep the code readable: use consistent indentation and clear condition ordering.

---
