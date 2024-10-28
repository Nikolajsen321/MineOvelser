package BinereSogeTreer;

import java.util.Comparator;

public class BinarySearchTreeNoter {
    public static void main(String[] args) {
        /*

        Binary sarch tree time complexity for search, insertion, og deletion operationer er
        hvis gennemsnit for operationer er O(log(n))
        hvor for lister og linked lister er den  O(n)

        For hver node i et binary search tree, the value of its left child is less than
            the value of the node and the value of the right child is greater than the vlaue
        of the node

        Husk: stack, og queues er linear struktur der består af en sekvens af elementer

        Binary tree er en hierakisk struktur: det er enten tomt eller består af et element , kaldet en root
        og to distinct binary trees  kaldet venstre subtree og højre subtree
        hvor den ene eller begge kan være tomme  figur 25.1a og b

        Hver node i binary treee har 0, 1 eller 2 subtreee

        Length af path er nummeret af edges in the path
        depth of a node is  the length of the path from the root to the node
        The set of all nodes at a  given depth is somtimen called the level of the tree

        Siblings nodes der deler samme parent nodes

        The root of a left (right) subtree of a node is called a left(right) child of the node

        A node without a children is called a leaf

        Height of a nonembty tree is length of path from root node to its furthest leaf

       Height of a tree that contains a single node is 0
       conventionaly the hegiht of an embty tree is -1

      Tænk på  tree figure 25.1b
       længden af path  fra node 60 til 45 er 2
       depth af node 60 er 0  og depth af node 55 er 1  og depth af node 45 er 2

       Binary search tree (BST) er ofte brug bart (ingen dupletter elementer) har en
       property der for hver node i træet, værdien af venstre child er mindre end
       værdien for noden  og værdien for højre child er større end værdien for noden


      binary search tree kan implementeres ved at bruge en linked struktur
      altså et set af linked nodes  hvor node indholder en værid og to links kaldet
      left og right reference left child and right child respektivly  figur 25.3
    // node kan defineres på følgende måde her er den tekst der høre til eksempel ex1


    BST gør det muligt at effektiv at søge på en måde der minder om
    binary search

    for at søge et element i BST, kan man starte fra roden og can hele vejen ned
    indtil match er fundet eller man kommer til et tomt subtree

    eksemepel på algorithme ex2

    så man kigger
   1. Lad current er roden af træet
   2.mens current ikke er null
   -  if e is less than current.element assign currnet.left to current
   -  if e is greater than current.element assign current.right to current
   -  if e is equal to current.element  return true
   3. hvis man når dette punkt betyder det at man har gennemgået hele træet uden at finde element



   Inserting element into BST:
    For at indsætte et element (Inserting) ind i BST , skal man først lokalisere hvor i træet
    man vil gør det, key idea er at lokalisere parent for den nye node ex3
    Det vil sige hvis tree is empty, create a root node med nyt element , eller lokalisere
    parent node  for the new element node
    create new node for the element og link denne node til dens parrent node

    If the new element is less than the parent element, the node
    for the new element will be the left child of the parent. If the new element is greater

    kig på figur 25.4 side 985


    Tree traversel
    This section presents inorder, postorder, preorder, depth-first, and
    breadth-first traversals.

     With inorder traversal, the left subtree of the current node is visited first recursively, then
    the current node, and finally the right subtree of the current node recursively. The inorder
    traversal displays all the nodes in a BST in increasing order, as shown in Figure 25.5.
    Inorder: 45 55 57 59 60 67 100 101 107 (udskriver først når den har venstre rekursive kald er færdig)
    så løber ned i bunden og printer det og så til et andet hvor dnen så tager højre til den rammer root
    så fra tager den hjre køre ned der var mulighed for venstre tager den

    With postorder traversal, the left subtree of the current node is visited recursively first, then
    recursively the right subtree of the current node, and finally the current node itself.
    Postorder: 45 59 57 55 67 101 107 100 60
    bedarbejder venstre og højre først og så

    With preorder traversal, the current node is visited first, then recursively the left subtree of
     the current node, and finally the right subtree of the current node recursively.
     Preorder: 60 55 45 57 59 100 67 107 101 (udskriv hver gang den passerer en node)

     eksempel figur 25.5 side 986


     Depth-first traversal is to visit the root then recursively visit its left subtree and right subtree
     in an arbitrary order. The preorder traversal can be viewed as a special case of depth-first
     traversal, which recursively visits its left subtree then its right subtree.
     With breadth-first traversal, the nodes are visited level by level. First the root is visited, then
     all the children of the root from left to right, then the grandchildren of the root from left to right,
      and so on.

      For example, in the tree in Figure 25.5, the inorder is
      45 55 57 59 60 67 100 101 107

      The postorder is
     45 59 57 55 67 101 107 100 60

     The preorder is
     60 55 45 57 59 100 67 107 101

     The depth-first is
     60 55 45 57 59 100 67 107 101

     The breadth-first traversal is
     60 55 100 45 57 67 107 59 101



     BTS klassen



     Deleting Elements from BTS
     Mere complex at delete fra binary sarch tree.
     Doing so is far more complex than adding an element into a binary search tree

     to delete element from binary search tree you need to lcoate the node that contains the element
     and also its parent node
     Lad current point til noden der indholder elementet i binary search tree og parent
     point til parent af den current node

     Current node kan fx være left child eller right child af parent node

     to cases at overveje:
      Case 1: The current node does not have a left child, as shown in Figure 25.9a. In this case,
      simply connect the parent with the right child of the current node, as shown in Figure 25.9b.
      For example, to delete node 10 in Figure 25.10a, you would connect the parent of node 10
     with the right child of node 10, as shown in Figure 25.10b.

     Case 2: The current node has a left child. Let rightMost point to the node that contains
     the largest element in the left subtree of the current node and parentOfRightMost point
     to the parent node of the rightMost node, as shown in Figure 25.11a. Note the rightMost
     node cannot have a right child but may have a left child. Replace the element value in the
     current node with the one in the rightMost node, connect the parentOfRightMost
     node with the left child of the rightMost node, and delete the rightMost node, as shown
     in Figure 25.11b.

     Ja, det er korrekt. Når man finder det største element i et deltræ af et
     binært søgetræ (BST), er man på udkig efter det yderste højre (rightmost) element.
     Dette er det største tal eller knude i det deltræ.

    Når man traverserer til venstre i BST, vil man fortsætte med at
    gå til venstre, indtil man ikke længere har en højre child. Den sidste knude,
    man når, inden man ikke har flere højre børn, vil være det største element i det deltræ.

    Så ja, det første man finder til højre i princippet eller det
     største tal i deltræet er det samme og repræsenterer det største element i det deltræ.



     Man snakker om perfekt balanceret træer når de ikke variere mere end dybden af 1

     Smart at bruge ved ukendte værdier/data ukendte mængde af data som kan tilføjes

     ikke smart at bruge hvis man har en mængde sorteret data da
     det kommer til at blive kædestruktur, langgren med knupper

     (kig i slides)
     delete ikke triviel fordi tal skal sættes til at pege på noget igen
     node med to børn skal finde største element i træet fx  88 mindre end 88
     fx 82 i eksemplet så slettes node 82 og flyttes op hver der stod 88 før




         */



    }
    // node kan defineres på følgende måde ex1
    class TreeNodeTest<E>{
        protected E element ;
        protected TreeNodeTest<E> left;
        protected TreeNodeTest<E> right;

        protected TreeNodeTest<E> root;


        public TreeNodeTest(E e){
            element = e;

        }
        /*
        Main:
        TreeNodeTest<Integer> root = new TreenodeTest<> (60)
        root.left = new TreeNodeTest<>(55)
        root.right = new TreeNodeTest<>(100)

         */
        //ex2
//        public boolean sarch(E e){
//            TreeNodeTest<E> current

        /*while(current != null){
           if(e < current.element){
           current = current.left //go left
           }
           else if(e > current.element){
           current = current.right; // go right
           }
           else {//element e matches current.element
           return true; //Element e is  found
           }
           return false; element not found
         */
//        }


        //Ex3 locate parent node

        /*
        boolean insert(E e) {
        if(tree is empty){
        create the node for e as the root
        }
        else{
        //lokalisere parrent node
        parent = current  = root;
        while(current != null){
        if(e < the value in current.element){
        parent = current; //keep the parent node
        current = current.left //go left
        }
        else if(e > the value in current.element){
        parrent = current; // keep parent
        current = current.right // go right
        }
        else{
        return false //duplicate node not inserted
       }
       create new node for e and attach it to parent
       return true;  // element inserted
         */
        }



        //Algo for at delete element i BST

    /*
         boolean delete(E e){
         locate  element e in the tree
         if element e is not found
         return false

         let current be the node that contains e and parrent be the parent of current
         if(current has no left child) //Case1{
         Connect the right child of current with parent
         Now current is not referenced, so it is elimanated
         else //Case2{
         Locate the rightmost node in the left subtree of current
         Copy the element value in the right most node to current
         Connect parent of the rightmost node to the left child of right most
         return true; //element deleted

         The complete implementation of the delete method is given in lines 162–220 in Listing 25.4.

         Case 1 of the algorithm is covered in lines 183–194. In this case, the current node has
         no left child (i.e., current.left == null). If parent is null, assign current.right to
         root (lines 185–187). Otherwise, assign current.right to either parent.left or parent.
         right, depending on whether current is a left or a right child of parent (189–192).

         The algorithm locates the rightmost node (named rightMost) in the left subtree of the current
         node and also its parent (named parentOfRightMost) (lines 199–205). Replace the element
         in current by the element in rightMost (line 208); assign rightMost.left to either
         parentOfRightMost.right or parentOfRightMost.left (lines 211–215), depending
         on whether rightMost is a right or a left child of parentOfRightMost.
        Listing 25.7 gives a test program that deletes the elements from the binary search

     */

    }


