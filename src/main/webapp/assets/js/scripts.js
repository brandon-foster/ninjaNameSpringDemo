$(function() {
	
	$("form").submit(function() {
		var firstName = $("input[name='firstName']").val();
		var lastName = $("input[name='lastName']").val();
		var nameType = $("select[name='nameType']").val();
		
		$.ajax({
			url: window.location.href,
			data: "firstName=" + firstName + "&lastName=" + lastName + "&nameType=" + nameType,
			type: "POST",
			dataType: "json",
			success: function(response) {
				$("#nameDisplay").show().find("strong").text(response.name);
			}
		});
		return false;
	});
	
});