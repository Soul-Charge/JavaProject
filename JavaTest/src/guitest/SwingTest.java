/* SwingTest.java -- ����û������һ�£��Ͻ�AwtTest.java */
package guitest;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest {

    public static void main(String[] args) {

        JFrame frame   = new JFrame();
        JButton button = new JButton("TEST");
        frame.add(button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

}
