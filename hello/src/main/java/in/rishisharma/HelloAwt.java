package in.rishisharma;

import java.awt.*;
import java.awt.event.*;

public class HelloAwt extends Frame {
    public static void main(String[] args) {
        new HelloAwt();
    }

    public HelloAwt() {
        super("Hello, World!");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(250, 100);
        add(new Label("Hello, World!", Label.CENTER));
        setVisible(true);
    }
}
