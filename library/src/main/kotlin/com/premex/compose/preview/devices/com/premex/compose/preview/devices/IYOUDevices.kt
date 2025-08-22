package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * iYOU device specifications for Android Compose previews.
 *
 * This extension provides iYOU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IYOU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IYOU: Any
  get() = object {
      /** DeviceSpec(manufacturer=iYOU, code=A10, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iYOU, code=A10, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val A10 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=iYOU, code=A30, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=iYOU, code=A30, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A30 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
