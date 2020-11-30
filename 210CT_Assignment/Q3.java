
/**
 * 在这里给出对类 Harmonic 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class Q3 extends JFrame implements ActionListener{
    private JTextField jtfn = new JTextField(10);
    private JTextField jtfanswer = new JTextField(10);
    private JButton jbCompute = new JButton("OK");
    
    public static void main(String[] args){
        Q3 frame = new Q3();
        frame.pack();
        frame.setTitle("Harmonic series");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public Q3(){
        JPanel p1= new JPanel();
        p1.setLayout(new GridLayout(3,2));
        
        p1.add(new JLabel("N"));
        p1.add(jtfn);
        
        p1.add(new JLabel("Answer"));
        p1.add(jtfanswer);
        jtfanswer.setEditable(false);
        
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(p1,BorderLayout.CENTER);
        this.getContentPane().add(jbCompute,BorderLayout.SOUTH);
        jbCompute.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == jbCompute) {
            double n = Double.parseDouble(jtfn.getText());
            double answer = 0;
            for(Double i = n ; i > 0 ; i--){
                answer = answer + 1/i;
            }
            
            jtfanswer.setText(""+answer);
        }
    }
    
}
