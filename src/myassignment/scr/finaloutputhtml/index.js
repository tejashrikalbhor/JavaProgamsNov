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
var ts=`<p id="ts">${totalCount}</p>`;
var cp=`<p id="cp">${countPass}</p>`;
var cf=`<p id="cf">${countFail}</p>`;

var statusCount= new Array();
statusCount.push({
childCount: ts,
passChild: cp,
failChild: cf,
});
