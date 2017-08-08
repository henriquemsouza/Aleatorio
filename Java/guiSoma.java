import javax.swing.JOptionPane;

public class guisimple {
	
	
public static void main(String[]args) {
	
   String fn =JOptionPane.showInputDialog("enter firt num");
   String sn =JOptionPane.showInputDialog("enter firt num");
   
   int  num1 = Integer.parseInt(fn);
   int  num2 = Integer.parseInt(sn);
   int sum = num1+num1;

   JOptionPane.showMessageDialog(null,"the answer is "+sum,"the title",JOptionPane.PLAIN_MESSAGE);

}


}
