import javax.swing.*;
import java.awt.*;

public class TwoCoinsGUI {
    public static void main(String[] args) {
        JMyFrame mainDisplay = new JMyFrame();
        Coin coinOne = new Coin(), coinTwo = new Coin();

        JPanel coinPanel = new JPanel();
        JLabel coinOneLabel = new JLabel(coinOne.toString()), coinTwoLabel =new JLabel(coinTwo.toString());
        coinPanel.add(coinOneLabel);
        coinPanel.add(coinTwoLabel);

        JPanel buttonPanel = new JPanel();
        JButton coinFlip = new JButton("Flip Coins");
        coinFlip.addActionListener(e -> {
            coinOne.flip();
            coinTwo.flip();
            coinOneLabel.setText(coinOne.toString());
            coinTwoLabel.setText(coinTwo.toString());
        });
        buttonPanel.add(coinFlip);

        // adds panels to mainDisplay
        mainDisplay.getContentPane().add(BorderLayout.CENTER, coinPanel);
        mainDisplay.getContentPane().add(BorderLayout.SOUTH, buttonPanel);

        // sets frame to be visible
        mainDisplay.setVisible(true);
    }
}
