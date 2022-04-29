package de.unistuttgart.dsass2022.ex00.p3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class SimpleList<T extends Comparable<T>> implements ISimpleListIterable<T> {
	
	private static int currentElementIndexSkippingIterator = 0;
	
	public class Iterator<T extends Comparable<T>>{
		
		public boolean hasNext() {
			return list.size() > list.indexOf();
		}

		public T next() {
			return null;
		
		}
		public void remove() throws UnsupportedOperationException {
			throw new UnsupportedOperationException("Operation not supported");
		}
	}
	/** Do not modify the existing methods and signatures */
	private final List<T> list;
	public SimpleList() {
		list = new ArrayList<T>();
	}

	@Override
	public void append(T element) {
		list.add(element);
	}

	@Override
	public int getSize() {
		return list.size();
	}

	@Override
	public T getElement(int index) {
		return list.get(index);
	}
	@Override
	public Iterator<T> iterator(){
		return null;
	}
	@Override
	public Iterator<T> skippingIterator(int numberSkippedElements){
		return null;
	}	/**
	* Returns an iterator that enumerates every
	* element in the collection, starting with the
	* first element.
	*
	* @return the iterator.
	*/
/*	@Override 
	public Iterator<T> iterator() throws NoSuchElementException{
		
		return new Iterator<T>() {
			private int index = 0;
			//private T next;
			@Override
			public boolean hasNext() {
				return currentElementIndexIterator < getSize();
			}
			@Override
			public T next()  {
				if(this.hasNext()) {
					currentElementIndexIterator++;
					
					T currentElement = getElement(index++); 
					return currentElement;
					}
				
				else {
					throw new NoSuchElementException("No more elements");
				}
			}
			@Override
			public void remove() {
				throw new UnsupportedOperationException("Operation not supported");
			}
		};
	}
	
	/**
	* Returns an iterator that enumerates every n-th
	* element in the collection, startng with the
	* first element.
	*
	* @param numberSkippedElements the number of skipped elements+1.
	* @return the iterator.
	* @throws IllegalArgumentException if numberSkippedElements is less than 1.
	*
	@Override
	public Iterator<T> skippingIterator(int numberSkippedElements) throws NoSuchElementException{
		if(numberSkippedElements < 1) {
			throw new IllegalArgumentException("Number is less than 1");
		}
		
		return new Iterator<T>() {
			
			// Attributes
			private int index = 1;
			private T currentElement; 
			
			@Override
			public boolean hasNext() {
				return getSize() > currentElementIndexSkippingIterator ;
			}
			@Override
			public T next(){
				currentElementIndexSkippingIterator = 0;
				if(this.hasNext()) {
					for(int i = 0; i < index; i++) {
						if(this.hasNext()) {
							currentElement = getElement(i);
							currentElementIndexSkippingIterator++;
							}
						else {
							throw new NoSuchElementException("No next elements ");
						}
						}
					}
				else {
					throw new NoSuchElementException("No next elements ");
				}
					index = index + numberSkippedElements;
					return currentElement;
			}
			@Override
			public void remove() throws UnsupportedOperationException{
				throw new UnsupportedOperationException("Operation not supported.");
			}
		}; 
	}
*/
	
}