<html>
<body>
	<h3>enter the Details of Student</h3>
	<form action="update-student">
		RollNo:<input type="text" name="rollNo"  readonly value="${student.rollNo}"><br />
		name :<input type="text" name="name" 	value="${student.name}"><br />
		 collage name :<input type="text" name="clgName"  value="${student.clgName}"><br />
		course :<input type="text" name="course" value="${student.course}"><br /> 
		 Branch:<input	type="text" name="branch" value="${student.branch}"><br />
		   Enter City:<input	type="text" name="city" value="${student.city}"><br />
		   Enter pincode :<input  type="number" name="pincode" value="${student.pincode}"><br />
		<button type="submit">Update<button>
	</form>

</body>

</html>