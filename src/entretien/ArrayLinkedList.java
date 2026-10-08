package entretien;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayLinkedList<T> implements List<T> {
	
	private static int DEFAULT_BLOCK_SIZE = 8;
	
	public static class ArrayLinkedListNode<T> {
		
		private T[] content;
		private final int size;
		public ArrayLinkedListNode<T> previous = null;
		public ArrayLinkedListNode<T> next = null; 
		
		@SuppressWarnings("unchecked")
		public ArrayLinkedListNode(int size) {
			this.size = size;
			content = (T[]) new Object[size];
		}
		
		public T get(int i) throws ArrayIndexOutOfBoundsException {
			if (i < 0 || i >= size) {
				throw new ArrayIndexOutOfBoundsException(Integer.toString(i));
			}
			return content[i];
		}
		
		public boolean set(int i, T o) throws ArrayIndexOutOfBoundsException {
			if (i < 0 || i >= size) {
				throw new ArrayIndexOutOfBoundsException(Integer.toString(i));
			}
			
			T previous = content[i];
			if  (previous == null) {
				if (o == null) {
					return false;
				}
			} else if (previous.equals(o)) {
				return false;
			}
			content[i] = o;
			return true;
		}
		
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}
		
	}
	
	private final int blocksize;
	private ArrayLinkedListNode<T> head;
	private ArrayLinkedListNode<T> tail;
	
	public ArrayLinkedList() {
		this(DEFAULT_BLOCK_SIZE);
	}
	
	public ArrayLinkedList(int blocksize) {
		this.blocksize = blocksize;
		ArrayLinkedListNode<T> initialBlock = getNewNode();
		head = initialBlock;
		tail = initialBlock;
	}
	
	// node management
	
	private ArrayLinkedListNode<T> getNewNode() {
		return new ArrayLinkedListNode<T>(blocksize);
	}
	
	private boolean addNodeTail() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean addNodeHead() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean addNode(int pos) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private boolean removeNodeHead() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private boolean removeNodeTail() {
		// TODO Auto-generated method stub
		return false;
	}
	
	private boolean removeNode(int pos) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	// implements List

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(T e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
