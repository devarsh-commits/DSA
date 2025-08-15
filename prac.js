// let s = "PPALLL"
// let arr = s.split("");
// let count = 0;
// let count1 = 0;
// for (const data of arr) {
//     if (data === "A") {
//         count++;
//         console.log(count)
//     }
//     if (data === "L") {
//         count1++
//         console.log(count1)
//     }
// }
// let dt=String;

// dt="dev"
// console.log(dt)
// if(count===3||count1===3){
//     return false
// }
// else{
//     return true
// }


// let n=3;
// if( n <=3){
//     console.log(n)
//     n--;
// }
// if(n<=3){
//     console.log(n)
// }
// let str="A man, a plan, a canal: Panama";
// let s=str.replace(/[^a-zA-z]/g,"")
// let mains=s.toLowerCase().split("").reverse().join("")
// console.log(mains);
function table(num,i){
  if(i>10){
    return num
  }
  else{
    console.log(num*i)
    table(num,i+1)
  }
}
function main(){
let num=2;
let i=1
  table(num,i)
}
main()