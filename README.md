# Find the first duplicate element
<br/>
Find the first duplicate element in an array of Strings using a Hashmap.
<br/><br/>
A solution involving nested loops to compare each element in the array to the rest of the elements
in the array runs N + (N-1) + (N-2) + (N-3) times (in the worst case scenario) resulting in O(N²) time.
Using a hashmap allows us to perform a lookup and either an insertion or return in the same step. While iterating through the array, if an element is found to already exist (added earlier in the loop) then it simply returns that element other wise it adds it to the hashmap. 

