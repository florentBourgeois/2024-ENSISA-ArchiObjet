package uha.ensisa.archiobjet.DungeonMapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UtilsHTML {


    /**
     * permet de transposer le html passé en paramettre dans le fichier Ressources/index.html
     * @param html
     */
    public static void writeHTMLToIndex(String html){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Ressources/DungeonMapper/index.html"));
            writer.write(getBegining());
            writer.write(html);
            writer.write(getEnding());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("ecriture dans le fichier index.html echouée\n" + e);
        }
    }




    public static String getBegining(){
        String result = "<!DOCTYPE html>\n" +
                "<html lang=\"fr\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Donjon Généré</title>\n" +
                "    <style>\n" +
                "        /* Style de base pour les salles */\n" +
                "        .salle {\n" +
                "            width: 50px;\n" +
                "            height: 50px;\n" +
                "            background-color: #333;\n" +
                "            border: 2px solid white;\n" +
                "            position: absolute;\n" +
                "        }\n" +
                "\n" +
                "        /* Conteneur pour gérer le positionnement */\n" +
                "        #map {\n" +
                "            position: relative;\n" +
                "            width: 500px;\n" +
                "            height: 500px;\n" +
                "            background-color: #444;\n" +
                "            margin: 0 auto;\n" +
                "            border: 2px solid #000;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <div id=\"map\">\n" +
                "        <!-- Les salles seront ici générées -->\n" +
                "    </div>\n" +
                "\n" +
                "    <script>\n" +
                "        // Fonction pour ajouter une salle au plan\n" +
                "        function ajouterSalle(x, y, couleur) {\n" +
                "            let salle = document.createElement('div');\n" +
                "            salle.classList.add('salle');\n" +
                "            salle.style.left = (x * 60) + 'px';  // 60px d'espacement pour inclure la bordure\n" +
                "            salle.style.top = (y * 60) + 'px';\n" +
                "            salle.style.backgroundColor = couleur;  // Applique la couleur passée en paramètre\n" +
                "            document.getElementById('map').appendChild(salle);\n" +
                "        }\n";
        return result;
    }

    public static String getEnding(){
        String result = "    </script>\n" +
                "</body>\n" +
                "</html>";
        return result;
    }

}