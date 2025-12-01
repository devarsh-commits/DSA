// let a=56;
// //now we gotta check the diviors of the numbers here
// let arr=new Array()
// for(let i=1;i<a;i++){
//     if(a%i===0){
//         arr.push(i)
//     }
// }
// console.log(arr)


let num=36;
 function divisors(num){
    let arr=new Array();
    for(let i=1;i<=Math.sqrt(num);i++){
        if(num%i===0){
            arr.push(i);
            if(num/i!==i) arr.push(num/i)
        }
    }
    return arr;
 }
 let a=divisors(num)
 console.log(a)
const sum=a.reduce((total,num)=>total+num,0)
console.log(sum)