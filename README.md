# 🧮 Greatest of Three Numbers – Java Program

This Java program determines the greatest number among three integers entered by the user. It demonstrates the use of conditional statements and the `Scanner` class for input handling in a simple and beginner-friendly way.

---

## 📄 Program Overview

```java
import java.util.Scanner;

public class GreatestOfThreeNums
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int a = s.nextInt();

		System.out.println("Enter the 2nd Number");
		int b = s.nextInt();

		System.out.println("Enter the 3rd Number");
		int c = s.nextInt();

		if(a > b && a > c)
			System.out.println("Greatest is " + a);
		else if(b > a && b > c)
			System.out.println("Greatest is " + b);
		else
			System.out.println("Greatest is " + c);
	}
}
```

---

## 🔎 How It Works

1. **Import Statement**:
   - `import java.util.Scanner;` allows the program to use the Scanner class for input.

2. **Scanner Object**:
   - `Scanner s = new Scanner(System.in);` initializes the scanner to read input from the user.

3. **Taking Inputs**:
   - The program prompts the user to enter three integers one by one.
   - These inputs are stored in `int` variables: `a`, `b`, and `c`.

4. **Conditional Logic**:
   - The program compares the values using `if-else if-else` statements.
   - It checks which among the three numbers is the greatest and displays it.

---

## ✅ Sample Output

```
Enter the 1st Number
45
Enter the 2nd Number
78
Enter the 3rd Number
32
Greatest is 78
```

---

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Greatest_Of_Three_Nums.git
```
