window.addEventListener('load', () => {
debugger

display_current_date_hopePage();
var storedArray = JSON.parse(sessionStorage.getItem("items"));
for (let i = 0; i < storedArray.length; i++) {
	var name = storedArray[i].name;
	var status = storedArray[i].status;
	var current_date = storedArray[i].current_date;
    var html=`<ul class='collapsible node-list' data-collapsible='accordion'><li class='node level-1 leaf pass' status='pass' test-id='2'><div class='collapsible-header'><div class='node-name'>${name}</div> <span class='node-time'>${current_date}</span>&middot; <span class='node-duration'>0h 2m 32s+291ms</span><span class='test-status right pass'> ${status}</span></div> `;
	document.getElementById("tbl").insertAdjacentHTML("beforeend",html);
}


   // document.getElementById('result-status').innerHTML = status;

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
function display_current_date_hopePage(){
var display_date=current_Date();
document.getElementById("blue darken_display_date").innerHTML=display_date;
document.getElementById("iteration1_date").innerHTML=display_date;
document.getElementById("start-time").innerHTML=display_date;
}