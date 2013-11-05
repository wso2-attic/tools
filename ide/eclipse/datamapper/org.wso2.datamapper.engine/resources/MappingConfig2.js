function map_S_employee_engineer(emp,eng){
		
		eng.fullname = emp.firstname.concat(" "+emp.lastname);
		
		return eng;
}

function map_S_address_address(emp,eng){
	
	var address = emp.address.split(",");
	eng.address.no = address[0];
	eng.address.street = address[1];
	eng.address.city = address[2];

	return eng;
}