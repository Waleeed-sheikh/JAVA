
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class multithreading extends JFrame {

    private JButton startButton;

    public multithreading() {
        super("Multi-Threaded GUI Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        startButton = new JButton("Start Task");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performTask();
            }
        });

        add(startButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void performTask() {
        startButton.setEnabled(false);

        // Create a new thread to perform the task
        Thread taskThread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Simulate a time-consuming task
                for (int i = 1; i <= 10; i++) {
                    final int progress = i; // Using final to access within the inner class
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            setTitle("Task Progress: " + progress + "/10");
                        }
                    });

                    try {
                        Thread.sleep(1000); // Simulating a time-consuming task
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                // Task completed, enable the button again
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        setTitle("Multi-Threaded GUI Example");
                        startButton.setEnabled(true);
                    }
                });
            }
        });

        // Start the thread
        taskThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new multithreading();
            }
        });
    }
}
