##################node.java#################################################

//Node Class for integer data

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aviral
 */

public class node{
	int data;
        node left;
	node right;
	

	node(int data){
		left=null;
		right=null;
		this.data=data;
	}

  	public String toString(){

		return String.valueOf(data);
	}

  }


