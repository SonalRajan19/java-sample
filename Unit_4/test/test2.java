/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sonal L R
 */
public class test2 {
    public static void main(String[] args){
        display arr = new display();
        arr.x = 0;     
        arr.cal(2);
        System.out.print(arr.x);
    }
}
interface calculate{
    void cal(int item);
}
class display implements calculate{
    int x;
    public void cal(int item){
        x = item * item;            
    }
}