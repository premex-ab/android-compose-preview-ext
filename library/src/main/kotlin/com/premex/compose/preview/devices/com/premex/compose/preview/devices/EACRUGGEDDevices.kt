package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EACRUGGED device specifications for Android Compose previews.
 *
 * This extension provides EACRUGGED device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EACRUGGED.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EACRUGGED: Any
  get() = object {
      /** DeviceSpec(manufacturer=EACRUGGED, code=EP500, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EACRUGGED, code=EP500, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val EP500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=EACRUGGED, code=RG80, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EACRUGGED, code=RG80, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val RG80 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=EACRUGGED, code=Wolf10R, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EACRUGGED, code=Wolf10R, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val WOLF10R = "spec:width=800,height=1280,unit=px,dpi=240"

  }
