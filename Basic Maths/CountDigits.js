// let n=5890;
// function count(n){
//     let count=0;
//     while(n>0){
//         let lnum=n%10;
//         console.log(lnum)
//         count++;
//         n=parseInt(n/10); //as we dont declare the data type in js so inorder to get the output proper we performed parseint
//     }
//     return count;
// }
// console.log(count(n))



// link:https://leetcode.com/problems/add-digits/  
/**
//  * @param {number} num
//  * @return {number}
 */
// function Countd(n){
//     let fullsum=0;
//   while(n>0){
//     let lastsum=n%10;
//     fullsum=fullsum+lastsum;
//     n=parseInt(n/10);
//   }
//   return fullsum;
// }
// var addDigits = function(num) {
//     while(num>=10){
//         num=Countd(num);
//     }
//     return num;
// };


//finding out reverse and count digits

let num=7896;
let rev=0;
while(num>0){
  let digit=num%10;
  num=Math.floor(num/10);
  rev=(rev*10)+digit;
  console.log(rev)
}
console.log(rev)

