/*
 * InputValidWhileIndent.java
 *
 * Created on November 10, 2002, 9:16 PM
 */

package com.google.checkstyle.test.chapter4formatting.rule42blockindentation;

/**
 *
 * @author  jrichard
 */
public class ValidWhileIndent {
    
    /** Creates a new instance of InputValidWhileIndent */
    public ValidWhileIndent() {
    }
    
    private void method1()
    {
        boolean test = true;
        
        while (test) System.getProperty("foo");

        while (test) 
            System.getProperty("foo");
        
        while (test) {
        }

        while (test) 
        {
        }

        while (test) 
        {
            System.getProperty("foo");
        }

        while (test)  {
            System.getProperty("foo");
        }
        
        while (test)  {
            System.getProperty("foo");
            System.getProperty("foo");
        }
        
        while (test)  
        {
            System.getProperty("foo");
            System.getProperty("foo");
        }

        while (test)  {
            if (test) {
                System.getProperty("foo");
            }
            System.getProperty("foo");
        }
        
        while (test)
            System.getProperty("foo");

        if (test) {
            while (test)
                System.getProperty("foo");
        }
        
        while (test 
            && 4 < 7 && 8 < 9
            && 3 < 4) {
        }
        
    }
    
}