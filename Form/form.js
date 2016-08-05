function form_checks{
  var firstname = getElementById('firstname').value;
  var lastname = getElementById('lastname').value;

  if (firstname == "" || lastname == ""){
    alert("Please fill in the firstname and the lastname!");
    return false;
  }
  else {
    return true;
  }


}
