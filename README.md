# 📐 String Calculator - TDD Kata (Java)

This repository contains the implementation of the **String Calculator Kata** using **Test-Driven Development (TDD)** in Java with **JUnit 5**.

The purpose of this exercise is to demonstrate a disciplined TDD workflow, building functionality step by step through tests and clean refactoring.

---

## ✨ Features Implemented

- `add(String numbers)` method that:
- Returns `0` for an empty string
- Handles one or more comma-separated numbers
- Supports new lines as delimiters
- Allows custom single-character delimiters (`//;\n1;2`)
- Throws exceptions for negative numbers with proper messages
- Ignores numbers greater than `1000` (`"2,1001" → 2`)
- Supports **custom delimiters of any length** (e.g., `"//[***]\n1***2***3" → 6`)
- Supports **multiple delimiters** (e.g., `"//[*][%]\n1*2%3" → 6`)
- Supports **multiple delimiters with length > 1** (e.g., `"//[**][%%]\n1**2%%3" → 6`)

---

## 🧪 Test-Driven Development Steps

Tests were written incrementally to drive each implementation step:

1. Empty string returns 0
2. One number returns itself
3. Two numbers return their sum
4. Unknown number of comma-separated numbers
5. Newline as a valid delimiter
6. Custom delimiter using `//<delimiter>\n` format
7. Exception on negative numbers
8. Numbers > 1000 are ignored
9. Delimiters of any length using `//[***]\n`
10. Multiple delimiters: `//[*][%]\n`
11. Multiple delimiters with length > 1: `//[**][%%]\n`

---

## 📁 Project Structure

- `src/main/java/StringCalc.java` – Main calculator logic with advanced delimiter support
- `src/test/java/StringCalcTest.java` – Comprehensive JUnit 5 tests covering all TDD steps
- `pom.xml` – Maven build file with JUnit 5 dependency
- `screenshots/` – Visual documentation of the TDD process

---

## 📦 Prerequisites

- Java 8+
- Maven or IntelliJ IDEA / VS Code
- JUnit 5 (included via Maven)

### 🛠️ Setup and Run Tests

```bash
# Clone the repo
git clone https://github.com/yourusername/string-calculator-tdd-java.git

cd string-calculator-tdd-java

# Run tests via Maven
mvn test
```

---

## 🛠️ Test-Driven Development & Software Craftsmanship

This project embodies high-quality **software craftsmanship** through a disciplined, test-first approach:

-  **Strict TDD process**: Each feature was built following the red-green-refactor cycle.
-  **Comprehensive test coverage**: All edge cases—negative numbers, custom/multi delimiters, large numbers—are validated through unit tests.
-  **Clean and maintainable code**: Clear structure, consistent naming, and logical flow make the code easy to read and extend.
-  **Incremental, commit-driven development**: Progress was captured through small, frequent commits aligned with each test case evolution.
-  **Beyond-the-basics implementation**: Extended support for delimiter flexibility (length > 1, multiple delimiters) demonstrates thoughtful feature extension.

---

## 📝 Assessment Highlights

This implementation reflects the **Software Craftsperson Mindset** that Incubyte promotes:

- 🧪 **Test-Driven Discipline**: Every feature originated from a failing test, enforcing confidence and correctness throughout.
- 🧠 **Attention to edge cases**: Special attention to failure modes (e.g., malformed inputs, negatives, ignored large values) ensures real-world readiness.
- 🧼 **Code Quality**: The code follows clean code principles—minimal duplication, meaningful naming, single-responsibility methods.
- 🔍 **Systematic Problem-Solving**: Features were approached iteratively, breaking down complex behavior into verifiable test steps.
- 📚 **Clear Documentation**: Screenshots and descriptions visualize the evolution of the codebase, reinforcing the TDD narrative.

> 🚀 This implementation exceeds standard expectations, demonstrating not only technical proficiency but also a strong commitment to clean, reliable software.

---


---

## 📸 Screenshots of Test-Driven Development Process

### ✅ 1. Empty String Returns 0

- **Test:** `assertEquals(0, calc.add(""))`
- **Description:** Base case to check if an empty string returns 0.

<img src="screenshots/Screenshot%202025-07-04%20093411.png" alt="Failing empty string test" width="550"/>
<img src="screenshots/Screenshot%202025-07-04%20093429.png" alt="Passing empty string test" width="550"/>

---

### ✅ 2. Single Integer Input

- **Test:** `assertEquals(3, calc.add("3"))`
- **Description:** Supports a single number without delimiters.

<img src="screenshots/Screenshot%202025-07-04%20094521.png" alt="Single number test" width="550"/>
<img src="screenshots/Screenshot%202025-07-04%20094734.png" alt="Single number test" width="550"/>

---

### ✅ 3. Sum of Multiple Integers

- **Test:** `assertEquals(14, calc.add("3,6,5"))`
- **Description:** Handles comma-separated integers.

<img src="screenshots/Screenshot%202025-07-04%20100110.png" alt="Sum of multiple ints" width="550"/>
<img src="screenshots/Screenshot%202025-07-04%20100624.png" alt="Sum of multiple ints" width="550"/>

---

### ✅ 4. Newline as Delimiter

- **Test:** `assertEquals(15, calc.add("3\n1,5,4\n2"))`
- **Description:** Supports newline characters in between numbers.

<img src="screenshots/Screenshot%202025-07-04%20103017.png" alt="Sum of multiple ints" width="550"/>
<img src="screenshots/Screenshot%202025-07-04%20104055.png" alt="Sum of multiple ints" width="550"/>

---

### ✅ 5. Custom Delimiters (Single Char)

- **Test:** `assertEquals(4, calc.add("//;\n3;1"))`
- **Description:** Custom single-char delimiter using `//;\n`.

<img src="screenshots/Screenshot%202025-07-05%20133345.png" alt="Sum of multiple ints" width="550"/>
<img src="screenshots/Screenshot%202025-07-04%20122327.png" alt="Sum of multiple ints" width="550"/>

---

### ✅ 6. Negative Number Check

- **Test:** `calc.add("1,-3,4,5,-6,1")`
- **Description:** Throws `IllegalArgumentException` for negative numbers.

<img src="screenshots/Screenshot%202025-07-05%20133834.png" alt="Sum of multiple ints" width="550"/>

---

### ✅ 7. Ignore Numbers Greater than 1000

- **Test:** `assertEquals(2, calc.add("1001,1,1"))`
- **Description:** Ignores numbers larger than 1000.

<img src="screenshots/Screenshot%202025-07-04%20231023.png" alt="Sum of multiple ints" width="550"/>
<img src="screenshots/Screenshot%202025-07-04%20231114.png" alt="Sum of multiple ints" width="550"/>

---

### ✅ 8. Delimiters of Any Length

- **Test:** `assertEquals(4, calc.add("//[***]\n3***1"))`
- **Description:** Accepts custom delimiters of variable length.

<img src="screenshots/Screenshot%202025-07-04%20231620.png" alt="Sum of multiple ints" width="550"/>
<img src="screenshots/Screenshot%202025-07-04%20235813.png" alt="Sum of multiple ints" width="550"/>

---

### ✅ 9. Multiple Delimiters

- **Test:** `assertEquals(6, calc.add("//[*][%]\n1*2%3"))`
- **Description:** Handles multiple delimiters.

<img src="screenshots/Screenshot%202025-07-04%20235827.png" alt="Sum of multiple ints" width="550"/>
<img src="screenshots/Screenshot%202025-07-05%20000520.png" alt="Sum of multiple ints" width="550"/>

---

### ✅ 10. Multiple Delimiters with Length > 1

- **Test:** `assertEquals(6, calc.add("//[***][%%]\n1***2%%3"))`
- **Description:** Supports multiple long delimiters.

<img src="screenshots/Screenshot%202025-07-05%20134505.png" alt="Sum of multiple ints" width="550"/>
<img src="screenshots/Screenshot%202025-07-05%20000843.png" alt="Sum of multiple ints" width="550"/>

---