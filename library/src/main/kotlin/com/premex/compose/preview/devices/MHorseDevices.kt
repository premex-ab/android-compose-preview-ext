package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * M-HORSE device specifications for Android Compose previews.
 *
 * This extension provides M-HORSE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MHorse.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MHorse: Any
  get() = object {
      /** M-HORSE M2S */
      val M2S = "spec:width=480,height=960,unit=px,dpi=240"

      /** M-HORSE Pure_3 */
      val PURE_3 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
