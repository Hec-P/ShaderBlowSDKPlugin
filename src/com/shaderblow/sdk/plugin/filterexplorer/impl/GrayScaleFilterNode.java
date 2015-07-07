package com.shaderblow.sdk.plugin.filterexplorer.impl;

import com.jme3.gde.core.filters.FilterNode;
import com.shaderblow.filter.grayscale.GrayScaleFilter;
import com.shaderblow.sdk.plugin.filterexplorer.AbstractFilterNode;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.nodes.Sheet;

/**
 *
 * @author Hector
 */
@org.openide.util.lookup.ServiceProvider(service = FilterNode.class)
public class GrayScaleFilterNode extends AbstractFilterNode {

    public GrayScaleFilterNode() {
    }

    public GrayScaleFilterNode(GrayScaleFilter filter, DataObject object, boolean readOnly) {
        super(filter);
        this.dataObject = object;
        this.readOnly = readOnly;
    }

    @Override
    protected Sheet createSheet() {
        Sheet sheet = super.createSheet();
        Sheet.Set set = Sheet.createPropertiesSet();
        set.setDisplayName("Gray Scale");
        set.setName(Node.class.getName());
        GrayScaleFilter obj = (GrayScaleFilter) filter;
        if (obj == null) {
            return sheet;
        }

        createFields(GrayScaleFilter.class, set, obj);
        sheet.put(set);
        return sheet;

    }

    @Override
    public Class<?> getExplorerObjectClass() {
        return GrayScaleFilter.class;
    }

    @Override
    public Node[] createNodes(Object key, DataObject dataObject, boolean readOnly) {
        return new Node[]{new GrayScaleFilterNode((GrayScaleFilter) key, dataObject, readOnly)};
    }
}
