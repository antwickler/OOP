package Counter;

import java.awt.Color;
import java.awt.Font;
import Counter.Canvas;

public class Tester {
   public static void main(String[] args)
  {
    Canvas canvas = new Canvas("Counter", 225, 150, Color.white); // set GUI
    canvas.setVisible(true);
    canvas.setFont( new Font("Dialog", Font.PLAIN, 96));

    CounterDisplay countNum = new CounterDisplay();
    countNum.setNum(8,8,8);  // set MaxNum

    while(true) {
      countNum.NumIncrement();   // Num++
      System.out.println(countNum.getNum());  // Test print in program
      canvas.erase();
      canvas.drawString(countNum.getNum(), 30, 100);
      canvas.wait(100);  // delay time mSec
    }
  }  // end of main()

}
