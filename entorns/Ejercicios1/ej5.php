<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="Recursos/estilo.css" title="Color">
</head>
  <body>
    <h1>EMOTICONO</h1>
    <p>Actualice la página para mostrar otro emoticono </p>
    <?php
      $emoji = "&#".mt_rand(128512,128586);
      
      print "<p style=font-size:1000%; text-align:center >$emoji</p>";
      ?>
      <?php
        print "<title>EMOTICONO $emoji</title>";
      ?>

  </body> 
</html>