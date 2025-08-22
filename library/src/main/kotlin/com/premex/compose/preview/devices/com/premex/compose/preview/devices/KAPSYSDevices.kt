package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KAPSYS device specifications for Android Compose previews.
 *
 * This extension provides KAPSYS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KAPSYS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KAPSYS: Any
  get() = object {
      /** DeviceSpec(manufacturer=KAPSYS, code=r889, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAPSYS, code=r889, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val R889 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KAPSYS, code=SmartVision3, width=640, height=960, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAPSYS, code=SmartVision3,
      width=640, height=960, dpi=260, isGoogleDevice=false).code */
      val SMARTVISION3 = "spec:width=640,height=960,unit=px,dpi=260"

      /** DeviceSpec(manufacturer=KAPSYS, code=SmartVision3us, width=640, height=960, dpi=260,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAPSYS, code=SmartVision3us,
      width=640, height=960, dpi=260, isGoogleDevice=false).code */
      val SMARTVISION3US = "spec:width=640,height=960,unit=px,dpi=260"

  }
