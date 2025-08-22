package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ElisaElamus device specifications for Android Compose previews.
 *
 * This extension provides ElisaElamus device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ElisaElamus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ElisaElamus: Any
  get() = object {
      /** DeviceSpec(manufacturer=ElisaElamus, code=uzw4026ele, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ElisaElamus, code=uzw4026ele,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val UZW4026ELE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
