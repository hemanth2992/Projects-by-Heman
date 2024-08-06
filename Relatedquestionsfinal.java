import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.AbstractBorder;

class CustomBorder extends AbstractBorder {
    private int borderWidth;

    public CustomBorder(int borderWidth) {
        this.borderWidth = borderWidth;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(Color.WHITE); // Set the border color
        g2d.setStroke(new BasicStroke(borderWidth));
        g2d.drawRect(x, y, width - 1, height - 1); // Adjust for border width
        g2d.dispose();
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(borderWidth, borderWidth, borderWidth, borderWidth);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.top = insets.bottom = insets.left = insets.right = borderWidth;
        return insets;
    }
}

class Relatedquestionsfinal extends JFrame  {
    private String userinput;
    public JFrame frame;
    private JPanel panel;
     private JPanel panelfinal;
    private JButton submitButton;
    private List<JCheckBox> checkBoxes;
    private int maxCheckboxes = 9;
    public  void RelatedQuestionsGUI(String result) {
        ImageIcon imageIcon=new ImageIcon("roboimage.jpg");
        //
        ImageIcon imageIcon1=new ImageIcon("roboimage.png");
        //title image
        ImageIcon chatbotimage=new ImageIcon("ww.png");

        frame.setSize(800,700);
        frame.getContentPane().setBackground(new Color(12, 7, 41));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setIconImage(imageIcon.getImage());
        frame.setLayout(new BorderLayout(5,5));
      //  frame.getContentPane().setBackground(new Color(223,23,123));
        frame.setIconImage(chatbotimage.getImage());
        frame.setVisible(true);
        frame.setTitle("Do You Mean?");

        //panel creation
        JPanel panel1=new JPanel();
        panel1.setPreferredSize(new Dimension(500,52));
        panel1.setLayout(new BorderLayout());
        JLabel label=new JLabel();
        label.setBackground(Color.CYAN);
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
        samplepanel.setBackground(Color.pink);
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
        textArea.setBackground(new Color(230, 230, 250));
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.SOUTH);
        frame.add(panel3,BorderLayout.WEST);
        frame.add(panel4,BorderLayout.EAST);
        frame.add(panel5,BorderLayout.CENTER);
        frame.setResizable(false);
        //frame.dispose();
        textArea.append("MINING BOT: THE ANSWERS TO THE RELATED QUESTIONS ARE DISPLAYED OVER HERE"+"\n");
        textArea.append("\nMINING BOT: "+result);

    }
    public  void RelatedQuestionsGUI(String userinput, List<String> relatedques) {
        ImageIcon relatedquesimage=new ImageIcon("roboimage.jpg");
        frame = new JFrame();
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(230, 230, 250));
        frame.setLayout(null);
        frame.setIconImage(relatedquesimage.getImage());
        frame.setTitle("RELATED QUESTIONS");

        // Panel creation
        panel = new JPanel();
        panel.setLayout(new GridLayout());
        panel.setBounds(65, 65, 550, 550);
        panel.setBackground(new Color(230, 230, 250));
        panel.setLayout(new GridLayout(10, 1));

        //adding four labels
        JPanel panel1=new JPanel();
        panel1.setBounds(0,0,60,700);
       // panel1.setPreferredSize(new Dimension(500,52));
        panel1.setLayout(new BorderLayout());
        JLabel label=new JLabel();
        label.setLayout(new BorderLayout());
        //label.setText("..WELCOME USER..");
        label.setIcon(relatedquesimage);
        panel1.add(label);
        panel1.setBackground(new Color(12, 7, 41));
        // panel1.setBorder(BorderFactory.createRaisedSoftBevelBorder());

        JPanel panel2=new JPanel();
        //panel2.setPreferredSize(new Dimension(500,50));
        panel2.setBounds(0,0,700,60);
        panel2.setLayout(new BorderLayout());
        //panel2.setBackground(Color.DARK_GRAY);
        JLabel label2=new JLabel();
        label2.setLayout(new BorderLayout());
        label2.setIcon(relatedquesimage);
        panel2.add(label2);
        panel2.setBackground(new Color(12, 7, 41));

        JPanel panel3=new JPanel();
        //panel3.setPreferredSize(new Dimension(50,500));
        panel3.setBounds(0,620,700,70);
        panel3.setLayout(new BorderLayout());
        //panel3.setBackground(Color.CYAN);
        JLabel label3=new JLabel();
        label3.setLayout(new BorderLayout());
        label3.setIcon(relatedquesimage);
        panel3.add(label3);
        panel3.setBackground(new Color(12, 7, 41));

        JPanel panel4=new JPanel();
       // panel4.setPreferredSize(new Dimension(50,500));
        panel4.setBounds(620,0,70,700);
        panel4.setLayout(new BorderLayout());
        // panel4.setBackground(Color.GRAY);
        JLabel label4=new JLabel();
        label4.setLayout(new BorderLayout());
        label4.setIcon(relatedquesimage);
        panel4.add(label4);
        panel4.setBackground(new Color(12, 7, 41));


        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
//        JPanel panel5=new JPanel();
//        panel5.setPreferredSize(new Dimension(300,300));
//        // panel5.setSize(300,300);
//        panel5.setLayout(new BorderLayout());
//        panel5.setBackground(Color.WHITE);
//        JLabel label5=new JLabel();
//        label5.setLayout(new BorderLayout());
//        label5.setIcon(imageIcon);
//        panel5.add(label5);
//        panel5.setBackground(new Color(12, 7, 41));
//
//        JPanel samplepanel=new JPanel();
//        samplepanel.setSize(750,300);
//        samplepanel.setLayout(null);
//        samplepanel.setBackground(Color.black);
//        panel5.add(samplepanel);


        // Create a custom border with a specific size (e.g., 10 pixels)
        int borderSize = 10;
        panel.setBorder(new CustomBorder(borderSize));

        // Implementation of content of checkboxes
        checkBoxes = new ArrayList<>();

        if (!relatedques.isEmpty()) {
            System.out.println("Some Related Questions are:");
            for (int i = 0; i < Math.min(maxCheckboxes, relatedques.size()); i++) {
                JCheckBox checkBox = new JCheckBox(relatedques.get(i));
                checkBoxes.add(checkBox);
            }
        }

        // Add checkboxes to the panel
        for (JCheckBox checkBox : checkBoxes) {
            panel.add(checkBox);
        }

        // Add a submit button to the panel
        //userinput="";
        submitButton = new JButton("Submit");
        submitButton.setFocusable(false);
        submitButton.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(panel);
//        for (JCheckBox checkBox : checkBoxes) {
//                        if (checkBox.isSelected()) {
//                            userinput=checkBox.getText();
//                            break;
//                        }
//                    }
       // return userinput;
        panel.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == submitButton) {
                     //selecteduserInput = "";
                    String selecteduserinput="";
                    for (JCheckBox checkBox : checkBoxes) {
                        if (checkBox.isSelected()) {
                            selecteduserinput=checkBox.getText();
                            break;
                        }
                    }
                    submitButton.setEnabled(false);
                   // System.out.println(selecteduserinput);
                    String username="";
                    String result=Virtubotimplementation.response3(selecteduserinput);
                    frame.dispose();
                    new Gui(username,result);
                   // frame.dispose();
                    //frame.dispose();
//                    try {
//                        wait(10000);
//                        {
//                            RelatedQuestionsGUI(result);
                        //}
//                    }catch (InterruptedException e3)
//                    {
//                        System.out.println(e3);
//                    }

                    
//frame.dispose();
//                    try {
//                        wait(10000);
//                        {
//                            frame.dispose();
//                        }
//                    }catch (Exception e)
//                    {
//                        System.out.println(e);
//                    }
//                    panelfinal = new JPanel();
//                    panelfinal.setLayout(new GridLayout());
//                    panelfinal.setBounds(65, 65, 550, 550);
//                    panelfinal.setBackground(new Color(114, 125, 112));
//                    panelfinal.setLayout(new GridLayout(10, 1));
//
//                    TextArea textArea=new TextArea();
//
//                    textArea.setBounds(65, 65, 550, 550);
//                    panel.setBounds(1000,1000,23,23);
//                   // panel.dis
//                    textArea.setBackground(new Color(114, 125, 112));
//                    textArea.append("MINING BOT:THE ANSWER TO RELATED QUESTION IS:");
//                    textArea.append("MINING BOT: "+result);
//                    panelfinal.add(textArea);

                    //panel.
                    //frame.dispose();
                    //Gui relatedquestionanswer=new Gui(username,result);
                   // relatedquestionanswer.

//                    System.out.println("-----------------------------------------------------");
//                    System.out.println(result);
//                    System.out.println("-----------------------------------------------------");

                    //System.out.println("relaetedquestions"+selecteduserinput);
                   // Virtubotimplementation.response3(selecteduserinput);
                    //Virtubotimplementation.chat(userinput);
                    // Virtubotimplementation.saveuserinput(userinput);
                    // Virtubotimplementation.response(userinput);
                    //response=

                }
            }});
        //System.out.println();

        //frame.userinput=userinput;
       // return userinput;

    }

        //@Override

}

//public class Virtubotimplementation {
//    public static List<String> relatedquestions(String userinput) {
//        // Implement the related questions logic here and return a list of related questions.
//        // For frame example, let's assume a static list of related questions.
//        List<String> relatedQuestions = new ArrayList<>();
//        relatedQuestions.add("What is your name?");
//        relatedQuestions.add("How are you?");
//        relatedQuestions.add("Where are you from?");
//        return relatedQuestions;
//    }
//
//    public static void response(String userinput) {
//        // Implement the response logic based on the user input.
//        // For frame example, let's just print the user input.
//        System.out.println("User input: " + userinput);
//    }
//
//    public static void main(String[] args) {
//        String userinput = "Sample User Input"; // Replace with your actual user input
//        List<String> relatedQuestions = relatedquestions(userinput);
//        RelatedQuestionsGUI gui = new RelatedQuestionsGUI(userinput, relatedQuestions);
