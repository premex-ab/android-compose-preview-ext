package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WIN device specifications for Android Compose previews.
 *
 * This extension provides WIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WIN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WIN: Any
  get() = object {
      /** DeviceSpec(manufacturer=WIN, code=DV8947-KPW, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=WIN, code=DV8947-KPW, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DV8947_KPW = "spec:width=720,height=1280,unit=px,dpi=320"

  }
