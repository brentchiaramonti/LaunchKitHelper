package backend;



public class BackEnd {
	

	public static String convert(String input) {
		input = input.replaceAll("\\[City]", "{CITY}");
		input = input.replaceAll("\\[Name of Practice]", "{PRACTICENAME}");
		input = input.replaceAll("\\[State]", "{STATE}");
		return input;
	}
	
	public static String welcomeLink(String input, String domainNumber) {
		System.out.println(input);
		String str = "General Dentistry";
		String str2 = "<a href=\"https://my.officite.com/" + domainNumber + "/articles/dear_doctor/509260-cosmetic-general-dentistry\" data-source-type=\"external-link\">General Dentistry</a>";
		input = input.replaceAll(str, str2);
		str = "Teeth Whitening";
		str2 = "<a href=\"https://my.officite.com/" + domainNumber + "/articles/dear_doctor/509349-teeth-whitening\" data-source-type=\"external-link\">Teeth Whitening</a>";
		input = input.replaceAll(str, str2);
		str = "Crowns";
		str2 = "<a href=\"https://my.officite.com/" + domainNumber + "/articles/dear_doctor/509264-crowns-bridgework\" data-source-type=\"external-link\">Crowns</a>";
		input = input.replaceAll(str, str2);
		str = "Preventive Care";
		str2 = "<a href=\"https://my.officite.com/" + domainNumber + "/articles/dear_doctor/509330-preventive-dentistry\" data-source-type=\"external-link\">Preventive Care</a>";
		input = input.replaceAll(str, str2);
		str = "Periodontal Exams";
		str2 = "<a href=\"https://my.officite.com/" + domainNumber + "/articles/dear_doctor/category/47371\" data-source-type=\"external-link\">Periodontal Exams</a>";
		input = input.replaceAll(str, str2);
		
		System.out.println(input);
		return input;
	}
	
	public static String generateList(Boolean[] checks) {
		String output = "<ul>";
		
		if(checks[0]) {
			output += "<li>Bonding</li>";
		}
		if(checks[1]) {
			output += "<li>Cosmetic Contouring</li>";
		}
		if(checks[2]) {
			output += "<li>Cosmetic Fillings</li>";
		}
		if(checks[3]) {
			output += "<li>Dentures</li>";
		}
		if(checks[4]) {
			output += "<li>Extractions</li>";
		}
		if(checks[5]) {
			output += "<li>Bone Grafts</li>";
		}
		if(checks[6]) {
			output += "<li>Gum Grafts</li>";
		}
		if(checks[7]) {
			output += "<li>Jaw/TMJ</li>";
		}
		if(checks[8]) {
			output += "<li>Root Canal Therapy</li>";
		}
		if(checks[9]) {
			output += "<li>Sealants</li>";
		}
		if(checks[10]) {
			output += "<li>Veneers</li>";
		}
		if(checks[11]) {
			output += "<li>Braces</li>";
		}
		if(checks[12]) {
			output += "<li>Cosmetic Dentistry</li>";
		}
		if(checks[13]) {
			output += "<li>Crowns and Bridges</li>";
		}
		if(checks[14]) {
			output += "<li>Excessive or Uneven Gums</li>";
		}
		if(checks[15]) {
			output += "<li>Flap Surgery</li>";
		}
		if(checks[16]) {
			output += "<li>Implants</li>";
		}
		if(checks[17]) {
			output += "<li>Maxillofacial Surgery</li>";
		}
		if(checks[18]) {
			output += "<li>Scaling and Root Planing</li>";
		}
		if(checks[19]) {
			output += "<li>Speciality Dentures</li>";
		}
		if(checks[20]) {
			output += "<li>Teeth Whitening</li>";
		}
		if(checks[21]) {
			output += "<li>Invisalign for Teens</li>";
		}
		if(checks[22]) {
			output += "<li>Invisalign for Adults</li>";
		}
		return output;
	}
	
	public static String generateListExtra(Boolean[] checks) {
		String output = "<ul>";
		
		if(checks[0]) {
			output += "<li>Bonding, to repair small chips or cracks</li>";
		}
		if(checks[1]) {
			output += "<li>Cosmetic Contouring</li>";
		}
		if(checks[2]) {
			output += "<li>Cosmetic Fillings</li>";
		}
		if(checks[3]) {
			output += "<li>Dentures</li>";
		}
		if(checks[4]) {
			output += "<li>Extractions, when a tooth is hopelessly damaged or decayed</li>";
		}
		if(checks[5]) {
			output += "<li>Bone Grafts</li>";
		}
		if(checks[6]) {
			output += "<li>Gum Grafts</li>";
		}
		if(checks[7]) {
			output += "<li>Jaw/TMJ, for chronic jaw pain</li>";
		}
		if(checks[8]) {
			output += "<li>Root Canal Therapy, to save an infected tooth</li>";
		}
		if(checks[9]) {
			output += "<li>Sealants, to protect children's teeth from decay</li>";
		}
		if(checks[10]) {
			output += "<li>Veneers, for repairing larger chips and cracks, and reshaping teeth</li>";
		}
		if(checks[11]) {
			output += "<li>Braces (Orthodontia), to move teeth into the right position</li>";
		}
		if(checks[12]) {
			output += "<li>Cosmetic Dentistry</li>";
		}
		if(checks[13]) {
			output += "<li>Crowns and Bridges, to replace large amounts of lost tooth structure and/or missing teeth</li>";
		}
		if(checks[14]) {
			output += "<li>Excessive or Uneven Gums</li>";
		}
		if(checks[15]) {
			output += "<li>Flap Surgery</li>";
		}
		if(checks[16]) {
			output += "<li>Implants, for the longest-lasting tooth replacement available today</li>";
		}
		if(checks[17]) {
			output += "<li>Maxillofacial Surgery</li>";
		}
		if(checks[18]) {
			output += "<li>Scaling and Root Planing</li>";
		}
		if(checks[19]) {
			output += "<li>Speciality Dentures</li>";
		}
		if(checks[20]) {
			output += "<li>Teeth Whitening, to brighten a faded or discolored smile</li>";
		}
		if(checks[21]) {
			output += "<li>Invisalign for Teens</li>";
		}
		if(checks[22]) {
			output += "<li>Invisalign for Adults</li>";
		}
		return output;
	}
	
public static String generateLink(String domain, Boolean[] checks) {
		
		String output = "<ul>";
		
		if(checks[0]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509262-cosmetic-tooth-bonding\"data-source-type=\"external-link\">Bonding</a></li>";
		}
		if(checks[1]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509356-tooth-contouring-reshaping\"data-source-type=\"external-link\">Cosmetic Contouring</a></li>";
		}
		if(checks[2]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509361-tooth-colored-fillings\"data-source-type=\"external-link\">Cosmetic Fillings</a></li>";
		}
		if(checks[3]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509333-removable-dentures\"data-source-type=\"external-link\">Dentures</a></li>";
		}
		if(checks[4]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509275-extractions\"data-source-type=\"external-link\">Extractions</a></li>";
		}
		if(checks[5]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509254-bone-grafting\"data-source-type=\"external-link\">Bone Grafts</a></li>";
		}
		if(checks[6]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509282-gum-grafting\"data-source-type=\"external-link\">Gum Grafts</a></li>";
		}
		if(checks[7]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509355-tmd\"data-source-type=\"external-link\">Jaw/TMJ</a></li>";
		}
		if(checks[8]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509336-root-canal-treatment\"data-source-type=\"external-link\">Root Canal Therapy</a></li>";
		}
		if(checks[9]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509340-sealants\"data-source-type=\"external-link\">Sealants</a></li>";
		}
		if(checks[10]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509326-porcelain-veneers\"data-source-type=\"external-link\">Veneers</a></li>";
		}
		if(checks[11]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509319-orthodontics\"data-source-type=\"external-link\">Braces</a></li>";
		}
		if(checks[12]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509260-cosmetic-general-dentistry\"data-source-type=\"external-link\">Cosmetic Dentistry</a></li>";
		}
		if(checks[13]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509264-crowns-bridgework\"data-source-type=\"external-link\">Crowns and Bridges</a></li>";
		}
		if(checks[14]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509261-cosmetic-gum-surgery\"data-source-type=\"external-link\">Excessive or Uneven Gums</a></li>";
		}
		if(checks[15]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509324-periodontal-flap-surgery\"data-source-type=\"external-link\">Flap Surgery</a></li>";
		}
		if(checks[16]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509289-implant-dentistry\"data-source-type=\"external-link\">Implants</a></li>";
		}
		if(checks[17]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509276-facial-trauma-and-reconstructive-surgery\"data-source-type=\"external-link\">Maxillofacial Surgery</a></li>";
		}
		if(checks[18]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509304-non-surgical-periodontal-treatment\"data-source-type=\"external-link\">Scaling and Root Planing</a></li>";
		}
		if(checks[19]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509278-fixed-dentures\"data-source-type=\"external-link\">Speciality Dentures</a></li>";
		}
		if(checks[20]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509349-teeth-whitening\"data-source-type=\"external-link\">Teeth Whitening</a></li>";
		}
		if(checks[21]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509294-invisalign-for-teens\"data-source-type=\"external-link\">Invisalign for Teens</a></li>";
		}
		if(checks[22]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509293-invisalign-for-adults\"data-source-type=\"external-link\">Invisalign for Adults</a></li>";
		}
		output += "</ul>";
		return output;
	}

	public static String generateLinkExtra(String domain, Boolean[] checks) {
		
		String output = "<ul>";
		
		if(checks[0]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509262-cosmetic-tooth-bonding\"data-source-type=\"external-link\">Bonding</a>, to repair small chips or cracks</li>";
		}
		if(checks[1]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509356-tooth-contouring-reshaping\"data-source-type=\"external-link\">Cosmetic Contouring</a></li>";
		}
		if(checks[2]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509361-tooth-colored-fillings\"data-source-type=\"external-link\">Cosmetic Fillings</a></li>";
		}
		if(checks[3]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509333-removable-dentures\"data-source-type=\"external-link\">Dentures</a></li>";
		}
		if(checks[4]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509275-extractions\"data-source-type=\"external-link\">Extractions</a>, when a tooth is hopelessly damaged or decayed</li>";
		}
		if(checks[5]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509254-bone-grafting\"data-source-type=\"external-link\">Bone Grafts</a></li>";
		}
		if(checks[6]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509282-gum-grafting\"data-source-type=\"external-link\">Gum Grafts</a></li>";
		}
		if(checks[7]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509355-tmd\"data-source-type=\"external-link\">Jaw/TMJ</a>, for chronic jaw pain</li>";
		}
		if(checks[8]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509336-root-canal-treatment\"data-source-type=\"external-link\">Root Canal Therapy</a>, to save an infected tooth</li>";
		}
		if(checks[9]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509340-sealants\"data-source-type=\"external-link\">Sealants</a>, to protect children's teeth from decay</li>";
		}
		if(checks[10]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509326-porcelain-veneers\"data-source-type=\"external-link\">Veneers</a>, for repairing larger chips and cracks, and reshaping teeth</li>";
		}
		if(checks[11]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509319-orthodontics\"data-source-type=\"external-link\">Braces</a>, to move teeth into the right position</li>";
		}
		if(checks[12]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509260-cosmetic-general-dentistry\"data-source-type=\"external-link\">Cosmetic Dentistry</a></li>";
		}
		if(checks[13]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509264-crowns-bridgework\"data-source-type=\"external-link\">Crowns and Bridges</a>, to replace large amounts of lost tooth structure and/or missing teeth</li>";
		}
		if(checks[14]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509261-cosmetic-gum-surgery\"data-source-type=\"external-link\">Excessive or Uneven Gums</a></li>";
		}
		if(checks[15]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509324-periodontal-flap-surgery\"data-source-type=\"external-link\">Flap Surgery</a></li>";
		}
		if(checks[16]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509289-implant-dentistry\"data-source-type=\"external-link\">Implants</a>, for the longest-lasting tooth replacement available today</li>";
		}
		if(checks[17]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509276-facial-trauma-and-reconstructive-surgery\"data-source-type=\"external-link\">Maxillofacial Surgery</a></li>";
		}
		if(checks[18]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509304-non-surgical-periodontal-treatment\"data-source-type=\"external-link\">Scaling and Root Planing</a></li>";
		}
		if(checks[19]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509278-fixed-dentures\"data-source-type=\"external-link\">Speciality Dentures</a></li>";
		}
		if(checks[20]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509349-teeth-whitening\"data-source-type=\"external-link\">Teeth Whitening</a>, to brighten a faded or discolored smile</li>";
		}
		if(checks[21]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509294-invisalign-for-teens\"data-source-type=\"external-link\">Invisalign for Teens</a></li>";
		}
		if(checks[22]) {
			output += "<li><a href=\"https://my.officite.com/" + domain + "/articles/dear_doctor/509293-invisalign-for-adults\"data-source-type=\"external-link\">Invisalign for Adults</a></li>";
		}
		output += "</ul>";
		return output;
	}
}
