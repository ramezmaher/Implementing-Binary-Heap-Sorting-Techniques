package eg.edu.alexu.csd.filestructure.sort;

public class HeapNode<T extends Comparable<T>> implements INode<T> {
	
	private T data;
	private HeapNode<T> rightChild;
	private HeapNode<T> leftChild;
	private HeapNode<T> parent;
	
	public HeapNode(T value,HeapNode<T> Parent) {
		this.data = value;
		this.leftChild = null ;
		this.rightChild = null ;
		this.parent = Parent;
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
}
