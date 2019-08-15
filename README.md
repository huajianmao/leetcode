# Leetcode
Code snippets and **Test cases** for Leetcode problems.

[![Build Status](https://travis-ci.org/huajianmao/leetjava.svg?branch=master)](https://travis-ci.org/huajianmao/leetjava)
[![Coverage Status](https://coveralls.io/repos/github/huajianmao/leetjava/badge.svg?branch=master)](https://coveralls.io/github/huajianmao/leetjava?branch=master)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=huajianmao_leetjava&metric=ncloc)](https://sonarcloud.io/dashboard?id=huajianmao_leetjava)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=huajianmao_leetjava&metric=bugs)](https://sonarcloud.io/dashboard?id=huajianmao_leetjava)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=huajianmao_leetjava&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=huajianmao_leetjava)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/095e4b25c3164e558dd15614dfec5f4f)](https://www.codacy.com/app/huajianmao/leetjava?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=huajianmao/leetjava&amp;utm_campaign=Badge_Grade)

## Introduction
This project hosts the code and test cases for Leetcode problems.
Besides, some of the interesting and amazing solutions from the discussion are also included.

### Environment
This project is coded and tested with [Java 8](https://docs.oracle.com/javase/8/docs/api/) and [Gradle 5.4.1](https://docs.gradle.org/5.4.1/userguide/userguide.html).

The test cases are based on the [TestNG](https://testng.org/doc/) framework ([6.14.3](https://www.javadoc.io/doc/org.testng/testng/6.14.3)).

The Google Java code style is used in this project.

### Code Layout

 - `src/main/java/com/leetcode/snippets` holds the original blank code snippets from `leetcode.com` and you may start solving the problems from here.

 - `src/main/java/com/leetcode/discussion` holds some of the solutions provided by the genius in Leetcode Disucss.

 - `src/main/java/cn/hjmao/leetcode` holds all my leetcode solutions. The code are in the same code format as the leetcode requires, so it can be directly copied and pasted on the leetcode OJ input box.

 - `src/test/java/cn/hjmao/leetcode` holds the test cases. You may copy the test cases to yours and just focus on thinking about the core algorithms for the problems.
    You can execute all the test cases with `gradle test`.
    If you have more test cases, you can append the test cases in the test unit files.

 - `src/main/java/cn/hjmao/utils` contains some of the utilities for my solutions.

<details><summary>Source Code Layout</summary>
<p>

``` shell
src
├── main
│   └── java
│       ├── cn
│       │   └── hjmao
│       │       ├── ProblemFetcher.java
│       │       ├── leetcode
│       │       │   ├── a001twosum
│       │       │   │   └── Solution.java
│       │       │   ├── a002addtwonumbers
│       │       │   │   └── Solution.java
│       │       │   ├── ...
│       │       │   │   └── Solution.java
│       │       │   └── ...
│       │       │       └── Solution.java
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
│               ├── discussion
│               │   ├── a001twosum
│               │   │   └── Solution.java
│               │   ├── a002addtwonumbers
│               │   │   └── Solution.java
│               │   ├── ...
│               │   │   └── Solution.java
│               │   └── ...
│               │       └── Solution.java
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
    └── java
        └── cn
            └── hjmao
                └── leetcode
                    ├── a001twosum
                    │   └── SolutionTest.java
                    ├── a002addtwonumbers
                    │   └── SolutionTest.java
                    ├── ...
                    │   └── SolutionTest.java
                    └── ...
                        └── SolutionTest.java
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

 4. Create your own code package in `src/main/java` for code and `src/test/java` for test cases, for example `your.code.place`

 5. Choose a problem and move the corresponding blank snippet code from `src/main/java/com/leetcode/snippets`,
    so that you do not need to prepare the `Solution` file from scratch. Just focus on problem solving!!!
    For example, copy the package `a001twosum` to package `your.code.place`. If you are using IDE like Jetbrains IDEA,
    it would automatically change the package name to yours, otherwise you might have to revise the snippet manually.

 6. Copy the test cases code in `cn.hjmao.leetcode` to `your.code.place` package in the `src/test/java`.
    **NOTICES: If you are using the IDEs, as the IDE would probably insert the `import cn.hjmao.leetcode.xxx.Solution` to the test case code file, you might need to delete it manually.**

 7. ***Focus and write the algorithm*** in the code file in `src/main/java/your/code/place/Solution.java`.

 8. Run and debug with the copied test cases in `src/main/java/your/code/place/Solution.java`.

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
