var text = "test";

document.getElementById("openFile").addEventListener('change', function() {
	var fr = new FileReader();
	var input;
	fr.onload = function() {
		document.getElementById("fileContents").textContent = this.result;
		input = document.getElementById("fileContents").textContent;
		makeXMLFile(input);
	}
	fr.readAsText(this.files[0]);

})

function makeXMLFile(fileContent){
	console.log("this will work");
	var lines = fileContent.split('\n');
	for(var i = 0; i < lines.length; i++){
		console.log(lines[i]);
	}
}