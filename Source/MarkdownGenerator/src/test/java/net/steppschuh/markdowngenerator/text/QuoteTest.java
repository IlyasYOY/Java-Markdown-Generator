package net.steppschuh.markdowngenerator.text;

import net.steppschuh.markdowngenerator.text.quote.Quote;

import org.junit.Test;

/**
 * Created by steppschuh on 15/12/2016.
 */
public class QuoteTest {

    @Test
    public void example1() throws Exception {
        String quote = "I am a blockquote.\nI may contain multiple lines.";
        Text text = new Quote(quote);
        System.out.println(text);
    }

}