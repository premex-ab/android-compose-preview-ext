package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MobiIoT device specifications for Android Compose previews.
 *
 * This extension provides MobiIoT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MobiIoT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MobiIoT: Any
  get() = object {
      /** MobiIoT MobiGo2 */
      val MOBIGO2 = "spec:width=480,height=960,unit=px,dpi=213"

      /** MobiIoT MobiGo2L */
      val MOBIGO2L = "spec:width=480,height=960,unit=px,dpi=240"

      /** MobiIoT MobiGo2P */
      val MOBIGO2P = "spec:width=480,height=960,unit=px,dpi=213"

      /** MobiIoT MobiGo2PP */
      val MOBIGO2PP = "spec:width=480,height=960,unit=px,dpi=213"

      /** MobiIoT MobiGo2PQV */
      val MOBIGO2PQV = "spec:width=480,height=960,unit=px,dpi=213"

      /** MobiIoT MobiPrint4_Plus */
      val MOBIPRINT4_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** MobiIoT MP5 */
      val MP5 = "spec:width=720,height=1440,unit=px,dpi=300"

      /** MobiIoT WM19 */
      val WM19 = "spec:width=480,height=800,unit=px,dpi=200"

      /** MobiIoT WM58 */
      val WM58 = "spec:width=576,height=1152,unit=px,dpi=200"

  }
