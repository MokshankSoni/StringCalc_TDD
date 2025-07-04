#  📐  String Calculator - TDD Kata (Java)

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
-  Ignores numbers greater than `1000` (`"2,1001" → 2`)
-  Supports **custom delimiters of any length** (e.g., `"//[***]\n1***2***3" → 6`)
-  Supports **multiple delimiters** (e.g., `"//[*][%]\n1*2%3" → 6`)
-  Supports **multiple delimiters with length > 1** (e.g., `"//[**][%%]\n1**2%%3" → 6`)

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

## 🚀 How to Run

### 📦 Prerequisites

- Java 21+
- IntelliJ IDEA / VS code
- JUnit 5 

### 🛠️ Setup and Run Tests

```bash
# Clone the repo
git clone https://github.com/yourusername/string-calculator-tdd-java.git

cd string-calculator-tdd-java
```
