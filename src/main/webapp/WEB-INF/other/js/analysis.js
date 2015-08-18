(function() {
	var $_GET = (function() {
		var url = window.document.location.href.toString();
		var u = url.split("?");
		if (typeof (u[1]) == "string") {
			u = u[1].split("&");
			var get = {};
			for ( var i in u) {
				var j = u[i].split("=");
				get[j[0]] = j[1];
			}
			return get;
		} else {
			return {};
		}
	})();

	$(document).ready(
			function() {
				
				var tabs = ["0","1","2","3","4","5","6"];
				for(t in tabs){

					$('#myTabs li:eq(' + t + ') a').on('shown.bs.tab', function (e) {
						  var id = $(this).attr('id');
							// NetHistoryLine
							var NetHistoryLineData = {
								labels : [ "2015/01", "2015/02", "2015/03", "2015/04",
										"2015/05", "2015/06", "2015/07" ],
								datasets : [ {
									fillColor : "rgba(220,220,220,0.5)",
									strokeColor : "rgba(220,220,220,1)",
									pointColor : "rgba(220,220,220,1)",
									pointStrokeColor : "#fff",
									data : [ 580, 600, 595, 631, 570, 590, 605 ]
								} ]
							}

							// GrowthHistoryLine
							var GrowthHistoryLineData = {
								labels : [ "2015/01", "2015/02", "2015/03", "2015/04",
										"2015/05", "2015/06", "2015/07" ],
								datasets : [ {
									fillColor : "rgba(220,220,220,0.5)",
									strokeColor : "rgba(220,220,220,1)",
									pointColor : "rgba(220,220,220,1)",
									pointStrokeColor : "#fff",
									data : [ 0, 0, 0, 0, 0, 0, 0 ]
								}, {
									fillColor : "rgba(151,187,205,0.5)",
									strokeColor : "rgba(151,187,205,1)",
									pointColor : "rgba(151,187,205,1)",
									pointStrokeColor : "#fff",
									data : [ -30, -5, 10, 0, 30, 30, 80 ]
								} ]
							}
							
							// Get context with jQuery - using jQuery's .get() method.
							var NetHistoryLineCtx = $("#NetHistoryLine" + id).get(0)
									.getContext("2d");
							// This will get the first returned node in the jQuery collection.
							new Chart(NetHistoryLineCtx).Line(NetHistoryLineData, {
								scaleOverride : true,
								scaleSteps : 7,
								scaleStepWidth : 50,
								scaleStartValue : 400
							});

							// Get context with jQuery - using jQuery's .get() method.
							var GrowthHistoryCtx = $("#GrowthHistoryLine" + id).get(0)
									.getContext("2d");
							// This will get the first returned node in the jQuery collection.
							new Chart(GrowthHistoryCtx).Line(GrowthHistoryLineData, {
								scaleOverride : true,
								scaleSteps : 7,
								scaleStepWidth : 50,
								scaleStartValue : -200,
								datasetFill : false
							});
							
							if(id == '0'){

								// TodayHistoryRadar0
								var TodayHistoryRadarData = {
										labels : [ "数学", "语文", "英语", "物理", "化学",  "历史"],
										datasets : [ {
											fillColor : "rgba(220,220,220,0.5)",
											strokeColor : "rgba(220,220,220,1)",
											pointColor : "rgba(220,220,220,1)",
											pointStrokeColor : "#fff",
											data : [ 85, 88, 83, 80, 78, 87]
										}, {
											fillColor : "rgba(151,187,205,0.5)",
											strokeColor : "rgba(151,187,205,1)",
											pointColor : "rgba(151,187,205,1)",
											pointStrokeColor : "#fff",
											data : [ 99, 75, 82, 97, 89, 70]
										} ]
								}
								

								//Get context with jQuery - using jQuery's .get() method.
								var TodayHistoryRadarCtx = $("#TodayHistoryRadar0").get(0).getContext("2d");
								//This will get the first returned node in the jQuery collection.
								new Chart(TodayHistoryRadarCtx).Radar(TodayHistoryRadarData, {});
								
							}

					})
				}
				
				var tabNo = $_GET['tabNo'];
				if(null!=tabNo && 0!=tabNo){
					$('#myTabs li:eq(' + tabNo + ') a').click();
				}else{
					$('#myTabs li:eq(0) a').click();	
				}
				
			});
})()