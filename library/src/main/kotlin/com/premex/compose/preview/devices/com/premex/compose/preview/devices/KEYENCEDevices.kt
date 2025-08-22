package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KEYENCE device specifications for Android Compose previews.
 *
 * This extension provides KEYENCE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KEYENCE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KEYENCE: Any
  get() = object {
      /** DeviceSpec(manufacturer=KEYENCE, code=BTA700, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEYENCE, code=BTA700, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BTA700 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KEYENCE, code=BT-A2000, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEYENCE, code=BT-A2000, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val BT_A2000 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KEYENCE, code=BT-A600, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEYENCE, code=BT-A600, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val BT_A600 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KEYENCE, code=DXA800, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEYENCE, code=DXA800, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val DXA800 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=KEYENCE, code=DX-A400, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEYENCE, code=DX-A400, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val DX_A400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KEYENCE, code=DX-A600, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KEYENCE, code=DX-A600, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DX_A600 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
