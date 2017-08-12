//20170524
//Flora Tsai

public abstract class TreeDecorator implements Tree {
	protected Tree decoratedTree;
	
	public TreeDecorator(Tree decoratedTree) {
		this.decoratedTree = decoratedTree;
	}
	
	public abstract void describe();
}
