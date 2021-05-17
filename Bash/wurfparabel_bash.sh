#Wurfparabel Bash

#!/bin/bash

#counter
((t = 0))
((n = 100))
((g = -4,2))

#Start
echo "Wurfparabelrechner in Bash"
echo "by Pascal"
echo "----"

#Inputs
#Beta
echo "Beta:"
read b
echo ""

#Gsch
echo "V:"
read v
echo ""

#höhe y oder auch z
echo "Y:"
read z
echo ""

#print
echo $b
echo $v
echo $z
echo ""

#cos und sin

var1=`echo "c($b)" | bc -l`
var2=`echo "c($b)" | bc -l`


echo $var1
echo $var2




#Counter X
while [ $t -le $n ]; do

   x=`echo "$v * $var1 * $t" | bc -l`
   echo $x	
	
   ((t++))

done

#restet
((t=0))
echo ""
echo ""

#counter y
while [ $t -le $n ]; do

   y=`echo "$g + $v * $var2 * $t * $z" | bc -l`
   echo $y	
	
   ((t++))

done






