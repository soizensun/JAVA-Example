package dictionary;

public class Vocaburaly {
    private String word;
    private String exmaple;
    private String meaning;
    private String partOfSpeech;

    public Vocaburaly(String word, String exmaple, String meaning, String partOfSpeech) {
        this.word = word;
        this.exmaple = exmaple;
        this.meaning = meaning;
        this.partOfSpeech = partOfSpeech;
    }

    public String getWord(){
        return word;
    }

    public String getExmaple() {
        return exmaple;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getPartOfSpeech() {
        return partOfSpeech;
    }
}
