/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bfs;

/**
 *
 * @author Student
 */
public class node {
    int state;
    int cost;
    node parent;
    
    node(int state,int cost,node parent){
        this.state=state;
        this.cost=cost;
        this.parent=parent;
    }
}
