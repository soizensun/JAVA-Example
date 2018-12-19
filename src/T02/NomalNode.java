package T02;

//elab-source:NomalNode.java
public class NomalNode implements Node{
    private String node;
    private int time;


    public NomalNode(String node, int time) {
        this.time = time;
        this.node = node;
    }

    @Override
    public String printFormat() {
        String s = "";
        for (int i = 0; i < time; i++) {
            s += node;
        }
        return s;
    }
}
