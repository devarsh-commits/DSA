
//binary search should have an sorted array
// let n=arr.length-1;
// while(n--,n!==0){
//     for(let i=0;i<=n;i++){
//         let temp=0;
//         if(arr[i]>arr[i+1]){
//             temp=arr[i+1]
//             arr[i+1]=arr[i];
//             arr[i]=temp
//         }
//     }
let arr=[
   4, 12, 32, 45,
  65, 74, 85, 96
]
let target =4;
let start=0;
let end=arr.length-1;
while(start<end){
    let mid=parseInt((start+end-1)/2);
    if(target<arr[mid]){
        end=mid-1;
    }
    else if(target>arr[mid]){
        start=mid+1
    }
    else{
        console.log(mid)
        break;
    }
}
