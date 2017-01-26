/**
 * This file is part of validation-model, a module of the veraPDF project.
 * Copyright (c) 2015, veraPDF Consortium <info@verapdf.org>
 * All rights reserved.
 *
 * validation-model is free software: you can redistribute it and/or modify
 * it under the terms of either:
 *
 * The GNU General public license GPLv3+.
 * You should have received a copy of the GNU General Public License
 * along with validation-model as the LICENSE.GPL file in the root of the source
 * tree.  If not, see http://www.gnu.org/licenses/ or
 * https://www.gnu.org/licenses/gpl-3.0.en.html.
 *
 * The Mozilla Public License MPLv2+.
 * You should have received a copy of the Mozilla Public License along with
 * validation-model as the LICENSE.MPL file in the root of the source tree.
 * If a copy of the MPL was not distributed with this file, you can obtain one at
 * http://mozilla.org/MPL/2.0/.
 */
package org.verapdf.gf.model.impl.cos;

import org.verapdf.cos.COSName;
import org.verapdf.model.coslayer.CosRenderingIntent;

/**
 * PDF Name representing rendering intent.
 * @author Sergey Shemyakov
 */
public class GFCosRenderingIntent extends GFCosName implements CosRenderingIntent {

    /** Type name for GFCosRenderingIntent */
    public static final String COS_RENDERING_INTENT_TYPE = "CosRenderingIntent";

    /**
     * Default constructor
     * @param cosName is rendering intent COSName.
     */
    public GFCosRenderingIntent(COSName cosName) {
        this(cosName, COS_RENDERING_INTENT_TYPE);
    }

    /**
     * Constructor for child classes
     * @param cosName is rendering intent COSName.
     * @param type child class type.
     */
    public GFCosRenderingIntent(COSName cosName, final String type) {
        super(cosName, type);
    }
}
