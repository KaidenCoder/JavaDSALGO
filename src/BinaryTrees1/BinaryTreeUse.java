package BinaryTrees1;

import java.util.*;

public class BinaryTreeUse {


    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data");
        }else{
            if(isLeft){
                System.out.println("Enter left child of " + parentData);
            }else{
                System.out.println("Enter right child of " + parentData);
            }
        }

        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);

        root.left = leftChild;
        root.right = rightChild;
        return root;

    }

    public static BinaryTreeNode<Integer> takeTreeInput(){
        System.out.println("Enter root data");
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChild;
        root.right = rightChild;
        return root;

    }

    public static void printTreeDetailed(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + ":");
        if(root.left != null){
            System.out.print("L" + root.left.data);
        }
        if(root.right != null){
            System.out.print(", R" + root.right.data);
        }
        System.out.println();
        printTreeDetailed(root.left);
        printTreeDetailed(root.right);
//        if(root.left != null){
//            printTree(root.left);
//        }
//        if(root.right != null){
//            printTree(root.right);
//        }
    }

    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        printTree(root.left);
        printTree(root.right);
//        if(root.left != null){
//            printTree(root.left);
//        }
//        if(root.right != null){
//            printTree(root.right);
//        }
    }

    public static int numNodes(BinaryTreeNode<Integer> root){

        if(root == null){
            return 0;
        }

        int leftNodeCount = numNodes(root.left);
        int rightNodeCount = numNodes(root.right);
        return 1 + leftNodeCount + rightNodeCount;

    }

    public static int getSum(BinaryTreeNode<Integer> root) {
        //Your code goes here.

        if(root == null){
            return 0;
        }
        int sum = root.data;

        int leftNodeCount =  getSum(root.left);
        int rightNodeCount =  getSum(root.right);
        return sum + leftNodeCount + rightNodeCount;
    }

    public static void preOrder(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return;
        }
        System.out.println(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //            50
    //     25            75
    // 12      37     62   87
    //      30   40

    public static BinaryTreeNode<Integer> solve(int[] arr){
       int n = arr.length;
       if(n == 0){
           return null;
       }
       BinaryTreeNode<Integer> root = null;
       for(int i = 0; i < n; i++){
           root = LevelOrder2(root, arr[i]);
       }
       return root;
    }

    private static BinaryTreeNode<Integer> getNode2(int data) {
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(null);

        newNode.data = data;
        newNode.left = newNode.right = null;
        return newNode;
    }

    private static BinaryTreeNode<Integer> LevelOrder2(BinaryTreeNode<Integer> root, int data) {
        if(root == null){
            root = getNode2(data);
            return root;
        }

        if(data < root.data){
            root.left = LevelOrder2(root.left, data);
        }
        else{
            root.right = LevelOrder2(root.right, data);
        }

        return root;

    }

    public static void postOrder(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+ " ");
    }

    public static int largest(BinaryTreeNode<Integer> root){
        if(root == null){
            return -1;
        }
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }

    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if(root == null){
            return 0;
        }


        int largestLeft = countNodesGreaterThanX(root.left,x);
        int largestRight = countNodesGreaterThanX(root.right,x);
        if(root.data > x){
            return 1 + largestLeft + largestRight;
        }

        return largestLeft + largestRight;

    }

    public static int height(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return 0;
        }else{
            int lDepth = height(root.left);
            int rDepth = height(root.right);

            if(lDepth > rDepth){
                return lDepth + 1;
            }else{
                return rDepth + 1;
            }
        }

    }

    public static int numLeaves(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }

        return numLeaves(root.left) + numLeaves(root.right);
    }

    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return;
        }
        if(k == 0){
            System.out.println(root.data);
            return;
        }
        printAtDepthK(root.left, k -1);
        printAtDepthK(root.right, k - 1);
    }

    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return;
        }
        int level = 0;
        replaceNode(root, level);
    }

    public static void replaceNode(BinaryTreeNode<Integer> root, int level){
        root.data = level;
        replaceNode(root.left, level + 1);
        replaceNode(root.right, level + 1);
    }

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
        //Your code goes here
        if(root == null){
            return false;
        }
        if(root.data == x){
            return true;
        }

        if(isNodePresent(root.left, x)) return true;
        if(isNodePresent(root.right, x)) return true;
        return false;
    }

    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        //Your code goes here

        if(root == null){
            return;
        }

        if(root.left != null && root.right != null){
            printNodesWithoutSibling(root.left);
            printNodesWithoutSibling(root.right);
        }
        else if(root.left != null){
            System.out.println(root.left.data);
            printNodesWithoutSibling(root.left);
        }
        else if(root.right != null){
            System.out.println(root.right.data);
            printNodesWithoutSibling(root.right);
        }

    }

    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        if(root.left == null && root.right == null){
            return null;
        }

        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;

    }

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        //Your code goes here
        mirrorTree(root);

    }

    public static BinaryTreeNode<Integer> mirrorTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        BinaryTreeNode<Integer> left = mirrorTree(root.left);
        BinaryTreeNode<Integer> right = mirrorTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root){

        if(root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }

        boolean isLeftBalance = isBalanced(root.left);
        boolean isRightBalance = isBalanced(root.right);

        return isLeftBalance && isRightBalance;

    }

    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
        if(root == null){
            int height = 0;
            boolean isBal = true;
            BalancedTreeReturn ans = new BalancedTreeReturn();
            ans.height = height;
            ans.isBalanced = isBal;
            return ans;
        }

        BalancedTreeReturn leftOutput = isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput = isBalancedBetter(root.right);
        boolean isBal = true;
        int height = 1 + Math.max(leftOutput.height, rightOutput.height);

        if(Math.abs(leftOutput.height - rightOutput.height) > 1){
            isBal = false;
        }

        if(!leftOutput.isBalanced || !rightOutput.isBalanced){
            isBal = false;
        }

        BalancedTreeReturn ans = new BalancedTreeReturn();
        ans.height = height;
        ans.isBalanced = isBal;
        return ans;

    }

    static int ans;

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        ans = 1;
        depth(root);
        return ans - 1;
    }

    private static int depth(BinaryTreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        int L = depth(root.left);
        int R = depth(root.right);
        ans = Math.max(ans, L + R + 1);
        return Math.max(L, R) + 1;
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter root data");
        int rootData = s.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren = new LinkedList<BinaryTreeNode<Integer>>();

        pendingChildren.add(root);

        while(pendingChildren.isEmpty()){
            BinaryTreeNode<Integer> front = pendingChildren.poll();
            System.out.println("Enter left child of" + front.data);
            int left = s.nextInt();
            if(left != -1){
                BinaryTreeNode<Integer> leftChildNode = new BinaryTreeNode<Integer>(left);
                front.left = leftChildNode;
                pendingChildren.add(leftChildNode);
            }

            System.out.println("Enter right child of" + front.data);
            int right = s.nextInt();
            if(right != -1){
                BinaryTreeNode<Integer> rightChildNode = new BinaryTreeNode<Integer>(right);
                front.right = rightChildNode;
                pendingChildren.add(rightChildNode);
            }
        }
        return root;
    }

    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        //Your code goes here
        ArrayList<Integer> path = new ArrayList<>();
        printPaths(root, k, 0, path);
    }

    public static void printPaths(BinaryTreeNode<Integer> curr_node, int sum, int currSum, ArrayList<Integer> path){
        if(curr_node == null){
            return;
        }

        currSum += curr_node.data;

        path.add(curr_node.data);//2,3,4,4

        if(currSum == sum){
            for(int i = 0; i < path.size(); i++){
                System.out.print(path.get(i) + " ");
            }
            System.out.println();
        }

        if(curr_node.left != null){
            printPaths(curr_node.left, sum, currSum, path);
        }

        if(curr_node.right != null){
            printPaths(curr_node.right, sum, currSum, path);
        }

        path.remove(path.size() - 1);

    }



    static int preIndex = 0;
    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
        //Your code goes here
        int inEnd = inOrder.length - 1;
        int inStart = 0;



        return buildTreeHelper(preOrder, inOrder, inStart, inEnd);

    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int[] preOrder, int[] inOrder, int inStart, int inEnd) {


        if(inStart > inEnd){
            return null;
        }

        BinaryTreeNode<Integer> tNode = new BinaryTreeNode<Integer>(preOrder[preIndex++]);

        if(inStart == inEnd){
            return tNode;
        }

        int inIndex = search(inOrder, inStart, inEnd, tNode.data);

        tNode.left = buildTreeHelper(preOrder, inOrder, inStart, inIndex - 1);
        tNode.right = buildTreeHelper(preOrder, inOrder, inIndex + 1, inEnd);

        return tNode;
    }

    public static int search(int arr[], int start, int end, int value){
        int i;
        for(i = start; i <= end; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return i;
    }

    static int postIndex = 0;

    public static BinaryTreeNode<Integer> buildTree2(int[] postOrder, int[] inOrder) {
        //Your code goes here
        int inEnd = inOrder.length - 1;
        int inStart = 0;
        Index pIndex = new Index();
        pIndex.index = inEnd;


        return buildTreeHelper2(postOrder, inOrder, inStart, inEnd, pIndex);
    }

    public static BinaryTreeNode<Integer> buildTreeHelper2(int[] post, int[] inOrder, int inStart, int inEnd, Index pIndex) {


        if(inStart > inEnd){
            return null;
        }

        BinaryTreeNode<Integer> tNode = new BinaryTreeNode<Integer>(post[pIndex.index]);
        (pIndex.index)--;

        if(inStart == inEnd){
            return tNode;
        }

        int inIndex = search2(inOrder, inStart, inEnd, tNode.data);

        tNode.right = buildTreeHelper2(post, inOrder, inIndex + 1, inEnd, pIndex);
        tNode.left = buildTreeHelper2(post, inOrder, inStart, inIndex - 1, pIndex);

        return tNode;
    }

    public static int search2(int arr[], int start, int end, int value){
        int i;
        for(i = start; i <= end; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return i;
    }

    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        //Your code goes here
        insertHelper(root);
    }

    public static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);

        int duplicateData = root.data;
        BinaryTreeNode<Integer> duplicateNode = new BinaryTreeNode<Integer>(duplicateData);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = duplicateNode;
        duplicateNode.left = temp;
        return root;
    }

    public static void getMinAndMax(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return;
        }

        BinaryTreeNode<Integer> current = root;
        BinaryTreeNode<Integer> pre;

        int max_value = Integer.MIN_VALUE;
        int min_value = Integer.MAX_VALUE;

        while(current != null){
            if(current.left == null){
                max_value = Math.max(max_value, current.data);
                min_value = Math.min(min_value, current.data);

                current = current.right;
            }
            else{
                pre = current.left;
                while(pre.right != null && pre.right != current){
                    pre = pre.right;

                }
                if(pre.right == null){
                    pre.right = current;
                    current = current.left;
                }
                else{
                    pre.right = null;
                    max_value = Math.max(max_value, current.data);
                    min_value = Math.min(min_value, current.data);

                    current = current.right;
                }
            }
        }

        new Pair(min_value, max_value);

    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if(tempNode.left != null){
                queue.add(tempNode.left);
            }
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
        }
    }

    public static void printKDistanceNodeDown(BinaryTreeNode<Integer> node, int k){
        if(node == null || k < 0){
            return;
        }
        if(k == 0){
            System.out.print(node.data);
            System.out.println("");
            return;
        }

        printKDistanceNodeDown(node.left, k - 1);
        printKDistanceNodeDown(node.right, k - 1);
    }

    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        BinaryTreeNode<Integer> target = new BinaryTreeNode<Integer>(node);
        nodesAtDistanceKHelper(root, target, k);
    }

    public static int nodesAtDistanceKHelper(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> target, int k) {
        //Your code goes here
        if(root == null){
            return -1;
        }

        if(root == target){
            printKDistanceNodeDown(root, k);
            return 0;

        }

        int dl = nodesAtDistanceKHelper(root.left, target, k);
        if(dl != -1){
            if(dl + 1 == k){
                System.out.print(root.data);
                System.out.println("");
            }
            else{
                printKDistanceNodeDown(root.right, k-dl-2);
            }
            return 1 + dl;
        }

        int dr = nodesAtDistanceKHelper(root.right, target, k);
        if(dr != -1){
            if(dr + 1 == k){
                System.out.print(root.data);
                System.out.println("");
            }
            else{
                printKDistanceNodeDown(root.left, k-dr-2);
            }
            return 1 + dr;
        }
        return -1;
    }

    static HashMap<BinaryTreeNode<Integer>, BinaryTreeNode<Integer>> um = new HashMap<>();

    static void storeParent(BinaryTreeNode<Integer> root)
    {

        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty())
        {
            BinaryTreeNode<Integer> p = q.poll();

            if (p == root)
            {
                um.put(p, null);
            }

            if (p.left != null)
            {
                um.put(p.left, p);
                q.add(p.left);
            }
            if (p.right != null)
            {
                um.put(p.right, p);
                q.add(p.right);
            }
        }
    }

    public static void nodesAtDistanceK2(BinaryTreeNode<Integer> root, int node, int k) {
        storeParent(root);
        BinaryTreeNode<Integer> target = new BinaryTreeNode<Integer>(node);
        HashSet<BinaryTreeNode<Integer>> s = new HashSet<>();
        int dist = 0;

        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(target);
        s.add(target);

        while (!q.isEmpty())
        {

            if (dist == k)
            {
                while (!q.isEmpty())
                {
                    System.out.print(q.peek().data + " ");
                    q.poll();
                }
            }


            int size = q.size();
            for(int i = 0; i < size; i++)
            {
                BinaryTreeNode<Integer> p = q.poll();


                if (p.left != null && !s.contains(p.left))
                {
                    q.add(p.left);
                    s.add(p.left);
                }


                if (p.right != null && !s.contains(p.right))
                {
                    q.add(p.right);
                    s.add(p.right);
                }


                if (um.get(p) != null &&
                        !s.contains(um.get(p)))
                {
                    q.add(um.get(p));
                    s.add(um.get(p));
                }
            }
            dist++;
        }

    }

    public static void inOrder(BinaryTreeNode<Integer> root) {
        //Write your code here
        if(root == null){
            return;
        }

        Stack<BinaryTreeNode<Integer>> s = new Stack<BinaryTreeNode<Integer>>();
        BinaryTreeNode<Integer> curr = root;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while(curr != null || s.size() > 0){
            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            arr.add(curr.data);

            System.out.print(curr.data + " ");

            curr = curr.right;
        }

    }

    public static int solve(BinaryTreeNode<Integer> root, int k){
        if(root == null){
            return -1;
        }

        Stack<BinaryTreeNode<Integer>> s = new Stack<BinaryTreeNode<Integer>>();
        BinaryTreeNode<Integer> curr = root;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        while(curr != null || s.size() > 0){
            while(curr != null){
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            arr.add(curr.data);

            System.out.print(curr.data + " ");

            curr = curr.right;
        }

        int sum = 0;
        // arr = [12, 25, 37, 50, 62, 75, 87]

        for(int i = 0; i < k; i++){
            sum = sum + arr.get(i);
        }

        return sum;
    }


    public static void inOrder2(BinaryTreeNode<Integer> root) {
        //Write your code here
        BinaryTreeNode<Integer> current, pre;
        if(root == null){
            return;
        }
        current = root;
        while(current != null){
            if(current.left == null){
                System.out.print(current.data + " ");
                current = current.right;
            }
            else {
                pre = current.left;
                while(pre.right != null && pre.right != current){
                    pre = pre.right;
                }
                if(pre.right == null){
                    pre.right = current;
                    current = current.left;
                }
                else{
                    pre.right = null;
                    System.out.print(current.data+ " ");
                    current = current.right;
                }
            }
        }
    }

    public static void postOrder2(BinaryTreeNode<Integer> root) {
        //Write your code here
        Stack<BinaryTreeNode<Integer>> s1 = new Stack<BinaryTreeNode<Integer>>();
        Stack<BinaryTreeNode<Integer>> s2 = new Stack<BinaryTreeNode<Integer>>();

        if(root == null){
            return;
        }

        s1.push(root);

        while(!s1.isEmpty()){
            BinaryTreeNode<Integer> temp = s1.pop();
            s2.push(temp);

            if(temp.left != null){
                s1.push(temp.left);
            }
            if(temp.right != null){
                s1.push(temp.right);
            }
        }

        while(!s2.isEmpty()){
            BinaryTreeNode<Integer> temp = s2.pop();
            System.out.print(temp.data + " ");
        }

    }

//    static BinaryTreeNode<Integer> root;


    public static BinaryTreeNode<Integer> specialtree(int[] preor, char[] preorLN, int n) {
        //Write your code here
        Index myindex = new Index();
        int index = 0;
        BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(null);
        return constructTreeUtil(preor, preorLN, myindex, n, node);

    }

    private static BinaryTreeNode<Integer> constructTreeUtil(int[] preor, char[] preorLN, Index myindex, int n, BinaryTreeNode<Integer> temp) {
        int index = myindex.index;

        if(index == n){
            return null;
        }

        temp = new BinaryTreeNode<Integer>(preor[index]);
        myindex.index++;

        if(preorLN[index] == 'N'){
            temp.left = constructTreeUtil(preor, preorLN, myindex, n, temp.left);
            temp.right = constructTreeUtil(preor, preorLN, myindex, n, temp.right);
        }
        return temp;
    }

    // 6(0) 0(1) 6(2)  2(3) 2(4) 3(5) -1(6)
    //               6
    //        0             2
    //    1             3       4
    //               5

    static BinaryTreeNode root;

    public static BinaryTreeNode<Integer> constructBT(int[] parent, int n) {
        //Write your code here
        BinaryTreeNode[] created = new BinaryTreeNode[n];
        for(int i = 0; i < n; i++){
            created[i] = null; // null, null, null, null, null, null, null
        }
        for(int i = 0; i < n; i++){
            createNode(parent, i, created);
        }
        return root;
    }
//int parent[] = new int[]{6,0,6,2,2,3,-1};
    private static void createNode(int[] parent, int i, BinaryTreeNode[] created) {
        if(created[i] != null){
            return;
        }
       // i = 0; 6; 1
        created[i] = new BinaryTreeNode(i); // 0, 6, 1
     // created = {0,6,1
        if(parent[i] == -1){ // parent[0] = 6 // parent[6] = -1 // parent[1] = 0
            root = created[i]; // root = 6
            return;
        }

        if(created[parent[i]] == null){ // parent[0] = 6 // created[6] = null
            // parent[1] = 0 // created[0] == 0
            createNode(parent, parent[i], created);
        }

        BinaryTreeNode p = created[parent[i]]; // p = 6

        if(p.left == null){
            p.left = created[i]; // p.left =
                                 //
        }
        else{
            p.right = created[i];
        }

    }

    // 6(0) 0(1) 6(2)  2(3) 2(4) 3(5) -1(6)
    //               6
    //        0             2
    //    1             3       4
    //               5
    //
    //                0
    //        1            2
    //   3      4
    // 5
    // 6
//int parent[] = new int[]{6,0,6,2,2,3,-1};
// int parent[] = new int[]{-1,0,0,1,1,3,5};
    public static BinaryTreeNode<Integer> constructBT2(int[] parent, int n) {
        //Write your code here
        HashMap<Integer, BinaryTreeNode<Integer>> hm = new HashMap<Integer, BinaryTreeNode<Integer>>();
        hm.put(-1, new BinaryTreeNode<Integer>(-1)); //(-1,-1)
        for(int i = 0; i < parent.length; i++){
            hm.put(i, new BinaryTreeNode<Integer>(i)); // (0,0)(1,1)(2,2)(3,3)(4,4)(5,5)(6,6)
        }
        int temp = 0;
        for(int i = 0; i < parent.length; i++){   //parent[6] = 5
            BinaryTreeNode<Integer> curr = hm.get(parent[i]); // 5
            if(parent[i] == - 1){
                temp = i; // temp = 0
            }
            if(curr.left == null){  //        6
                curr.left = hm.get(i);// 0
            }                       // 1   2
                                 // 3    4
                               // 5
                            //  6
            else{
                curr.right = hm.get(i); //
            }
        }
        return hm.get(temp);

    }

    static class T{
        int tilt = 0;
    }

    public static int getTilt(BinaryTreeNode<Integer> root) {
        //Write your code here
        T t = new T();
        traverse(root, t);
        return t.tilt;
    }

    private static int traverse(BinaryTreeNode<Integer> root, T t) {
        if(root == null){
           return 0;
        }

        int ldata = traverse(root.left, t);
        int rdata = traverse(root.right, t);

        t.tilt += Math.abs(ldata - rdata);

        return ldata + rdata + root.data;
    }

    public static void ancestor(BinaryTreeNode<Integer> root, int[][] matrix) {
        //Write your code here
        int size = numNodes(root);

        if (root==null)
            return ;

        ancestor(root.left, matrix);

        ancestor(root.right, matrix);

        if (root.left != null)
        {
            matrix[root.data][root.left.data] = 1;
            for (int i = 0; i < size; i++)
            {
                if (matrix[root.left.data][i] == 1)
                    matrix[root.data][i] = 1;
            }
        }

        if (root.right != null)
        {
            matrix[root.data][root.right.data] = 1;

            for (int i = 0; i < size; i++)
            {
                if (matrix[root.right.data][i]==1)
                    matrix[root.data][i] = 1;
            }
        }
    }

    private static void ancestorHelper(BinaryTreeNode<Integer> root, int[][] matrix, int size) {

        if(root == null){
            return;
        }

        ancestorHelper(root.left, matrix, size);
        ancestorHelper(root.right, matrix, size);

        if(root.left != null){
            matrix[root.data][root.left.data] = 1;
            for(int i = 0; i < size; i++){
                if(matrix[root.left.data][i] == 1){
                    matrix[root.data][i] = 1;
                }
            }
        }

        if(root.right != null){
            matrix[root.data][root.right.data] = 1;
            for(int i = 0; i < size; i++){
                if(matrix[root.right.data][i] == 1){
                    matrix[root.data][i] = 1;
                }
            }
        }


    }

    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {

        if(root == null){
            return false;
        }
        if(root.data == k){
            return true;
        }

        if(k < root.data ){
            return searchInBST(root.left, k);
        }
        return   searchInBST(root.right, k);


    }


    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
        if (root == null) {
            return;
        }

        if (k1 < root.data) {
            elementsInRangeK1K2(root.left, k1, k2);
        }

        if (k1 <= root.data && k2 >= root.data) {
            System.out.print(root.data + " ");
        }

        if (k2 > root.data) {
            elementsInRangeK1K2(root.right, k1, k2);
        }
//        if(root == null){
//            return;
//        }
//        ArrayList<Integer> arr  = new ArrayList<Integer>();
//        if(root.data < k1){
//            elementsInRangeK1K2(root.right, k1,k2);
//
//        } else if(root.data > k2){
//            elementsInRangeK1K2(root.left, k1,k2);
//        }else{
//            arr.add(root.data);
//            elementsInRangeK1K2(root.left, k1,k2);
//            elementsInRangeK1K2(root.right, k1,k2);
//        }
//        printArray(arr);

    }

    public static void printArray(ArrayList<Integer> arr){
        Collections.sort(arr);
        for(int i = 0; i< arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        int start = 0;
        return sortArrayBSTHelper(arr, start, n -1);
    }

    private static BinaryTreeNode<Integer>  sortArrayBSTHelper(int[] arr, int start, int end) {
        if(start > end){
            return null;
        }

        int mid = (start+end)/2;
        BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>(arr[mid]);

        node.left = sortArrayBSTHelper(arr, start, mid-1);
        node.right = sortArrayBSTHelper(arr,mid+1, end);

        return node;

    }

    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }
        int leftMax = maximum(root.left);
        if(leftMax >= root.data){
            return false;
        }

        int rightMin = minimum(root.right);
        if(rightMin < root.data){
            return false;
        }

        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);
        return isLeftBST && isRightBST;
    }

    private static int minimum(BinaryTreeNode<Integer> root) {
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }

    private static int maximum(BinaryTreeNode<Integer> root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int largestLeft = maximum(root.left);
        int largestRight = maximum(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }

    public static IsBSTReturn isBST2(BinaryTreeNode<Integer> root){
        if(root == null){
            IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        }
        IsBSTReturn leftAns = isBST2(root.left);
        IsBSTReturn rightAns = isBST2(root.right);

        int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
        int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
        boolean isBST = true;

        if(leftAns.max >= root.data){
            isBST = false;
        }
        if(rightAns.min < root.data){
            isBST = false;
        }

        if(!leftAns.isBST){
            isBST = false;
        }

        if(!rightAns.isBST){
            isBST = false;
        }

        IsBSTReturn ans = new IsBSTReturn(min, max, isBST);
        return ans;

    }

    public static boolean isBST3(BinaryTreeNode<Integer> root, int minRange, int maxRange){
        if(root == null){
            return true;
        }

        if(root.data < minRange || root.data > maxRange){
            return false;
        }

        boolean isLeftWithinRange = isBST3(root.left, minRange, root.data - 1);
        boolean isRightWithinRange = isBST3(root.right, root.data + 1, maxRange);

        return isLeftWithinRange && isRightWithinRange;

    }

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            ArrayList<Integer> arr2 = constructArray(root, arr);

            Collections.sort(arr2);
            LinkedListNode<Integer> head = new LinkedListNode<Integer>(arr2.get(0));
            LinkedListNode<Integer> temp = head;
            for(int i = 1; i < arr2.size(); i++){
                head.next = new LinkedListNode<Integer>(arr2.get(i));
            }

            return head;

    }

    public static  ArrayList<Integer> constructArray(BinaryTreeNode<Integer> root, ArrayList<Integer> arr){
        if(root == null){
            return null;
        }
        arr.add(root.data);
        constructArray(root.left,arr);
        constructArray(root.right,arr);

        return arr;
    }

    public static LinkedListNode<Integer> constructLinkedList2(BinaryTreeNode<Integer> root) {
        LinkedListNode<Integer> head = null;
        return sortedList(head, root);
    }

    private static LinkedListNode<Integer> sortedList(LinkedListNode<Integer> head, BinaryTreeNode<Integer> root) {
        if (root == null){
            return head;
        }

        head = sortedList(head, root.left);
        LinkedListNode<Integer> newNode = new LinkedListNode<>(root.data);
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> prev = null;

        if(temp == null){
            head = newNode;
        }
        else{
            while(temp != null){
                if(temp.data > root.data){
                    break;
                }
                else{
                    prev = temp;
                    temp = temp.next;
                }
            }

            if(temp == null){
                prev.next = newNode;
            }
            else{
                if(prev == null){
                    newNode.next = temp;
                    head = newNode;
                }
                else{
                    newNode.next = temp;
                    prev.next = newNode;
                }
            }
        }

        head = sortedList(head, root.right);
        return head;

    }

    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
        if(root == null){
            return -1;
        }

        if(root.data > a && root.data > b){
            return getLCA(root.left, a, b);
        }

        if(root.data < a && root.data < b){
            return getLCA(root.right, a, b);
        }

        return root.data;

    }

    public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
        // Write your code here
        Sum S = new Sum();
        replaceWithLargerNodesSumHelper(root, S);

    }

    public static void replaceWithLargerNodesSumHelper(BinaryTreeNode<Integer> root, Sum S){

        if(root == null){
            return;
        }

        replaceWithLargerNodesSumHelper(root.right, S);

        S.sum = S.sum + root.data;
        root.data = S.sum;

        replaceWithLargerNodesSumHelper(root.left, S);

    }

    public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root, int x){
        if(root == null){
            return null;
        }
        if(root.data == x){
            ArrayList<Integer> output = new ArrayList<Integer>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftOutput = nodeToRootPath(root.left, x);
        if(leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput = nodeToRootPath(root.right, x);
        if(rightOutput != null){
            rightOutput.add(root.data);
            return rightOutput;
        }

        return null;

    }

    public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            return null;
        }
        if(root.data == data){
            ArrayList<Integer> output = new ArrayList<Integer>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftOutput = getPath(root.left, data);
        if(leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput = getPath(root.right, data);
        if(rightOutput != null){
            rightOutput.add(root.data);
            return rightOutput;
        }

        return null;
    }

    public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
        // Write your code here
        ArrayList<LinkedListNode<Integer>> arr  = new ArrayList<>();
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTreeNode<Integer> tempNode = queue.poll();
            arr.add(new LinkedListNode<>(tempNode.data));
            System.out.print(tempNode.data + " ");

            if(tempNode.left != null){
                queue.add(tempNode.left);
            }
            if(tempNode.right != null){
                queue.add(tempNode.right);
            }
        }
        return arr;
    }

    public static boolean isBST22(BinaryTreeNode<Integer> node, int min, int max)
    {
        // base case
        if (node == null)
            return true;

        // if node's value fall outside valid range
        if (node.data < min || node.data > max) {
            return false;
        }

        // recursively check left and right subtrees with updated range
        return isBST22(node.left, min, node.data) &&
                isBST22(node.right, node.data, max);
    }


    public static int size(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        return size(root.left) + 1+ size(root.right);
    }

    public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
        // Write your code here
        if(isBST22(root, Integer.MIN_VALUE, Integer.MAX_VALUE)){
            return size(root);
        }

        return Math.max(largestBSTSubtree(root.left), largestBSTSubtree(root.right));

    }

    public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
        // Write your code here
        HashSet<Integer> set  = new HashSet<Integer>();
        if(!pairHelper(root, s, set)){
            System.out.println(-1);
        }
    }

    public static boolean pairHelper(BinaryTreeNode<Integer> root, int sum, HashSet<Integer> set){
        if(root == null){
            return false;
        }
        if(pairHelper(root.left, sum, set)){
            return true;
        }
        if(set.contains(sum - root.data)){
            if(root.data > (sum - root.data)){
                System.out.println((sum - root.data) + " " + root.data);
            }else{
                System.out.println(root.data+ " " +(sum - root.data));
            }
           // return true;
        }
        else{
            set.add(root.data);
        }
        return pairHelper(root.right, sum, set);
    }


    public static BinaryTreeNode<Integer> constructBST(int[] preorder) {
        Index index = new Index();
        int size = preorder.length;
        return constructBSTUtil(preorder, index, 0, size-1, size);
    }

    private static BinaryTreeNode<Integer> constructBSTUtil(int[] preorder, Index preIndex, int low, int high, int size) {
        if(preIndex.index >= size || low > high){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(preorder[preIndex.index]);
        preIndex.index += 1;

        if(low == high){
            return root;
        }

        int i;
        for(i = low; i <= high; ++i){
            if(preorder[i] > root.data){
                break;
            }
        }

        root.left = constructBSTUtil(preorder, preIndex, preIndex.index, i - 1, size);
        root.right = constructBSTUtil(preorder, preIndex, i, high, size);

        return root;

    }

    public static BinaryTreeNode<Integer> constructBST2(int[] preorder, int n) {
        if(n == 0){
            return null;
        }
        BinaryTreeNode<Integer> root = null;

        for(int i = 0; i < n; i++){
            root = LevelOrder(root, preorder[i]);
        }
        return root;
    }

    private static BinaryTreeNode<Integer> LevelOrder(BinaryTreeNode<Integer> root, int data) {
        if(root == null){
            root = getNode(data);
            return root;
        }

        if(data < root.data){
            root.left = LevelOrder(root.left, data);
        }
        else{
            root.right = LevelOrder(root.right, data);
        }

        return root;

    }

    private static BinaryTreeNode<Integer> getNode(int data) {
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(null);

        newNode.data = data;
        newNode.left = newNode.right = null;
        return newNode;
    }

    public static boolean deadEnd(BinaryTreeNode<Integer> root) {
        //Write your code here
        int min = 1;
        int max = Integer.MAX_VALUE;
        return deadEndHelper(root, min, max);
    }

    private static boolean deadEndHelper(BinaryTreeNode<Integer> root, int min, int max) {
        if(root == null){
            return false;
        }

        if(min == max){
            return true;
        }

        return deadEndHelper(root.left, min, root.data-1) || deadEndHelper(root.right, root.data+ 1, max);
    }


    public static void replace(int[] arr, int n) {
        for(int i = 0; i < arr.length; i++){
            int successor = -1;
            int diff = Integer.MAX_VALUE;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[i] && (arr[j] - arr[i] < diff)){
                    successor = arr[j];
                    diff = arr[j] - arr[i];
                }
            }
            arr[i] = successor;
        }
    }

    public static int minDiff(BinaryTreeNode<Integer> root, int k) {
//        Stack<BinaryTreeNode<Integer>> h = new Stack<>();
        List<Integer> m = new ArrayList<>();
//        h.add(root);
        while(root != null){
            m.add(root.data);
            root = root.left;
            root = root.right;
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < m.size(); i++){
            int diff = Math.abs(m.get(i) - k);
            if(diff < min){
                min = diff;
            }
        }

        return min;

    }

    public static int median(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;

        int count = counNodes(root);
        int currCount = 0;
        BinaryTreeNode<Integer> current = root, pre = null, prev = null;

        while (current != null)
        {
            if (current.left == null)
            {
                currCount++;
                
                if (count % 2 != 0 && currCount == (count+1)/2)
                    return prev.data;
                
                else if (count % 2 == 0 && currCount == (count/2)+1)
                    return (prev.data + current.data)/2;
                
                prev = current;
                
                current = current.right;
            }
            else
            {
                pre = current.left;
                while (pre.right != null && pre.right != current)
                    pre = pre.right;
                
                if (pre.right == null)
                {
                    pre.right = current;
                    current = current.left;
                }  
  

                else
                {
                    pre.right = null;

                    prev = pre;
                    
                    currCount++;
                    
                    if (count % 2 != 0 && currCount == (count+1)/2 )
                        return current.data;

                    else if (count%2==0 && currCount == (count/2)+1)
                        return (prev.data+current.data)/2;
                    
                    prev = current;
                    current = current.right;

                } 
            }
        } 
        return -1;
    }

    private static int counNodes(BinaryTreeNode<Integer> root) {

        BinaryTreeNode<Integer> current, pre;

        int count = 0;

        if (root == null)
            return count;

        current = root;
        while (current != null)
        {
            if (current.left == null)
            {
                count++;

                current = current.right;
            }
            else
            {
                pre = current.left;

                while (pre.right != null &&
                        pre.right != current)
                    pre = pre.right;

                if(pre.right == null)
                {
                    pre.right = current;
                    current = current.left;
                }

                else
                {
                    pre.right = null;

                    count++;
                    current = current.right;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//        root.left = rootLeft;
//        root.right = rootRight;
//        BinaryTreeNode<Integer> rootTwoRight= new BinaryTreeNode<Integer>(4);
//        BinaryTreeNode<Integer> rootThreeLeft  = new BinaryTreeNode<Integer>(5);
//        rootLeft.right = rootTwoRight;
//        rootRight.left = rootThreeLeft;
        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
       // printTree(root);
        printTreeDetailed(root);
        System.out.println("The size of the largest BST is " + largestBSTSubtree(root));
    }

}

////         5
 //    10         6
//   2    3    -1   -1
//-1   -1-1 9
class LinkedListNode<T> { T data; LinkedListNode<T> next;

public LinkedListNode(T data) { this.data = data; } }

class Index2 {
    int index;
}

class Sum{
    int sum = 0;
}

class Index
{
    int index = 0;
}

class Pair<T, U> {
    T minimum;
    U maximum;

    public Pair(T minimum, U maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

}

class BinarySearchTree {
    private BinaryTreeNode<Integer> root;
    private int size;

    public void insert(int data) {
        //Implement the insert() function
        root = insertHelper(root, data);
    }

    public BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int key){
        if(root == null){
            root = new BinaryTreeNode<>(key);
            return root;
        }

        if(key < root.data){
            root.left = insertHelper(root.left, key);
        }else if(key > root.data){
            root.right = insertHelper(root.right, key);
        }
        return root;
    }

    public void remove(int data) {
        //Implement the remove() function
        root = removeHelper(root, data);
    }

    public BinaryTreeNode<Integer> removeHelper(BinaryTreeNode<Integer> root, int key){
        if(root == null){
            return root;
        }

        if(key < root.data){
            root.left = removeHelper(root.left, key);
        } else if(key > root.data){
            root.right = removeHelper(root.right, key);
        }
        else{
            if(root.left == null){
                return root.right;
            } else if(root.right == null){
                return root.left;
            }

            root.data = minimum(root.right);
            root.right = removeHelper(root.right, root.data);
        }
        return root;
    }

    private static int minimum(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int minLeft = minimum(root.left);
        int minRight = minimum(root.right);
        return Math.min(root.data, Math.min(minLeft, minRight));
    }


    public void printTree() {
        printTreeHelper(root);
    }

    private static void printTreeHelper(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        System.out.print(root.data + ":");
        if(root.left != null){
            System.out.print("L" + root.left.data);
        }
        if(root.right != null){
            System.out.print(",R" + root.right.data);
        }
        System.out.println();
        printTreeHelper(root.left);
        printTreeHelper(root.right);
    }

    public boolean search(int data) {
        //Implement the search() function
        return searchHelper(root, data);
    }

    public boolean searchHelper(BinaryTreeNode<Integer> root, int key){
        if(root == null ){
            return false;
        }
        if(root.data == key){
            return true;
        }

        if(root.data < key){
            return searchHelper(root.right, key);
        }
        if(root.data > key){
            return searchHelper(root.left, key);
        }
        return false;
    }


}