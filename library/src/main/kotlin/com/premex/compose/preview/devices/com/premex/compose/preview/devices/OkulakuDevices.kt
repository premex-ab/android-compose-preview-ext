package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * okulaku device specifications for Android Compose previews.
 *
 * This extension provides okulaku device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Okulaku.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Okulaku: Any
  get() = object {
      /** DeviceSpec(manufacturer=okulaku, code=K10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=okulaku, code=K10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=okulaku, code=ZIDS701, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=okulaku, code=ZIDS701, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ZIDS701 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
