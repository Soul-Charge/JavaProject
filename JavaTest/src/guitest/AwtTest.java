/* AwtTest.java -- �������Ĳ���ѧ�̳�����һ��GUI */
package guitest;
import java.awt.Button;
import java.awt.Frame;

public class AwtTest {

    public static void main(String[] args) {

        Frame frame   = new Frame();
        Button button = new Button("TEST");
        frame.add(button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
