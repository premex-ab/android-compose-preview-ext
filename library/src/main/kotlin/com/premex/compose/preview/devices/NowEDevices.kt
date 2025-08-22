package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Now_E device specifications for Android Compose previews.
 *
 * This extension provides Now_E device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NowE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NowE: Any
  get() = object {
      /** Now_E hk101 */
      val HK101 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
