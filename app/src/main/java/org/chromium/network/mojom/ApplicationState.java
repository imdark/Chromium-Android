
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_param.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class ApplicationState {


    public static final int UNKNOWN = 0;

    public static final int HAS_RUNNING_ACTIVITIES = UNKNOWN + 1;

    public static final int HAS_PAUSED_ACTIVITIES = HAS_RUNNING_ACTIVITIES + 1;

    public static final int HAS_STOPPED_ACTIVITIES = HAS_PAUSED_ACTIVITIES + 1;

    public static final int HAS_DESTROYED_ACTIVITIES = HAS_STOPPED_ACTIVITIES + 1;


    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private ApplicationState() {}

}