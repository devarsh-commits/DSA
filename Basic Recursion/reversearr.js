//solving the problem using two pointers
function revers(start, end, arr) {
    while (start < end) {
        let temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp
        start++
        end--
    }
    return arr
}

//now solving the problem with recursion
function recursreverse(start, end, arr) {
    if(start<end){
    let temp = arr[end];
    arr[end] = arr[start];
    arr[start] = temp
    recursreverse(start+1,end-1,arr)
}
    }

function main() {
    let arr = [1, 2, 3, 4, 5, 6];
    // console.log(revers(0, arr.length - 1, arr))
     recursreverse(0,arr.length-1,arr)
     console.log(arr)
}
main()