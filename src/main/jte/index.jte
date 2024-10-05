<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>My Home Page</title>
    <script src="https://unpkg.com/htmx.org@2.0.3"></script>
</head>
<body>
<h1>
    What's up, my friend?
</h1>
<button hx-get="/random-number" hx-target="#random-number-container">
    Click here for random number!
</button>
<div id="random-number-container">
    No number fetched yet...
</div>
</body>
</html>
