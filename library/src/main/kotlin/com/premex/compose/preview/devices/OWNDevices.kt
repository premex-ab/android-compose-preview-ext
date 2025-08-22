package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OWN device specifications for Android Compose previews.
 *
 * This extension provides OWN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OWN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OWN: Any
  get() = object {
      /** OWN OWN_FUN_6 */
      val OWN_FUN_6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** OWN OWN_FUN_7 */
      val OWN_FUN_7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** OWN OWN_SMART_9 */
      val OWN_SMART_9 = "spec:width=720,height=1528,unit=px,dpi=280"

      /** OWN Smart_9_Pro */
      val SMART_9_PRO = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** OWN SMART_O2 */
      val SMART_O2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** OWN VFD511 */
      val VFD511 = "spec:width=480,height=854,unit=px,dpi=240"

  }
