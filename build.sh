#!/bin/sh

MAIN_SRC_DIR=src/main/java
TEST_SRC_DIR=src/test/java

MAIN_BUILD_DIR=build/main
INST_BUILD_DIR=build/inst
TEST_BUILD_DIR=build/test

# Compile source files
echo "Compiling sources..."
mkdir -p $MAIN_BUILD_DIR
javac $OPTS -g -d $MAIN_BUILD_DIR $(find $MAIN_SRC_DIR -iname *.java)

# Instrument
echo "Instrument..."
mkdir -p $INST_BUILD_DIR
java -jar lib/ba-dua-cli-0.3.0-all.jar instrument -src $MAIN_BUILD_DIR -dest $INST_BUILD_DIR

echo "Compiling tests..."
mkdir -p $TEST_BUILD_DIR
javac $OPTS -d $TEST_BUILD_DIR \
      -cp lib/junit-3.8.2.jar:$MAIN_BUILD_DIR $(find $TEST_SRC_DIR -iname *.java)

echo "Running tests..."
java -Doutput.file=build/badua.ser \
     -cp lib/junit-3.8.2.jar:lib/ba-dua-cli-0.3.0-all.jar:$INST_BUILD_DIR:$TEST_BUILD_DIR \
     junit.textui.TestRunner br.usp.each.saeg.badua.example.Suite
