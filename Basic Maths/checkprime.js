//doin it function wise
function checkPrime(num){
    if(num===1){
        return true;
    }
    else if(num===0){
        return 0
    }
    else{
        for(let i=2;i<num;i++){
            if(num%i===0){
                return false;
            }
            else{
                return true
            }
        }
    }
}
console.log(checkPrime(121))

//the above program is all about prime number 

//find the prime numbers of the given range

function primeRange(range){
    let arr=new Array();
    for(let i=2;i<=range;i++){
        let trueval=true;
        for(let j=2;j<=Math.sqrt(i);j++){
           if(i % j ===0){
            trueval=false;
           }
        }
        if(trueval) arr.push(i)
    }
    return arr
}
console.log(primeRange(20))