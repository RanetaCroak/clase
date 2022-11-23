<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <?php
        $title = "Muestra animales";
    print "<title>$title</title>";
    ?>
    <link rel="stylesheet" href="Recursos/estilo.css">
</head>


    <body>
        <?php
            print "<h1>$title</h1>";
        ?>
        <p>
            Actualice la página para mostrar un nuevo animal.
        </p>
        <?php
        
            $animales = ["ballena","caballito-mar","camello","cebra","elefante","hipopotamo","jirafa","leon","leopardo","medusa","mono","oso-blanco","oso","pajaro","pinguino","rinoceronte","serpiente","tigre","tortuga-marina","tortuga"];
            
            $randomAnimal = mt_rand(0,count($animales)-1);

            print "<img width=300 height=300 src=Recursos/animales/".$animales[$randomAnimal].".svg alt=".$animales[$randomAnimal].">";

            # Listado de todos los animales de la array
            
            // foreach ($animales as $key => $value) {
            //     print "<img width=300 height=300 src=Recursos/animales/$animales[$key].svg>";
            // }
        ?>

    </body>
</html>