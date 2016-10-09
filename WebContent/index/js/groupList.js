$(function(){
   initGroupList();
});

function ActionGo(name,value){
	
	 $.ajax({
		  type:"post",
	      url:"http://localhost:8080/GSDP/AS?"+name+"="+value,
	      success:function(msg){
	    	  if(name == "TypeId"){
	    		  location.reload(true);
	    	  }else if(name == "GroupId"){
	    		  $('#openWin').attr("action",msg);
	    		  $('#openWin').submit();
	    	  }
	      },
	      error:function(jqXHR){
	         alert("操作失误:"+jqXHR.status);
	      }	  
	  });   
	 
}

function initGroupList(){
	
  var Address = "http://localhost:8080/GSDP/GGMBTS";
  
  $("#group_container").empty();
	
  $.ajax({
	  type:"post",
      url:"http://localhost:8080/GSDP/GGMBTS",
      dataType:"json",
      success:function(msg){
    	  var json = eval(msg);
          for (var i = json.length - 1; i >= 0; i--) {
             var groupIcon = json[i].group_icon;
             var groupName = json[i].group_name;  
             var groupId = json[i].group_id;
             
             $("#group_container").append("<div class='group_list_item'>"+"<a href="+"javascript:ActionGo("+"'GroupId'"+","+groupId+");><div class='group_icon shadow' style='background:url("+groupIcon+") no-repeat !important;'></div><span class='group_name'>"+groupName+"</span></a></div>");

          }
      },
      error:function(jqXHR){
         alert("数据错误:"+jqXHR.status);
      }	  
  });
  
  
	
}