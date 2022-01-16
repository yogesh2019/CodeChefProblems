public class _2_string_inter_and_immutability_and_stringbuilder {
    
}
// memory 
// interning 
// new
// immutability
// performance issue
// equal and ==

// memory
// String s1 = "Hello";
// s1 will go to stack
// on 1st line java will check does intern pool have hello
// String s2= "hello";
// now this time java wont create a new hello it will give address of intern pool to s2 in heap
// so this is called interning that a  new hello wont be getting created
// purpose : save memory
// interning can be avoided using new

// implications of interning
// equals & ==
// so for comparison dont use = use equals why?
// ex
// s1 == s2 will give true but s1 == s3 will give false
// equals check for address first, if false then check value

// 2nd implication : immutability
// what why and impact
// reference is immutable, instance is not
// why ? because others may also be pointing
// impact performance slow
// String s = "_"
// for(int i = 0 ; i < 100 ; i++){
//     s+=i;
// } 
// here each time string will created in heap (pool) and s will point to new address
// now why this is happening is during concat it will copy previous then attach to it 
// for ex hello + e will copy hello to new instance so will perform 5 operations then add operation
// so it will work for O(n2)
// 1 + 2 + 3 + .........+ n
// n(n+1)/2