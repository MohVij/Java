import javax.swing.*;
import java.awt.*;

public class MohVijLove extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Smooth graphics
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Background color
        setBackground(new Color(255, 192, 203));  // Soft pink

        // Big red heart
        g.setColor(Color.RED);
        g.fillOval(100, 50, 100, 100);
        g.fillOval(200, 50, 100, 100);
        int[] xPoints = {100, 250, 300};
        int[] yPoints = {120, 300, 120};
        g.fillPolygon(xPoints, yPoints, 3);

        // Text message
        g.setFont(new Font("Serif", Font.BOLD, 28));
        g.setColor(Color.WHITE);
        g.drawString("❤️ #MohVij ❤️", 130, 250);
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        g.drawString("We both love each other!", 110, 290);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Love for #MohVij");
        MohVijLove panel = new MohVijLove();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
