package simplejavatexteditor;

import javax.swing.JTextPane;

public class SimpleJavaTextEditor extends JTextPane {

    private static final long serialVersionUID = 1L;
    public final static String NAME = "Our NotePad";
    public final static double VERSION = 3.0;

    public static void main(String[] args) {
        new UI().setVisible(true);
    }

}