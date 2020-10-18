import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

//TETRIS SHAPES
public class Form {

	//Tetris block parts
	Rectangle a;
	Rectangle b;
	Rectangle c;
	Rectangle d;
	Color color;

	private String name;
	public int form = 1; //Number representing the default shape of the block

	//CONSTRUCTORS START
	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.name = name;

		//Setting colours for the blocks
		switch (name) {
		case "j":
			color = Color.SLATEGRAY;
			break;

		case "l":
			color = Color.DARKGOLDENROD;
			break;

		case "o":
			color = Color.INDIANRED;
			break;

		case "s":
			color = Color.FORESTGREEN;
			break;

		case "t":
			color = Color.CADETBLUE;
			break;

		case "z":
			color = Color.HOTPINK;
			break;

		case "i":
			color = Color.SANDYBROWN;
			break;

		}

		//Filling in the colors in the blocks
		this.a.setFill(color);
		this.b.setFill(color);
		this.c.setFill(color);
		this.d.setFill(color);
	}
	//CONSTRUCTORS END

	//Getter
	public String getName() {
		return name;
	}

	//For the rotations of the block. Each rotation represented by 1,2,3,4.
	public void changeForm() {
		if (form != 4) {
			form++;
		}

		else {
			form = 1;
		}
	}
}