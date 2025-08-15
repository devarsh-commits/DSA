function fact(num){
    if(num===0){
        return 1;
    }
    else{
        return num*fact(num-1)
    }
}

function main(){
console.log(fact(4))
}
main()