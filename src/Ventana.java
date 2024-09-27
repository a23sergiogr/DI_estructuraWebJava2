import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Ventana extends JFrame {
    public Ventana() {
        super("Estructura Web Básica 2");
        new FlowLayout();


        /**********************/
        /********Colors********/
        /**********************/

        Color blue = new Color(122,188,222);
        Color red = new Color(203,91,94);


        /**********************/
        /********Border********/
        /**********************/

        Border whiteBorderMargin = BorderFactory.createLineBorder(Color.WHITE, 3);
        Border redBorderMargin = BorderFactory.createLineBorder(red, 6);


        /***********************/
        /********JPanels********/
        /***********************/

        //Layout
        GridBagLayout gblBody = new GridBagLayout();
        GridBagLayout gblMain = new GridBagLayout();
        GridBagLayout gblSection = new GridBagLayout();

        //Constraints
        GridBagConstraints gbc = new GridBagConstraints();


        //Body
        JPanel body = new JPanel(gblBody);
        body.setOpaque(true);
        body.setBackground(Color.WHITE);
        body.setBorder(whiteBorderMargin);

        //Main JPanels
        JPanel headerJpanel = new JPanel(new GridBagLayout());
        headerJpanel.setOpaque(true);
        headerJpanel.setBackground(red);
        headerJpanel.setBorder(whiteBorderMargin);

        JPanel mainJpanel = new JPanel(gblMain);
        mainJpanel.setOpaque(true);
        mainJpanel.setBackground(red);
        mainJpanel.setBorder(whiteBorderMargin);

        JPanel footerJpanel = new JPanel(new GridBagLayout());
        footerJpanel.setOpaque(true);
        footerJpanel.setBackground(red);
        footerJpanel.setBorder(whiteBorderMargin);

        //Center JPanels
        JPanel navJPanel = new JPanel(new GridBagLayout());
        navJPanel.setOpaque(true);
        navJPanel.setBackground(red);
        navJPanel.setBorder(whiteBorderMargin);

        JPanel sectionJPanel = new JPanel(gblSection);
        sectionJPanel.setOpaque(true);
        sectionJPanel.setBackground(red);
        sectionJPanel.setBorder(whiteBorderMargin);


        //Artigo JPanels
        JPanel artigoJPanel1 = new JPanel(new GridBagLayout());
        artigoJPanel1.setOpaque(true);
        artigoJPanel1.setBackground(blue);
        artigoJPanel1.setBorder(redBorderMargin);

        JPanel artigoJPanel2 = new JPanel(new GridBagLayout());
        artigoJPanel2.setOpaque(true);
        artigoJPanel2.setBackground(blue);
        artigoJPanel2.setBorder(redBorderMargin);

        JPanel artigoJPanel3 = new JPanel(new GridBagLayout());
        artigoJPanel3.setOpaque(true);
        artigoJPanel3.setBackground(blue);
        artigoJPanel3.setBorder(redBorderMargin);



        /************************/
        /*********JLabels********/
        /************************/


        Font font = new Font("Times New Roman", Font.BOLD, 16);

        JLabel headerText = new JLabel("\ncabeceira\n");
        headerText.setForeground(Color.white);
        headerText.setFont(font);

        JLabel footerText = new JLabel("\npé\n");
        footerText.setForeground(Color.white);
        footerText.setFont(font);

        JLabel navText1 = new JLabel("\nmenú de\n");
        navText1.setForeground(Color.white);
        navText1.setFont(font);
        JLabel navText2 = new JLabel("\nnavegación\n");
        navText2.setForeground(Color.white);
        navText2.setFont(font);

        JLabel artigoText1 = new JLabel("\nartigo\n");
        artigoText1.setForeground(Color.white);
        artigoText1.setFont(font);

        JLabel artigoText2 = new JLabel("\nartigo\n");
        artigoText2.setForeground(Color.white);
        artigoText2.setFont(font);

        JLabel artigoText3 = new JLabel("\nartigo\n");
        artigoText3.setForeground(Color.white);
        artigoText3.setFont(font);



        /*********************/
        /*********ADDs********/
        /*********************/

        headerJpanel.add(headerText);
        footerJpanel.add(footerText);
        navJPanel.add(navText1);
        navJPanel.add(navText2);
        artigoJPanel1.add(artigoText1);
        artigoJPanel2.add(artigoText2);
        artigoJPanel3.add(artigoText3);


        //GridBagConstraints for artigo
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.gridx = 0;
        gbc.weighty = 1;
        gbc.gridy = 0;
        sectionJPanel.add(artigoJPanel1,gbc);

        gbc.weighty = 10;
        gbc.gridy = 2;
        sectionJPanel.add(artigoJPanel2,gbc);

        gbc.weighty = 1;
        gbc.gridy = 11;
        sectionJPanel.add(artigoJPanel3,gbc);


        //GridBagConstraints for main
        gbc.weightx = 1;
        gbc.gridx = 0;
        mainJpanel.add(navJPanel,gbc);

        gbc.weightx = 40;
        gbc.gridx = 1;
        mainJpanel.add(sectionJPanel,gbc);


        //GridBagConstraints for body
        gbc.weighty = 3;
        gbc.gridy = 0;
        body.add(headerJpanel,gbc);

        gbc.weighty = 18;
        gbc.gridy = 3;
        body.add(mainJpanel,gbc);

        gbc.weighty = 1;
        gbc.gridy = 20;
        body.add(footerJpanel,gbc);

        add(body);


        /***********************/
        /*********Window********/
        /***********************/

        this.setSize(480, 470);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
