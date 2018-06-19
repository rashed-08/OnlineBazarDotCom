$(document).ready(function() {
	switch (menu) {
	case 'About us':
		$('#about').addClass('active');
		break;
	case 'All Products':
		$('#product').addClass('active');
		break;
	case 'Contact us':
		$('#contact').addClass('active');
		break;
	default:
		$('#home').addClass('active');
		break;
	}
});