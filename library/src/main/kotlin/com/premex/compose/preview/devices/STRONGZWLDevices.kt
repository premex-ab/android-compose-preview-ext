package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STRONG-ZWL device specifications for Android Compose previews.
 *
 * This extension provides STRONG-ZWL device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STRONGZWL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STRONGZWL: Any
  get() = object {
      /** STRONG-ZWL HP40A1 */
      val HP40A1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** STRONG-ZWL HP44H */
      val HP44H = "spec:width=720,height=1280,unit=px,dpi=320"

  }
