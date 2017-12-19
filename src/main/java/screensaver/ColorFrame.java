package screensaver;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public abstract class ColorFrame extends JFrame {

	public ColorFrame() {
		setSize(200, 200);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public void showOnRandomPlace() {
		Random random = new Random();
		setLocation(random.nextInt(1200), random.nextInt(700));
		getContentPane().setBackground(getColor());
		repaint();
	}

	protected abstract Color getColor();

}
