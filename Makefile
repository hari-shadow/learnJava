all : compile run 

compile :
	@javac basics/ConditionalsAndLoops.java

run :
	@java basics/ConditionalsAndLoops
clean :
	@rm basics/*.class
