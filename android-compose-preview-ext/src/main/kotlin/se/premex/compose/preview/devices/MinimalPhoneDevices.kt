package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Minimal_Phone device specifications for Android Compose previews.
 *
 * This extension provides Minimal_Phone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MinimalPhone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MinimalPhone: Any
  get() = object {
      /** Minimal_Phone MP01 */
      val MP01 = "spec:width=600,height=800,unit=px,dpi=180"

  }
