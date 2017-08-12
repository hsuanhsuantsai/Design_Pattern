//20170524
//Flora Tsai

public class Star extends TreeDecorator {
	public Star(Tree decoratedTree) {
		super(decoratedTree);
	}
	
	public void describe() {
		decoratedTree.describe();
		decorate();
	}
	
	private void decorate() {
		System.out.println("Star shines in the silent holy night.");
	}
}
