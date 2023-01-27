function countStatus(status){
if(status =="pass"||status =="Pass"||status =="PASS"){
countPass=countPass+1;
arrPass.push(countPass);
}
else{
if(status =="fail"||status =="Fail"||status =="FAIL"){
countFail=countFail +1;
arrFail.push(countFail);
}
}
}