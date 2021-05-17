#!/bin/bash
read var
erg=`echo "c($var)" | bc -l`

echo $erg