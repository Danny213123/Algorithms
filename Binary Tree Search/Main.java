public class Main {

    public static void main(String[] args) {

        //empty tree
        Tree myTree = new Tree();

        myTree.add(12);
        myTree.add(6);
        myTree.add(18);
        myTree.add(9);
        myTree.add(9);
        myTree.add(21);

        System.out.println(myTree.find(6));

        System.out.println(myTree.find(7));

        myTree.traverse();
    }
}
