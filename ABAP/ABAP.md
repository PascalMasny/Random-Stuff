# ABAP Basics


## Links

https://www.tutorialspoint.com/sap_abap/sap_abap_screen_navigation.htm


## Online ABAP Editor
https://abapeditor.com/


## IDE
SE38 oder SE80


## Hello World
```
WRITE 'Hello World'.
```


## Basic Syntax
```
REPORT [Program_Name]. 
 
[Statements…]. 
```

## Comment
```
* Comment
```

## Datatyps

Symbol | Type
---|---
|X | Byte
|C | Char
|N | Numeric Text field
|D | Date Char
|T | Time Char
|I | Integir
|F | Float
|P | Long
|STRING | String
|XSTRING | String in hex code

Simple String:
```
DATA text_string TYPE STRING. 
text_string = 'A Program in ABAP'. 
Write / text_string.
```

Get current Date:
```
DATA d_date TYPE D. 
d_date = SY-DATUM. 
Write / d_date.
```

## Variables
```
DATA <f> TYPE <type> VALUE <val>. 
```

example:
```
DATA d1(2) TYPE C.  
DATA d2 LIKE d1.  
DATA minimum_value TYPE I VALUE 10. 
``` 