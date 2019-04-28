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

	var dict = {};

	var text, url, additional

	var parser = new DOMParser();
    xmlDoc = parser.parseFromString(xml.responseText, "text/xml");
    console.log(xmlDoc);
	txt = "";
	title = xmlDoc.getElementsByTagName("linkList")[0].getAttribute("title");
	name = title + "Links"
	items = xmlDoc.getElementsByTagName("item");
	for(i = 0; i < items.length; i++){
		console.log(items[i].childNodes[5].firstChild);
		text = items[i].childNodes[1].firstChild.nodeValue;
		url = items[i].childNodes[3].firstChild.nodeValue;
		additional = items[i].childNodes[5].firstChild.nodeValue;
		txt += "<label><input type=\"checkbox\" name=\"" + name + "\">" + text + "</label><br>";
	}
	document.getElementById("checkboxes").innerHTML = txt;

	document.getElementById("generate").onclick = generateLinks()
}


function generateLinks(name, dictionary) {

}