#/bin/bash

echo "Ziel:"
read X

echo "Schritte:"
read N


while [ $N -le $X ]; do
   echo Zeile $N
   ((N++))
done
 
