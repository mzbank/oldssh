$(".first").click(function(){
	$(this).find(".clear").slideToggle();
	$(this).siblings().find(".clear").slideUp();
});