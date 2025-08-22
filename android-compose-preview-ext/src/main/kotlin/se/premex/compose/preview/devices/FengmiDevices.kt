package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Fengmi device specifications for Android Compose previews.
 *
 * This extension provides Fengmi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fengmi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fengmi: Any
  get() = object {
      /** Fengmi angleeUHD */
      val ANGLEEUHD = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
