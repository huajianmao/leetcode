# Leetcode
Code snippets and **Test cases** for Leetcode problems.
Only **Easy** Problems are solved.

[![Build Status](https://travis-ci.org/huajianmao/leetcode.svg?branch=master)](https://travis-ci.org/huajianmao/leetcode)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/095e4b25c3164e558dd15614dfec5f4f)](https://www.codacy.com/app/huajianmao/leetcode?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=huajianmao/leetcode&amp;utm_campaign=Badge_Grade)

## Introduction
This project hosts the snippet code and test cases for Leetcode problems.
You may find my solution code in [branch `hjmao`](https://github.com/huajianmao/leetcode/tree/hjmao).

### Environment
This project is coded and tested with [Java 8](https://docs.oracle.com/javase/8/docs/api/) and [Gradle 5.4.1](https://docs.gradle.org/5.4.1/userguide/userguide.html).

The test cases are based on the [TestNG](https://testng.org/doc/) framework ([6.14.3](https://www.javadoc.io/doc/org.testng/testng/6.14.3)).

The Google Java code style is used in this project.

### Code Layout

 - `src/main/java/com/leetcode/snippets` holds the original blank code snippets from `leetcode.com` and you may start solving the problems from here.

 - `src/main/java/cn/hjmao` holds the utilities for this project.

 - `src/test/java/com/leetcode/snippets` holds the test cases.
  All the test cases are disabled by the `SOLUTION_DONE` static variable in the solution file.
  So when you finish the problem, please set it to `true` in the solution file to enable the test cases.
  You can execute all the test cases with `gradle test`.
  If you have more test cases, you can append the test cases in the test unit files.

<details><summary>Source Code Layout</summary>
<p>

``` shell
src
├── main
│   └── java
│       ├── cn
│       │   └── hjmao
│       │       ├── ProblemFetcher.java
│       │       └── utils
│       │           ├── AssertUtils.java
│       │           ├── list
│       │           │   ├── ListNode.java
│       │           │   └── ListNodeUtils.java
│       │           └── tree
│       │               ├── TreeNode.java
│       │               └── TreeNodeUtils.java
│       └── com
│           └── leetcode
│               └── snippets
│                   ├── a001twosum
│                   │   └── Solution.java
│                   ├── a002addtwonumbers
│                   │   └── Solution.java
│                   ├── ...
│                   │   └── Solution.java
│                   └── ...
│                       └── Solution.java
└── test
    ├── java
    │   ├── cn
    │   │   └── hjmao
    │   │       ├── ProblemFetcherTest.java
    │   │       └── utils
    │   │           ├── AssertUtilsTest.java
    │   │           ├── list
    │   │           │   └── ListNodeUtilsTest.java
    │   │           ├── quadtree
    │   │           │   └── NodeTest.java
    │   │           └── tree
    │   │               └── TreeNodeUtilsTest.java
    │   └── com
    │       └── leetcode
    │           └── snippets
    │               ├── a001twosum
    │               ├── ...
    │               │   └── SolutionTest.java
    │               └── a999availablecapturesforrook
    │                   └── SolutionTest.java
    └── resources
        └── log4j2.properties
```

</p>
</details>

## How to use this repo
 1. Install [Gradle 5.4.1](https://downloads.gradle.org/distributions/gradle-5.4.1-bin.zip)

 2. Clone this project
    ``` shell
    git clone https://github.com/huajianmao/leetcode
    ```
    
 3. Install the dependencies.
    ``` shell
    gradle check
    ```

 4. Choose a problem, and focus on problem solving!!!
 
 5. Set the `protected static final boolean SOLUTION_DONE = false;` to ***`true`***!!!!!

 6. Open and append your test cases to the test file!
 
 7. Debug with the test cases in `src/test/java/com/leetcode/snippets/a00xxxxx/SolutionTest.java`.
 
 8. Copy the code and submit it to Leetcode.

Note: If you don't like the code style checking, you may comment out two configurations in build.gradle:
```
->  // id 'checkstyle'
...
...
->  // checkstyle {
->  //   toolVersion = '6.19'
->  //   configDir = file("$rootProject.projectDir/config/checkstyle")
->  //}
```

### `ProblemFetcher` script
If a new problem is provided in `leetcode.com`, you might use `ProblemFetcher` to automatically get the problem descriptions and the `Solution` file will be generated in `com.leetcode.snippets`,
and you can copy it to your code place package.
But in this case, you have to write the test cases by yourself.

**Notice: You might need to revise the snippet slightly to make it return in the correct type.**

## Contribution
It would be my honor if you like this repo.
You are very welcome to submit PRs on solutions, test cases.
There would probably have lots of issues in this project, if you find some one, please throw a issue to me.
Please help improving this repo better. Thanks!
