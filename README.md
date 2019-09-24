# Leetcode solution scaffold with Python 3

## Introduction
This is project includes a sketch framework for Leetcode in Python3.
You may start solving the Leetcode problems with this project.

## Environment
This project is coded in Python 3 and managed with Makefile.

The test cases uses the default `unittest` framework.

## Code Layout
 - `src/solutions`: will holds all your solutions.
  The code are in the same code format as the leetcode requires,
  so when you passed your own unit test cases, it can be directly copied and pasted on the leetcode OJ input box.
 - `src/utils`: contains some of the utilities for the Leetcode solutions.
 - `tests`: Your test cases for the solutions would be here.
  You may start with `test_a0000blank.py` by coping it to `test_a00id_name.py`, and then write test cases.
 - `Makefile`: You may run `make init` first to run the dependencies, and test your solutions with `make test`.
 
 
<details><summary>Source Code Layout</summary>
<p>

``` shell
.
├── LICENSE
├── MANIFEST.in
├── Makefile
├── README.md
├── requirements.txt
├── setup.py
├── src
│   ├── __init__.py
│   ├── solutions
│   │   ├── __init__.py
│   │   ├── a0000blank.py
│   │   └── a0001twosum.py
│   └── utils
│       └── __init__.py
├── test_requirements.txt
└── tests
    ├── __init__.py
    ├── test_a0000blank.py
    └── test_a0001twosum.py
```
</p>
</details>

## How to use this repo
 1. Clone this project
   `
   git clone https://github.com/huajianmao/leetcode
   `
 
 2. Switch to `python3` branch
 `git checkout python3`
 
 3. Run `make init` to install the dependencies
 
 4. Choose a problem and create the `a00xxtitle.py` in the `src/solutions`, and write your solution in this file.
 
 5. Create a test file `test_a00xxtitle.py` in the `tests`, and write your test cases in this file.
 
 6. Test your solution with `make test`.
 
