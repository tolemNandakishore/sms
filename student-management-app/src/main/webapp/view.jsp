<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<table>
		<tr>
			<th>RollNo</th><br />
			<th>Name</th><br/ >
			<th>ClgName</th><br />
			<th>Course</th><br />
			<th>Branch</th><br />
			<th>City</th><br />
			<th>Pincode</th><br />
		</tr>

	<tbody>

		<c:forEach items="${student}"  var="s">
			<tr>
				<td>${s.rollNo}</td>
				<td>${s.name}</td>
				<td>${s.clgName}</td>
				<td>${s.course}</td>
				<td>${s.branch}</td>
				<td>${s.city}</td>
				<td>${s.pincode}</td>
				<td>
				 <a href="edit-student?rollNo=${s.rollNo}">Edit</a>
				 <a href="delete-student?rollNo=${s.rollNo}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
</body>
</html>