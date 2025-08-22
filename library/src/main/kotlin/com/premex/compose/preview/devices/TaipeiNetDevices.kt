package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TaipeiNet device specifications for Android Compose previews.
 *
 * This extension provides TaipeiNet device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TaipeiNet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TaipeiNet: Any
  get() = object {
      /** TaipeiNet HY40A3 */
      val HY40A3 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
