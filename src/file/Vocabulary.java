package file;

import java.io.Serializable;

public class Vocabulary implements Serializable {
    private String word;
    private String type;
    private String meaning;
    private String example;

    public Vocabulary(String word, String type, String meaning, String example) {
        this.word = word;
        this.type = type;
        this.meaning = meaning;
        this.example = example;
    }

    public String getWord() {
        return word;
    }
    public String getType() {
        return type;
    }
    public String getMeaning() {
        return meaning;
    }
    public String getExample() {
        return example;
    }

    @Override
    public String toString() {
        return "Vocabulary{" +
                "word='" + word + '\'' +
                ", type='" + type + '\'' +
                ", meaning='" + meaning + '\'' +
                ", example='" + example + '\'' +
                '}';
    }
}
