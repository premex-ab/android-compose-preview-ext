package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Maxcom device specifications for Android Compose previews.
 *
 * This extension provides Maxcom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maxcom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maxcom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Maxcom, code=Maxcom_MS554, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxcom, code=Maxcom_MS554,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MAXCOM_MS554 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxcom, code=MS459, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxcom, code=MS459, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val MS459 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxcom, code=MS507_STRONG, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxcom, code=MS507_STRONG,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val MS507_STRONG = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxcom, code=MS515, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxcom, code=MS515, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MS515 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maxcom, code=MS651, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxcom, code=MS651, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MS651 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
