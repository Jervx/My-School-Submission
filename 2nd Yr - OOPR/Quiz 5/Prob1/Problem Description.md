# 1. Binary Search
**by CodeChum**

Searching is one very important Computer Science task. When you have a list, searching is natural. You would want to search for an item in the list. If the list is not sorted, there is no way to it but do a linear search - check each element until the item is found or until there are no elements left to inspect.



But when the list is sorted, searching becomes way faster! Think of the dictionary; the actual printed dictionary. The words there are sorted from A-Z. And searching for what soliluquy means you should not start from A and turning the pages one by one until you reach the entries for the letter S.



What do you usually do? You open the dictionary right smack in the middle and see if you are in the letter S. If you are short and are brought to a letter before S, you try to estimate and open a page to the right of where you are currently. If you went beyond S, you try to open a page before the page you are currently at.



This is called Binary Search.



You are going to use the List to store the numbers. Sort the list via Collections.sort(). It is used as shown below:

    List <Integer> list = new LinkedList<Integer>();
    list.add(19);
    list.add(8);
    list.add(3);
    list.add(11);
    list.add(15);

Collections is found in the java.util package.

**Input Format**

    The first line contains a positive integer n that represents the number of items there are. The second line contains the n numbers. The third line contains one last number which is the search item: the item that needs to be searched in the list.

**Input Sample**

    10
    1 2 3 4 5 6 7 8 9 10
    7

**Output Format**

The numbers should be stored in a list and should be sorted. Print the sorted items in one line. And in a line that should follow, print the count of iterations it took for the binary search to finish. And finally, print whether the search item is "FOUND" or "NOT FOUND".

**Output Sample**

1 2 3 4 5 6 7 8 9 10
4 FOUND



### Testcase 2

**Input Sample**

    10
    100 90 80 70 60 50 40 30 20 10
    4

**Output Sample**

    10 20 30 40 50 60 70 80 90 100
    3 NOT FOUND


### Testcase 3
**Input Sample**

    12
    50 25 12 34 70 90 85 65 44 77 10 98
    70

**Output Sample**

    10 12 25 34 44 50 65 70 77 85 90 98
    4 FOUND