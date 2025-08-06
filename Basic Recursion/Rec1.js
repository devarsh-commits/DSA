let count=0;
function fun(){
    if(count===3){
        return
    }
    else{
        console.log(count)
        count++;
        fun(); //here the recursion happening
    }
}

function Main(){
    fun()
}
Main()