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
 * @Preview(device = Devices.CryptoDATA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CryptoDATA: Any
  get() = object {
      /** DeviceSpec(manufacturer=CryptoDATA, code=Hidr_S1_PRO, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CryptoDATA, code=Hidr_S1_PRO,
      width=1080, height=2460, dpi=480, isGoogleDevice=false).code */
      val HIDR_S1_PRO = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
