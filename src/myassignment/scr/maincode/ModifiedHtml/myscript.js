let x = new Array();
const countPass=0;
const countFail=0;
        function showMessage(){
            var name = document.getElementById("name").value;

            var status = document.getElementById("status").value;
            const d = new Date();
<!--            document.getElementById("demo").innerHTML = format(MMM D, YYYY hh mm ss A)-->
<!--            document.getElementById("demo").innerHTML = d;-->
debugger
            x.push({
            name:name,
            status:status,
            date:d
            })



alert("Record Added Successfully !");
<!--document.form.reset();-->
document.getElementById("myForm").reset();

        }

 function showData(){
 var r=new Array();
 r=x;
 debugger
   if(x.length>0){
            for(let i=0;i<x.length;i++){
             document.getElementById( 'table' ).innerHTML +=
<!--         '<tr ><td>' + x[i].name + '</td><td>' + x[i].status + '</td><td>' + x[i].date + '</td></tr>';-->
 '<tr ><td>' + x[i].name + '</td><td>'    + x[i].date +  '</td><td>'  + x[i].status + '</td></tr>';


            }

            }
<!--            r=[];-->

 }
 


