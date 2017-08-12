//20170524
//Flora Tsai

public class Demo {

	public static void main(String[] args) {
		System.out.println("Basic decorator\n");

		System.out.println("Christmas Tree before decorations.");
		Tree christmasTree = new ChristmasTree();
		christmasTree.describe();

		System.out.println("\nDecorated by star.");
		Tree chrstmasTree_star = new Star(christmasTree);
		chrstmasTree_star.describe();

		System.out.println("\nDecorated by String lights.");
		Tree chrstmasTree_lights = new StringLights(christmasTree);
		chrstmasTree_lights.describe();

		System.out.println("\nDecorated by ornaments.");
		Tree christmasTree_ornaments = new Ornaments(christmasTree);
		christmasTree_ornaments.describe();

		System.out.println("=============================");
		System.out.println("Decorate in different order");

		System.out.println("\nStar -> String lights -> Ornaments");
		Tree chrTree1 = new Ornaments(new StringLights(new Star(new ChristmasTree())));
		chrTree1.describe();

		System.out.println("\nString lights -> Ornaments -> Star");
		Tree chrTree2 = new Star(new Ornaments(new StringLights(new ChristmasTree())));
		chrTree2.describe();

	}

}
