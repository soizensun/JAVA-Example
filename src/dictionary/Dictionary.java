package dictionary;

import java.util.ArrayList;

public class Dictionary {
    private ArrayList<Vocaburaly> dic;

    public Dictionary() {
        dic = new ArrayList<Vocaburaly>();
    }

    public void addVocab(Vocaburaly vocab){
        this.dic.add(vocab);
    }

    public String meaning(String word){
        String s = "";
        for (Vocaburaly a :
                dic) {
            if(a.getWord().equals(word)){
                s = a.getMeaning();
            }
            s = word + " is not in this dictionary";
        }
        return s;
    }

    public void deleteVocab(Vocaburaly vocaburaly){
        this.dic.remove(vocaburaly);
    }


}
