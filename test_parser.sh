#!/bin/bash

TESTS="/Users/samhop/compilers/repo/trunk/2013fa/project/pa2/grading/*.in"

for t in $TESTS
do
  INFILE=$t
  NOEXTENSION=${t%%\.in}
  OUTFILE="$NOEXTENSION.out"
  TESTNAME=${NOEXTENSION##*/}
  echo "testing $TESTNAME"
  java x3.X3Compiler $INFILE > tmp.txt
  diff tmp.txt $OUTFILE
done

