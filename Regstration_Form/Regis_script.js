function fillData() {
		courseArr = ['Graduation','Post-Graduation']
		var dd = document.getElementById('course')
		for (var i = 0; i < courseArr.length; i++) {
			//console.log(animalsArr[i]);
			var ele = document.createElement('option')
			ele.text=courseArr[i];
			dd.add(ele,i)

		}
	}

	function fillData2() {
		opts=[['Computer Science','Information Technology','Electrical Engineering','Civil Engineering','Mechanical'],['Cloud Computing','Parallel Computing','High Perf. Computing','Distributed Computing']];

		var dd = document.getElementById('course')
		var ddopt = document.getElementById('options')
		
		idx = dd.selectedIndex;
		ddopt.innerHTML=null;

		for (var i = 0; i < opts[idx].length; i++) {
			
			var ele = document.createElement('option')
			ele.text=opts[idx][i];
			ddopt.add(ele,i)

		}
	}

	function dob2() {
		
        var dd2 = new Date();

		var y2 = dd2.getFullYear()-18;
		var m2 = dd2.getMonth()+1;
		var d2 = dd2.getDate();
		
		if (d2<10){
			d2 = '0'+d;
		}
		if(m2<10)
            m2='0'+m2;
        document.getElementById('dob').max=y2+'-'+m2+'-'+d2;
	}

	function showp() {
		var x = document.getElementById('pass').type
		if(x=='text'){
			document.getElementById('pass').type = 'password';
		}else{
			document.getElementById('pass').type = 'text';
		}
	}

	function checkall() {
		var name =  document.getElementById('uname').value
		var p1 =  document.getElementById('pass').value
		var p2 =  document.getElementById('pass2').value
		var cou =  document.getElementById('course').value
		var opt =  document.getElementById('options').value
		var db =  document.getElementById('dob').value

		console.log(name + p1 + p2 + cou + opt + db)

		if(name === undefined || name == null || name.length <= 0 ||
			p1 === undefined || p1 == null || p1.length <= 0 ||
			p2 === undefined || p2 == null || p2.length <= 0 ||
			cou === undefined || cou == null || cou.length <= 0 ||
			opt === undefined || opt == null || opt.length <= 0){
			alert('All Fields Mandatory!')
			return false
		}

		if(p1!=p2){
			alert('Passwords Dont Match')
			return false
		}

		//alert('Good Job, Everything is Set')
		return true;
	}

	function checkPasswordMatch() {
    var password = document.getElementById('pass').value
    var confirmPassword = document.getElementById('pass2').value

    if (password != confirmPassword)
        document.getElementById('test').innerHTML= "Password Mis-Match"
    else
        document.getElementById('test').innerHTML= "Password Match"
}
