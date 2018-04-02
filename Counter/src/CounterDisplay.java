package Counter;

import Counter.NumberDisplay;

public class CounterDisplay {

        private NumberDisplay Num1;
        private NumberDisplay Num2;
        private NumberDisplay Num3;
         
        private String currNumString;  // the current Num as a string

        public CounterDisplay()
          // intialize the counter to 000
        {
            Num1 = new NumberDisplay(8);
            Num2 = new NumberDisplay(8);
            Num3 = new NumberDisplay(8);
            setNumString();
        }

        private void setNumString()
        {  
            currNumString = Num3.getDisplayValue() + Num2.getDisplayValue() + Num1.getDisplayValue();  
        }

        public void setNum(int num3, int num2,int num1)
        {
            Num3.setValue(num3);
            Num2.setValue(num2);
            Num1.setValue(num3);

            setNumString();
        }

        public String getNum()
        { 
            return currNumString; 
        }

        public void NumIncrement()
          // increment the value by one mSec;
        {
            Num1.increment();
            if (Num1.getValue() == 0){    // if bit0 = 0
                Num2.increment();         // bit1++
                if (Num2.getValue() == 0) // if bit1 = 0
                    Num3.increment();     // bit2++
            }
            setNumString();
        }  // end of NumIncrement()
}
