package com.shaderblow.sdk.plugin.filterexplorer.actions;

import com.shaderblow.sdk.plugin.filterexplorer.AbstractNewFilterAction;
import com.jme3.gde.core.filters.actions.NewFilterAction;
import com.jme3.post.Filter;
import com.shaderblow.filter.colorscale.ColorScaleFilter;

/**
 *
 * @author Hector
 */
@org.openide.util.lookup.ServiceProvider(service = NewFilterAction.class)
public class NewColorScaleFilterAction extends AbstractNewFilterAction {

    public NewColorScaleFilterAction() {
        name = PREFFIX_NAME + "Color Scale";
    }

    @Override
    protected Filter doCreateFilter() {
        return new ColorScaleFilter();
    }

}
