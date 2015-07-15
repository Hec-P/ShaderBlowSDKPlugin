package com.shaderblow.sdk.plugin.filterexplorer.actions;

import com.shaderblow.sdk.plugin.filterexplorer.AbstractNewFilterAction;
import com.jme3.gde.core.filters.actions.NewFilterAction;
import com.jme3.post.Filter;
import com.shaderblow.filter.oldfilm.OldFilmFilter;

/**
 *
 * @author Hector
 */
@org.openide.util.lookup.ServiceProvider(service = NewFilterAction.class)
public class NewOldFilmFilterAction extends AbstractNewFilterAction {

    public NewOldFilmFilterAction() {
        name = PREFFIX_NAME + "Old Film";
    }

    @Override
    protected Filter doCreateFilter() {
        return new OldFilmFilter();
    }

}
