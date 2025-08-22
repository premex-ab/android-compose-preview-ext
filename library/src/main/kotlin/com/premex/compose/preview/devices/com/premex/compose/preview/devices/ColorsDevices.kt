package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Colors device specifications for Android Compose previews.
 *
 * This extension provides Colors device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Colors.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Colors: Any
  get() = object {
      /** DeviceSpec(manufacturer=Colors, code=P52_Pride5C, width=480, height=1014, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Colors, code=P52_Pride5C,
      width=480, height=1014, dpi=220, isGoogleDevice=false).code */
      val P52_PRIDE5C = "spec:width=480,height=1014,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Colors, code=P77_Pride_1E, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Colors, code=P77_Pride_1E,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val P77_PRIDE_1E = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Colors, code=P88_Pride_1X, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Colors, code=P88_Pride_1X,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val P88_PRIDE_1X = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Colors, code=P95_Pride_7s, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Colors, code=P95_Pride_7s,
      width=640, height=1280, dpi=320, isGoogleDevice=false).code */
      val P95_PRIDE_7S = "spec:width=640,height=1280,unit=px,dpi=320"

  }
