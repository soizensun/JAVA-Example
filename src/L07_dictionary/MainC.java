package L07_dictionary;

public class MainC {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add(new Vocabulary("word", "Noun", "Meaning of word.", "Example of using word."));

        Vocabulary vocabulary = dictionary.getByIndex(0);
        System.out.println(
                vocabulary.getWord() + "(" + vocabulary.getType() + ")" + "\n"
                        + "Meaning >> " + vocabulary.getMeaning() + "\n"
                        + "Examples" + "\n"
                        + " >> " + vocabulary.getExample()
        );
    }
}
