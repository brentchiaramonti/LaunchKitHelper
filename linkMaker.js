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
	var x, i, txt, xmlDoc, title, name, xmlFormated;
	console.log(xml);


	var parser = new DOMParser();
    xmlDoc = parser.parseFromString(xml.responseText, "text/xml");
	console.log(xmlFormated);
	console.log(xmlDoc);
	txt = "";
	title = xmlDoc.getElementsByTagName("item")[0].childNodes[1].childNodes[0].nodeValue;
	console.log(title)
	name = title + "Links"
	items = xmlDoc.getElementsByTagName("item");
	for(i = 0; i < items.length; i++){
		console.log(i)
		console.log(items)
		console.log(items[i])
		txt += "<label><input type=\"checkbox\" name=\"" + name + "\">" + items[i].childNodes[1].firstChild.nodeValue + "</label><br>";
	}
	document.getElementById("checkboxes").innerHTML = txt;
}
