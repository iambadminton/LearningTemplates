package SharpenSkills.rank3;
import java.util.Map;
import java.util.HashMap;

/**
 * https://www.codewars.com/kata/52f831fa9d332c6591000511/train/java
 For a given chemical formula represented by a string, count the number of atoms of each element contained in the molecule and return an object (associative array in PHP, Dictionary<string, int> in C#, Map in Java).

 For example:
 String water = "H2O";
 parseMolecule.getAtoms(water); // return [H: 2, O: 1]

 String magnesiumHydroxide = "Mg(OH)2";
 parseMolecule.getAtoms(magnesiumHydroxide); // return ["Mg": 1, "O": 2, "H": 2]

 String fremySalt = "K4[ON(SO3)2]2";
 parseMolecule.getAtoms(fremySalt); // return ["K": 4, "O": 14, "N": 2, "S": 4]

 parseMolecule.getAtoms("pie"); // throw an IllegalArgumentException
 As you can see, some formulas have brackets in them. The index outside the brackets tells you that you have to multiply count of each atom inside the bracket on this index. For example, in Fe(NO3)2 you have one iron atom, two nitrogen atoms and six oxygen atoms.

 Note that brackets may be round, square or curly and can also be nested. Index after the braces is optional.
 */


class ParseMolecule {

    public static Map<String,Integer> getAtoms(String formula) {
        // Your code here!

        return new HashMap<String,Integer>();
    }
}
