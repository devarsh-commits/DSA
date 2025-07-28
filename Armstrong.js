//Code to check wheather the number is Armstrong or not
// let num=153
//  function Armstrong(num){
//     let number=num.toString();
//     let power=number.length;
//     let sum=0;
//     for (let i of number) {
//         sum+=Math.pow(parseInt(i),power)
//     }
//     if(sum===num){
//         return true;
//     }
//     else{
//         return false;
//     }
//  }
//  let a=Armstrong(153);
//  console.log(a)


//the below is javascript methods
//  let str="cdbcbbaaabab";
//  let arr=str.split("")
//  let x=4;
//  let y=5;
//  let point=0;
// for(let i=0;i<arr.length;i++){
//     let string=arr[i]+arr[i+1]
//     if(string === 'ab'){
//        point+=x;
//        arr
//     }
// }


//Solving Everything manually

let num=371
let copynum=num;
let sum=0;
while(num > 0){
    let digits=num%10;
    sum=sum+(digits*digits*digits)
    num=parseInt(num/10)
}
console.log(sum)