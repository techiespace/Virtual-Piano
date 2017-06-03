/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualpiano;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.*;

/**
 *
 * @author dos
 */
public class VirtualPiano extends JFrame implements KeyListener{

    /**
     * @param args the command line arguments
     */
    
    final Image backgroundImage;
    String filePath = new File("").getAbsolutePath();
    VirtualPiano() {
    try {
        backgroundImage = javax.imageio.ImageIO.read(getClass().getClassLoader().getResource("resources/keyBoard.jpg"));
        setContentPane(new JPanel(new BorderLayout()) {
            @Override public void paintComponent(Graphics g) {
                g.drawImage(backgroundImage, 0, 0, null);
            }
        });
    } catch (IOException e) {
        throw new RuntimeException(e);
    }        

        addKeyListener(this);
        setSize(547,191);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //BorderLayout layout = new BorderLayout();
        //setLayout(layout);

    }
    
    
    

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
            
            if(keyCode == KeyEvent.VK_Q){
            InputStream inputStream;
            try {
                System.out.println(filePath);
                inputStream = getClass().getResourceAsStream("/resources/39180__jobro__piano-ff-033.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }    
            }
            if(keyCode == KeyEvent.VK_2){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39181__jobro__piano-ff-034.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_W){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39182__jobro__piano-ff-035.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_3){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39183__jobro__piano-ff-036.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_E){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39184__jobro__piano-ff-037.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            if(keyCode == KeyEvent.VK_4){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39185__jobro__piano-ff-038.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_R){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39186__jobro__piano-ff-039.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_5){        
            }
            if(keyCode == KeyEvent.VK_T){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39187__jobro__piano-ff-040.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_6){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39188__jobro__piano-ff-041.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_Y){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39189__jobro__piano-ff-042.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_7){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39190__jobro__piano-ff-043.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_U){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39191__jobro__piano-ff-044.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_8){
            }
            if(keyCode == KeyEvent.VK_I){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39193__jobro__piano-ff-045.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_9){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39194__jobro__piano-ff-046.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_O){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39195__jobro__piano-ff-047.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_0){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39196__jobro__piano-ff-048.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_P){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39197__jobro__piano-ff-049.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_MINUS){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39198__jobro__piano-ff-050.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_OPEN_BRACKET){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39199__jobro__piano-ff-051.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
            if(keyCode == KeyEvent.VK_EQUALS){
            }
            if(keyCode == KeyEvent.VK_CLOSE_BRACKET){
            InputStream inputStream;
            try {
                inputStream = getClass().getResourceAsStream("/resources/39200__jobro__piano-ff-052.wav");
                AudioStream audioStream = new AudioStream(inputStream);
                AudioPlayer.player.start(audioStream);
            } catch (Exception ex) {
                Logger.getLogger(VirtualPiano.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        VirtualPiano test = new VirtualPiano();
        
    }
    
}
