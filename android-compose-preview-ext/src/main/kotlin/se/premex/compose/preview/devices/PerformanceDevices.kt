package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Performance device specifications for Android Compose previews.
 *
 * This extension provides Performance device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Performance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Performance: Any
  get() = object {
      /** Performance PR7RKTNF */
      val PR7RKTNF = "spec:width=600,height=1024,unit=px,dpi=160"

  }
