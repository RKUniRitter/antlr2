import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
    
public class HelloRunner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//https://stackoverflow.com/a/52850358/2396999
		//ANTLRInputStream input = new ANTLRInputStream( System.in);
		//CharStream charStream = CharStreams.fromFileName("/path/to/file.ext");
		//CharStream input = CharStreams.fromString("hello there");
		CharStream input = CharStreams.fromStream(System.in);
	    
		HelloLexer lexer = new HelloLexer(input);

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		HelloParser parser = new HelloParser(tokens);
		ParseTree tree = parser.r(); // begin parsing at rule 'r'
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree		

	}

}
