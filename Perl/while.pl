#!/usr/bin/perl

print "content-type: text/html \n\n";

# SET A VARIABLE
$count = 0;

# RUN A WHILE LOOP
while ($count <= 7) {
	# PRINT THE VARIABLE AND AN HTML LINE BREAK
	print "$count \n";
	# INCREMENT THE VARIABLE EACH TIME
	$count ++;
}
print "Finished Counting!";