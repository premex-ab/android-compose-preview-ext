package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mipo device specifications for Android Compose previews.
 *
 * This extension provides mipo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mipo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mipo: Any
  get() = object {
      /** DeviceSpec(manufacturer=mipo, code=mipo_M17, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mipo, code=mipo_M17, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MIPO_M17 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mipo, code=mipo_M25, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mipo, code=mipo_M25, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MIPO_M25 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mipo, code=mipo_M46_Plus, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mipo, code=mipo_M46_Plus,
      width=720, height=1640, dpi=320, isGoogleDevice=false).code */
      val MIPO_M46_PLUS = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=mipo, code=mipo_M59, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=mipo, code=mipo_M59, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val MIPO_M59 = "spec:width=1080,height=2460,unit=px,dpi=480"

  }
