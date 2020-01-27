import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener {
    Board board;
    boolean spacePress, rightPress,leftPress;
    public Game(){

        setTitle("Space Thing");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        board=new Board(this);
        add(board);
        addKeyListener(this);
        pack();
        board.setup();
        setResizable(false);
    }
    public static void main(String[]args){
        new Game();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_SPACE) {
            spacePress = true;
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            leftPress=true;
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            rightPress=true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_SPACE){
            spacePress=false;
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            leftPress=false;
        }
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            rightPress=false;
        }

    }
    public boolean isSpacePressed(){
        return spacePress;
    }
    public boolean isleftPressed(){
        return leftPress;
    }
    public boolean isrightPressed(){
        return rightPress;
    }
}
