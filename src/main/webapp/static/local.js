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

function keypressResponse(e) {
	var keynum = (window.event) ? event.keyCode : e.which;
	
	if(keynum = 8706)
	{
	if (debuginfo.style.visibility === "hidden") {
		debuginfo.style.visibility = "visible";
	} else {
		debuginfo.style.visibility = "hidden";
	}
	}

}

function errorhandler(msg, url, ln) {
	alert("Error: " + msg + "\nln File: " + url + "\nAt Line: " + ln);
	return true;
}

onerror = errorhandler;
document.addEventListener("DOMContentLoaded", init, false);//just waits for HTML