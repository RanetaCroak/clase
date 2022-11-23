<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <title>TIRADA DE DADOS</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="Recursos/estilo.css" title="Color">
</head>

  <body>
      <h1>TIRADA DE DADOS</h1>
      <?php
          print "<p>Actualice la página para mostrar el resultado.</p>";
          $dado1 = mt_rand(1,6);
          $dado2 = mt_rand(1,6);

          print "<img src=Recursos/img/$dado1.svg alt=dado$dado1>";
          print "<img src=Recursos/img/$dado2.svg alt=dado$dado2>";
      
          print "<p> Total: <span>".$dado1 + $dado2."</span> </p>";
      ?>

  </body>
</html> 