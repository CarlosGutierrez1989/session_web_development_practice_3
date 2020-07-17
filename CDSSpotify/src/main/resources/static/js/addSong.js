
$( document ).ready(function() {
    console.log( "ready!" );
    
 // Datepicker - SelectPicker
    $('select').selectpicker();
   
    $('.date div').datepicker({
    	todayHighlight: true,
    	clearBtn: true,
    	format:"yyyy/mm/dd",
    });
    
    
	$("#createSongButton").on('click', function() {
		createSong();
	});
	
});



function createSong(){

	var data = {
			name : $("#name").val(),
			external_url : $("#external_url").val(),
			image : $("#image").val(),
			duration_ms : $("#duration_ms").val(),
			artists: $("#artists").val(),
			release_date: $("#release_date").datepicker("getFormattedDate")
		};

	
		var json = JSON.stringify(data);
		console.log(json)
		
	$.ajax({
		type : "POST",
		url : "/songs/addSong/add",
		data : json,
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		success : function(data) {
	
			
		},
		error : function(e) {


		}
	}); 
	
}
