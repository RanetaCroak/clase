
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <title>DADO DIGITAL</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="Recursos/estilo.css" title="Color">
</head>

<body>

        <h1>DADO DIGITAL GRÁFICO</h1>
    <?php

        print "<p>Actualice la página para mostrar un nuevo valor.</p>";

        $dado = mt_rand(1,6);

        print "<img src=Recursos/img/$dado.svg alt=dado$dado>";

    ?>

</body>
</html> 