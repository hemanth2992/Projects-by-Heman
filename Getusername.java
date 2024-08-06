import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Scanner;
//import javax.swing.*;
//import java.awt.*;
//
class Getusername
{
    public static String getusernamemethod()
    {
        String username="";
        int confimation=1;
        if (confimation==1)
        //System.out.println(username);
        {
            while(confimation==1)
            {
                username= JOptionPane.showInputDialog("PLEASE ENTER THE NAME OF THE USER");
                String title="";
                confimation=JOptionPane.showConfirmDialog(null,"Please confirm username: "+username,"USER NAME CONFIRAMATION",JOptionPane.YES_NO_OPTION);
                //System.out.println(confimation);
                if (confimation==0)
                    break;
                while (confimation==-1)
                {
                    JOptionPane.showMessageDialog(null,"PLEASE CONFIRM TO PROCEED FURTHER");
                   // continue;
//                    while(confimation==-1) {
                        confimation = JOptionPane.showConfirmDialog(null, "Please confirm username: " + username, "USER NAME CONFIRAMATION", JOptionPane.YES_NO_OPTION);
//                    }
                }
            }
        }
        return username;
    }
}


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces

//class Samplesam
//{
//    public static String Samplesammethod()
//    {
//        String username="";
//        int confimation=1;
//        if (confimation==1)
//        //System.out.println(username);
//        {
//            while(confimation==1)
//            {
//                username=JOptionPane.showInputDialog("PLEASE ENTER THE NAME OF THE USER");
//                String title="";
//                confimation=JOptionPane.showConfirmDialog(null,"PLEASE CONFIRM:IS YOUR NAME:"+username+":","USER NAME CONFIRAMATION", JOptionPane.INFORMATION_MESSAGE);
//                System.out.println(confimation);
//                if (confimation==0)
//                    break;
//            }
//        }
//        return username;
//    }
//}