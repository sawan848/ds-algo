
import Arrays.WordList;

import java.util.regex.*;

public class Ch9WordConCordance {
    private static final String WORD="\\W+";
    private WordList wordList;
    private Pattern pattern;

    public Ch9WordConCordance() {
        wordList =new WordList();
        pattern = Pattern.compile(WORD);
    }

    public void build(String document){
        Matcher matcher=pattern.matcher(document);
        wordList.reset();
        while (matcher.find()){
          wordList.add(document.substring(matcher.start(), matcher.end()));

        }
        String list="one 14\ntwo 3\nthree 3\nfour 5\nfive 92\n";

                wordList.getConcordance();
    }
}
