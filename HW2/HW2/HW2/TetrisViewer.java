import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class TetrisViewer {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowTetromino();
			}
		});
	}

	private static void createAndShowTetromino() {
		Random rand = new Random();

		// System.out.println("Created GUI on EDT? " + SwingUtilities.isEventDispatchThread());
		JFrame f = new JFrame("TetrisViewer");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String randomShapeLetter = TetrisShape.shapes[rand.nextInt(TetrisShape.shapes.length)];
		System.out.println(randomShapeLetter);
		TetrisShape randomShape = new TetrisShape(randomShapeLetter);
		Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
		f.add(new TetrisComponent(randomShape, randomColor));
		f.pack();
		f.setVisible(true);
	}

}

class Pair<L, R> {
	private L l;
	private R r;

	public Pair(L l, R r) {
		this.l = l;
		this.r = r;
	}

	public L getL() {
		return l;
	}

	public R getR() {
		return r;
	}

	public void setL(L l) {
		this.l = l;
	}

	public void setR(R r) {
		this.r = r;
	}
}

class TetrisShape {

	public ArrayList<Pair<Integer, Integer>> shape;
	public static final String shapes[] = { "I", "J", "O", "L", "T", "S", "Z" };

	public TetrisShape(String shape) {
		this.shape = new ArrayList<>();
		if (shape.equalsIgnoreCase("I")) {
			this.shape.add(new Pair<>(0, 0));
			this.shape.add(new Pair<>(1, 0));
			this.shape.add(new Pair<>(2, 0));
			this.shape.add(new Pair<>(3, 0));
		} else if (shape.equalsIgnoreCase("J")) {
			this.shape.add(new Pair<>(0, 0));
			this.shape.add(new Pair<>(1, 0));
			this.shape.add(new Pair<>(2, 0));
			this.shape.add(new Pair<>(2, 1));
		} else if (shape.equalsIgnoreCase("O")) {
			this.shape.add(new Pair<>(0, 0));
			this.shape.add(new Pair<>(0, 1));
			this.shape.add(new Pair<>(1, 0));
			this.shape.add(new Pair<>(1, 1));
		} else if (shape.equalsIgnoreCase("L")) {
			this.shape.add(new Pair<>(0, 0));
			this.shape.add(new Pair<>(1, 0));
			this.shape.add(new Pair<>(2, 0));
			this.shape.add(new Pair<>(0, 1));
		} else if (shape.equalsIgnoreCase("T")) {
			this.shape.add(new Pair<>(0, 0));
			this.shape.add(new Pair<>(1, 0));
			this.shape.add(new Pair<>(2, 0));
			this.shape.add(new Pair<>(1, 1));
		} else if (shape.equalsIgnoreCase("S")) {
			this.shape.add(new Pair<>(1, 0));
			this.shape.add(new Pair<>(2, 0));
			this.shape.add(new Pair<>(0, 1));
			this.shape.add(new Pair<>(1, 1));
		} else if (shape.equalsIgnoreCase("Z")) {
			this.shape.add(new Pair<>(0, 0));
			this.shape.add(new Pair<>(1, 0));
			this.shape.add(new Pair<>(1, 1));
			this.shape.add(new Pair<>(2, 1));
		}
	}

}

class TetrisComponent extends JPanel {

	private static final long serialVersionUID = -2296521903745645510L;
	private final int maxX = 1000;
	private final int maxY = 500;
	private int squareX;
	private int squareY;
	private int squareW = 50;
	private int squareH = 50;
	private TetrisShape shape;
	private Color color;

	public TetrisComponent(TetrisShape shape, Color color) {
		Random rand = new Random();
		this.shape = shape;
		this.color = color;
		this.squareX = rand.nextInt(this.maxX - (squareW * 4) + 1);
		this.squareY = rand.nextInt(this.maxY - (squareH * 2) + 1);
	}

	public Dimension getPreferredSize() {
		return new Dimension(this.maxX, this.maxY);
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (int i = 0; i < shape.shape.size(); i++) {
			int xOffset = shape.shape.get(i).getL();
			int yOffset = shape.shape.get(i).getR();
			int X = squareX + (xOffset * squareW);
			int Y = squareY + (yOffset * squareH);
			g.setColor(color);
			g.fillRect(X, Y, squareW, squareH);
			g.setColor(Color.black);
			g.drawRect(X, Y, squareW, squareH);
		}
	}
}
