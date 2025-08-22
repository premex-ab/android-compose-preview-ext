package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ANS device specifications for Android Compose previews.
 *
 * This extension provides ANS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ANS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ANS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ANS, code=L50, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ANS, code=L50, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val L50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ANS, code=L51, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ANS, code=L51, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val L51 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ANS, code=UL40, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ANS, code=UL40, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val UL40 = "spec:width=480,height=800,unit=px,dpi=240"

  }
