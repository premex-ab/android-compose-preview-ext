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
 * @Preview(device = Devices.DingDong.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DingDong: Any
  get() = object {
      /** DeviceSpec(manufacturer=DingDong, code=IB101F_UAG, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DingDong, code=IB101F_UAG,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val IB101F_UAG = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
