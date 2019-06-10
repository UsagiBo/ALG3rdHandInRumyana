/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Comparator;

public class Test
{
    public static void main(String[] args)
    {
        IMap<Integer, String> map = new TreeMap<>();
        // enable normal assertions by adding -ea under Poject->Properties->Run->VM Options
        assert(map.size() == 0);
                
        map.put(3, "Red");
        map.put(9, "Yellow");
        map.put(16, "Green");
        map.put(11, "Blue");
        assert(map.size() == 4);
        
        assert(map.get(100) == null);
        
        System.out.println("The Rainbow goes :"); 
        System.out.println(map.get(3));
        System.out.println(map.get(9));
        System.out.println(map.get(16));
        System.out.println(map.get(11));
       
    }
}
