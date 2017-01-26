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
package org.verapdf.gf.model.impl.operator.markedcontent;

import org.verapdf.cos.COSBase;
import org.verapdf.model.operator.Op_EMC;

import java.util.List;

/**
 * @author Timur Kamalov
 */
public class GFOp_EMC extends GFOpMarkedContent implements Op_EMC {

	/** Type name for {@code GFOp_EMC} */
    public static final String OP_EMC_TYPE = "Op_EMC";

    public GFOp_EMC(List<COSBase> arguments) {
        super(arguments, OP_EMC_TYPE);
    }

}
