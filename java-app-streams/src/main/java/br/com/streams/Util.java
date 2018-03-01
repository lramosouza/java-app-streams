package br.com.streams;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class Util {
	static Character streamCharacters;
	static Character fristCharWithoutRepetition;

	public static Character findFirstChar(StreamImpl stream) throws Exception {

		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<Character>();

		List<Character> auxList = new ArrayList<Character>();
		if (stream != null) {
			while (stream.hasNext()) {
				streamCharacters = stream.getNext();
				verifyRepetition(linkedHashSet, auxList);
			}
			if (linkedHashSet.isEmpty()) {
				throw new Exception("Não existem caracteres sem repetição");
			} else {
				verifyFristCharWithoutRepetition(linkedHashSet);
			}
			auxList.clear();
			linkedHashSet.clear();
			return fristCharWithoutRepetition;
		}else {
			throw new Exception("Stream Vazia");
		}
	}

	private static void verifyRepetition(LinkedHashSet<Character> linkedHashSet, List<Character> auxList) {
		if (!linkedHashSet.contains(streamCharacters) &&
				!auxList.contains(streamCharacters)) {
			linkedHashSet.add(streamCharacters);
		} else {
			linkedHashSet.remove(streamCharacters);
			auxList.add(streamCharacters);
		}
	}

	private static void verifyFristCharWithoutRepetition(LinkedHashSet<Character> linkedHashSet) {
		for (Character character : linkedHashSet) {
			fristCharWithoutRepetition = character;
			break;
		}
	}
}