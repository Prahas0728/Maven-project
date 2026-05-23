<!DOCTYPE html>
<html>

<head>

<title>Rock Paper Scissors</title>

<style>

body{
    margin:0;
    padding:0;
    font-family:Arial;
    background:linear-gradient(135deg,#141e30,#243b55);
    color:white;
    height:100vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.container{

    background:#1f2937;
    padding:40px;
    border-radius:20px;
    text-align:center;
    box-shadow:0 0 20px rgba(0,0,0,0.5);
    width:500px;
}

h1{
    margin-bottom:30px;
    font-size:40px;
}

.scoreboard{

    display:flex;
    justify-content:space-around;
    margin-bottom:30px;
    font-size:20px;
}

.buttons{

    display:flex;
    justify-content:center;
    gap:20px;
}

button{

    padding:20px;
    font-size:20px;
    border:none;
    border-radius:15px;
    cursor:pointer;
    transition:0.3s;
    width:120px;
    background:#374151;
    color:white;
}

button:hover{

    transform:scale(1.1);
    background:#4b5563;
}

.footer{

    margin-top:30px;
    color:#9ca3af;
}

</style>

</head>

<body>

<div class="container">

<h1> Rock Paper Scissors</h1>

<div class="scoreboard">

<div>
 Player
<br>
0
</div>

<div>
 Computer
<br>
0
</div>

</div>

<form action="play" method="post">

<div class="buttons">

<button name="choice" value="Rock">
 Rock
</button>

<button name="choice" value="Paper">
 Paper
</button>

<button name="choice" value="Scissors">
Scissors
</button>

</div>

</form>

<div class="footer">

Choose your move and defeat the computer!

</div>

</div>

</body>
</html>
