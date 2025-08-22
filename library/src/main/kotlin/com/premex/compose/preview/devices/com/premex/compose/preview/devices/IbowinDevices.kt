package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ibowin device specifications for Android Compose previews.
 *
 * This extension provides ibowin device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ibowin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ibowin: Any
  get() = object {
      /** DeviceSpec(manufacturer=ibowin, code=M10ES11, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ibowin, code=M10ES11, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val M10ES11 = "spec:width=800,height=1280,unit=px,dpi=180"

  }
