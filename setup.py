# -*- coding: utf-8 -*-

from setuptools import setup, find_packages


with open('README.md') as f:
    readme = f.read()

with open('LICENSE') as f:
    license = f.read()

setup(
    name='Leetcode',
    version='0.1.0',
    description='Project framework for Leetcode solutions',
    long_description=readme,
    author='Huajian Mao',
    author_email='huajianmao@gmail.com',
    url='https://github.com/huajianmao/leetcode/tree/python3',
    license=license,
    packages=find_packages(exclude=('tests', 'docs'))
)