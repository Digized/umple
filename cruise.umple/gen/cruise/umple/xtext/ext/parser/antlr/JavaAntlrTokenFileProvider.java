/*
* generated by Xtext
*/
package cruise.umple.xtext.ext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class JavaAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("cruise/umple/xtext/ext/parser/antlr/internal/InternalJava.tokens");
	}
}
