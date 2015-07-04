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
public class JmeGrayScaleFilter extends AbstractFilterNode {

    public JmeGrayScaleFilter() {
    }

    public JmeGrayScaleFilter(GrayScaleFilter filter, DataObject object, boolean readOnly) {
        super(filter);
        this.dataObject = object;
        this.readOnly = readOnly;
    }

    @Override
    protected Sheet createSheet() {
        Sheet sheet = super.createSheet();
        Sheet.Set set = Sheet.createPropertiesSet();
        set.setDisplayName("GrayScale");
        set.setName(Node.class.getName());
        GrayScaleFilter obj = (GrayScaleFilter) filter;
        if (obj == null) {
            return sheet;
        }
        //set.put(makeProperty(obj, ColorRGBA.class, "getColor", "setColor", "Color"));
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
        return new Node[]{new JmeGrayScaleFilter((GrayScaleFilter) key, dataObject, readOnly)};
    }
}
