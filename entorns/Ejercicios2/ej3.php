<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <?php
        $title = "Partida de dados";
    print "<title>$title</title>";
    ?>
    <link rel="stylesheet" href="Recursos/estilo.css">
</head>


    <body>
        <?php
            print "<h1>$title</h1>";
        ?>
        <p>Actualice la página para mostrar una nueva partida de dados.</p>
        <?php
            $veces = mt_rand(2,7);

            $ganadasJ1 = 0;
            $ganadasJ2 = 0;
            $empate = 0;

            for ($i=0 ; $i<$veces ; $i++) { 

                $tiradasJ1 [] = mt_rand(1,6);
                $tiradasJ2 [] = mt_rand(1,6);

                if ($tiradasJ1[$i] == $tiradasJ2[$i]) { # Comprobación de partidas
                    $empate++;
                } else {
                    
                    if ($tiradasJ1[$i] > $tiradasJ2[$i]) {
                        $ganadasJ1++;
                    } else {
                        $ganadasJ2++;
                    }
                }   
            }

            print "<h2>Jugador 1</h2>";
            
            foreach ($tiradasJ1 as $key => $value) { 
                print "<img src=Recursos/$tiradasJ1[$key].svg alt=$tiradasJ1[$key]>";
            }
            
            print "<h2>Jugador 2</h2>";
            foreach ($tiradasJ2 as $key => $value) { 
                print "<img src=Recursos/$tiradasJ2[$key].svg alt=$tiradasJ2[$key]>";
            }

            // Singular / plural
            $veces1 = "veces";
            $veces2 = "veces";
            $veces3 = "veces";

            print "<h2>Resultado</h2>";
            print "<p>El jugador 1 ha ganado <b>$ganadasJ1</b> $veces1, el jugador 2 ha ganado <b>$ganadasJ2</b> $veces2 y los jugadores han empatado <b>$empate</b> $veces3.</p>";
            if ($ganadasJ1 == $ganadasJ2) {
                print "<p>Ha habido un empate.</p>";
            } else {
                print "<p>En conjunto, ha ganado el jugador <b>".($ganador = ($ganadasJ1>$ganadasJ2) ? 1 : 2)."</b>.</p>" ;
            }
        ?>

    </body>
</html>