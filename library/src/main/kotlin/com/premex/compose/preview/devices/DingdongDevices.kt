package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DingDong device specifications for Android Compose previews.
 *
 * This extension provides DingDong device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dingdong.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dingdong: Any
  get() = object {
      /** DingDong IB101F_UAG */
      val IB101F_UAG = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
