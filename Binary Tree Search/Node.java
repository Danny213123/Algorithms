public class Node {

    private Node left = null;
    private Node right = null;
    private int value;

    public Node(int value ){
        this.value = value;
    }

    public void add(int newValue){
        if(newValue < this.value){
            //look at left subtree
            if(left == null){
                left = new Node(newValue);
                System.out.println("added " + newValue + " left of " + this.value);
            } else{
                left.add(newValue);
            }
        } else {
            if(right == null){
                right = new Node(newValue);
                System.out.println("added " + newValue + " right of " + this.value);
            } else{
                right.add(newValue);
            }
        }
    }

    public Node find(int searchValue){
        //is this the correct node?
        if(this.value == searchValue){
            return this;
        } else if (searchValue < this.value && left != null){
            return left.find(searchValue);
        } else if (searchValue >= this.value && right != null){
            return right.find(searchValue);
        }

        return null;

    }

    public void traverse(){
        if(left != null){
            left.traverse();
        }
        System.out.print(" " + this.value);
        if(right != null){
            right.traverse();
        }

    }

    public String toString(){
        return "Node: " + this.value;
    }

}
