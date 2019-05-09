import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Save {
    public Save(Character character){
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        try {
            builder = factory.newDocumentBuilder();
            Document doc = builder.newDocument();
            // создаем корневой элемент
            Element rootElement =
                    doc.createElementNS("https://pathfinderwiki.com/wiki/Pathfinder_Wiki", "Character");
            doc.appendChild(rootElement);
            rootElement.appendChild(getCharacter(doc, character));
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            // для красивого вывода в консоль
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(doc);

            //печатаем в консоль или файл
            StreamResult console = new StreamResult(System.out);
            //StreamResult file = new StreamResult(new File("/character" + character.getName() + ".xml"));
            StreamResult file = new StreamResult(new File("character" + character.getName() + ".xml"));
            //записываем данные
            transformer.transform(source, console);
            transformer.transform(source, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // метод для создания нового узла XML-файла
    private static Node getCharacter(Document doc, Character character) {
        Element char_pathfinder = doc.createElement("SavePerson");
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Name", character.getName()));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Age", String.valueOf(character.getAge())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Alignment", String.valueOf(character.getAlignment())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Race", String.valueOf(character.getRace().getRaceName())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Class", String.valueOf(character.getClassName())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Money", String.valueOf(character.getStartingMoney())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Height", String.valueOf(character.getHeight())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Weight", String.valueOf(character.getWeight())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Strength", String.valueOf(character.getStrength())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Dexterity", String.valueOf(character.getDexterity())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Constitution", String.valueOf(character.getConstitution())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Intelligence", String.valueOf(character.getIntelligence())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Wisdom", String.valueOf(character.getWisdom())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Charisma", String.valueOf(character.getCharisma())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Typeofgeneration", String.valueOf(character.getTypeGenerate())));
        char_pathfinder.appendChild(getCharacterElements(doc, char_pathfinder, "Gender", String.valueOf(character.getGender())));
        return char_pathfinder;
    }


    // утилитный метод для создание нового узла XML-файла
    private static Node getCharacterElements(Document doc, Element element, String name, String value) {
        Element node = doc.createElement(name);
        node.appendChild(doc.createTextNode(value));
        return node;
    }
}
