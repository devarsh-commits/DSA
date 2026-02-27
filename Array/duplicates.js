let arr=[1,1,2,2,3,4]
let j=0
for(let i=1;i<=arr.length;i++){
    if(arr[i]!==arr[i-1]){
        j+=1;
        arr[j]=arr[i]
    }
}
console.log(arr)