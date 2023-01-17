package practiceforinterviews;

import java.util.List;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

//to practice for tech interviews

public class Practice {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        //factorial of number via recursion
        int number = 5;
        /*
        int factorial = FactorialViaRecurrsion(number);
        System.out.println("Factorial of a "+ number +  " is " + factorial);
        System.out.printf("Factorial of a number %s is %s", number, factorial);
        */

        //factorial of number via for loop
        /*
        int factorial_loop = FactorialViaLoop(number);
        System.out.println("Factorial of a "+ number +  " is " + factorial_loop);
        System.out.printf("Factorial of a number %s is %s", number, factorial_loop);
        System.out.println();
        */

        //Find the occurences of elements in the array.
        /*
        int[] arr = new int[]{1, 2, 3, 4, 4, }; 
        Hashtable ht = CountOfValues(arr);
        System.out.println(ht);
        */

        //Sort the elements in the array.
            //bubble sort
            //quick sort
        //Build a tree (binary)
        /*
        //Traverse the tree
        BinaryTree tree = BuildATree(); //{1,2,3,4,5}
            // Left, Root, Right (in-order) traversal
            BinaryTree.printInorder(tree.root);
            // Left, Right, Root (post-order) traversal
            BinaryTree.printPreorder(tree.root);
            // Root, Left, Right (pre-order) traversal
            BinaryTree.printPostorder(tree.root);
        */

        /*
        //Try catch finally block. see CountOfValues function.

        */

        //Oops concepts - Encapsulation, Abstraction, Polymorphism, Inheritance
        
            //Operators.Add1(); //Interfaces
            /*
            Shape s = new Square(10); //Abstraction.
            System.out.println("Area of " + s.shape_name + s.area());
            System.out.println("Permiter of " + s.shape_name + s.perimeter());

            Shape s1 = new Circle(10);
            System.out.println("Area of " + s1.shape_name + s1.area());
            System.out.println("Permiter of " + s1.shape_name + s1.perimeter());
            */
            
            //Inheritance
            /*
            Car c = new Car();
            System.out.println("Name the vehicle is " + c.VehicleName());
            System.out.println("Color of the vehicle is " + c.VehicleColor());
            */

            //Polymorphism - compile time (method overloading), run time (extends base class)
        //Implement exception class for outorrange condition or something similar to know how the IMPLEMENTS, or EXTENDS work.

        //@Todo: Multithread basic program - pritn 1- 100 in a multi thread program
        //@Todo: Build a tree/heap
        //@Todo: Build a linked list and doubly link list
        //@Todo: Build a stack and queue
        //@Todo: Solve some string and array problems like merging arrays, finding subset of arrays, etc.
        
    }

    public static int FactorialViaRecurrsion(int number)
    {
        if(number <= 1)
        {
            return 1;
        }else{
          return number * FactorialViaRecurrsion(number - 1);
        }
    }

    /**
     * @param number
     * @return
     */
    public static int FactorialViaLoop(int number)
    {
        int factorial = 1;
        for(int num = 1; num <= number; num++)
        {
            factorial = num * factorial;
        }

        return factorial;
    }

    public static Hashtable CountOfValues(int[] Values)
    {
        Hashtable<Integer, Integer> dict = new Hashtable<Integer, Integer>();
        try
        {
            for(int i = 0; i < Values.length; i++)
            {
                    if(!dict.containsKey(Values[i]))
                    {
                        dict.put(Values[i], 1);
                    }else{
                        dict.put(Values[i], dict.get(Values[i]) + 1);
                    }
            }    
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds :: Accessed index out of bounds");
        }
        catch(Exception e)  
        {  
            System.out.println("Exception :: " + e.getMessage ());  
        }finally
        {
            System.out.println("Code executed in finally block");
        }
        return dict;
    }

    public static BinaryTree BuildATree()
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        return tree;
    }
}
