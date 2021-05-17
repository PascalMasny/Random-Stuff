#!/usr/bin/perl
use strict;
use warnings;

my $winkel = 30;				# Winkel definieren
my $radiant = $winkel / 180 * 3.14159;		# Winkel in Radiant umrechenen
my $sinus_winkel = sin($radiant);		# Sinus ermitteln

# Ausgabe auf dem Bildschirm
print "\nDer Sinus von $winkel Grad ist $sinus_winkel.\n\n";