# Uncommon Java Bug: Unexpected Loop Termination

This repository demonstrates a subtle bug in Java related to the interaction between a `while` loop, exception handling (`try-catch`), and a `finally` block.  The problem arises from incrementing the loop counter variable (`x`) within the `finally` block, potentially leading to unexpected loop termination.

## The Bug
The provided `UncommonBug.java` file contains code that attempts to iterate through a loop, perform division, and handle potential division-by-zero errors. However, the placement of the loop counter increment within the `finally` block creates a situation where the loop might not behave as expected. 

## The Solution
The `UncommonBugSolution.java` file shows how to resolve this issue by moving the increment operation to a safer location within the loop construct, ensuring expected loop termination and avoiding unexpected behavior.