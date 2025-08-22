package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Beyond_PTE device specifications for Android Compose previews.
 *
 * This extension provides Beyond_PTE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BeyondPTE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BeyondPTE: Any
  get() = object {
      /** DeviceSpec(manufacturer=Beyond_PTE, code=MAX4, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Beyond_PTE, code=MAX4, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val MAX4 = "spec:width=480,height=996,unit=px,dpi=240"

  }
