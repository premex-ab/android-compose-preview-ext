package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * cwowdefu device specifications for Android Compose previews.
 *
 * This extension provides cwowdefu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cwowdefu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cwowdefu: Any
  get() = object {
      /** DeviceSpec(manufacturer=cwowdefu, code=F12W, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=cwowdefu, code=F12W, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val F12W = "spec:width=800,height=1280,unit=px,dpi=160"

  }
