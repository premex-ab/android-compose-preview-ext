package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Ultym5 device specifications for Android Compose previews.
 *
 * This extension provides Ultym5 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ultym5.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ultym5: Any
  get() = object {
      /** Ultym5 hwG535-L11 */
      val HWG535_L11 = "spec:width=540,height=960,unit=px,dpi=240"

  }
