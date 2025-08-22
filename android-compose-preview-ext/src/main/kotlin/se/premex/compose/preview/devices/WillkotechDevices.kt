package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * WILLKOTECH device specifications for Android Compose previews.
 *
 * This extension provides WILLKOTECH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Willkotech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Willkotech: Any
  get() = object {
      /** WILLKOTECH WK1863L */
      val WK1863L = "spec:width=800,height=1280,unit=px,dpi=160"

  }
