//https://leetcode.com/problems/valid-parentheses/description/
class Solution {
    fun isValid(s: String): Boolean {
         val array = s.toCharArray()
    var stack = ArrayDeque<Char>()
    if(array.isEmpty()){
        return true
    }
    val map=mapOf('(' to ')','{' to '}','[' to ']')

    for(i in 0..array.size-1){

        if(array[i] in map.keys){
            stack.push(array[i])
        }
        else if(!stack.isEmpty() && array[i] ==')' && stack.peek()=='(') {
            stack.pop()
        }
        else if(!stack.isEmpty() && array[i] ==']' && stack.peek()=='[') {
            stack.pop()
        }
        else if(!stack.isEmpty() && array[i] =='}' && stack.peek()=='{') {
            stack.pop()
        }else{
            return  false
        }
    }
    return stack.isEmpty()
    }
}
