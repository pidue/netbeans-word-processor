/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.word.editor.uppercase;

import org.openide.util.lookup.ServiceProvider;
import org.word.editor.api.WordFilter;

/**
 *
 * @author Paolo
 */
@ServiceProvider(service = WordFilter.class, position = 2, path = "word")
public class LowercaseFilter implements WordFilter {

    @Override
    public String process(String s) {
        return s.toLowerCase();
    }
    
}
