#########################insert.java#####################################################
/*Insert class with functions for inserting both integer and string data
  in the binary search tree
*/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aviral
 */
public class insert {
    
    //Insert in BST for integer values
    public static void insert(node node,int value) {
       if (value < node.data) {
         if (node.left != null) {
             insert(node.left, value);
         }
         else 
         {
            System.out.println("  Inserted " + value +  " to left of node " + node.data);
             node.left = new node(value);
         }
      } else if (value > node.data) {
          if (node.right != null) {
             insert(node.right, value);
            }
          else {
              System.out.println("  Inserted " + value + "  to right of node " + node.data);
              node.right = new node(value);
             }
         }
      }
    
    //Insert in BST for String values
    public static void insert1(NodeStr node,String value) {
       if (value.compareTo(node.data)<0) {
         if (node.left != null) {
             insert1(node.left, value);
         }
         else 
         {
            System.out.println("  Inserted " + value +  " to left of node " + node.data);
             node.left = new NodeStr(value);
         }
      } else if (value.compareTo(node.data)>0) {
          if (node.right != null) {
             insert1(node.right, value);
            }
          else {
              System.out.println("  Inserted " + value + "  to right of node " + node.data);
              node.right = new NodeStr(value);
             }
         }
      }
    
}
