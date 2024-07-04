#all : compile run 

#compile :
#	@javac basics/ConditionalsAndLoops.java

#run :
#	@java basics/ConditionalsAndLoops
#clean :
#	@rm basics/*.class

# Makefile for Java project

# Compiler
JAVAC = javac

# Source directory
SRC = basics

# All .java files in the source directory
SOURCES = $(wildcard $(SRC)/*.java)

# Corresponding .class files
CLASSES = $(SOURCES:.java=.class)

# Default target
all: $(CLASSES)

# Rule to create .class files from .java files
%.class: %.java
    $(JAVAC) $<

# Clean up the directory
clean:
    rm -f $(SRC)/*.class

