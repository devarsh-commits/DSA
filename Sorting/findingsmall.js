let arr=[6,8,2,4,9,7];
let temp=0;
let min=Math.max(100);
for(let i=0;i<arr.length;i++){
    let temp=0;
    let min=i;
    for(let j=i+1;j<arr.length;j++){
        if(arr[min]>arr[j]){
            min=j;
        }
    }
    temp=arr[i];
    arr[i]=arr[min];
    arr[min]=temp

}
console.log(arr)