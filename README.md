# BrainFuck-Interpreter
A simple BrainFuck Interpreter in Java.

Brainfuck is an esoteric programming language created in 1993 by Urban Müller, and notable for its extreme minimalism.
The language consists of only eight simple commands and an instruction pointer. While it is fully Turing-complete, it is not intended for practical use, but to challenge and amuse programmers.

# Commands

The eight language commands each consist of a single character:

Character	Meaning

1. The >	increment the data pointer (to point to the next cell to the right).
2. <	decrement the data pointer (to point to the next cell to the left).
3. '+'	increment (increase by one) the byte at the data pointer.
4. '-'	decrement (decrease by one) the byte at the data pointer.
5. .	output the byte at the data pointer.
6. ,	accept one byte of input, storing its value in the byte at the data pointer.
7. [	if the byte at the data pointer is zero, then instead of moving the instruction pointer forward to the next command, jump it forward to the command after the matching ] command.
8. ]	if the byte at the data pointer is nonzero, then instead of moving the instruction pointer forward to the next command, jump it back to the command after the matching [ command.
9. (Alternatively, the ] command may instead be translated as an unconditional jump to the corresponding [ command, or vice versa; programs will behave the same but will run more slowly, due to unnecessary double searching.)
10. [ and ] match as parentheses usually do: each [ matches exactly one ] and vice versa, the [ comes first, and there can be no unmatched [ or ] between the two.
