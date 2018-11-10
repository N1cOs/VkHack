document.getElementById('search_form').onsubmit =  (event) =>{
   const searchValue = document.getElementById('search_employee').value;
   $.ajax({
      type : 'POST',
       url : '/employee/search',
       data : searchValue,
       success : function(data){
          console.log('success');
       }
   });
};