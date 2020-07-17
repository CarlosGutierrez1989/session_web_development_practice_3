
$( document ).ready(function() {
    console.log( "ready!" );

	$("#createArtistButton").on('click', function(e) {
		 e.preventDefault();
		 e.stopPropagation(); 
		createArtist();
	});
	
	$('#name').keyup(function() {
	    updatename();
	});

	$('#web_page').keyup(function() {
	    updateweppage();
	});
	
});



function updatename() {
    $('#singername').text("Singer name: " + $('#name').val());
}

function updateweppage() {
    $('#singerpage').text("Singer web page: " + $('#web_page').val());
}



function createArtist(){

	var data = {
			name : $("#name").val(),
			href : $("#web_page").val(),

		};

	
		var json = JSON.stringify(data);
		console.log(json)
		
	$.ajax({
		type : "POST",
		url : "/songs/addSong/addArtist/add",
		data : json,
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		success : function(data) {
			displayModalOk();
			
		},
		error : function(e) {
			displayModalError(e.responseText)

		}
	}); 
	
}

function displayModalError (e) {

	$("#exampleModalLabel").css("color", "red");
	$("#modalBody").text("Artist saved error " + e).css("color", "red");
	$("#exampleModal").modal();
}

function displayModalOk () {
	$("#exampleModalLabel").css("color", "green");
	$("#modalBody").text("Artist saved success.").css("color", "green");
	$("#exampleModal").modal();
	
}
