package br.com.streams;

public class StreamImpl implements Stream {

	private final char[] word;
	private final int length;
	private int index;
	
	public StreamImpl(String word) throws Exception {
		super();
		if(isEmpty(word)){
			throw new Exception("Texto vazio!");
		}
		this.word = word.toCharArray();
		this.length=this.word.length;
		this.index=0;
	}

	private boolean isEmpty(String word) {
		return word == null || ("").equalsIgnoreCase(word);
	}

	public char getNext() {
		return word[index++];
	}

	public boolean hasNext() {
		return index < length;
	}	

}
