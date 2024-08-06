////}
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Scanner;
//import javax.swing.border.AbstractBorder;
//
//class CustomBorder extends AbstractBorder {
//    private int borderWidth;
//
//    public CustomBorder(int borderWidth) {
//        frame.borderWidth = borderWidth;
//    }
//
//    @Override
//    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
//        Graphics2D g2d = (Graphics2D) g.create();
//        g2d.setColor(Color.WHITE); // Set the border color
//        g2d.setStroke(new BasicStroke(borderWidth));
//        g2d.drawRect(x, y, width - 1, height - 1); // Adjust for border width
//        g2d.dispose();
//    }
//
//    @Override
//    public Insets getBorderInsets(Component c) {
//        return new Insets(borderWidth, borderWidth, borderWidth, borderWidth);
//    }
//
//    @Override
//    public Insets getBorderInsets(Component c, Insets insets) {
//        insets.top = insets.bottom = insets.left = insets.right = borderWidth;
//        return insets;
//    }
//}
//
//class RelatedQuestionsGUI extends JFrame implements ActionListener {
//    //    static HashMap<String, String> dict = new HashMap<>();
////    static Scanner scr = new Scanner(System.in);
//    //  static  List<String> relatedques=new ArrayList<String>();
//   static JFrame frame;
//    static JPanel panel;
//    static JButton submitbutton;
//    static JCheckBox checkBox1;
//    //checkBox1.setSize(20,20);
//     JCheckBox checkBox2;
//
//
//     JCheckBox checkBox3;
//
//
//     JCheckBox checkBox4;
//
//
//      JCheckBox checkBox5;
//
//
//     JCheckBox checkBox6;
//
//
//     JCheckBox checkBox7;
//
//
//    JCheckBox checkBox8;
//
//    JCheckBox checkBox9;
//    int maxCheckboxes = 9;
//
//    List<String> checkboxstrings = null;
//    List<JCheckBox> checkboxes=null;
//   public static String RelatedQuestionsGUII(String userinput, String relatedques) {
//        ImageIcon image = new ImageIcon("botimage.png");
//        frame.setSize(700, 700);
//        frame.setVisible(true);
//        // frame.getContentPane().setBackground(new Color(12, 7, 41));
//        frame.getContentPane().setBackground(Color.gray);
//        frame.setLayout(null);
//        frame.setTitle(" RELATED QUESTIONS");
//        frame.setIconImage(image.getImage());
//
//
//        // Panel creation
//        panel = new JPanel();
//        panel.setLayout(new GridLayout());
//        panel.setBounds(65, 65, 550, 550);
//        panel.setBackground(new Color(114, 125, 112));
//        panel.setLayout(new GridLayout(10, 1));
//        // Create a custom border with a specific size (e.g., 5 pixels)
//        int borderSize = 10;
//        panel.setBorder(new CustomBorder(borderSize));
//
//        //implemenrtaion of content of check box
////        List<String> checkboxstrings=null;
////       List<String> relatedquesgui = Virtubotimplementation.relatedquestions(userinput);
////       if (!relatedques.isEmpty()) {
////           System.out.println("Some Related Questions are:");
////            checkboxstrings=new ArrayList<String>();
////            checkboxstrings=relatedquesgui;
////          // checkBox1.setText(relatedquesgui.toString());
////       }
////      //  System.out.println(checkboxstrings);
////        //creting the checkboxes
////        checkBox1 = new JCheckBox();
//////checkBox1.setSize(20,20);
////        //checkBox1.setText(checkbox1temp);
////        checkBox2 = new JCheckBox();
////        //checkBox2.setText(checkbox2temp);
////
////        checkBox3 = new JCheckBox();
////        //checkBox3.setText(checkbox3temp);
////
////        checkBox4 = new JCheckBox();
////      //  checkBox4.setText(checkbox4temp);
////
////        checkBox5 = new JCheckBox();
////       checkBox5.setText("what is your name");
////
////        checkBox6 = new JCheckBox();
////       // checkBox6.setText(checkbox6temp);
////
////        checkBox7 = new JCheckBox();
////       // checkBox6.setText(checkbox7temp);
////
////        checkBox8 = new JCheckBox();
////        //checkBox8.setText(checkbox8temp);
////
////        checkBox9 = new JCheckBox();
////        //checkBox9.setText(checkbox9temp);
////
////
////        String checkbox1temp="";
////        String checkbox2temp="";
////        String checkbox3temp="";
////        String checkbox4temp="";
////        String checkbox5temp="";
////        String checkbox6temp="";
////        String checkbox7temp="";
////        String checkbox8temp="";
////        String checkbox9temp="";
////        //String checkbox1temp="";
////        for (String text:checkboxstrings)
////        {
////            if (checkbox1temp.equalsIgnoreCase("")) {
////                checkbox1temp = text;
////                System.out.println(checkbox1temp);
////                checkBox1.setText(checkbox1temp);
////                continue;
////            }
////           else if (!checkbox1temp.equalsIgnoreCase(""))
////            {
////                checkbox2temp=text;
////                System.out.println(checkbox2temp);
////                checkBox2.setText(checkbox2temp);
////                continue;
////            } else if (!checkbox2temp.equalsIgnoreCase("")) {
////                checkbox3temp=text;
////                System.out.println(checkbox3temp);
////                checkBox3.setText(checkbox3temp);
////                continue;
////            }
////            else if (!checkbox3temp.equalsIgnoreCase("")) {
////                checkbox4temp=text;
////                System.out.println(checkbox4temp);
////                checkBox4.setText(checkbox4temp);
////                continue;
////            }
////            else if (!checkbox4temp.equalsIgnoreCase("")) {
////                checkbox5temp=text;
////                System.out.println(checkbox5temp);
////                //checkBox5.setText(checkbox5temp);
////                continue;
////            }
////            else if (!checkbox5temp.equalsIgnoreCase("")) {
////                checkbox6temp=text;
////                System.out.println(checkbox6temp);
////                checkBox6.setText(checkbox6temp);
////                continue;
////            }
////            else if (!checkbox6temp.equalsIgnoreCase("")) {
////                checkbox7temp=text;
////                System.out.println(checkbox7temp);
////                checkBox7.setText(checkbox7temp);
////                continue;
////            }
////            else if (!checkbox7temp.equalsIgnoreCase("")) {
////                checkbox8temp=text;
////                System.out.println(checkbox8temp);
////                checkBox8.setText(checkbox8temp);
////                continue;
////            }
////            else  {
////                checkbox9temp=text;
////                System.out.println(checkBox9);
////                checkBox9.setText(checkbox9temp);
////                break;
////            }
////
////}
////
////
//////    if ()
//////    {
//////        checkbox2temp=text;
//////    }
//////    if (!checkbox1temp.equalsIgnoreCase(""))
//////    {
//////        checkbox2temp=text;
//////    }
//////}
////        // JCheckBox checkBox10=new JCheckBox();
//////submit buttton
////        submitbutton = new JButton("submit");
////        submitbutton.setFocusable(false);
////        submitbutton.setFont(new Font("Arial", Font.BOLD, 20));
////
////
////        //addong the chech boxes to the panel
////        panel.add(checkBox1);
////        panel.add(checkBox2);
////        panel.add(checkBox3);
////        panel.add(checkBox4);
////        panel.add(checkBox5);
////        panel.add(checkBox5);
////        panel.add(checkBox6);
////        panel.add(checkBox7);
////        panel.add(checkBox7);
////        panel.add(checkBox8);
////        panel.add(checkBox9);
////        panel.add(submitbutton);
//        //panel.add(checkBox10);
//
//
//        //implemenrtaion of content of check box
//
//        //List<String> checkboxstrings = null;
//        List<String> relatedquesgui = Virtubotimplementation.relatedquestions(userinput);
//
//        if (!relatedquesgui.isEmpty()) {
//            System.out.println("Some Related Questions are:");
//            checkboxstrings = new ArrayList<>(relatedquesgui);
//        }
//
//// Define the maximum number of checkboxes you want to display
////        int maxCheckboxes = 9;
////        List<JCheckBox> checkboxes = new ArrayList<>();
//        maxCheckboxes=9;
//        checkboxes=new ArrayList<>();
//
//// Create and set the text for each checkbox
//        for (int i = 0; i < Math.min(maxCheckboxes, checkboxstrings.size()); i++) {
//            JCheckBox checkBox = new JCheckBox(checkboxstrings.get(i));
//            checkboxes.add(checkBox);
//        }
//
//// Add checkboxes to the panel
//        for (JCheckBox checkBox : checkboxes) {
//            panel.add(checkBox);
//        }
//
//// Add a submit submitbutton to the panel
//        submitbutton = new JButton("Submit");
//        submitbutton.setFocusable(false);
//        submitbutton.setFont(new Font("Arial", Font.BOLD, 20));
//        panel.add(submitbutton);
//
//        submitbutton.addActionListener(frame);
//        frame.add(panel);
//
//
//
//
////        for (int i = 0; i < Math.min(maxCheckboxes, checkboxstrings.size()); i++) {
////            JCheckBox checkBox = new JCheckBox(checkboxstrings.get(i));
////            checkboxes.add(checkBox);
////
////            // Assign the checkboxes to class members
////            switch (i) {
////                case 0:
////                    checkBox1 = checkBox;
////                    break;
////                case 1:
////                    checkBox2 = checkBox;
////                    break;
////                case 2:
////                    checkBox3 = checkBox;
////                    break;
////                case 3:
////                    checkBox4 = checkBox;
////                    break;
////                case 4:
////                    checkBox5 = checkBox;
////                    break;
////                case 5:
////                    checkBox6 = checkBox;
////                    break;
////                case 6:
////                    checkBox7 = checkBox;
////                    break;
////                case 7:
////                    checkBox8 = checkBox;
////                    break;
////                case 8:
////                    checkBox9 = checkBox;
////                    break;
////            }
////        }
////
//    }
//
//    static String userinput = "";
//
//    @Override
//    public  void actionPerformed(ActionEvent e) {
//
//        if (e.getSource() == submitbutton) {
////            if (checkBox1.isSelected()) {
////                userinput = checkBox1.getText();
////
////            } else if (checkBox2.isSelected()) {
////                userinput = checkBox2.getText();
////
////            } else if (checkBox3.isSelected()) {
////                userinput = checkBox3.getText();
////
////            } else if (checkBox4.isSelected()) {
////
////                userinput = checkBox4.getText();
////            } else if (checkBox5.isSelected()) {
////
////                userinput = checkBox5.getText();
////            } else if (checkBox6.isSelected()) {
////                userinput = checkBox6.getText();
////
////            } else if (checkBox7.isSelected()) {
////                userinput = checkBox7.getText();
////
////            } else if (checkBox8.isSelected()) {
////                userinput = checkBox8.getText();
////
////            } else {
////                userinput = checkBox9.getText();
//
//            //}
//            for (int i = 0; i < Math.min(maxCheckboxes, checkboxstrings.size()); i++) {
//if (checkboxes.get(i).isSelected())
//{
//                   userinput = checkboxes.get(i).getText();
//
//}
//            }
//            submitbutton.setEnabled(false);
//            }
//        Virtubotimplementation.response(userinput);
//        //System.out.println("gui class"+userinput);
//        //frame.geruserinput(userinput);
//    }
//
////      static String getuserinput() {
////         // System.out.println(userinput);
////        //String response=Virtubotimplementation.response(userinput);
////         // System.out.println(response);
////
////          return userinput;
////    }
//}