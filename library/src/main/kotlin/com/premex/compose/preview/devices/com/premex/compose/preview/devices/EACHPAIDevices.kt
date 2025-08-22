package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EACHPAI device specifications for Android Compose previews.
 *
 * This extension provides EACHPAI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EACHPAI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EACHPAI: Any
  get() = object {
      /** DeviceSpec(manufacturer=EACHPAI, code=Q8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EACHPAI, code=Q8, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=EACHPAI, code=706, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EACHPAI, code=706, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val _706 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
