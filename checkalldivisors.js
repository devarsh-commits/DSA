let a=56;
//now we gotta check the diviors of the numbers here
let arr=new Array()
for(let i=1;i<a;i++){
    if(a%i===0){
        arr.push(i)
    }
}
console.log(arr)