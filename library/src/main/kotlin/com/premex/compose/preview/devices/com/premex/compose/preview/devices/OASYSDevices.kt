package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OASYS device specifications for Android Compose previews.
 *
 * This extension provides OASYS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OASYS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OASYS: Any
  get() = object {
      /** DeviceSpec(manufacturer=OASYS, code=TEG9300, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OASYS, code=TEG9300, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TEG9300 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=OASYS, code=TEG9300-4, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OASYS, code=TEG9300-4, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TEG9300_4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=OASYS, code=TEG9300-5, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OASYS, code=TEG9300-5, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TEG9300_5 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=OASYS, code=TEG9300-M, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OASYS, code=TEG9300-M, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val TEG9300_M = "spec:width=720,height=1440,unit=px,dpi=320"

  }
