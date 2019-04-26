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
	console.log(xml);
	var parser = new DOMParser();
    xmlDoc = parser.parseFromString(xml.response, "text/xml");
	console.log(xml.responseText);
	console.log(xmlDoc);
	txt = "";
	title = xmlDoc.getElementsByTagName("item")[0].childNodes[3].nodeName;
	console.log(title)
	name = title + "Links"
	items = xmlDoc.getElementsByTagName("item");
	for(i = 0; i < items.length; i++){
		console.log(items[i])
		txt += "<label><input type=\"checkbox\" name=\"" + name + "\">" + items[i].childNodes[1].nodeValue + "</label><br>";
	}
	document.getElementById("checkboxes").innerHTML = txt;
}
