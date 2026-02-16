import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class AnalogClock extends JPanel {

    public AnalogClock() {
        Timer timer = new Timer(1000, e -> repaint());
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();
        int radius = Math.min(width, height) / 3;

        int centerX = width / 2;
        int centerY = height / 2;

        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);

        Calendar now = Calendar.getInstance();

        int seconds = now.get(Calendar.SECOND);
        int minutes = now.get(Calendar.MINUTE);
        int hours = now.get(Calendar.HOUR);

        double secondAngle = Math.toRadians(seconds * 6 - 90);
        double minuteAngle = Math.toRadians(minutes * 6 - 90);
        double hourAngle = Math.toRadians(hours * 30 + minutes * 0.5 - 90);

        g.setColor(Color.RED);
        g.drawLine(centerX, centerY,
                centerX + (int)(radius * Math.cos(secondAngle)),
                centerY + (int)(radius * Math.sin(secondAngle)));

        g.setColor(Color.BLUE);
        g.drawLine(centerX, centerY,
                centerX + (int)(radius * 0.8 * Math.cos(minuteAngle)),
                centerY + (int)(radius * 0.8 * Math.sin(minuteAngle)));

        g.setColor(Color.BLACK);
        g.drawLine(centerX, centerY,
                centerX + (int)(radius * 0.6 * Math.cos(hourAngle)),
                centerY + (int)(radius * 0.6 * Math.sin(hourAngle)));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Analog Clock");
        frame.add(new AnalogClock());
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
