/*
 * Copyright (c) 2025 Tark Coms Ltd.
 * Copyright 2025 Arkraft Technica  Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Tark-Commercial.
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.appconfig

object ApplicationConfig {
    /**
     * Application name used in the UI for string. If empty, the value is taken from the resources `R.string.app_name`.
     * Note that this value is not used for the launcher icon.
     * For Tark, the value is empty, and so read from `R.string.app_name`, which depends on the build variant:
     * - "Tark" for release builds;
     * - "Tark dbg" for debug builds;
     * - "Tark nightly" for nightly builds.
     */
    const val APPLICATION_NAME: String = ""

    /**
     * Used in the strings to reference the Tark client.
     * Cannot be empty.
     * For Tark, the value is "Tark".
     */
    const val PRODUCTION_APPLICATION_NAME: String = "Tark"

    /**
     * Used in the strings to reference the Tark Desktop client, for instance Tark Web.
     * Cannot be empty.
     * ForTark, the value is "Tark". We use the same name for desktop and mobile for now.
     */
    const val DESKTOP_APPLICATION_NAME: String = "Tark"
}
