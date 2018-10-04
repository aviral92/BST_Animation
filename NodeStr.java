###################################NodeStr.java#############################################

//Node class for String data

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aviral
 */
public class NodeStr {
    String data;
        NodeStr left;
	NodeStr right;
	

	NodeStr(String data){
		left=null;
		right=null;
		this.data=data;
	}

  

	public String toString(){

		return String.valueOf(data);
	}

  }
