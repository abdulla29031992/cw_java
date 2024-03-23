package program.core.unit;

import java.util.Collection;

import program.core.AnalyzeText;

public class WordCounter implements AnalyzeText 
{
    private final Collection<String> words;

    public WordCounter(Collection<String> words) 
    {
        this.words = words;
    }

    private Integer getWordCount() 
    {
        return  this.words.size();
    }

    @Override
    public void analyze() 
    {
        System.out.println("Количество слов в тексте " + getWordCount());
    }
}
