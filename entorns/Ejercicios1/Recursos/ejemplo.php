<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <title>Página HTML 5 válida</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="estilo.css" title="Color">
</head>

<body>

<h1>COLORES</h1>

<p>Actualice la página para mostrar el resultado.</p>

<table>
    <tbody>
<?php
$color1 = rand(0, 360);
$color2 = rand(0, 360);

print "      <tr>\n";
print "        <th>Color: hsl($color1, 100%, 50%)</th>\n";
print "        <th>Color: hsl($color2, 100%, 50%)</th>\n";
print "      </tr>\n";
print "      <tr>\n";
print "        <td style=\"height: 50px; background-color: hsl($color1, 100%, 50%)\"></td>\n";
print "        <td style=\"background-color: hsl($color2, 100%, 50%)\"></td>\n";
print "      </tr>\n";
?>
    </tbody>
  </table>

</body>
</html>