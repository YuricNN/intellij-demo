class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

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

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] dataSet = {50, 30, 70, 20, 40, 60, 80, 35, 45, 65};

        System.out.println("----------------------------------------");
        System.out.println("BST Olusturuluyor:");
        for (int data : dataSet) {
            bst.insert(data);
        }
        System.out.print("Olusturulan Agac (Inorder): ");
        bst.inorder();
        System.out.println("\n----------------------------------------");

        int newData = 55;
        System.out.println(newData + " Dugumu Ekleniyor...");
        bst.insert(newData);
        System.out.print("Yeni Agac (Inorder): ");
        bst.inorder();
        System.out.println("\n----------------------------------------");

        int searchKey = 45;
        boolean found = bst.search(searchKey);
        System.out.println(searchKey + " Araniyor...");
        System.out.println(searchKey + " Dugumu Agacta: " + (found ? "BULUNDU" : "BULUNAMADI"));
        System.out.println("----------------------------------------");

        int deleteKey = 30;
        System.out.println(deleteKey + " Dugumu Siliniyor (Iki Cocuklu)...");
        bst.delete(deleteKey);
        System.out.print("Silme Sonrasi Agac (Inorder): ");
        bst.inorder();
        System.out.println("\n----------------------------------------");
    }
}