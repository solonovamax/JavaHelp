package reddit.javahelp.u.NotVector;

import java.util.Arrays;


/**
 * Reddit Thread: https://www.reddit.com/r/javahelp/comments/ewr63t/how_to_group_a_sequence_of_characters_into_threes/
 */
public class RNAArrays {
    static final String[] rna = {"A", "T", "G",
                                 "C", "C", "T",
                                 "U", "A", "C",
                                 "G", "G", "A",
                                 "A", "G", "T",
                                 "C", "C", "T"};
    static       String[] threeSequence;
    
    public static void main(String[] args) {
        threeSequence = new String[rna.length / 3];
        
        for (int i = 0; i < rna.length / 3; i++) {
            for (int j = 0; j < 3; j++) {
                threeSequence[i] = (threeSequence[i] == null ? "" : threeSequence[i]) + rna[i * 3 + j];
            }
        }
        
        System.out.println(Arrays.toString(threeSequence));
    }
}
