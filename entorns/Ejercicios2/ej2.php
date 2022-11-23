<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <?php
        $title = "Contar pares e impares";
    print "<title>$title</title>";
    ?>
    <link rel="stylesheet" href="Recursos/estilo.css">
</head>


    <body>
        <?php
            print "<h1>$title</h1>";
        ?>

        <p>
            Actualice la página para mostrar una nueva tirada.
        </p>

        <?php
            $veces = mt_rand(1,10);
            print "<h2>$veces dados</h2>";

            $pares = 0; 
            $impares = 0;

            for ($i=0 ; $i<$veces ; $i++) { 
                $dado = mt_rand(1,6);

                if ($dado%2==0) {
                    $pares++;
                } else {
                    $impares++;
                }
                
                print "<img src=Recursos/$dado.svg alt=dado$i>";
            }
            
            print "<p>Han salido $pares números pares y $impares números impares.</p>";

        ?>
        
    </body>
</html>