package com.shaderblow.sdk.plugin.filterexplorer;

import com.jme3.post.Filter;
import com.shaderblow.sdk.plugin.icons.IconList;
import java.awt.Image;

/**
 *
 * @author Hector
 */
public abstract class AbstractFilterNode
        extends com.jme3.gde.core.filters.AbstractFilterNode {

    private static Image sIcon;

    public AbstractFilterNode() {
        super();
    }

    public AbstractFilterNode(Filter filter) {
        super(filter);
        sIcon = IconList.S_eyeOpen.getImage();
    }

    @Override
    public Image getIcon(int type) {
        return sIcon;
    }

    @Override
    public void toggleIcon(boolean enabled) {
        if (enabled) {
            sIcon = IconList.S_eyeOpen.getImage();

        } else {
            sIcon = IconList.S_eyeCrossed.getImage();

        }
        fireIconChange();
    }

}
