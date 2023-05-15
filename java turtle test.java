import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Spiral extends JPanel {

    // Set the background color as black
    public Spiral() {
        setBackground(Color.BLACK);
    }

    // Override the paintComponent method to draw the curve
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set the pensize as 2
        g.setColor(Color.WHITE);
        g.setStroke(new BasicStroke(2));

        // Iterate six times in total
        for (int i = 0; i < 6; i++) {

            // Choose your color combination
            for (Color color : new Color[] {
                Color.RED, Color.MAGENTA, Color.BLUE,
                Color.CYAN, Color.GREEN, Color.WHITE,
                Color.YELLOW
            }) {
                g.setColor(color);

                // Draw a circle of chosen size, 100 here
                int x = getWidth() / 2;
                int y = getHeight() / 2;
                int r = 100;
                g.drawOval(x - r, y - r, 2 * r, 2 * r);

                // Move 10 pixels left to draw another circle
                g.translate(-10, 0);
            }
        }
    }

    // Create a JFrame to hold the JPanel
    public static void main(String[] args) {
        JFrame frame = new JFrame("Spiral");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.add(new Spiral());
        frame.setVisible(true);
    }
}
