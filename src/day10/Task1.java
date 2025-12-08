package day10;

public class Task1 {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(20);

        // добавляем остальные узлы (пример дерева)
        tree.insert(10);
        tree.insert(30);
        tree.insert(5);
        tree.insert(15);
        tree.insert(25);
        tree.insert(35);


        tree.printInOrder();
    }
}
