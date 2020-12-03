public class Tree {

    private Node root = null;

    public Tree(){
        //default constructor
    }

    public void add(int value){

        if(root == null){
            root = new Node(value);
            System.out.println("added root node " + value);
        } else {
            root.add(value);
        }

    }

    public Node find(int value){

        if(root != null){
            return root.find(value);
        } else {
            return null;
        }
    }

    public void traverse(){
        if(root != null){
           root.traverse();
        }
    }

}
