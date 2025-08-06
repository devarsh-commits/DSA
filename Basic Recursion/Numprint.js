function Printnum(num,times){
    if(num>times){
        return
    }
    else{
        console.log(num)
        Printnum(num+1,times)
    }
}
function Printrnum(num){
    if(num===0){
        return
    }
    else{
        console.log(num)
        Printrnum(num-1)
    }
}

function Main(){
    let num=10;
    Printnum(num,1)
    Printrnum(10)
}
Main()