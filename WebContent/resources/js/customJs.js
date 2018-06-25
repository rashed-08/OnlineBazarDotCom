$(document).ready(function() {
	switch (menu) {
	case 'About us':
		$('#about').addClass('active');
		break;
	case 'Home':
		$('#home').addClass('active');
		break;
	case 'Manage Product':
		$('#manage').addClass('active');
		break;
	case 'Contact us':
		$('#contact').addClass('active');
		break;
	default:
		$('#product').addClass('active');
		$('#a_'+menu).addClass('active');
		break;
	}
	
	var $table= $("#productListTable");
	
	if ($table.length){
		var jsonUrl = '';
		if (window.categoryId==''){
			jsonUrl = window.contextRoot+'/json/data/all/product';
		} else {
			jsonUrl = window.contextRoot+'/json/data/category/'+window.categoryId+'/product';
			
		}
		
		
		$table.DataTable({
			lengthMenu: [[3,5,10,-1],['3 Records','5 Records','10 Records','All']],
			pageLength:5,
			"ajax": {
				"url": jsonUrl,
				dataSrc:''
			},
			"columns": [
				{
					"data":"code",
					mRender: function(data, type, row){
						return '<img src="'+window.contextRoot+'/resources/images/'+data+'" class="dataTableImg"/>';
					}
				}, {
					"data": "name"
				}, {
					"data": "brand"
				}, {
					"data": "unitPrice",
					mRender: function(data, type, row){
						return "&#2547 "+data;
					}
				}, {
					"data": "quantity",
					mRender:function(data, type, row){
						if (data<1){
							return '<span style="color:red">Out of Stock!</span>';
						}
						return data;
					}
				}, {
					"data": "id",
					bSortable: false,
					mRender: function(data, type, row){
						var str='';
						str+='<a href="'+window.contextRoot+'/show/'+data+'/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &nbsp;';
						
						if (row.quantity < 1){
							str+='<a href="javascript:void(0);" class="btn btn-success disabled"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
						} else {
							str+='<a href="'+window.contextRoot+'/add/cart/'+data+'/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
						}
						
						return str;
					}
				}
			]
		});
	}
	
	var $alert=$('.alert');
	if ($alert.length){
		setTimeout(function(){
			 $alert.fadeOut('slow');
		},3000)
	}
	
});