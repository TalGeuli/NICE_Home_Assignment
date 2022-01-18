# NICE_Home_Assignment

### First Solution

The space complexity is array from size max-min+1 and constant number of variables – O(n).

In the worst case, the time complexity is not bounded because we are drawing random numbers until we get all the numbers in range.
The expected time complexity is O(nlog(n)) – the expected number of draws until we draw all the elements.

### Alternative Solution

The space complexity is array from size max-min+1 and constant number of variables – O(n).

The time complexity is O(n) – we have two iterations, the first one adds all the elements and the second one removes all of them.

