var xhttp;
xhttp = new XMLHttpRequest();
xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
        populateWebpage(this);
    }
};
xhttp.open("GET", "https://raw.githubusercontent.com/brentchiaramonti/LaunchKitHelper/master/dental.xml", true);
xhttp.send();

function populateWebpage(xml){
	var x, i, txt, xmlDoc, title, name;
	xmlDoc = xml.responseXML;
	console.log(xml);
	txt = "";
	title = xmlDoc.getElementsByTagName("title");
	name = title + "Links"
	items = xmlDoc.getElementsByTagName("item");
	for(i = 0; i < items.length; i++){
		txt += "<label><input type=\"checkbox\" name=\"" + name + "\">" + items[i].childNodes[0].nodeValue + "</label><br>";
	}
	document.getElementById("checkboxes").innerHTML = txt;
}
