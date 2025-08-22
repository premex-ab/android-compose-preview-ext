package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ViettelTV device specifications for Android Compose previews.
 *
 * This extension provides ViettelTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vietteltv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vietteltv: Any
  get() = object {
      /** ViettelTV HP40A */
      val HP40A = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
