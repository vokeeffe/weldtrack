var debuginfo;

function init() {
	document.onkeypress = keypressResponse;
	//alert("init() called");
	debuginfo = document.getElementById("debuginfo");

	for (property in modelSySection) {
		if (modelSySection[property] !== "") {
			debuginfo.innerHTML += (property + ": " + modelSySection[property] + "<br>");
		}
	}

}

function storeData() {

	var mf_function = document.getElementById("panel");

}

//Capture keystrokes
function keypressResponse(e) {
	var keynum = (window.event) ? event.keyCode : e.which;
	
	//alert(keynum);
	
	if(keynum === 100)//fn+D
	{
		//showHideDebugInfo();
	}
	else if(keynum === 110)//fn+N
	{
		newRecord();
	}
	else if(keynum === 102)//fn+F
	{
		//findRecord();
	}

}

function showHideDebugInfo(){
	
	if (debuginfo.style.visibility === "hidden") {
		debuginfo.style.visibility = "visible";
		debuginfo.style.display = "block";

	} else {
		debuginfo.style.visibility = "hidden";
		debuginfo.style.display = "none";
	}	
	
}

function newRecord()
{
	
	var newform = document.getElementById("newrecord");
	newform.style.visibility = "visible";
	newform.style.display = "block";
	newform.focus();
}

function submitNewRecord()
{
	
	var newform = document.getElementById("newrecord");
	newform.style.visibility = "hidden";
	newform.style.display = "none";
}

function findRecord()
{
	
	var findform = document.getElementById("findrecord");
	findform.style.visibility = "visible";
	findform.style.display = "block";
	findform.focus();
}

function submitFindRecord()
{
	
	var findform = document.getElementById("findrecord");
	findform.style.visibility = "hidden";
	findform.style.display = "none";
}


function errorhandler(msg, url, ln) {
	alert("Error: " + msg + "\nln File: " + url + "\nAt Line: " + ln);
	return true;
}

onerror = errorhandler;
document.addEventListener("DOMContentLoaded", init, false);//just waits for HTML