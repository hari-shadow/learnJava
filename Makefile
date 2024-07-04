all : compile run 

compile :
	@javac basics/*.java

#run :
#	@java -cp basics * 
clean :
	@rm basics/*.class
#move :
	@mv basics/*.java basics/archive/

