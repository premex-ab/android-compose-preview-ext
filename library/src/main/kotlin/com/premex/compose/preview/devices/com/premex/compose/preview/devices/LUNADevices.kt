package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LUNA device specifications for Android Compose previews.
 *
 * This extension provides LUNA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LUNA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LUNA: Any
  get() = object {
      /** DeviceSpec(manufacturer=LUNA, code=G6, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUNA, code=G6, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val G6 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LUNA, code=G6E, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUNA, code=G6E, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val G6E = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LUNA, code=LUNA_G9, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUNA, code=LUNA_G9, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val LUNA_G9 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LUNA, code=LUNA_T10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUNA, code=LUNA_T10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val LUNA_T10 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=LUNA, code=LUNA_V6, width=1080, height=2248, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUNA, code=LUNA_V6, width=1080,
      height=2248, dpi=480, isGoogleDevice=false).code */
      val LUNA_V6 = "spec:width=1080,height=2248,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=LUNA, code=LUNA_V6_3GB, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUNA, code=LUNA_V6_3GB, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val LUNA_V6_3GB = "spec:width=720,height=1600,unit=px,dpi=320"

  }
