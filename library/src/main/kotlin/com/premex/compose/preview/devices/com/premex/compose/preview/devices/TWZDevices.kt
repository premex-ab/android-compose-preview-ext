package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TWZ device specifications for Android Compose previews.
 *
 * This extension provides TWZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TWZ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TWZ: Any
  get() = object {
      /** DeviceSpec(manufacturer=TWZ, code=OX_X1, width=240, height=296, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TWZ, code=OX_X1, width=240,
      height=296, dpi=120, isGoogleDevice=false).code */
      val OX_X1 = "spec:width=240,height=296,unit=px,dpi=120"

      /** DeviceSpec(manufacturer=TWZ, code=V10, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TWZ, code=V10, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val V10 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=TWZ, code=V6, width=480, height=960, dpi=204,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TWZ, code=V6, width=480,
      height=960, dpi=204, isGoogleDevice=false).code */
      val V6 = "spec:width=480,height=960,unit=px,dpi=204"

  }
