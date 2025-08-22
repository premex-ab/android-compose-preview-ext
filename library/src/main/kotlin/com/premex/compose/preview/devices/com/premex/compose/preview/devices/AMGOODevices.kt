package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AMGOO device specifications for Android Compose previews.
 *
 * This extension provides AMGOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AMGOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AMGOO: Any
  get() = object {
      /** DeviceSpec(manufacturer=AMGOO, code=AM515, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AMGOO, code=AM515, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AM515 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AMGOO, code=AM518, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AMGOO, code=AM518, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val AM518 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AMGOO, code=AM530, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AMGOO, code=AM530, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val AM530 = "spec:width=480,height=854,unit=px,dpi=240"

  }
