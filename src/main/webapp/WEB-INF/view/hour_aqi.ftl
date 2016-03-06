<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>RealHourAQI</title>
	
	<link rel="stylesheet" href="${rc.contextPath}/js/bootstrap/css/bootstrap.min.css" />
	<link rel="stylesheet" href="${rc.contextPath}/css/theme.min.css" />
	
	<script src="${rc.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript">
  		$(document).ready(function(){
  			$("#content").height($(window).height()-20);
  			$("#content").width($(window).width());
  			
  		});
  	</script>
</head>
<body>
	<div id="content" class="table-responsive">
	<table id="list" class="table table-striped table-bordered" style="width:2000px;">
		<thead>
			<tr>
      			<th style="width:180px;">DateTime</th>
      			<th style="width:100px;">PortName</th>
      			<th>SO2</th>
      			<th>SO2_IAQI</th>
      			<th>NO2</th>
      			<th>NO2_IAQI</th>
      			<th>PM10</th>
      			<th>PM10_IAQI</th>
      			<th>CO</th>
      			<th>CO_IAQI</th>
      			<th>O3</th>
      			<th>O3_IAQI</th>
      			<th>Recent8HoursO3</th>
      			<th>Recent8HoursO3_IAQI</th>
      			<th>PM2.5</th>
      			<th>PM2.5_IAQI</th>
      			<th>AQIValue</th>
      			<th>PrimaryPollutant</th>
      			<th>Class</th>
      			<th>Grade</th>
      			<th>HealthEffect</th>
      			<th>TakeStep</th>
    		</tr>
		</thead>
		<tbody>
			<#list dataList as r>
			<tr>
				<td>${r.dateTime?string("yyyy/MM/dd HH:mm:ss")}</td>
      			<td>${r.portname}</td>
      			<td>${r.SO2}</td>
      			<td>${r.SO2_IAQI}</td>
      			<td>${r.NO2}</td>
      			<td>${r.NO2_IAQI}</td>
      			<td>${r.PM10}</td>
      			<td>${r.PM10_IAQI}</td>
      			<td>${r.CO}</td>
      			<td>${r.CO_IAQI}</td>
      			<td>${r.o3}</td>
      			<td>${r.o3_IAQI}</td>
      			<td>${r.recent8HoursO3}</td>
      			<td>${r.recent8HoursO3_IAQI}</td>
      			<td>${r.PM25}</td>
      			<td>${r.PM25_IAQI}</td>
      			<td>${r.AQIValue}</td>
      			<td>${r.primaryPollutant}</td>
      			<td>${r.DClass}</td>
      			<td>${r.healthEffect}</td>
      			<td>${r.takeStep}</td>
      		</tr>
      		</#list>
		</tbody>
	</table>
	</div>
</body>
</html>