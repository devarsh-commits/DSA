let arr=[5,3,56,45,8,2,21];
// //now we gonna rum bubble sorting;
// let n=arr.length-1;
// while(n--,n!=0){
//     let temp=0;
//     for(let i=0;i<n+1;i++){
//         if(arr[i]>arr[i+1]){
//             temp=arr[i];
//             arr[i]=arr[i+1];
//             arr[i+1]=temp
//         }
//     }
// }
// console.log(arr)

//above prpgram was for the bubble sort 

//now selection sort

for(let i=0;i<arr.length;i++){
    let min=i;
    let temp=0;
    for(let j=i;j<arr.length;j++){
        if(arr[min]>arr[j]){
            min=j;
        }
    }
    temp=arr[i];
    arr[i]=arr[min];
    arr[min]=temp
}
console.log(arr)