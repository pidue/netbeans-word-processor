/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.word.editor.core;

import java.net.MalformedURLException;
import java.net.URL;
import org.netbeans.spi.quicksearch.SearchProvider;
import org.netbeans.spi.quicksearch.SearchRequest;
import org.netbeans.spi.quicksearch.SearchResponse;
import org.openide.awt.HtmlBrowser.URLDisplayer;
import org.openide.awt.StatusDisplayer;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;

public class WordQuickSearch implements SearchProvider {

    @Override
    public void evaluate(SearchRequest request, SearchResponse response) {
                
        Lookup.Result<String> result = org.openide.util.Utilities.actionsGlobalContext().lookupResult(String.class);
        for (final String string :  result.allInstances()) {
            if (string.startsWith(request.getText())) {
                if (!response.addResult(new Runnable() {

                    @Override
                    public void run() {
                        StatusDisplayer.getDefault().setStatusText(string);
                        try {
                            URLDisplayer.getDefault().showURL(new URL("http://www.google.it/search?q=" + string));
                        } catch (MalformedURLException ex) {
                            Exceptions.printStackTrace(ex);
                        }
                    }
                }, string)) {
                    break;
                }
            }
        }
        

        //sample code
        //for (SearchedItem item : getAllItemsToSearchIn()) {
        //    if (isConditionSatisfied(item, request)) {
        //        if (!response.addResult(item.getRunnable(), item.getDisplayName(),
        //	      item.getShortcut(), item.getDisplayHint())) {
        //	      break;
        //	  }
        //    }
        //}
    }

}
