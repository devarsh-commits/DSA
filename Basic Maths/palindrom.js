//problem to check if number is palindrome;
let num=121;
let rev=0;
let duunum=num;
while(num!=0){
  let digits= num%10;
  num=Math.floor(num/10);
  rev=(rev*10)+digits
}
if(rev===duunum){
    console.log("Palindrime")
}
else console.log("Not")