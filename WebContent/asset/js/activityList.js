$(function(){
  initActivityList();
});

function initActivityList(){
	
  var Addresss = "http://localhost:8080/GSDP/GAMS";

   $.ajax({
      type:"post",
      url:"http://localhost:8080/GSDP/GAMS",
      dataType:"json",
      success:function(msg){
         var json = eval(msg);
         for (var i = json.length - 1; i >= 0; i--) {
            var activityId = json[i].activity_id;
            var activityTitle =  json[i].activity_title;
            var publishTime = new Date();
            publishTime.setTime(json[i].publishTime);
            publishTime = publishTime.Format("yyyy/MM/dd");

            var address = Addresss+"?ActivityId="+activityId;
            
            $("#AllActivity").append("<li><a href="+address+"><span class='title'>"+activityTitle+"</span></a><span class='time'>发布时间:&nbsp;<i>"+publishTime+"</i></span></li>");

         }
      },
      error:function(jqXHR){
         alert("发生错误："+jqXHR.status);
      }
   })
}
//对Date的扩展，将 Date 转化为指定格式的String
//月(M)、日(d)、小时(h)、分(m)、秒(s)、季度(q) 可以用 1-2 个占位符， 
//年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字) 
//例子： 
//(new Date()).Format("yyyy-MM-dd hh:mm:ss.S") ==> 2006-07-02 08:09:04.423 
//(new Date()).Format("yyyy-M-d h:m:s.S")      ==> 2006-7-2 8:9:4.18 
Date.prototype.Format = function (fmt) { //author: meizz 
 var o = {
     "M+": this.getMonth() + 1, //月份 
     "d+": this.getDate(), //日 
     "h+": this.getHours(), //小时 
     "m+": this.getMinutes(), //分 
     "s+": this.getSeconds(), //秒 
     "q+": Math.floor((this.getMonth() + 3) / 3), //季度 
     "S": this.getMilliseconds() //毫秒 
 };
 if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
 for (var k in o)
 if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
 return fmt;
} 
//var time1 = new Date().Format("yyyy-MM-dd");
//var time2 = new Date().Format("yyyy-MM-dd HH:mm:ss");