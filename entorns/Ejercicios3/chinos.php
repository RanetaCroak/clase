<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <?php
    $title = "Los chinos";
    print "<title>$title</title>";
    ?>
    <link rel="stylesheet" href="Recursos/estilo.css">
</head>

    <body>

        <?php
            print "<h1>$title</h1>";
        ?>

    <p>Actualice la página para mostrar otra partida.</p>

        <?php
            $estimacionJ1 = mt_rand(0,6);
            $estimacionJ2 = mt_rand(0,6);

            $manoJ1 = mt_rand(0, 3);
            $manoJ2 = mt_rand(0, 3);

            $mensaje = "";

            $resultado = $manoJ1 + $manoJ2;

            if ($estimacionJ1 == $resultado || $estimacionJ2 == $resultado) {
                
                if ($estimacionJ1 == $resultado) {
                    $mensaje = "¡Ha acertado el jugador 1!";
                } 
                if ($estimacionJ2 == $resultado) {
                    if ($mensaje != "") {
                        $mensaje = "¡Empate! ¡Han acertado los dos!";
                    } else {   
                        $mensaje = "¡Ha acertado el jugador 2!";
                    }
                }
            } else {
                $mensaje = "¡No ha acertado ningún jugador!";
            }
        ?>

        <table>
            <tr>
                <th>
                    Jugador 1
                </th>
                <th>
                    Jugador 2
                </th>
            </tr>

            <tr>
                <td>
                    <!-- J1 -->
                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 117.97 107.3" width="200">
                        <g stroke-width="2" stroke-linejoin="round" stroke-linecap="round">
                            <path fill="#ccc" stroke="#ccc" d="M23.8 6l78 5.4c8.4 0 15.2 6.7 15.2 15L112.2 74c0 8.3-5.4
                            14.4-13.8 14.4l-17 .3 4 17.6L60 89l-26 .8c-8.3 0-19-7.5-19-16L7 24c0-8.4 8.2-18 16.6-18z"/>
                            <path fill="#fff" stroke="#000" d="M17.5 1l78 5.6c8.5 0 15.2 6.7 15.2 15L106 69.2c0 8.5-5.4
                            14.6-13.8 14.6l-17 .3 4 17.6L54 84.3 28 85c-8.6 0-19.5-7.5-19.5-16L1 19C1 10.4 9 1 17.5 1z"/>
                            <text x="40" y="65" textanchor="middle" style="font-size: 70px">
                                <?php
                                    print $estimacionJ1;
                                ?>
                            </text>
                        </g>
                    </svg>
                </td>
                <td>
                    <!-- J2 -->
                    <svg version="1.1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 117.97 107.3" width="200">
                        <g stroke-width="2" stroke-linejoin="round" stroke-linecap="round">
                            <path fill="#ccc" stroke="#ccc" d="M94.2 6l-78 5.4C7.6 11.4 1 18 1 26.4L5.8 74c0 8.3 5.4
                            14.4 13.814.4l17 .3-4 17.6L57.8 89l26.8c8.4 0 19.3-7.5 19.3-16l8-50c0-8.4-8-18-16.5-18z" />
                            <path fill="#fff" stroke="#000" d="M100.5 1l-78 5.6C14 6.6 7 13.3 7 21.6L12 69c0 8.6 5.2 
                            14.7 13.6 14.7l17 .3-4 17.4L64 84.2l26 .7c8.4 0 19.3-7.8 19.3-16l7.6-50c0-8.8-8-18-16.8-18z" />
                            <text x="40" y="65" textanchor="middle" style="font-size: 70px">
                                <?php
                                    print $estimacionJ2;
                                ?>   
                            </text>
                        </g>
                    </svg>
                </td>
            </tr>
            <tr>
                <th>
                    <?php
                        print "<img width=200 height=200 src=Recursos/chinos/chinos-$manoJ1.svg alt=manoJ1-$manoJ1>";
                    ?>
                </th>
                <th>
                    <?php
                        print "<img width=200 height=200 src=Recursos/chinos/chinos-$manoJ2.svg alt=manoJ1-$manoJ2>";
                    ?>
                </th>
            </tr>
            <tr>
                <th colspan="2">
                    <?php
                        print "<h2>$mensaje</h2>";
                    ?>
                </th>
            <tr>
        </table>
    </body>

</html>