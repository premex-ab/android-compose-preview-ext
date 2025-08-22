package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Meberry device specifications for Android Compose previews.
 *
 * This extension provides Meberry device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meberry.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meberry: Any
  get() = object {
      /** Meberry M7 */
      val M7 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Meberry M7Pro */
      val M7PRO = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Meberry M7_EEA */
      val M7_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Meberry M7_US */
      val M7_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Meberry M8_EEA */
      val M8_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** Meberry M8_US */
      val M8_US = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
