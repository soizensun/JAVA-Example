package L07;

public class Dictionary {
    private Vocabulary[] words;
    private int lastIndex;

    public Dictionary() {
        this.words = new Vocabulary[50];
        this.lastIndex = 0;
    }

    public Vocabulary getByIndex(int id){
        return this.words[id];
    }
    public void add(Vocabulary vocabulary){
        if(lastIndex>=50){ return; }
        this.words[this.lastIndex] = vocabulary;
        this.lastIndex++;
    }
}
