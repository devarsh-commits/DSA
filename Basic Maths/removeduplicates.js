let nums=[0,0,1,1,1,2,2,3,3,4]
let newarr=new Array();
for(let i=1;i<=nums.length;i++){
    if(nums[i]!==nums[i-1]){
        newarr.push(nums[i-1])
    }
}

console.log(newarr)