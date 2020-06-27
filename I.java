/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COSC241_1_1.Inheritance;

/**
 *
 * @author alexonukwugha
 */
public interface I {
    public void m();
        
    
}

/*** < Below is the <POSTMORDOM> of my process >***/
/*
So I just madea class gave it the name you see then I looked at abunch of videos
on making GUI's wanted my first one to be simple, simple but made manualy.
It took longer and I don't suggest doing it this way, but the simpler the GUI
the more you learn from it being manual. It's not very scalable when you code it manully\
The way I made it is in the code documentation, but if you want to make it manually
strongly suggest making it with the GUI netbbens first and making your code affter the 
autmaticly genrated code created when you change/edit the GUI design object
Plus people usually use graphics method, but since I was just getting text data
and it was suppose to be very simple I feel it okay not to use that method class.
Almost every GUI uses a graphics method if not using an external component from a module
or imported java module

Lastly I would like to thank my Teacher and Advier,
Mr. Kennedy for making programming fun
This project at times was a pain and doesn't really do much for me as an
aspiring application developer, but I learned a lot so it was worth it personally
My next Git sharing I will talk about the process of sharing your first Git hub post
*/



/******  Graduation GUI convergence Project *******
 
 font = new Font("Helvetic", Font.BOLD,84);
            g.setFont(font);
            g.fill3DRect(50, 200, xx, yyy, true);
                 g.setColor(Color.BLACK);
            g.drawString("A", 85, 311);
            g.setColor(Color.LIGHT_GRAY);
            g.fill3DRect(275, 200, xx, yyy, true);
                 g.setColor(Color.BLACK);
            g.drawString("B", 310, 311);
            g.setColor(Color.LIGHT_GRAY);
            g.fill3DRect(500, 200, xx, yyy, true);
                 g.setColor(Color.BLACK);
            g.drawString("C", 535, 311);
 *****/









/********************** <<GRAD GUI_COSC241:BEGINING OF COMMENT >>**********************>>>>>>>
 * 
 * 
 * 
 * 
    public JPanel panel = new JPanel();
    public JFrame window = new JFrame("GUI Demonstrating Inheritance");
    public Display AD = new Display();
    public Graphics graph;
    public  Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    public int x = (int) d.getWidth() / 3;
    public int y = (int) d.getHeight() / 3;
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    enum Check {
        FINALLY, NEW, LATER, STARTING, ENDING

    }
    private int height;
    private int width;
    public String lbl;

    public class Example extends Test {

    }

    public class Example2 extends Test1 {

    }

    public class Display extends JPanel implements Runnable{

        public Display() {

            setLayout(null);

        }

        public JButton Buttonmaker() {
            JButton btn = new JButton("A");
            btn.doClick();
            btn.setSize(100, 100);
            return btn;
        }

        public void paintComponent(Graphics g) {

           
            Font font = new Font("Helvetic", Font.BOLD, 24);

            
            int yy = y / 4;
            int xx = x / 3;
            int yyy = y / 2;
            setBackground(Color.BLUE);
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(10, 10, x, yy);
            g.fill3DRect(10, 10, x, yy, true);
            g.setColor(Color.BLACK);
            g.setFont(font);
            g.drawString(lbl, 40, 50);
            g.setColor(Color.LIGHT_GRAY);
            
            graph = g;
        }

        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    public static void main(String[] args) {
        Check md = Check.STARTING;
        System.out.print(md);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.print(" . ");
        Grad_COSC241_Inheritance AO = new Grad_COSC241_Inheritance();
        System.out.print(" . ");
        System.out.print(" . ");
        AO.window.show();
        System.out.print(" . ");
        System.out.print(" . ");
        AO.lbl = "FIRST GRAD JFRAME CODE EVER";
        System.out.print(" . ");
        System.out.print(" . ");
        System.out.print(" . ");
        System.out.print(" . ");
        AO.panel.add(AO.AD);
        AO.window.add(AO.panel);
        //AO.window.add(panel2);
        System.out.print(" . ");
        System.out.print(" . ");
        AO.window.setBounds((int) d.getWidth() / 4, (int) d.getHeight() / 4, (int) d.getWidth() / 2, (int) d.getHeight() / 2);
        System.out.print(" . ");
        AO.window.setResizable(false);
        System.out.print(" . ");
        //window.setMaximumSize(new Dimension(((int) d.getWidth() / 5) * 4, ((int) d.getHeight() / 5) * 4));
        AO.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.print(" . ");
        //window.setMinimumSize(new Dimension((int) d.getWidth() / 3, (int) d.getHeight() / 3));
        AO.window.show();
        System.out.println(" . ");
        
        //BufferedImage dis = new BufferedImage();
        Check mf = Check.FINALLY;
        System.out.println(mf);
    }

 * 
 * 
 * 
 * 
 * 
 ****************************<< GRAD: END of COMMENTS>>*****************>>>>*/