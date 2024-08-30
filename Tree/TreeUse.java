import java.util.*;

public class TreeUse {

    public static TreeNode<Integer> takeInput() {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = s.nextInt();

        Queue<TreeNode<Integer>> pendingNodes = new Queue<>();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);
        while(!pendingNodes.isEmpty()) {
            TreeNode<Integer> frontNode = pendingNodes.dequeue();
            System.out.println("Enter the number of children of " + frontNode.data);
            int numChildren = s.nextInt();
            for(int i=0; i<numChildren; i++) {
                System.out.println("Enter " + (i+1) + "th child of " + frontNode.data);
                int child = s.nextInt();
                TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                frontNode.children.add(childNode);
                pendingNodes.enqueue(childNode); 
            }
        }

        return root;
    }

    public static void print(TreeNode<Integer> root) {

        String s = root.data + ":";
        for(int i=0; i<root.children.size(); i++) {
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);
        for(int i=0; i<root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    public static int numNodes(TreeNode<Integer> root) {

        if(root == null) {
            return 0;
        }

        int count = 1;

        for(int i=0; i<root.children.size(); i++) {

            count += numNodes(root.children.get(i));
        }

        return count;
    }

    public static int largest(TreeNode<Integer> root) {

        if(root == null) {
            return Integer.MIN_VALUE;
        }

        int ans = root.data;

        for(int i=0; i<root.children.size(); i++) {

            int childLargest = largest(root.children.get(i));
            if(childLargest > ans) {
                ans = childLargest;
            }
        }

        return ans;
    }

    public static int height(TreeNode<Integer> root) {

        if(root == null) {
            return 0;
        }

        if(root.children == null) {
            return 1;
        }

        int ans = 0;

        for(int i=0; i<root.children.size(); i++) {
            ans = Math.max(ans, height(root.children.get(i)));
        }

        return ans+1;
    }

    public static void printAtK(TreeNode<Integer> root, int k) {

        if(root == null) {
            return;
        }

        if(root.children == null) {
            System.out.print(root.data + " ");
            return;
        }

        for(int i=0; i<root.children.size(); i++) {
            printAtK(root.children.get(i), k-1);
        }
    }

    public static int leafNode(TreeNode<Integer> root) {

        if(root == null) {
            return 0;
        }

        int ans = 0;

        for(int i=0; i<root.children.size(); i++) {

            ans += leafNode(root.children.get(i));
        }

        if(root.children.size()==0) {
            ans++;
        }

        return ans;
    }

    public static void main(String[] args) {
        
        TreeNode<Integer> root = takeInput();
        print(root);
        System.out.println(leafNode(root));
    }
}
