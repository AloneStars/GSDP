$(function(){

  var index = 0;

  var int=self.setInterval(function(){
     
     var len = -20*[index%5];
               
  	 $("#background").css("transform","translateX("+len+"%)");

  	 index++;

  },60000);

});