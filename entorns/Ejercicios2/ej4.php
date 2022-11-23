<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <?php
        $title = "Calcula letra DNI";
    print "<title>$title</title>";
    ?>
    <link rel="stylesheet" href="Recursos/estilo.css">
</head>


    <body>
        <?php
            print "<h1>$title</h1>";
        ?>
        
        <?php
            $dni = 20881234;
            $letras=["T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"];

            print "<p>Dado el DNI $dni, su letra es la ".$letras[$dni%23]."</p>";

        ?>

    </body>
</html>