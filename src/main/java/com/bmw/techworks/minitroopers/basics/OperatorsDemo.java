package com.bmw.techworks.minitroopers.basics;

public class OperatorsDemo {

    public void demonstrateArithmeticOperators() {
        int a = 7;
        int b = 3;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        int x = 5;
        int preIncrement = ++x; // x becomes 6, preIncrement = 6
        int postIncrement = x++; // postIncrement = 6, x becomes 7
        int preDecrement = --x; // x becomes 6, preDecrement = 6
        int postDecrement = x--; // postDecrement = 6, x becomes 5

        System.out.println("Arithmetic operators:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b  = " + sum);
        System.out.println("a - b  = " + difference);
        System.out.println("a * b  = " + product);
        System.out.println("a / b  = " + quotient);
        System.out.println("a % b  = " + remainder);
        System.out.println();
        System.out.println("Increment / Decrement:");
        System.out.println("preIncrement = " + preIncrement);
        System.out.println("postIncrement = " + postIncrement);
        System.out.println("preDecrement = " + preDecrement);
        System.out.println("postDecrement = " + postDecrement);
        System.out.println("final x = " + x);
        System.out.println("----");
    }

    public void demonstrateComparisonOperators() {
        int a = 5;
        int b = 10;

        boolean equal = (a == b);
        boolean notEqual = (a != b);
        boolean greater = (a > b);
        boolean less = (a < b);
        boolean greaterOrEqual = (a >= b);
        boolean lessOrEqual = (a <= b);

        System.out.println("Comparison operators:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a == b  -> " + equal);
        System.out.println("a != b  -> " + notEqual);
        System.out.println("a > b   -> " + greater);
        System.out.println("a < b   -> " + less);
        System.out.println("a >= b  -> " + greaterOrEqual);
        System.out.println("a <= b  -> " + lessOrEqual);

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println();
        System.out.println("String comparison:");
        System.out.println("s1 == s2       -> " + (s1 == s2) + "   (compares references)");
        System.out.println("s1.equals(s2)  -> " + s1.equals(s2) + "   (compares values)");
        System.out.println("----");
    }

    public void demonstrateLogicalOperators() {
        boolean a = true;
        boolean b = false;

        boolean and = a && b;
        boolean or = a || b;
        boolean notA = !a;

        System.out.println("Logical operators:");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a && b  -> " + and);
        System.out.println("a || b  -> " + or);
        System.out.println("!a      -> " + notA);
        System.out.println();

        System.out.println("Short-circuit example:");
        int x = 0;
        boolean result = (x != 0) && (10 / x > 1); // second part is never evaluated
        System.out.println("(x != 0) && (10 / x > 1) with x = 0 -> " + result);
        System.out.println("No exception because of short-circuit evaluation.");
        System.out.println("----");
    }

    public void demonstrateBitwiseOperators() {
        int a = 0b0101; // 5
        int b = 0b0011; // 3

        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int notA = ~a;

        int leftShift = a << 1;
        int rightShift = a >> 1;
        int unsignedRightShift = a >>> 1;

        System.out.println("Bitwise operators:");
        System.out.println("a       = " + a + " (binary " + toBinary(a) + ")");
        System.out.println("b       = " + b + " (binary " + toBinary(b) + ")");
        System.out.println("a & b   = " + and + " (binary " + toBinary(and) + ")");
        System.out.println("a | b   = " + or + " (binary " + toBinary(or) + ")");
        System.out.println("a ^ b   = " + xor + " (binary " + toBinary(xor) + ")");
        System.out.println("~a      = " + notA + " (binary " + toBinary(notA) + ")");
        System.out.println();
        System.out.println("Shifts:");
        System.out.println("a << 1   = " + leftShift + " (binary " + toBinary(leftShift) + ")");
        System.out.println("a >> 1   = " + rightShift + " (binary " + toBinary(rightShift) + ")");
        System.out.println("a >>> 1  = " + unsignedRightShift + " (binary " + toBinary(unsignedRightShift) + ")");
        System.out.println("----");
    }

    public void demonstrateAssignmentOperators() {
        int a = 5;
        int b = 3;

        System.out.println("Assignment operators:");
        System.out.println("Start: a = " + a + ", b = " + b);

        a += b; // a = a + b
        System.out.println("a += b   -> a = " + a);

        a -= 2; // a = a - 2
        System.out.println("a -= 2   -> a = " + a);

        a *= 2; // a = a * 2
        System.out.println("a *= 2   -> a = " + a);

        a /= 3; // a = a / 3
        System.out.println("a /= 3   -> a = " + a);

        a %= 2; // a = a % 2
        System.out.println("a %= 2   -> a = " + a);

        int x = 0b0010; // 2
        System.out.println();
        System.out.println("Bitwise compound assignments:");
        System.out.println("Start: x = " + x + " (binary " + toBinary(x) + ")");

        x <<= 1; // x = x << 1
        System.out.println("x <<= 1  -> x = " + x + " (binary " + toBinary(x) + ")");

        x |= 0b0001; // x = x | 1
        System.out.println("x |= 1   -> x = " + x + " (binary " + toBinary(x) + ")");

        x &= 0b0011; // x = x & 3
        System.out.println("x &= 3   -> x = " + x + " (binary " + toBinary(x) + ")");

        x ^= 0b0001; // x = x ^ 1
        System.out.println("x ^= 1   -> x = " + x + " (binary " + toBinary(x) + ")");
        System.out.println("----");
    }

    public void demonstratePrecedenceExample() {
        int result1 = 4 + 5 * 2;      // 4 + (5 * 2) = 14
        int result2 = (4 + 5) * 2;    // (4 + 5) * 2 = 18

        boolean precedenceLogical = true || false && false;   // true || (false && false) = true
        boolean withParentheses = (true || false) && false;   // (true || false) && false = false

        System.out.println("Operator precedence examples:");
        System.out.println("4 + 5 * 2       = " + result1);
        System.out.println("(4 + 5) * 2     = " + result2);
        System.out.println("true || false && false        -> " + precedenceLogical);
        System.out.println("(true || false) && false      -> " + withParentheses);
        System.out.println("----");
    }

    // helper: show 32-bit binary representation
    private String toBinary(int value) {
        return String.format("%32s", Integer.toBinaryString(value))
                .replace(' ', '0');
    }
}
