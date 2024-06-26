package program.core;

import java.util.Collection;
import java.util.HashMap;

import program.core.unit.FindLongest;
import program.core.unit.FreqDicitonary;
import program.core.unit.WordCounter;

public class Analyzer 
{
    Collection<String> words;
    HashMap<Integer, AnalyzeText> analyzer;
    public Analyzer(Collection<String> words) {
        this.words = words;
        this.analyzer = new HashMap<Integer, AnalyzeText>();
        this.analyzer.put(1, new WordCounter(this.words));
        this.analyzer.put(2, new FindLongest(this.words));
        this.analyzer.put(3, new FreqDicitonary(this.words));
    }
    public void analyze(Integer command)
    {
        this.analyzer.get(command).analyze();
    }
}
