package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MASCOM device specifications for Android Compose previews.
 *
 * This extension provides MASCOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MASCOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MASCOM: Any
  get() = object {
      /** DeviceSpec(manufacturer=MASCOM, code=MASCOM_SS289, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MASCOM, code=MASCOM_SS289,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val MASCOM_SS289 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MASCOM, code=MASCOM_WS517, width=480, height=856, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MASCOM, code=MASCOM_WS517,
      width=480, height=856, dpi=240, isGoogleDevice=false).code */
      val MASCOM_WS517 = "spec:width=480,height=856,unit=px,dpi=240"

  }
