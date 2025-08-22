package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUNTAK device specifications for Android Compose previews.
 *
 * This extension provides SUNTAK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SUNTAK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SUNTAK: Any
  get() = object {
      /** DeviceSpec(manufacturer=SUNTAK, code=MOJO, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNTAK, code=MOJO, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MOJO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SUNTAK, code=MOX_2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SUNTAK, code=MOX_2, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val MOX_2 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
