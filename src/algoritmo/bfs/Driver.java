/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmo.bfs;

import algoritmo.bfs.BreadthFirstSearch;
import algoritmo.bfs.Node;

/**
 *
 * @author FLORES-POZO
 */
public class Driver {

   
    public static void main(String args[]){
       
    	Node station1 = new Node("Westminster", null, null);
        Node station2 = new Node("Waterloo", station1, null);
        Node station3 = new Node("Trafalgar Square", station1, station2);
        Node station4 = new Node("Canary Wharf", station2, station3);
        Node station5 = new Node("London Bridge", station4, station3);
        Node station6 = new Node("Tottenham Court Road", station5, station4);
         
        BreadthFirstSearch bfs = new BreadthFirstSearch(station6, station2);

        if(bfs.compute())
            System.out.print("Path Found!");
    }
    
}
