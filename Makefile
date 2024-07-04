all : compile run 

compile :
	@javac basics/ConditionalsAndLoops.java

run :
	@java -cp basics ConditionalsAndLoops
clean :
	@rm basics/*.class
move :
	@mv basics/*.java basics/archive/

