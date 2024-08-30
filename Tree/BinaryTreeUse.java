import java.util.Scanner;

public class BinaryTreeUse {

    public static BinaryTreeNode<Integer> takeInput(boolean isRoot, int parentData, boolean isLeft) {

        if (isRoot) {
            System.out.println("Enter root data");
        } else {
            if (isLeft) {
                System.out.println("Enter left child of " + parentData);
            } else {
                System.out.println("Enter right child of " + parentData);
            }
        }

        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);

        int rootData = s.nextInt();

        if (rootData == -1) {

            return null;

        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        BinaryTreeNode<Integer> leftChild = takeInput(false, rootData, true);

        BinaryTreeNode<Integer> rightChild = takeInput(false, rootData, false);

        root.left = leftChild;

        root.right = rightChild;

        return root;

    }

    public static void print(BinaryTreeNode<Integer> root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + ":");

        if (root.left != null) {
            System.out.print("L" + root.left.data + ", ");
        }
        if (root.right != null) {
            System.out.print("R" + root.right.data + ", ");
        }
        System.out.println();

        print(root.left);
        print(root.right);
    }

    public static int numNodes(BinaryTreeNode<Integer> root) {

        if(root == null) {
            return 0;
        }

        int leftNode = numNodes(root.left);
        int rightNode = numNodes(root.right);

        return 1+leftNode+rightNode;
    }

    public static void inorderTraversal(BinaryTreeNode<Integer> root) {
      
        if (root == null)
            return;
      
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void PreorderTraversal(BinaryTreeNode<Integer> root) {
      
        if (root == null)
            return;
      
        System.out.print(root.data + " ");
        PreorderTraversal(root.left);
        PreorderTraversal(root.right);
    }

    public static void PostorderTraversal(BinaryTreeNode<Integer> root) {
      
        if (root == null)
            return;
      
        PostorderTraversal(root.left);
        PostorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static int largest(BinaryTreeNode<Integer> root) {

        if(root == null) {
            return -1;
        }

        int leftLargest = largest(root.left);
        int rightLargest = largest(root.right);

        return Math.max(root.data, Math.max(leftLargest, rightLargest));
    }

    public static int height(BinaryTreeNode<Integer> root) {

        if(root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1+(Math.max(leftHeight, rightHeight));
    }

    public static int leafNodes(BinaryTreeNode<Integer> root) {

        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }

        int leftLeaf = leafNodes(root.left);
        int rightLeaf = leafNodes(root.right);

        return leftLeaf+rightLeaf;
    }

    public static void printLeaf(BinaryTreeNode<Integer> root) {

        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            System.out.print(root.data + " ");
            return;
        }

        if(root.left != null) {
            printLeaf(root.left);
        }

        if(root.right != null) {
            printLeaf(root.right);
        }
    }

    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {

        if(root == null) {
            return;
        }

        if(k == 0) {
            System.out.print(root.data+" ");
            return;
        }

        printAtDepthK(root.left, k-1);
        printAtDepthK(root.right, k-1);
    } 

    public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root) {

        if(root == null) {
            return null;
        }

        if(root.left == null && root.right == null) {
            return null;
        }

        root.left = removeLeafNodes(root.left);
        root.right = removeLeafNodes(root.right);

        return root;
    }

    public static void mirror(BinaryTreeNode<Integer> root) {

        if(root == null) {
            return;
        }

        mirror(root.left);
        mirror(root.right);
        
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root) {

        if(root == null) {
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight-rightHeight) > 1) {
            return false;
        }

        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }

    public static int diameter(BinaryTreeNode<Integer> root) {

        if(root == null) {
            return 0;
        }

        int option1 = height(root.left) + height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);

        return Math.max(option1, Math.max(option2, option3));
    }

    

    public static void main(String[] args) {

        BinaryTreeNode<Integer> root = takeInput(true, 0, true);
        print(root);
        System.out.println(height(root));
    }
}
