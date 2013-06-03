$(function() {
	
	$("form").submit(function() {
		var firstName = $("input[name='firstName']").val();
		var lastName = $("input[name='lastName']").val();
		
		$.ajax({
			url: window.location.href,
			data: "firstName=" + firstName + "&lastName=" + lastName,
			type: "POST",
			dataType: "json",
			success: function(response) {
				$("#ninjaNameDisplay").show().find("strong").text(response.name);
			}
		});
		return false;
	});
	
});