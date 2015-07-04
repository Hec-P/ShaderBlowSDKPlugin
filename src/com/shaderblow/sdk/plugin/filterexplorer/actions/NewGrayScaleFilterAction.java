package com.shaderblow.sdk.plugin.filterexplorer.actions;

import com.jme3.gde.core.filters.actions.NewFilterAction;
import com.jme3.post.Filter;
import com.shaderblow.filter.grayscale.GrayScaleFilter;

/**
 *
 * @author Hector
 */
@org.openide.util.lookup.ServiceProvider(service = NewFilterAction.class)
public class NewGrayScaleFilterAction extends AbstractNewFilterAction {

    public NewGrayScaleFilterAction() {
        name = PREFFIX_NAME + "GrayScale";
    }

    @Override
    protected Filter doCreateFilter() {
        return new GrayScaleFilter();
    }
    
}
