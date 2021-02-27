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
    public static void aMethod() throws Exception{
        try{
            throw new Exception();
        }
        finally{
            System.out.println("finally ");
        }
    }
    public static void main(String[] args){
        try{
            aMethod();
        }
        catch(Exception e){
            System.out.println("exception ");
        }
        System.out.println("finished ");
    }
}