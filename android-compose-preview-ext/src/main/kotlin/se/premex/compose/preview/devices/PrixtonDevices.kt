package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Prixton device specifications for Android Compose previews.
 *
 * This extension provides Prixton device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Prixton.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Prixton: Any
  get() = object {
      /** Prixton Expert */
      val EXPERT = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Prixton T9120 */
      val T9120 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
