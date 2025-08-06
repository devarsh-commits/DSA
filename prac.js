let s = "PPALLL"
let arr = s.split("");
let count = 0;
let count1 = 0;
for (const data of arr) {
    if (data === "A") {
        count++;
        console.log(count)
    }
    if (data === "L") {
        count1++
        console.log(count1)
    }
}
let dt=String;

dt="dev"
console.log(dt)
// if(count===3||count1===3){
//     return false
// }
// else{
//     return true
// }