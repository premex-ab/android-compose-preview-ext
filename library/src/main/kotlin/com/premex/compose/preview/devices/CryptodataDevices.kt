package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CryptoDATA device specifications for Android Compose previews.
 *
 * This extension provides CryptoDATA device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cryptodata.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cryptodata: Any
  get() = object {
      /** CryptoDATA Hidr_S1_PRO */
      val HIDR_S1_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
