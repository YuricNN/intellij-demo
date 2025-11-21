class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private boolean searchRec(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    private Node deleteRec(Node root, int key) {
        if (root == null)
            return root;

        if (key < root.data) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key);
        } else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);

            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}