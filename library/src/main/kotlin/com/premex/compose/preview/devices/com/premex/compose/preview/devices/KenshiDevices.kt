package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kenshi device specifications for Android Compose previews.
 *
 * This extension provides Kenshi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kenshi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kenshi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kenshi, code=Kenshi_K10, width=1200, height=2000, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kenshi, code=Kenshi_K10,
      width=1200, height=2000, dpi=340, isGoogleDevice=false).code */
      val KENSHI_K10 = "spec:width=1200,height=2000,unit=px,dpi=340"

  }
