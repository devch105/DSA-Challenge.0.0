public class BinaryST {

    Node root;

    class Node{
        int value;
        Node left;
        Node right;


        Node(int val){
            this.value=val;
        }
    }


    public boolean InsertNode(int value) {
        Node newnode = new Node(value);
        if (root == null) {
            root = newnode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newnode.value == temp.value) {
                return false;
            }
            if (newnode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newnode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newnode;
                    return true;
                }
                temp = temp.right;
            }

        }


    }

    public boolean Contains(int value){

        Node temp = root;
        while (temp!=null){

            if(value<temp.value){
                temp=temp.left;
            }else if(value>temp.value) {
                temp=temp.right;
            }
            else{return true;}
        }
        return false;
    }

    public static void main(String[] args) {
        BinaryST BST=new BinaryST();
        System.out.println(" root = "+BST.root);
        BST.InsertNode(45);
        BST.InsertNode(23);
        BST.InsertNode(46);
        BST.InsertNode(43);
        System.out.println("       "+BST.root.value);
        System.out.println(BST.root.left.value+"---------"+BST.root.right.value);
        System.out.println(""+BST.root.left.right.value);

        System.out.println(" Check 23 + "+BST.Contains(23));
        System.out.println(" Check 2 + "+BST.Contains(2));



    }
}
