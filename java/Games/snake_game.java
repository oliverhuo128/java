import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class SnakeGame extends JFrame {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    private static final int UNIT_SIZE = 20;
    private static final int GAME_UNITS = (WIDTH * HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    private static final int DELAY = 75;

    private final ArrayList<Integer> snakeX;
    private final ArrayList<Integer> snakeY;
    private int snakeLength;
    private int foodX;
    private int foodY;
    private char direction;
    private boolean isRunning;
    private Timer timer;
    private Random random;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addKeyListener(new MyKeyAdapter());

        snakeX = new ArrayList<>();
        snakeY = new ArrayList<>();
        direction = 'R';
        isRunning = false;
        random = new Random();

        startGame();
    }

    private void startGame() {
        snakeLength = 3;
        snakeX.clear();
        snakeY.clear();
        snakeX.add(0);
        snakeY.add(0);
        generateFood();

        timer = new Timer(DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                isRunning = true;
                move();
                checkCollision();
                repaint();
            }
        });
        timer.start();
    }

    private void generateFood() {
        foodX = random.nextInt(WIDTH / UNIT_SIZE) * UNIT_SIZE;
        foodY = random.nextInt(HEIGHT / UNIT_SIZE) * UNIT_SIZE;
    }

    private void move() {
        for (int i = snakeLength - 1; i > 0; i--) {
            snakeX.set(i, snakeX.get(i - 1));
            snakeY.set(i, snakeY.get(i - 1));
        }

        switch (direction) {
            case 'U':
                snakeY.set(0, snakeY.get(0) - UNIT_SIZE);
                break;
            case 'D':
                snakeY.set(0, snakeY.get(0) + UNIT_SIZE);
                break;
            case 'L':
                snakeX.set(0, snakeX.get(0) - UNIT_SIZE);
                break;
            case 'R':
                snakeX.set(0, snakeX.get(0) + UNIT_SIZE);
                break;
        }
    }

    private void checkCollision() {
        // Check collision with food
        if (snakeX.get(0) == foodX && snakeY.get(0) == foodY) {
            snakeLength++;
            generateFood();
        }

        // Check collision with the boundaries
        if (snakeX.get(0) < 0 || snakeX.get(0) >= WIDTH || snakeY.get(0) < 0 || snakeY.get(0) >= HEIGHT) {
            gameOver();
        }

        // Check self-collision
        for (int i = 1; i < snakeLength; i++) {
            if (snakeX.get(i) == snakeX.get(0) && snakeY.get(i) == snakeY.get(0)) {
                gameOver();
            }
        }
    }

    private void gameOver() {
        isRunning = false;
        timer.stop();
        JOptionPane.showMessageDialog(this, "Game Over", "Snake Game", JOptionPane.PLAIN_MESSAGE);
        startGame();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }}
        //