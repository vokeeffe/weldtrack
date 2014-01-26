var counter = 0;
var panel, flag;

function focusResponse()
{
this.value = "In Focus";
alert($(document.activeElement).up('form'));
}

function blurResponse()
{
this.value = "Focus lost";
}

function init()
{

	panel = document.getElementById("panel");
	panel.innerHTML = "Move the Mouse<br><br>";
	
	focuspanel.innerHTML = "<input type = 'text' id = 'txt1'>";

	
	
	focuspanel.innerHTML += "<input type = 'text' id = 'txt2'>";

	var field1 = document.getElementById("txt1");
	field1.onfocus = focusResponse;
	field1.onblur = blurResponse;

	var field2 = document.getElementById("txt2");
	field2.onfocus = focusResponse;
	field2.onblur = blurResponse;

	field1.focus();

	document.onmousemove = mousemoveResponse;
	panel.onmouseover = mouseoverResponse;
	panel.onmouseout = mouseoutResponse;

	document.onkeydown = keydownResponse;
	document.onkeyup = keyupResponse;
	document.onkeypress = keypressResponse;

	if(counter > 0)
	{
		window.clearTimeout(timerId);
	}
	else
	{
		timerId = window.setTimeout(init,1000);
	}

	//panel.innerHTML = screenInfo(window);
	//panel.innerHTML = browserInfo(window);


	for (i=0; i < 50; i++)
	{
		//panel.innerHTML += i + " ";
	}

	window.scrollBy(0, 500);
	window.moveTo(0,0);

	clicktest.innerHTML = "Click Here &gt;<br>";
	clicktest.onclick = clickResponse;
	clicktest.ondblclick = dblclickResponse;
	clicktest.onmousedown = mousedownResponse;
	clicktest.onmouseup = mouseupResponse;


	/*panel.innerHTML += "<br><span style='background:black;color:white;margin:2px;'>" + counter + "</span>";

	panel.innerHTML += "<br><a href='history-1.html'>Page 1</a> | ";
	panel.innerHTML += "<a href='history-2.html'>Page 2</a> | ";
	panel.innerHTML += "<a href='history-3.html'>Page 3</a> | ";

	panel.innerHTML += "<br>History Length " + history.length + "<br>";
	panel.innerHTML += "Current Location: " + location.pathname + "<br>";

	panel.innerHTML += "<button onclick='history.back()'>Back</button> ";
	panel.innerHTML += "<button onclick='history.forward()'>Forward</button> ";*/

	//POP UPS DISABLED
	/*var pop = open("", "", "top=200,left=100,width=450,height=100");
	pop.document.write("<title>Popup Window</title>");
	pop.document.write("<img src='images/debate.png'>");
	pop.document.write("Dynamic Popup Content");
	pop.document.close();*/

	/*for (i=0; i < weekend.length; i++)
		{
		week[week.length] = weekend [i];
		}
	obj.innerHTML = week;

	week.length -= 2;

	obj.innerHTML += "<br>"+week;*/

	Car.prototype.doors = 5;
	for (property in myCar)
	{
		if ( myCar[property] !== "")
		{
			//obj.innerHTML += (property + ": " + myCar[property] + "<br>");
		}
	}
	//obj.innerHTML = myCar.color + myCar.make + myCar.model;
	//obj.innerHTML += myCar.accelerate();
}
function loaded()
{
	//window.alert("here");	
}

function stringify(argA,argB,argC)
{

	return argA + " " + argB + " " + argC + "<br>"; 

}

function accelerate() { return "<br>Vroom!";}

function Car(make, model, color)
{
	this.make = make;
	this.model = model;
	this.color = color;
	this.accelerate = accelerate;
}

function screenInfo(window)
{
	var width, height, avWidth, avHeight, colors;

	width = window.screen.width;
	height = window.screen.height;
	avWidth = window.screen.availWidth;
	avHeight = window.screen.availHeight;

	switch(window.screen.colorDepth)
	{
	case 8 : colors = "Low Color";break;
	case 16: colors = "High Color";break;
	case 24: colors = "True Color";break;
	case 32: colors = "Deep Color";break;
	default : colors = "Unknown";
	}

	return "Screen Resolution: " + width + " x " + height + "<br>" + 
	"Available Screen Size: " + avWidth + " x " + avHeight + "<br>" +
	"Color Capacity: " + colors + "<br>";

}

function browserInfo(window)
{

	var info;

	info = "Document Components...";
	info += "<br>No. Forms: " + document.forms.length;
	info += "<br>No. Links: " + document.links.length;
	info += "<br>No. Anchors: " + document.anchors.length;
	info += "<br>No. Images: " + document.images.length;
	info += "<br>First Image: " + document.images[0].src;

	info += "<br>Linked from: " + document.referrer;
	info += "<br>Title: " + document.title;
	info += "<br>URL: " + document.URL;
	info += "<br>Domain: " + document.domain;

	info += "<hr>Href: " + location.href;
	info += "<br>Protocol: " + location.protocol;
	info += "<br>Host: " + location.host;
	info += "<br>Path: " + location.pathname;
	info += "<br>Hash: " + location.hash;

	info += "Browser: " + navigator.appName;
	info += "<br>Code Name: " + navigator.appCodeName;
	info += "<br>Version: " + navigator.appVersion;
	info += "<br>Platform: " + navigator.platform;

	if(document.addEventListener)
	{
		info += "<br>This is a modern DOM Browser";
	}

	if(navigator.javaEnabled())
	{
		info += "<br>Java Support is Enabled";
	}

	if(navigator.plugins.length !== 0)
	{
		info += "<hr>Total Plugins: " + navigator.plugins.length;
		info += "<br>Example: " + navigator.plugins[1].name;
		info += " -  " + navigator.plugins[1].description;
	}

	if(navigator.mimeTypes.length !== 0)
	{
		info += "<hr>Total mime Types: " + navigator.mimeTypes.length;
		info += "<br>Example: " + navigator.mimeTypes[1].name;
		info += " -  " + navigator.mimeTypes[1].description;
	}

	return info;

}

function clickResponse()
{
	alert("clickResponse");
	this.innerHTML += "Click detected<hr>";
}

function dblclickResponse()
{
	this.innerHTML += "Doubleclick detected<br>";
}

function mousedownResponse()
{
	this.innerHTML += "Mouse button down<br>";
}

function mouseupResponse()
{
	this.innerHTML += "Mouse button up<br>";
}
function keydownResponse()
{
	panel.innerHTML += "<br>Key Pressed: ";
}
function keyupResponse()
{
	panel.innerHTML += "<br>Key Released: ";
}

function keypressResponse(e)
{
	var keynum = (window.event) ? event.keyCode : e.which;
	alert(keynum);
	panel.innerHTML += String.fromCharCode(keynum);
}

function mousemoveResponse(e)
{
	var x,y;

	if (window.event)
	{
		x = event.x;
		y = event.y;
	}
	else if (e)
	{
		x = e.pageX;
		y = e.pageY;
	}

	if (flag)
	{
		panel.innerHTML = "Mouse is at X: " + x + ", Y: " + y;
	}
}

function mouseoverResponse()
{
	flag = false;
	panel.innerHTML = "Mouse is Over";
}

function mouseoutResponse()
{
	flag = true;	
}


function errorhandler(msg,url,ln)
{
	alert("Error: " + msg + "\nln File: " + url + "\nAt Line: " + ln);
	return true;
}
onerror = errorhandler;
//window.onload = loaded; waits for all images etc.. to be loaded
//document.addEventListener("DOMContentLoaded",init,false);//just waits for HTML