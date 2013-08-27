var obj;

function init()
{
var panel = document.getElementById("panel");
panel.innerHTML += "Send Book Data";

var form = document.getElementById("book");
form.action = "ies_assign.html";
form.method = "POST";

var title = document.getElementById("title");
title.size = "30";
title.name = "Book Title";
title.value = "JavaScript in easy steps";

var author = document.getElementById("author");
author.size = "30";
author.name = "By Author";
author.value = "Mike McGrath";

obj = document.getElementById("active");
obj.style.width = "100px"

}
document.addEventListener("DOMContentLoaded", init, false);