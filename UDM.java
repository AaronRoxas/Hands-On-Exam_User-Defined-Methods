import javax.swing.JOptionPane;
public class UDM 
{
    static int num, reversed, counter;
    static int sum = 0;
    public static void main(String[] args)
    {
       num = 0;
       String isActive = "yes";
       do
       {
       num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
       reverseNum();
       numOfDigits();
       sumOfDigits();
       
       isActive = JOptionPane.showInputDialog("Again? Yes/No?");
       
       if(isActive.equalsIgnoreCase("no"))
       {
           System.exit(0);
       }
       
       }while(isActive.equalsIgnoreCase("yes"));  
    }
    
    public static void reverseNum()
    {
        int num1 = num;
        String display = "";
        while(num1!=0)
        {
            reversed = reversed *10 + num1 %10;
            num1/=10;
            
        }
        JOptionPane.showMessageDialog(null,"Number in reversed: "+reversed);
        reversed = 0;

    }
    public static void numOfDigits()
    {
        int num1 = num;
        for(int i = 1; i <= num1;i++)
        {
            while(num1!=0)
            {
                num1/=10;
                counter++;
            }            
            JOptionPane.showMessageDialog(null,"Number of Digits: "+counter);
            counter = 0; 
        }
    }
    
    public static void sumOfDigits()
    {
      int num1 = num;
        while(num1 != 0)
        {
            sum = sum + num1%10;
            num1/=10;
        }
        
        JOptionPane.showMessageDialog(null,"Sum of Digits: " + sum);
        sum = 0;
    }
}
