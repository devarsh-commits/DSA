//writing a recursion to print name n times
function Pname(i,n){
    if(i>=n){
        return
    }
    else{
        console.log("Devarsh")
        Pname(i+1,n)
    }
}
function main(){
    let i=1;
    Pname(i,4)
}

main()