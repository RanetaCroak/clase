<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <?php
        $title = "Juego: dado más alto";
    print "<title>$title</title>";
    ?>
    <link rel="stylesheet" href="Recursos/estilo.css">
</head>


    <body>
        <?php
            print "<h1>$title</h1>";
        ?> 
        <table>

            <p>
                Actualice la página para mostrar una nueva tirada.
            </p>

            <tr>
                <th>Jugador 1</th>
                <th>Jugador 2</th>
                <th>Resultado</th>
            </tr>

            <tr>
                <?php
                   
                    $jugador1 = mt_rand(1,6);
                    $jugador2 = mt_rand(1,6);

                    if ($jugador1>$jugador2) {
                        $ganador = 1;
                    } else {
                        $ganador = 2;
                    }

                    print "<td class=azul><img src=Recursos/$jugador1.svg alt=dado1></td>";
                    print "<td class=rojo><img src=Recursos/$jugador2.svg alt=dado2></td>";
                    
                    print "<td>";
                        if ($jugador1 == $jugador2) {
                            print "Empate!";
                        } else {
                            print "Ha ganado el jugador $ganador";
                        }
                    print "</td>";
                ?>
            </tr>
        </table>

    </body>
</html>