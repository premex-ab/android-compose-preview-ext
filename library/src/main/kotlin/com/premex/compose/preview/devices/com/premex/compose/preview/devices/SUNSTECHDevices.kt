package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNSTECH device specifications for Android Compose previews.
 *
 * This extension provides SUNSTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNSTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNSTECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=SUNSTECH, code=martin, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNSTECH, code=martin, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=SUNSTECH, code=TAB1081, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNSTECH, code=TAB1081, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB1081 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SUNSTECH, code=TAB1090, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNSTECH, code=TAB1090, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TAB1090 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
