//20170524
//Flora Tsai

public class Ornaments extends TreeDecorator {
	public Ornaments(Tree decoratedTree) {
		super(decoratedTree);
	}
	
	public void describe() {
		decoratedTree.describe();
		decorate();
	}
	
	private void decorate() {
		System.out.println("Ornaments decorate the Christmas Tree and our life.");
	}
}
