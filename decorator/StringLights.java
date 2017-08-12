//20170524
//Flora Tsai

public class StringLights extends TreeDecorator {
	public StringLights(Tree decoratedTree) {
		super(decoratedTree);
	}
	
	public void describe() {
		decoratedTree.describe();
		decorate();
	}
	
	private void decorate() {
		System.out.println("Light up the tree!");
	}
}
