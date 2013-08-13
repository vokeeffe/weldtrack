function init()
{
	
	var obj = document.getElementById("panel");
	var myCar = new Car ("Fiat", "Punto", "Red");
	var week = ["mon", "tue", "wed", "thu", "fri"];
	var weekend = ["sat", "sun"];
	for (i=0; i < weekend.length; i++)
		{
		week[week.length] = weekend [i];
		}
	obj.innerHTML = week;
	
	week.length -= 2;
	
	obj.innerHTML += "<br>"+week;
	
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

//window.onload = loaded;
document.addEventListener("DOMContentLoaded",init,false);