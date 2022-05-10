# BFinterpreter
PROJECT TITLE: BrainFuck Interpreter in Java
PURPOSE OF PROJECT: To create a lightweight BrainFuck interpreter in Java
HOW TO START THIS PROJECT:

USER INSTRUCTIONS:
The language consists of only eight simple commands and an instruction pointer. While it is fully Turing-complete, it is not intended for practical use, but to challenge and amuse programmers.
BrainFuck is a tiny language with only eight instructions:

> Move the pointer to the right
< Move the pointer to the left
+ Increment the memory cell under the pointer
- Decrement the memory cell under the pointer
. Output the character signified by the cell at the pointer
, Input a character and store it in the cell at the pointer
[ Jump past the matching ] if the cell under the pointer is 0
] Jump back to the matching [ if the cell under the pointer is nonzero
