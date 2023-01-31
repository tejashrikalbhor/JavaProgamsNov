
window.addEventListener('load', () => {


debugger


var storedArray = JSON.parse(sessionStorage.getItem("items"));
var duplicateArray = storedArray;

var countPass =duplicateArray==null?0:duplicateArray.filter(function(element){return (element.status == 'pass')||(element.status == 'Pass')||(element.status == 'PASS');}).length

var countFail =duplicateArray==null?0:duplicateArray.filter(function(element){return (element.status == 'fail')||(element.status == 'Fail')||(element.status == 'FAIL');}).length



document.getElementById("countPass").innerHTML=countPass;
document.getElementById("countFail").innerHTML=countFail;

var totalCount=storedArray==null?0:storedArray.length;
document.getElementById("steps").innerHTML=totalCount;

display_current_date_homePage();

var statusCount=new Array();
statusCount.push({
    ts:totalCount,
    cp:countPass,
    cf:countFail

});



var statusGroup =new Array();
 statusGroup.push({


				childCount: statusCount.ts,

				passChild:statusCount.cp,

				failChild: statusCount.cf,

			});

//document.getElementById("statusGroup").innerHTML=statusGroup;



for (let i = 0; i < storedArray.length; i++) {
	var name = storedArray[i].name;
	var status = storedArray[i].status;
	var current_date = storedArray[i].current_date;
if((status == 'pass')||(status == 'Pass')||(status == 'PASS')){
    var html=`<ul class='collapsible node-list' data-collapsible='accordion'><li class='node level-1 leaf pass' status='pass' id='pass'><div class='collapsible-header'><div class='node-name'>${name}</div> <span class='node-time'>${current_date}</span>&middot; <span class='node-duration'>0h 2m 32s+291ms</span><span class='test-status right pass'> ${status}</span></div><div class='collapsible-body'></div> `;
    document.getElementById("tbl").insertAdjacentHTML("beforeend",html);
}
else{
if((status == 'fail')||(status == 'Fail')||(status == 'FAIL'))
	{
    var html=`<ul class='collapsible node-list' data-collapsible='accordion'><li class='node level-1 leaf fail' status='fail' id='fail'><div class='collapsible-header'><div class='node-name'>${name}</div> <span class='node-time'>${current_date}</span>&middot; <span class='node-duration'>0h 2m 32s+291ms</span><span class='test-status right fail'> ${status}</span></div><div class='collapsible-body'></div> `;
	document.getElementById("tbl").insertAdjacentHTML("beforeend",html);

}
}
}
//refreshPage();
})

function current_Date(){

var options = {  year: 'numeric', month: 'short', day: 'numeric' };
var today  = new Date();

var curr_date = today.toLocaleString("en-US",options);
var curr_time=today.toLocaleString("en-US");
let curr_time_am_pm=curr_time.slice(10);

var current_date_time =curr_date+curr_time_am_pm;
return current_date_time;
}

function display_current_date_homePage(){

var display_date=current_Date();
document.getElementById("blue darken_display_date").innerHTML=display_date;
document.getElementById("iteration1_date").innerHTML=display_date;

document.getElementById("start-time").innerHTML=display_date;
document.getElementById("end-time").innerHTML=display_date;

document.getElementById("panel-lead-start-time").innerHTML=display_date;
document.getElementById("panel-lead-end-time").innerHTML=display_date;

}


function refreshPage(){
    window.location.reload();

}
