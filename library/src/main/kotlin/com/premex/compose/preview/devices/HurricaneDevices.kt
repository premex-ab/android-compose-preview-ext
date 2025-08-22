package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices

/**
 * Hurricane device specifications for Android Compose previews.
 *
 * This extension provides Hurricane device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * \`\`\`kotlin
 * @Preview(device = Devices.Hurricane.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * \`\`\`
*/
val Devices.Hurricane get() = object {
    /** Hurricane Curve */
    val CURVE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hurricane DZIRE */
    val DZIRE = "spec:width=480,height=960,unit=px,dpi=213"

    /** Hurricane Excite */
    val EXCITE = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hurricane Flame_Plus */
    val FLAME_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Hurricane Fuel */
    val FUEL = "spec:width=480,height=960,unit=px,dpi=240"

    /** Hurricane Icon */
    val ICON = "spec:width=540,height=960,unit=px,dpi=240"

    /** Hurricane Iris */
    val IRIS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Hurricane Iris_Plus */
    val IRIS_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

    /** Hurricane LINK */
    val LINK = "spec:width=480,height=854,unit=px,dpi=240"

    /** Hurricane PULSE */
    val PULSE = "spec:width=480,height=800,unit=px,dpi=240"

    /** Hurricane Ridge Plus */
    val RIDGE_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Hurricane Rush Plus */
    val RUSH_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Hurricane Storm */
    val STORM = "spec:width=480,height=854,unit=px,dpi=240"

    /** Hurricane Volt_Plus */
    val VOLT_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

    /** Hurricane Vulcan */
    val VULCAN = "spec:width=540,height=960,unit=px,dpi=240"

}
