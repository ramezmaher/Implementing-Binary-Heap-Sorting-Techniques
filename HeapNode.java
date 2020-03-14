package eg.edu.alexu.csd.filestructure.sort;

public class HeapNode<T extends Comparable<T>> implements INode<T> {

	private T data;
	private INode<T> leftChild;
	private INode<T> rightChild;
	private INode<T> parent;

	public HeapNode(T value, INode<T> Parent) {
		this.data = value;
		this.parent = Parent;
		this.leftChild = null;
		this.rightChild = null;
	}

	public INode<T> getLeftChild() {
		return this.leftChild;
	}

	public INode<T> getRightChild() {
		return this.rightChild;
	}

	public INode<T> getParent() {
		return this.parent;
	}

	public T getValue() {
		return data;
	}

	public void setValue(T value) {
		this.data = value;
	}

	public void setRchild(INode<T> node) {
		this.rightChild = node;
	}

	public void setLchild(INode<T> node) {
		this.leftChild = node;
	}
}
