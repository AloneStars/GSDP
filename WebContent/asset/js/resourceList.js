$(function(){
	initMusic();
	$(".video").click(function(){
        change(0);
	});
	$(".audio").click(function(){
        change(1);
    });
	$(".text").click(function(){
        change(2);
	});
	$(".picture").click(function(){
        change(3);
	});
	$(".soft").click(function(){
        change(4);
	});
	$(".more b").click(function(){
        $(".videoList").slideToggle("slow");
	});
});

function begin(src){
	 $(".videoList").slideToggle("slow");
        var player = videojs('video');
	    video = [{
	        "type": "video\/mp4",
	        "src": src
	    }, {
	        "type": "video\/webm",
	        "src": "http:\/\/mabuse.dev\/assets\/videos\/testVideo.webm"
	    }, {
	        "type": "video\/ogg",
	        "src": "http:\/\/mabuse.dev\/assets\/videos\/testVideo.ogv"
	    }, {
	        "type": "video\/flv",
	        "src": "http:\/\/mabuse.dev\/assets\/videos\/testVideo.flv"
	    }];

		/* Add sources to new player */
		player.src(video);
		player.play();

		/* Remove loader & play video once loaded */
		/*player.on("loadedalldata", function(){
		    player.play();
		});*/
		return false;
}

function play(AudioSrc,ImgSrc){

	var MP=document.getElementById("myAudio");
	var PP=document.getElementById("play_pause");
	var MCD=document.getElementsByClassName("mcd").item(0);	 
     $("#myAudio").attr("src","file\/music\/"+AudioSrc);
     $(".mcd").attr("src","image\/music\/"+ImgSrc); 
     MP.pause();
	 PP.style.backgroundImage="url(image/music/MainCont1.png)";
	 MCD.className="mcd bxzhh";
}

function change(num){
	
	var arr = new Array("video","audio","text","picture","soft");
	if(num!=0){
		$("#video").css("opacity","0");
	}else{
		$("#video").css("opacity","1");
	}	
	for(x in arr){
		var s = "#";
		if(x==num){
			s=s+arr[x];
			$(s).css("transform","translateY(-"+100*num+"%)");
		}else{
			s=s+arr[x];
			$(s).css("transform","translateY(0px)");
		}

	}
	 var player = videojs('video');
	 player.pause();
	
}

function initMusic(){
	var MP=document.getElementById("myAudio");
	var PP=document.getElementById("play_pause");
	var MCD=document.getElementsByClassName("mcd").item(0);
	PP.onclick=function(){
		if(MP.paused){
			MP.play();
			PP.style.backgroundImage="url(image/music/MusicPause1.png)";
			MCD.className="mcd zxhh";
		}else{
			MP.pause();
			PP.style.backgroundImage="url(image/music/MainCont1.png)";
			MCD.className="mcd bxzhh";
		}
	}
	MP.addEventListener('ended',function(){
		PP.style.backgroundImage="url(image/music/MainCont1.png)";
		MCD.className="mcd bxzhh";
		});
}