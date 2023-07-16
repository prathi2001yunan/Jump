fun main() { 
  print("Enter text: ")
    var input = readLine()!!
   var str =  input.toString()
    
    
val strs = str.split(" ").toTypedArray()
var str1 = "${strs[2].toString()}  ${strs[3].toString()}  ${strs[4].toString()} "

var value = 0
 var num1 = strs[2].toInt()
 var num2 = strs[4].toInt()
 var k = "plus"
 var k1 = "add"
 var k2 = "minus"
 var k3 = "subtract"
 var k4 = "multiply"
 var k5 = "multiplied"
 var k6 = "divided"
 var k7 = "divide"
if(strs[3].toString() == k || strs[3].toString() == k1  ){
    value =num1 + num2
  
    
}
if(strs[3].toString() == k2 || strs[3].toString() == k3  ){
    value =num1 - num2
  
    
}
if(strs[3].toString() == k4 || strs[3].toString() == k5  ){
    value =num1 * num2
  
    
}
if(strs[3].toString() == k6 || strs[3].toString() == k7  ){
    value =num1 / num2
  
    
}
print("$str1 is $value")

       
}
   


       

           
       
