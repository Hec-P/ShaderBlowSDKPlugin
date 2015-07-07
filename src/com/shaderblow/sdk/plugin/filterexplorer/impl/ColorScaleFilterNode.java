package com.shaderblow.sdk.plugin.filterexplorer.impl;

import com.jme3.gde.core.filters.FilterNode;
import com.shaderblow.filter.colorscale.ColorScaleFilter;
import com.shaderblow.sdk.plugin.filterexplorer.AbstractFilterNode;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.nodes.Sheet;

/**
 *
 * @author Hector
 */
@org.openide.util.lookup.ServiceProvider(service = FilterNode.class)
public class ColorScaleFilterNode extends AbstractFilterNode {

    public ColorScaleFilterNode() {
    }

    public ColorScaleFilterNode(ColorScaleFilter filter, DataObject object, boolean readOnly) {
        super(filter);
        this.dataObject = object;
        this.readOnly = readOnly;
    }

    @Override
    protected Sheet createSheet() {
        Sheet sheet = super.createSheet();
        Sheet.Set set = Sheet.createPropertiesSet();
        set.setDisplayName("Color Scale");
        set.setName(Node.class.getName());
        ColorScaleFilter obj = (ColorScaleFilter) filter;
        if (obj == null) {
            return sheet;
        }
        //set.put(makeProperty(obj, ColorRGBA.class, "getColor", "setColor", "Color"));
        createFields(ColorScaleFilter.class, set, obj);
        sheet.put(set);
        return sheet;

    }

    @Override
    public Class<?> getExplorerObjectClass() {
        return ColorScaleFilter.class;
    }

    @Override
    public Node[] createNodes(Object key, DataObject dataObject, boolean readOnly) {
        return new Node[]{new ColorScaleFilterNode((ColorScaleFilter) key, dataObject, readOnly)};
    }
}
