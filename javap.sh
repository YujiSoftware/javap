#!/bin/bash
VER=20
while getopts v: OPT
do
  case $OPT in
     v) VER=$OPTARG;;
  esac
done
shift `expr $OPTIND - 1`

case $VER in
    6) BIN=/usr/lib/jvm/jdk1.6.0_45/bin/;;
    8) BIN=/usr/lib/jvm/java-8-openjdk-amd64/bin/;;
    11) BIN=/usr/lib/jvm/java-11-openjdk-amd64/bin/;;
    20) BIN=/usr/lib/jvm/jdk-20/bin/;;
esac

DIR=`dirname $1`
FILE=`basename $1`
FILE=${FILE%.*}

cd $DIR
$BIN/javac -g $FILE.java
$BIN/javap -p -v $FILE > $FILE.javap
code $FILE.javap
