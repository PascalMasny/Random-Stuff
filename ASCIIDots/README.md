# ASCIIDots

## Interpreter
[official website](https://asciidots.herokuapp.com)

## Current Syntax

|  Character  | Description |
| :---: | :--- |
| \- | Allows the dot to move horizontally |
| \| | Allows the dot to move vertically |
| + | Acts as crossroads; dots can pass through this horizontally or vertically |
| ~ | Takes a dot input from the bottom and left; if the bottom's value is 0, then the left one continues on to the right. If the bottom's value is not, then the dot coming from the left starts moving upward |
| : | If a dot passes this and has a value equal to 0, it is deleted |
| ; | If a dot passes this and has a value equal to 1, it is deleted |
| ! | If underneath a `~`, reverse it so that 0 makes the dot move up and any other number makes it continue on right |
| $ | Prints a value to the console |
| # | Sets the value of the dot, can also be used to get the value of the dot in a print command |
| @ | Sets the address of the dot, can also be used to get the address of the dot in a print command |
| _ | Marks that the console will not print a newline after its message |
| a | Marks that the console will print the ASCII character equivalent of a number |
| ? | Asks for user input; may only be used after a `#` or `@` |
| ^ | Changes the dot's direction to up |
| \> | Changes the dot's direction to right |
| < | Changes the dot's direction to left |
| v | Changes the dot's direction to down |
| * | A dot that hits this character will have itself duplicated, with the duplicates travelling in every possible (connected) direction |
| \\ | A "mirror" that changes the dot's direction |
| / | Another "mirror" that changes the dot's direction |
| () | Anything inside these parentheses will loop forever |
| [] | Operation inside will be evaluated; a vertical-moving dot will be eval'd against a horizontal dot. The horizontal dot will be deleted and the vertical will continue |
| {} | Operates similar to `[]`, but a horizontal dot is eval'd against a vertical dot and the horizontal dot is outputed |
| & | Ends the program |
| "" or '' | Marks a string that the value or print command can use |
| %! | Imports a file as a character. Do not specificy the directory if you want to use a built in library. Usage: `%!file.dots f` |
| %^ | Used when creating your own library. The character following it will be the entry and exit point for the library |
| %$ | Used to denote warps. You can put multiple letters next to eachother to denote multiple warps. You can only use a warp twice in the code |

## Tutorials I recommend
[ASCII Dots Tutorial](https://www.youtube.com/watch?v=2BvBk-WHHZQ)
