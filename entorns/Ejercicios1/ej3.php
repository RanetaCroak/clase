<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <title>DADO DIGITAL</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="Recursos/estilo.css" title="Color">
</head>

<body>

    <?php
        print "<h1>DADO DIGITAL</h1>";
        print "<p>Actualice la página para mostrar un nuevo valor.</p>";
        print "<p><span>".mt_rand(1,6)."</span></p>";
    ?>

</body>
</html> 