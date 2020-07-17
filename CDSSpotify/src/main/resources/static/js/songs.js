
$( document ).ready(function() {
    console.log( "ready!" );

    var actual_song_like = $( "#actual_song_like" ).attr("like");
    
    if(actual_song_like){
    	$( "#actual_song_like" ).append('<span class="fa fa-heart">');
    	$( "#actual_song_name2" ).append('<span class="fa fa-heart">');

    }else{
    	$( "#actual_song_like" ).append('<span class="fa fa-heart-o">');
    	$( "#actual_song_name2" ).append('<span class="fa fa-heart">');
    }


	
});


function changeMainSong(element){ 
  
    
    var childs = element.children;
    var id = element.id;
    getSongById(id)

};  



function getSongById(id){

	$.ajax({
		type : "GET",
		url : "/songs/getSongById/"+id,
		contentType : "application/json; charset=utf-8",
		dataType : "json",
		success : function(data) {
			
			$( "#actual_song_exernal_url" ).attr("href",data.external_url);
			$( "#actual_song_image" ).attr("src",data.image);
			$( "#actual_song_name" ).text(data.name);
			$( "#actual_song_like" ).empty();
			$( "#actual_song_release_date" ).text(data.release_date);
			$( "#actual_song_like" ).attr("songid",data._id);
			
			if(data.like){
				$( "#actual_song_name2" ).text(data.name);
				$( "#actual_song_name2" ).append('<span class="fa fa-heart">');
				$( "#actual_song_like" ).empty();
				$( "#actual_song_like" ).append('<span class="fa fa-heart">');
			}else{
				$( "#actual_song_name2" ).text(data.name);
				$( "#actual_song_name2" ).append('<span class="fa fa-heart-o">');
				$( "#actual_song_like" ).empty();
				$( "#actual_song_like" ).append('<span class="fa fa-heart-o">');
			}

		},
		error : function(e) {
			console.log(e)

		}
	}); 
	
}

function likeSong(element){

	 var songid = $( "#"+element.id).attr("songid");
	 
		$.ajax({
			type : "GET",
			url : "/songs/likeSongById/"+songid,
			contentType : "application/json; charset=utf-8",
			dataType : "json",
			success : function(data) {
				console.log(data);
				if(data.like){
					$( "#actual_song_name2" ).text(data.name);
					$( "#actual_song_name2" ).append('<span class="fa fa-heart">');
					$( "#actual_song_like" ).empty();
					$( "#actual_song_like" ).append('<span class="fa fa-heart">');
				}else{
					$( "#actual_song_name2" ).text(data.name);
					$( "#actual_song_name2" ).append('<span class="fa fa-heart-o">');
					$( "#actual_song_like" ).empty();
					$( "#actual_song_like" ).append('<span class="fa fa-heart-o">');
				}
				
			},
			error : function(e) {
				console.log(e)

			}
		}); 

}