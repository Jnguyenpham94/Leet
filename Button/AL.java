package Button;
import java.awt.event.*;

import java.awt.*;

    public class AL extends Frame implements WindowListener,ActionListener {
        TextField text = new TextField(20);
        Button b;
        private int numClicks = 0;

        public static void main(String[] args) {
            AL myWindow = new AL("My first window");
            myWindow.setSize(350,100);
            myWindow.setVisible(true);
    }

    public AL(String title) {

            super(title);
            setLayout(new FlowLayout());
            addWindowListener(this);
            b = new Button("Click me");
            add(b);
            add(text);
            b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
            //numClicks++;
            text.setText("Button Clicked " + ++numClicks + " times");
            if(numClicks % 3 == 0){
                System.out.print("FIZZ ");
            }
            if(numClicks % 5 == 0){
                System.out.print("BUZZ ");
            }
            System.out.print(numClicks + " ");
    }

    public void windowClosing(WindowEvent e) {
            dispose();
            System.out.println("CLOSING GOODBYE!");
            System.exit(0);
    }

    public void windowOpened(WindowEvent e) {
            System.out.println("Window is now open");
    }
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}

}