import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public  class Gui extends JFrame
{
    JButton button;
    TextArea textArea;
    TextField textField;
    String username="hi";
    Gui(String username) throws RuntimeException
    {

        ImageIcon imageIcon=new ImageIcon("1.jpg");
        ImageIcon imageIcon1=new ImageIcon("3.jpg");
        ImageIcon imageiconleft=new ImageIcon("left.jpg");
        ImageIcon imageiconright=new ImageIcon("right.jpg");
        ImageIcon chatbotimage=new ImageIcon("ww.png");

        this.setSize(800,700);
       this.getContentPane().setBackground(new Color(12, 7, 41));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setIconImage(imageIcon.getImage());
      this.setLayout(new BorderLayout(5,5));
this.setIconImage(chatbotimage.getImage());
        this.setVisible(true);
this.setTitle("WanderWise(WayBot)");

        //panel creation
        JPanel panel1=new JPanel();
        panel1.setPreferredSize(new Dimension(500,52));
        panel1.setLayout(new BorderLayout());
        JLabel label=new JLabel();
        label.setLayout(new BorderLayout());
        //label.setText("..WELCOME USER..");
        label.setIcon(imageIcon);

        panel1.add(label);
        panel1.setBackground(new Color(12, 7, 41));
       // panel1.setBorder(BorderFactory.createRaisedSoftBevelBorder());
//down panel
        JPanel panel2=new JPanel();
        panel2.setPreferredSize(new Dimension(500,50));
        panel2.setLayout(new BorderLayout());
        //panel2.setBackground(Color.DARK_GRAY);
        JLabel label2=new JLabel();
        label2.setLayout(new BorderLayout());
        label2.setIcon(imageiconright);
        panel2.add(label2);
        panel2.setBackground(new Color(12, 7, 41));
////left panel
        JPanel panel3=new JPanel();
        panel3.setPreferredSize(new Dimension(50,500));
        panel3.setLayout(new BorderLayout());
        //panel3.setBackground(Color.CYAN);
        JLabel label3=new JLabel();
        label3.setLayout(new BorderLayout());
        label3.setIcon(imageiconleft);
        panel3.add(label3);
        panel3.setBackground(new Color(12, 7, 41));
//right panel
        JPanel panel4=new JPanel();
        panel4.setPreferredSize(new Dimension(50,500));
        panel4.setLayout(new BorderLayout());
       // panel4.setBackground(Color.GRAY);
        JLabel label4=new JLabel();
        label4.setLayout(new BorderLayout());
        label4.setIcon(imageIcon1);
        panel4.add(label4);
        panel4.setBackground(new Color(12, 7, 41));

        JPanel panel5=new JPanel();
        panel5.setPreferredSize(new Dimension(300,300));
       // panel5.setSize(300,300);
        panel5.setLayout(new BorderLayout());
        panel5.setBackground(Color.WHITE);
        JLabel label5=new JLabel();
        label5.setLayout(new BorderLayout());
        label5.setIcon(imageIcon);
        panel5.add(label5);
        panel5.setBackground(new Color(12, 7, 41));

        JPanel samplepanel=new JPanel();
        samplepanel.setSize(750,300);
        samplepanel.setLayout(null);
        samplepanel.setBackground(Color.black);
        panel5.add(samplepanel);
        //text area and text field
        TextArea textArea=new TextArea();
        samplepanel.add(textArea);
        //textArea.se
       //font color changing
        textArea.setFont(new Font("",Font.BOLD,15));
        textArea.setForeground(Color.black);
        textArea.setBounds(0,0,675,500);
        //textArea.setPreferredSize(new Dimension(250,200));
        //textArea.setBackground(new Color(83, 108, 166));
        textArea.setBackground(new Color(230, 230, 250));

        //text field
        TextField textField=new TextField();
        textField.setBackground(new Color(189, 218, 169, 255));
        textField.setBounds(0,510,610,40);
        textField.setFont(new Font("Arial",Font.LAYOUT_LEFT_TO_RIGHT,15));
        textField.setForeground(Color.black);
        textField.setText("Ask Me A Question:");
        textField.setCaretPosition(18);
        samplepanel.add(textField);

//button creation
        JButton button=new JButton("SEND");
        button.setLayout(new BorderLayout());
        button.setBorder(BorderFactory.createCompoundBorder());
        // button.setSize(20,20);
        button.setBackground(new Color(150, 226, 231));
        button.setBounds(610,510,65,40);
        button.setFocusable(false);
        samplepanel.add(button);
//textField.add(button);




        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.SOUTH);
        this.add(panel3,BorderLayout.WEST);
        this.add(panel4,BorderLayout.EAST);
        this.add(panel5,BorderLayout.CENTER);
        this.setResizable(false);

        //implementaation
       // Scanner  scr=new Scanner(System.in);
        //String userinput = "";
//        System.out.println("ENTER YOUR NAME[USER NAME]:");
//        String name=scr.nextLine();

        //System.out.println("MINING BOT: HI! HOW CAN I HELP YOU TODAY");
        textArea.append("WayBot: HI! HOW CAN I HELP YOU TODAY"+"\n");
        this.username=username;


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // textField.setText("Enter text:");
                //textField.setCaretPosition(12);
                String userinput=textField.getText();
                userinput=userinput.replaceAll("Ask Me A Question:","");
                textArea.append(username.toUpperCase()+": "+userinput.toUpperCase()+"\n");
textField.setText("Ask Me A Question:");
//if (userinput.equalsIgnoreCase())
                if (userinput.equalsIgnoreCase("bye"))
                {
                    textArea.append("WayBot: THANK YOU! HAVE A GOOD DAY\n Please provide feedback on your experience\nhttps://forms.gle/9meqBUwvokARgv7H9");
                    textField.setText("Ask Me A Question:");
                }
                else if (userinput.trim().isEmpty()) {
                    //System.out.println("MINING BOT: PLEASE ENTER A RESPONSE..");
                    textArea.append("WayBot: PLEASE ENTER A RESPONSE.."+"\n");
                    textField.setText("Ask Me A Question:");
                }
                else {
                    userinput = userinput.replaceAll("\\[|\\]", "");
                    String response = Virtubotimplementation.response3(userinput);
                    //System.out.println("line 165"+response);
//                   if (!response.equalsIgnoreCase("SORRY! ANSWER TO QUESTION NOT FOUND"))
//                      //  if (response.equalsIgnoreCase(""))
//
//                        {
//response=Virtubotimplementation.nullresponse();
//                        System.out.println("Gui response"+response);
//                    }

//                   try {
//                       wait(2000);
//                   }
//                   catch (InterruptedException e1)
//                   {
//                       System.out.println(e1);
//                   }
                    textArea.append("WayBot: "+ response + "\n");
                   // textArea.append("MINING BOT: " + response + "\n");
                    textField.setText("Ask Me A Question:");
                }
            }
        });


    }
Gui(String username,String result)
{
//panels image
    ImageIcon imageIcon=new ImageIcon("left.jpg");
    //
    ImageIcon imageIcon1=new ImageIcon("WELCOME TO MINING BOT.png");
    //title image
    ImageIcon chatbotimage=new ImageIcon("roboimage.jpg");

    this.setSize(800,700);
    this.getContentPane().setBackground(new Color(12, 7, 41));
    this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    //this.setIconImage(imageIcon.getImage());
    this.setLayout(new BorderLayout(5,5));
    this.setIconImage(chatbotimage.getImage());
    this.setVisible(true);
    this.setTitle("WanderWise(WayBot)");

    //panel creation
    JPanel panel1=new JPanel();
    panel1.setPreferredSize(new Dimension(500,52));
    panel1.setLayout(new BorderLayout());
    JLabel label=new JLabel();
    label.setLayout(new BorderLayout());
    //label.setText("..WELCOME USER..");
    label.setIcon(imageIcon);



    panel1.add(label);
    panel1.setBackground(new Color(12, 7, 41));
    // panel1.setBorder(BorderFactory.createRaisedSoftBevelBorder());

    JPanel panel2=new JPanel();
    panel2.setPreferredSize(new Dimension(500,50));
    panel2.setLayout(new BorderLayout());
    //panel2.setBackground(Color.DARK_GRAY);
    JLabel label2=new JLabel();
    label2.setLayout(new BorderLayout());
    label2.setIcon(imageIcon);
    panel2.add(label2);
    panel2.setBackground(new Color(12, 7, 41));

    JPanel panel3=new JPanel();
    panel3.setPreferredSize(new Dimension(50,500));
    panel3.setLayout(new BorderLayout());
    //panel3.setBackground(Color.CYAN);
    JLabel label3=new JLabel();
    label3.setLayout(new BorderLayout());
    label3.setIcon(imageIcon);
    panel3.add(label3);
    panel3.setBackground(new Color(12, 7, 41));

    JPanel panel4=new JPanel();
    panel4.setPreferredSize(new Dimension(50,500));
    panel4.setLayout(new BorderLayout());
    // panel4.setBackground(Color.GRAY);
    JLabel label4=new JLabel();
    label4.setLayout(new BorderLayout());
    label4.setIcon(imageIcon);
    panel4.add(label4);
    panel4.setBackground(new Color(12, 7, 41));

    JPanel panel5=new JPanel();
    panel5.setPreferredSize(new Dimension(300,300));
    // panel5.setSize(300,300);
    panel5.setLayout(new BorderLayout());
    panel5.setBackground(Color.WHITE);
    JLabel label5=new JLabel();
    label5.setLayout(new BorderLayout());
    label5.setIcon(imageIcon);
    panel5.add(label5);
    panel5.setBackground(new Color(12, 7, 41));

    JPanel samplepanel=new JPanel();
    samplepanel.setSize(750,350);
    samplepanel.setLayout(null);
    samplepanel.setBackground(Color.black);
    panel5.add(samplepanel);
    //text area and text field
    TextArea textArea=new TextArea();
    samplepanel.add(textArea);
    //textArea.se

    textArea.setFont(new Font("Arial",Font.BOLD,15));
    textArea.setForeground(Color.black);
    textArea.setBounds(0,0,675,550);
    //textArea.setPreferredSize(new Dimension(250,200));
    //textArea.setBackground(new Color(83, 108, 166));
    textArea.setBackground(Color.lightGray);
    this.add(panel1,BorderLayout.NORTH);
    this.add(panel2,BorderLayout.SOUTH);
    this.add(panel3,BorderLayout.WEST);
    this.add(panel4,BorderLayout.EAST);
    this.add(panel5,BorderLayout.CENTER);
    this.setResizable(false);
    //this.dispose();
    textArea.append("WayBot: THE ANSWERS TO THE RELATED QUESTIONS ARE DISPLAYED OVER HERE"+"\n");
textArea.append("\nWayBot: "+result);
//this.dispose();

    }

}




