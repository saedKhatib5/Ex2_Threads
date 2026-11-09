Recursive Multithreaded Subset Sum Algorithm with Thread Synchronization
This project implements a recursive multithreaded algorithm for the subset sum problem. The goal is to find all subsets of a given set that add up to a specified target sum. The algorithm uses multiple threads to improve performance, and thread synchronization ensures that shared resources are accessed safely.

Project Structure
The project is structured as follows:

src/ contains the Java source code.
SubsetSum.java: Implements the main logic of the subset sum algorithm.
Utils.java: Contains utility methods for multithreading and thread synchronization.
README.md: This file.
Algorithm Overview
Recursive Multithreaded Subset Sum
The algorithm works as follows:

Base Case: If the target sum is zero, a valid subset is found.
Recursive Case: For each element in the set:
Include the current element and recursively call the function with the remaining elements and the updated target sum.
Exclude the current element and recursively call the function with the remaining elements.
Thread Synchronization
To ensure that shared resources are accessed safely, the following synchronization mechanisms are used:

ReentrantLock: Protects critical sections of code where multiple threads may access shared data simultaneously.
CountDownLatch: Used to coordinate threads. It allows one or more threads to wait until a set of operations being performed in other threads completes.
Data Structure Refactoring
The project refactors the data structure from ArrayList<Integer> to improve memory usage and performance. The Utils class provides methods for creating and manipulating these structures.

Code Documentation with Javadoc
Javadoc comments are used to document the code, making it easier for developers to understand and maintain. Key areas include:

Class Comments: Provide an overview of the class's purpose.
Method Comments: Describe what each method does, its parameters, return values, and any potential exceptions.
Field Comments: Explain the purpose and usage of instance variables.
Authors and Git Collaboration Roles
Authors
John Doe (john.doe@example.com)
Jane Smith (jane.smith@example.com)
Git Collaboration Roles
John Doe:
Designed the algorithm.
Implemented the main logic in SubsetSum.java.
Contributed to thread synchronization using ReentrantLock and CountDownLatch.
Jane Smith:
Refactored data structures to use ArrayList<Integer>.
Wrote utility methods in Utils.java.
Contributed documentation with Javadoc comments.
Licensing
This project is licensed under the 'Braude College Academic License'. The full text of the license can be found here.

By contributing to this project, you agree to the terms and conditions outlined in the license.