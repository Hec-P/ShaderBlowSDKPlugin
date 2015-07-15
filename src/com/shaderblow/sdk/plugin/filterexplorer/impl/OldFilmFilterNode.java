package com.shaderblow.sdk.plugin.filterexplorer.impl;

import com.jme3.gde.core.filters.FilterNode;
import com.shaderblow.filter.oldfilm.OldFilmFilter;
import com.shaderblow.sdk.plugin.filterexplorer.AbstractFilterNode;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.nodes.Sheet;

/**
 *
 * @author Hector
 */
@org.openide.util.lookup.ServiceProvider(service = FilterNode.class)
public class OldFilmFilterNode extends AbstractFilterNode {

    public OldFilmFilterNode() {
    }

    public OldFilmFilterNode(OldFilmFilter filter, DataObject object, boolean readOnly) {
        super(filter);
        this.dataObject = object;
        this.readOnly = readOnly;
    }

    @Override
    protected Sheet createSheet() {
        Sheet sheet = super.createSheet();
        Sheet.Set set = Sheet.createPropertiesSet();
        set.setDisplayName("Old Film");
        set.setName(Node.class.getName());
        OldFilmFilter obj = (OldFilmFilter) filter;
        if (obj == null) {
            return sheet;
        }
        createFields(OldFilmFilter.class, set, obj);
        sheet.put(set);
        return sheet;

    }

    @Override
    public Class<?> getExplorerObjectClass() {
        return OldFilmFilter.class;
    }

    @Override
    public Node[] createNodes(Object key, DataObject dataObject, boolean readOnly) {
        return new Node[]{new OldFilmFilterNode((OldFilmFilter) key, dataObject, readOnly)};
    }
}
