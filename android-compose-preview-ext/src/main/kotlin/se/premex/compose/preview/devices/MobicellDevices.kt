package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Mobicell device specifications for Android Compose previews.
 *
 * This extension provides Mobicell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobicell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobicell: Any
  get() = object {
      /** Mobicell ICE */
      val ICE = "spec:width=480,height=800,unit=px,dpi=240"

      /** Mobicell SHIFT */
      val SHIFT = "spec:width=480,height=854,unit=px,dpi=240"

  }
