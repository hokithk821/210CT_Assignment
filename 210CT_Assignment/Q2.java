
/**
 * 在这里给出对类 LoanCalculator 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 * 
 * 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q2 extends JFrame implements ActionListener 
{
    
    private JTextField jtfLoanAmount = new JTextField(10);
    private JTextField jtfLoanTerm = new JTextField(10);
    private JTextField jtfInterestRate = new JTextField(20);
    private JTextField jtfPayBack = new JTextField(20);
    private JButton jbCompute = new JButton("Calculator");
    
    public static void main(String[ ] args) {
        Q2 frame = new Q2( );
        frame.pack();
        frame.setTitle("LoanCalculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
  }
  
    public Q2(){
        JPanel p1 = new JPanel( );
        
        p1.setLayout(new GridLayout(4, 2));						
        p1.add(new JLabel("Loan amount"));
        p1.add(jtfLoanAmount);	
        
        p1.add(new JLabel("Loan term in years"));
        p1.add(jtfLoanTerm);
        
        p1.add(new JLabel("interest rate"));
        p1.add(jtfInterestRate);
        
        p1.add(new JLabel("Monthly payback"));
        p1.add(jtfPayBack);										
        jtfPayBack.setEditable(false);
        								
     
        // Add p1 to the frame
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(p1,BorderLayout.CENTER);	
        this.getContentPane().add(jbCompute,BorderLayout.SOUTH);

        // Register listener
        jbCompute.addActionListener(this);						


    }
    public void actionPerformed(ActionEvent e) {				
    if (e.getSource() == jbCompute) {	
        int amount = Integer.parseInt(jtfLoanAmount.getText());
        int term = Integer.parseInt(jtfLoanTerm.getText());
        double rate = Double.parseDouble(jtfInterestRate.getText());
        double payback = amount/term/12;
        double Exrate = amount/term/12/rate;
        payback = amount/term/12 + amount/term/12/rate;
        
        
        jtfPayBack.setText(""+payback);
	} // end of if
  } // end of ActionPerformed



}
