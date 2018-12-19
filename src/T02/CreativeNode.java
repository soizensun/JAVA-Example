package T02;

//elab-source:CreativeNode.java
public class CreativeNode implements Node {
    private String node;
    private int times;
    private int time;

    public CreativeNode(String node, int time) {
        this.node = node;
        times = 0;
        this.time = time;
    }


    public void setNode(String node) {
        this.node = node;
    }

    @Override
    public String printFormat() {
        String s = "";
        for (int i = 0; i < time; i++) {
            if(node.equals("C") && times < 1000){
                times += 1;
                setNode("D");
                s += "D";
            }
            else if(node.equals("D") && times < 1000){
                times += 1;
                setNode("E");
                s += "E";
            }
            else if(node.equals("E") && times < 1000){
                times += 1;
                setNode("F");
                s += "F";
            }
            else if(node.equals("F") && times < 1000){
                times += 1;
                setNode("G");
                s += "G";
            }
            else if(node.equals("G") && times < 1000){
                times += 1;
                setNode("A");
                s += "A";
            }
            else if(node.equals("A") && times < 1000){
                times += 1;
                setNode("B");
                s += "B";
            }
            else if(node.equals("B") && times < 1000){
                times += 1;
                setNode("C");
                s += "C";
            }
            else return "Invalif node";
        }
        return s;


    }
}
