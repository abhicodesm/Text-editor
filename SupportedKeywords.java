package simplejavatexteditor;

import java.util.ArrayList;

/**
 * <h1>A class to store the programming language keywords and
 * provide access to them.</h1>
 *
 * <p>Makes multiple language support possible and makes adding new language
 * support convenient. To add more keywords, add a string array and getters
 * to this class. Then, update the switch statement in UI.java.</p>
 */
public class SupportedKeywords {

    private String[] supportedLanguages = {".cpp",".java" , ".txt"};

    private String[] java = {"abstract", "assert", "boolean",
            "break", "byte", "case", "catch", "char", "class", "const",
            "continue", "default", "do", "double", "else", "extends", "false",
            "final", "finally", "float", "for", "goto", "if", "implements",
            "import", "instanceof", "int", "System", "out", "print()", "println()",
            "new", "null", "package", "private", "protected", "public", "interface",
            "long", "native", "return", "short", "static", "strictfp", "super", "switch",
            "synchronized", "this", "throw", "throws", "transient", "true",
            "try", "void", "volatile", "while", "String"};

    private String[] cpp = { "auto", "const", "double", "float", "int", "short",
                "struct", "unsigned", "break", "continue", "else", "for", "long", "signed",
                "switch", "void", "case", "default", "enum", "goto", "register", "sizeof",
                "typedef", "volatile", "char", "do", "extern", "if", "return", "static",
                "union", "while", "asm", "dynamic_cast", "namespace", "reinterpret_cast", "try",
                "bool", "explicit", "new", "static_cast", "typeid", "catch", "false", "operator",
                "template", "typename", "class", "friend", "private", "this", "using", "const_cast",
                "inline", "public", "throw", "virtual", "delete", "mutable", "protected", "true", "wchar_t" };
    
    private String[] txt = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his",
    			"they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your",
    			"can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then",
    			"them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number",
    			"no","way","could","people","my","than","first","water","been","call","who",
    			"oil","its","now","find","long","down","day","did","get","come","made","may","part"};

    public String[] getSupportedLanguages() {
        return supportedLanguages;
    }

    private String[] brackets = { "{", "(" };
    private String[] bCompletions = { "}", ")" };
    public String[] getJavaKeywords() {
        return java;
    }
    public String[] getCppKeywords() {
        return cpp;
    }
   
    public String[] getTxtKeywords() {
        return txt;
    }
    
    public ArrayList<String> getbracketCompletions() {
        ArrayList<String> al = new ArrayList<>();
        for(String completion : bCompletions) {
            al.add(completion);
        }
        return al;
    }
    public ArrayList<String> getbrackets() {
        ArrayList<String> al = new ArrayList<>();
        for(String completion : brackets) {
            al.add(completion);
        }
        return al;
    }
    public ArrayList<String> setKeywords(String[] arr) {
        ArrayList<String> al = new ArrayList<>();
        for(String words : arr) {
            al.add(words);
        }
        return al;
    }

}
