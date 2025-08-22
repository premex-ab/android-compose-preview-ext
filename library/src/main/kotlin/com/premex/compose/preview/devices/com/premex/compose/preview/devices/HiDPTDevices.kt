package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HiDPT device specifications for Android Compose previews.
 *
 * This extension provides HiDPT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HiDPT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HiDPT: Any
  get() = object {
      /** DeviceSpec(manufacturer=HiDPT, code=Hi3751V350, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HiDPT, code=Hi3751V350, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HI3751V350 = "spec:width=720,height=1280,unit=px,dpi=160"

  }
