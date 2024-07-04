all : compile run 

compile :
	@javac Hello.java

run :
	@java Hello
clean :
	@rm *.class
