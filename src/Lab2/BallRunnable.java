package Lab2; /**
 @author Cay Horstmann (REORGANISED by N Voelker) 
 */

import java.awt.*;

/**
 * A runnable that animates a bouncing ball.
 */
public class BallRunnable implements Runnable {
  /**
   * Constructs the runnable.
   * 
   * @aBall the ball to bounce
   * @aPanel the component in which the ball bounces
   */
  public BallRunnable(Ball aBall, Component aComponent) {
    ball = aBall;
    component = aComponent;
  }

  public void run() {
    int[] array = null;
    int sum = 0;
    for (int i = 0; i < array.length; i++)
      sum += array[i];
    for (int i = array.length - 1; i >= 0; i--)
      sum += array[i];

    try {
      for (int i = 1; i <= STEPS; i++) {
        ball.move(component.getBounds());
        component.repaint();
        Thread.sleep(DELAY);
      }
    } catch (InterruptedException e) {
    }
  }

  private Ball ball;

  private Component component;

  public static final int STEPS = 100000;

  public static final int DELAY = 5;

}
