package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QIUWOKY device specifications for Android Compose previews.
 *
 * This extension provides QIUWOKY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QIUWOKY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QIUWOKY: Any
  get() = object {
      /** DeviceSpec(manufacturer=QIUWOKY, code=C10S, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QIUWOKY, code=C10S, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val C10S = "spec:width=800,height=1280,unit=px,dpi=160"

  }
