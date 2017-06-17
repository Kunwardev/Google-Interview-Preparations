/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LeetCode;

/**
 *
 * @author Kunwar
 */
// Java implementation of above algorithm
 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
 
public class E_LRU
{
    // Method to find page faults using indexes
    static int pageFaults(int pages[], int n, int capacity)
    {
        // To represent set of current pages. We use
        // an unordered_set so that we quickly check
        // if a page is present in set or not
        HashSet<Integer> s = new HashSet<>(capacity);
      
        // To store least recently used indexes
        // of pages.
        HashMap<Integer, Integer> indexes = new HashMap<>();
      
        // Start from initial page
        int page_faults = 0;
        for (int i=0; i<n; i++)
        {
            // Check if the set can hold more pages
            if (s.size() < capacity)
            {
                // Insert it into set if not present
                // already which represents page fault
                if (!s.contains(pages[i]))
                {
                    s.add(pages[i]);
      
                    // increment page fault
                    page_faults++;
                }
      
                // Store the recently used index of
                // each page
                indexes.put(pages[i], i);
            }
      
            // If the set is full then need to perform lru
            // i.e. remove the least recently used page
            // and insert the current page
            else
            {
                // Check if current page is not already
                // present in the set
                if (!s.contains(pages[i]))
                {
                    // Find the least recently used pages
                    // that is present in the set
                    int lru = Integer.MAX_VALUE, val=Integer.MIN_VALUE;
                     
                    Iterator<Integer> itr = s.iterator();
                     
                    while (itr.hasNext()) {
                        int temp = itr.next();
                        if (indexes.get(temp) < lru)
                        {
                            lru = indexes.get(temp);
                            val = temp;
                        }
                    }
                 
                    // Remove the indexes page
                    s.remove(val);
      
                    // insert the current page
                    s.add(pages[i]);
      
                    // Increment page faults
                    page_faults++;
                }
      
                // Update the current page index
                indexes.put(pages[i], i);
            }
        }
      
        return page_faults;
    }
     
    // Driver method
    public static void main(String args[])
    {
        int pages[] = {7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2};
        
        int capacity = 4;
         
        System.out.println(pageFaults(pages, pages.length, capacity));
    }
}