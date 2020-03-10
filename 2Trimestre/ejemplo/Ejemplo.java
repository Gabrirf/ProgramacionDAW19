import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

@SuppressWarnings("serial")
public class Ejemplo extends JPanel {

    int x = 0;
    int y = 0;

    private void movimiento () {
        this.x ++;
        this.y ++;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(Color.BLACK);
	g2d.fillOval(this.x, this.y, 25, 25);
    }

    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame("Ejemplo");

        Ejemplo ejemplo = new Ejemplo();

        frame.add(ejemplo);

	frame.setSize(500, 500);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        while (true) {
            ejemplo.repaint();
            ejemplo.movimiento();
            Thread.sleep(50);
        }

    }
}
