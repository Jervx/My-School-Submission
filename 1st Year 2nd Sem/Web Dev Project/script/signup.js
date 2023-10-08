let accounts = new Array(); function load(){ if(stor_get("cur_user") != null){ alert("You Are Already Login!"); window.history.back(); } if(stor_get("accounts")) accounts = JSON.parse(stor_get("accounts")); } let username; let password; let confirmpassword; let firstname; let lastname; let age; let email; let mobile; let gender; function checkData(){ username = document.getElementById("username").value; password = document.getElementById("password").value; confirmpassword = document.getElementById("confirm-password").value; firstname = document.getElementById("firstname").value; lastname = document.getElementById("lastname").value; age = parseInt(document.getElementById("age").value); email = document.getElementById("email").value; mobile = document.getElementById("mobile").value; gender = document.getElementById("gender").value; if(username.length <= 0 ){ alert( "Please Create A Username"); return; } if(isUsrExist(username)){ alert( "Username Already Taken, Create a new one"); return; } if(password.length <= 5){ alert( "Please Create A Password With More Than 5 Characters"); return; } if(confirmpassword.length <= 0){ alert( "Please Retype Your Password"); return; } if(password !== confirmpassword){ alert( "Password Doesn't Match"); return; } if(firstname.length <= 0){ alert( "Please Type Your First Name"); return; } if(hasNumber(firstname)){ alert( "First Name Should Not Have Number"); return; } if(lastname.length <= 0){ alert( "Please Enter Your Last Name"); return; } if(hasNumber(lastname)){ alert( "Last Name Should Not Have a Number"); return; } if(Number.isNaN(age)){ alert( "Enter A Valid Age"); return; } if(Number(age) <= 0){ alert( "Age Must be greater than 10 & Must be a valid age"); return; }else if(Number(age) <= 10){ alert( "You're Too Young"); return; }else if(Number(age) >= 100){ alert("You're Too Old"); return; } if(gender.length == 0){ alert( "Please Select Your Gender"); return; } if(email.length <= 0){ alert( "Please Enter Your E-Mail Address"); return; } if(isEmailValid(email) != true){ alert( "Please Enter A Valid E-Mail"); return; } console.log(isNaN(mobile)); if(mobile.length == 0 || isNaN(mobile)){ alert( "Please Enter A Valid Mobile Number"); return; } pushAccount(); } function isEmailValid(email){ let atLoc = email.indexOf("@"); let comLoc = email.indexOf(".com"); if(atLoc === -1 || atLoc == 0 || atLoc === email.length) return false; if(comLoc === -1 || comLoc < atLoc || comLoc != email.length - 4)return false; return true; } function hasNumber(str){ for(c = 0; c < str.length; c++){ let churchar = str[c]; if(churchar >= '0' && churchar <= '9') return true; } return false; } function isUsrExist(usr){ for(d = 0; d < accounts.length; d++)if(accounts[d].username === usr) return true; return false; } function pushAccount(){ let newUser = { "username":username, "password":password, "firstname":firstname, "lastname":lastname, "age":age, "email":email, "mobile":mobile, "gender":gender }; accounts[accounts.length] = newUser; saveData(newUser); } function saveData(newuser){ stor_rem("accounts"); stor_add("accounts",JSON.stringify(accounts)); stor_add("cur_user",JSON.stringify(newuser)); window.location="index.html"; } 
