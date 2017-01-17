# leetcode

Code for leetcode problems.

This project uses gradle and testNG to run and test the code.

The solutions are described in `src/main/java/cn/hjmao/leetcode/`,
 and the test cases are put in `src/test/java/cn/hjmao/leetcode/`.

You can execute all the test cases with `gradle test`.
If you have more test cases, you can append the test cases in the test unit files.

When working on a new problem from the leetcode.
 1. add a new package under `src/main/java/cn/hjmao/leetcode/` with a name of the problem
 2. new a `Solution` class under the created package or you may copy the `Solution` class from `blank/Solution.java`
 3. add the problem url and the problem description would be better
 4. copy the solution method from leetcode page
 5. new a unit test file for the class and put the test cases from leetcode page
 6. implement the solution method
 7. run it with `gradle test` or right click the `test` directory in the IDE to run the test cases.
