$("#sub").click(function(){
	alert("");
	var username= $("#username").val();
	var IDcardNum = $("#IDcardNum").val();
	var tel = $("#tel").val();
	var address = $("#address").val();
	var requrl = "../../women.action";
		alert("");
		$.ajax({
			type: "POST",
			url: requrl,
			data: {
				"username":username,
				"IDcardNum":IDcardNum,
				"tel":tel,
				"address":address
		},
		dataType:"text",
		function(da){
			
			alert(result);
			/*window.location.href="index.html";*/
		}
		});
});