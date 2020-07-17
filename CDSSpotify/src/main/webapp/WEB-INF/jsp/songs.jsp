<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>


<html lang="es">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1, shrink-to-fit=no" name="viewport">

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"/>
<link rel="stylesheet" type="text/css" href="/resources/css/main.css">
<link rel="stylesheet" type="text/css" href="/resources/css/songs.css">

<title>CDSSpotify</title>
</head>


<body>

<jsp:include page="header.jsp" />
			
<div class="BodySong">
    <div class="container-fluid BodySong">
        <div class="row row1">
            <div class="col-2 sf-gray-primary">
                <br><br><br><br>
                <a href="" class="sf-link">TOP SPAIN <i class="fa fa-music" aria-hidden="true"></i></a>
                <br><br><br>
                <img src="https://charts-images.scdn.co/REGIONAL_ES_DEFAULT.jpg" class="img-fluid"/>
            </div>
            <div class="col-8 sf-playlist">
                <br/>
                <div class="row">
                    <div class="col-3">
                        <input class="form-control sf-input" placeholder="TOP 50 - SPAIN"/>
                    </div>
                    <div class="offset-4 col-3">
                       
                    </div>       
               
                </div>
                <br/>
                <div class="row">
                    <div class="col-4">
                        <h4 class="title">Spain Top</h4>
                    </div>
                    <div class="offset-3 col-2">
                        <button class="btn btn-dark btn-block sf-btn-primary">PAUSE</button>
                    </div>
                    <div class="col-2">
                        <button class="btn btn-dark btn-block sf-btn-default">FOLLOW</button>
                    </div>       
                    <div class="col-1">
                        <button class="btn btn-dark sf-btn-default">
                            <span class="fa fa-ellipsis-h"></span>
                        </button>
                    </div>                  
                </div>
                <br/>

                <div class="row">
                    <div class="col-12">
                        <a href="" class="sf-link">GENERAL</a>
                        <a href="" class="sf-link">YOUR FANS ALSO LISTEN</a>
                        <a id="actual_song_exernal_url" href="${song.external_url}" class="sf-link">INFORMATION</a>

                    </div>
                </div>

                <br/>
                <div class="row">
                    <div class="col-2">
                        <img id="actual_song_image" src="${song.image}" class="img-fluid"/>
                    </div>
                    <div class="col-10">
                        <label id="actual_song_release_date">${song.release_date}</label>
                        <h2 id="actual_song_name" class="title">${song.name }</h2>
                        <button songid="${song._id}" onclick='likeSong(this);' class="btn btn-dark sf-btn-default" id="actual_song_like" like="${song.like}">
                            
                        </button>

                        <button class="btn btn-dark sf-btn-default">    
                            <span class="fa fa-ellipsis-h"></span>
                        </button>
                    </div>
                </div>
                <br/>

                <div class="row">
                    <div class="col-12">
                        <div style="height: 300px; overflow: auto">
                            <table class="table">
                                <thead>
                                    <th>#</th>
                                    <th></th>
                                    <th>TITLE - RELEASE</th>
                                    
                                    <th>ARTISTS</th>
                                    <th>DURATION</th>
                                    <th>
                                        <span class="fa fa-thumbs-up"></span>
                                    </th>
                                </thead>
                                <tbody>
									<c:forEach items="${songs}" var="songAux" varStatus="theCount">
									
                                    <tr id="${songAux._id}" onclick='changeMainSong(this);'>
                                        <td>${theCount.index}</td> 
                                        <td>
                                            <span ${songAux._id} class="fa"></span>
                                        </td>
                                        <td>${songAux.name} - ${songAux.release_date}</td>
                                        
                                        <td>
                                        	<c:forEach items="${songAux.artists}" var="artist">
                                            	<span>${artist.name}</span>
                                            </c:forEach>
                                        </td>
                                        
                                        <td>${songAux.duration_ms}</td>
                                        <td>${songAux.popularity}</td>
                                    </tr>
                                    </c:forEach>
                                    
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-2 sf-gray-primary">
                <div style="text-align: center; margin-top: 100%">
                    <h5 class="title">Add Song <i class="fa fa-youtube-play" aria-hidden="true"></i></h5><br/>
                    <form:form method="GET" action="/songs/addSong">
                  		  <button class="btn btn-dark sf-btn-default">ADD</button>  
					</form:form>     
                </div>
            </div>
        </div>


        <div class="row sf-gray-secondary row2">
            <div class="col-2">
                <br/>
                <label id="actual_song_name2" class="sf-name-music"> ${song.name}  </label><br/>
                <label class="sf-name-music">TOP 50 - SPAIN</label>
                <br/>
            </div>
            <div class="col-8">
                <div style="text-align: center; margin-top: 10px">
                    <button class="btn sf-btn-control">
                        <span class="fa fa-random"></span>
                    </button>

                    <button class="btn sf-btn-control">
                        <span class="fa fa-step-backward"></span>
                    </button>
    
                    <button class="btn sf-btn-control">
                        <span class="fa fa-play sf-btn-play"></span>
                    </button>

                    <button class="btn sf-btn-control">
                        <span class="fa fa-step-forward"></span>
                    </button>

                    <button class="btn sf-btn-control">
                        <span class="fa fa-retweet"></span>
                    </button>    

                    <br/>
                    <div class="progress sf-progress">
                        <div class="progress-bar" role="progressbar" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100"></div>
                    </div>
                </div>
            </div>
            <div class="col-2">
                <br/>
                <button class="btn sf-btn-control">
                    <span class="fa fa-list"></span>
                </button>
               
                <button class="btn sf-btn-control">
                    <span class="fa fa-laptop"></span>
                </button>    
               
                <button class="btn sf-btn-control">
                    <span class="fa fa-volume-up"></span>
                </button>                        
            </div>
        </div>

    </div>
</div>

<div song="${song}" id="acutalSong" style="display: none;"></div>

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>


<script src="/resources/js/songs.js"></script>

</body>
</html>
