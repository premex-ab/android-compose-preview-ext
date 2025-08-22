package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Tanoshi device specifications for Android Compose previews.
 *
 * This extension provides Tanoshi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tanoshi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tanoshi: Any
  get() = object {
      /** Tanoshi TTBKB10-01 */
      val TTBKB10_01 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
