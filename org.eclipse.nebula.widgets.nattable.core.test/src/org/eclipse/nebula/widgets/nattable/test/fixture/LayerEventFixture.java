/*******************************************************************************
 * Copyright (c) 2012 Original authors and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Original authors and others - initial API and implementation
 ******************************************************************************/
package org.eclipse.nebula.widgets.nattable.test.fixture;

import java.util.Collection;

import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.layer.event.ILayerEvent;
import org.eclipse.nebula.widgets.nattable.layer.event.IVisualChangeEvent;
import org.eclipse.swt.graphics.Rectangle;

public class LayerEventFixture implements IVisualChangeEvent {

    @Override
    public ILayerEvent cloneEvent() {
        return new LayerEventFixture();
    }

    @Override
    public boolean convertToLocal(ILayer localLayer) {
        return true;
    }

    @Override
    public Collection<Rectangle> getChangedPositionRectangles() {
        return null;
    }

    @Override
    public ILayer getLayer() {
        return null;
    }

}
