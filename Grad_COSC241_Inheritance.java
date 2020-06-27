/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COSC241_1_1.Inheritance;

/**
 * @author alexander onukwugha jr
 * @date May 21st - June 1st, 2020
 * This is a personal project to practice GUI, Since in college I didn't find time to do them I choose to do them
 * during the time of the Pandemic quarantine period. This code does use code from 4 years ago I have made in college
 * I wanted to make it relate to past code, but offer more feature and I will add a lot more complications as I make 
 * more GUI's
 */
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

 //I do not use the Netbeans GUI class I simply import that class library above
 //Other GUI's I will post later with use the Netbeans GUI class builder just cause it's easier
public class Grad_COSC241_Inheritance implements Runnable {
    //These are objects that are updated as the code is running
    //I initialize a few of them with out perameters of their dimensions and properties
    //Except for Dimension d object because I want it to be a ratio of the size of your computer
    //I also changed created a ByteArrayOutputStream and PrintStream object outside the 
    protected JFrame frame = new JFrame("");
    protected JLabel label1 = new JLabel("FIRST GRAD JFRAME/JSWING CODE EVER");
    protected JPanel panel1 = new JPanel(), panel2 = new JPanel(), panel3 = new JPanel();
    protected JPanel panel4 = new JPanel(), panel4_1 = new JPanel(), panel4_2 = new JPanel(), panel4_3 = new JPanel(), panel = new JPanel();
    protected JButton button1 = new JButton(), button2 = new JButton(), button3 = new JButton(), button4 = new JButton();
    protected Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    protected Rectangle box;
    public boolean s = false;
    public Graphics grph;
    public ByteArrayOutputStream bout = new ByteArrayOutputStream();
    public PrintStream out = new PrintStream(bout);

    public static void main(String[] args) {
        Grad_COSC241_Inheritance AO = new Grad_COSC241_Inheritance();
        // This just allows me to cast static to object and classes that are called in main class if those objects/classes are not static
        System.out.println("\n\n. . .JFRAME has started press buttons to test");//I just wanted this to show on console
        System.setOut(AO.out);//I set the output of System.out.print go through the Printstream [out] objct
        AO.run();//This is the run methd that I am calling below that was abstractly created when 'implementing Runnable' at beginining of class
        //Though you don't need to implement Runnable you could just make that method and call it what ever as long as it's public void
        System.err.println("The resulting Out put is from [TEST or TEST1] Class with a JFRAME comment");
        //I like that System.err prints in red in my netbeans so I just use that to print text I want to see
    }

    public void run() {
        Grad_COSC241_Inheritance AO = new Grad_COSC241_Inheritance();
        //Making this static helps the GUI flicker less while Action Listener is being used
        
        AO.frame.setTitle("GRAD-Inheritance-GUI");
        //Frame tital of panel generated
        AO.frame.setBounds((int) AO.d.width / 4, (int) AO.d.height / 4, (int) AO.d.width / 2, (int) AO.d.height / 3);
        //Sets the dimentions of the frame which is relevent to the ratio of computer screen display ratio
        AO.frame.setResizable(false);
        //Makes the frame dimension unchangable
        AO.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //This makes the program terminate when user press exit button on top left corner
        AO.box = AO.frame.getBounds();
        Rectangle pic = new Rectangle(500, 400);
        /*System.out.println("The Width is: " + AO.box.width + " The Height is: " + AO.box.height
                + " \nPic Width: " + pic.width + " Pic Height: " + pic.height);
         */
        System.out.println("\n");

        AO.panel1.setBounds(10, 90, pic.width, pic.height);
        //This is used as the bounds for the panel that will display the dat from already created programs
        
        AO.panel1.setBackground(Color.white);
        //AO.panel4_3.setBounds(10, 90, pic.width, pic.height);
        
        AO.panel2.setSize(AO.box.width, 70);
        //This sets the size of the Blue Panel that is the tytle of this program
        Font font = new Font("DIN Condensed", Font.BOLD, 57);
        //This sets the font as well as the size and astetics as a object that describes any string out on Jframe
        AO.label1.setLocation(10, 10);
        //This shifts the location of label from center point of panel or what ever parent object it's added to
        AO.label1.setFont(font);
        //This calls all the attributes of the font object and applies it to the text of the label
        AO.panel2.add(AO.label1);
        //assigns label1 as child object reference for panel2 by adding it to panel area
        AO.panel2.setBackground(Color.BLUE);
        //Sets panel are to color described above using color library
        AO.panel3.setSize(AO.box.width - 200, AO.box.height);
        AO.panel3.setBackground(Color.LIGHT_GRAY);
        AO.panel4_1.setBackground(Color.LIGHT_GRAY);
        AO.panel4_1.setBounds(AO.box.width - 195, AO.box.height - 200, 190, 70);
        AO.panel4_2.setBackground(Color.LIGHT_GRAY);
        AO.panel4_2.setBounds(AO.box.width - 195, AO.box.height - 110, 190, 70);
        AO.panel4.setBackground(Color.GRAY);
        AO.panel4.setBounds(AO.box.width - 220, AO.box.height - 350, 220, 300);
        //Everything above before next comment does manual proprerty changing of the GUI components
        //Each number is just to specify where I want those object should be relevent to their parent
        //Component and there size as well as their color
        font = new Font("DIN Condensed", Font.BOLD, 34);
        AO.button1.setText("ACCESS Test ");
        //Createes button with text to deferntiate and font attributes
        AO.button1.setFont(font);
        AO.button2.setText("ACCESS Test1");
        AO.button2.setFont(font);
        AO.panel4_1.add(AO.button1);
        AO.panel4_2.add(AO.button2);
        //Adds thos buttons to the Panels created for astetic purposes
        AO.button1.addActionListener(new ActionListener() {
            boolean b1start = false;
            //Used to make sure GUI does action once if not will re-create gui without terminating program
            public void actionPerformed(ActionEvent e) {
                //This is an actionListner method created to activate 
                //When button is pressed
                if (b1start == false && AO.s != true) {
                    JLabel label2 = new JLabel("Class: Test is being accessed . . .");
                    //Displays in panel of GUI
                    Font font = new Font("DIN Condensed", Font.BOLD, 44);
                    
                    AO.panel1.setFont(font);label2.setFont(font);
                    AO.panel1.add(label2);
                    //Sets size of out put
                    b1start = true;
                    //changes condition so that if button is pressed again Recurtion is used to recreate GUI
                    AO.s = true;
                    //Used as condition later to make sure the other button was not press as well as this one
                    String[] args = null;
                    //Just needs to be there so called Empty class below 
                    testoutput.main(args);
                    //Passing along data from Test main 
                    String str =  bout.toString();
                    //sets the out put of main to be converted from it's low leve bytes form to high level form and then displayed as a string Data type
                    label2 = new JLabel("\n");AO.panel1.add(label2);
                    //This just allows fora space after words so outputs are not clumped together
                    label2.setText("\n" + str);
                    label2.setLocation(0, 100);
                    label2.setFont(font);
                    AO.panel1.add(label2);

                    //System.out.flush();
                } else {
                    bout.reset();
                    //The object that takes in Bytes is emtied
                    System.err.println("JFRAME has restarted press buttons to test");
                    //displays in Netbeens console so you know how many times button occured
                    AO.frame.dispose();
                    //Delegtes frame so that no information is still appended to fram objects are created
                    run();
                    //Re-creates frame of run method
                }
            }
        });
        //Does the same exact thing as button1 accept class Test1 is called and the data from there is used 
        AO.button2.addActionListener(new ActionListener() {
            boolean b1start = false;
            
            public void actionPerformed(ActionEvent e) {
                if (b1start == false && AO.s != true) {
                    JTextArea area = new JTextArea();
                    JLabel label2 = new JLabel("Class: Test1 is being accessed . . .");
                    Font font = new Font("DIN Condensed", Font.BOLD, 44);
                    AO.panel1.setFont(font);
                    AO.panel1.add(label2);label2.setFont(font);
                    b1start = true;
                    AO.s = true;
                    String[] args = null;
                    test1output.main(args);
                    String str =  bout.toString() ;
                    label2 = new JLabel("\n");AO.panel1.add(label2);
                    

                    label2.setText( "\n\n\n\n\n        " + str);
                    label2.setAlignmentY(100);
                    AO.panel1.add(label2);
                    label2.setFont(font);
                    //System.out.flush();
                } else {
                    bout.reset();
                    System.err.println("JFRAME has restarted press buttons to test");
                    AO.frame.dispose();
                    run();
                }
            }
        });
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        AO.panel.setBackground(Color.ORANGE);
        //Sets this panel to orange

        AO.frame.add(AO.panel1);
        AO.frame.add(AO.panel2);
        AO.frame.add(AO.panel3);
        AO.frame.add(AO.panel4_1);
        AO.frame.add(AO.panel4_2);
        AO.frame.add(AO.panel4);
        AO.frame.add(AO.panel);
        //above is adding everhy panel to the frame to be on equal hierchy
        AO.frame.show();
        //Displays frame or atleast makes it visable which there are a couple ways to
        //set frame visable this way is untraditional, but it works
    }

    public class testoutput extends Test {
        //These are empty classes that call the attributes of the class Test
        //Which is called by run method
    }

    public class test1output extends Test1 {
        //These are empty classes that call the attributes of the class Test1
        //Which is called by run method
    }
}
