#!/usr/bin/perl

$t = 0;
$g = -4,9;

print "Beta:";
$beta = <>;
print"\n";

print "V:";
$v = <>;
print"\n";

print "Y:";
$z = <>;
print"\n";

print "T:";
$t2 = <>;
print"\n";

print "s:";
$s = <>;
print"\n";



$radiant = $beta / 180 * 3.14159;
$cos_winkel = cos($radiant);
$sin_winkel = sin($radiant);


print"X Werte: \n";
while ($t <= $t2) {
	
	$t = $t + $s;
	$x = $v * $cos_winkel * $t;
	print "$x \n";
			
}

$t = 0;
print "\n";

print"Y Werte: \n";
while ($t <= $t2) {
	
	$t = $t + $s;
	$y = $g + $v * $sin_winkel * $t +$z;
	print "$y \n";
			
}

print "Done! \n";
	