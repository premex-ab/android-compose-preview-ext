package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * F2 device specifications for Android Compose previews.
 *
 * This extension provides F2 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.F2.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.F2: Any
  get() = object {
      /** DeviceSpec(manufacturer=F2, code=C8Finger, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F2, code=C8Finger, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val C8FINGER = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=F2, code=F80s_plus, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F2, code=F80s_plus, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val F80S_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=F2, code=i8_ROKR, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F2, code=i8_ROKR, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val I8_ROKR = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=F2, code=LT5216, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F2, code=LT5216, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LT5216 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=F2, code=Z8POCKET, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=F2, code=Z8POCKET, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val Z8POCKET = "spec:width=480,height=960,unit=px,dpi=240"

  }
