package com.shaderblow.sdk.plugin.icons;

import javax.swing.ImageIcon;
import org.openide.util.ImageUtilities;

/**
 *
 * @author Hector
 */
public class IconList extends com.jme3.gde.core.icons.IconList {

    private static final String ICON_PATH = "com/shaderblow/sdk/plugin/icons/";

    public static ImageIcon S_eyeOpen
            = ImageUtilities.loadImageIcon(ICON_PATH + "eye_s.gif", false);
    public static ImageIcon S_eyeCrossed
            = ImageUtilities.loadImageIcon(ICON_PATH + "crossedEye_s.gif", false);

}
