let  nums = [0,0,1,1,1,2,2,3,3,4];
let arr=new Array()
for(let i=0;i<nums.length;i++){
    if(nums[i]!=nums[i+1]){
        arr[i]=nums[i]
    }
}
console.log(arr.sort().slice(0,5))
