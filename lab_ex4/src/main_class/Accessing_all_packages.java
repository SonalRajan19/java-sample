/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_class;
import Firstpackage.*;
import Secondpackage.*;
import Secondpackage.Subpack.*;
/**
 *
 * @author SONAL L R
 */
public class Accessing_all_packages {
    public static void main(String[] args) {
        Firstclass f=new Firstclass();
        f.first();
        Secondclass s=new Secondclass();
        s.second();
        Thirdclass t=new Thirdclass();
        t.third();
    }
}
