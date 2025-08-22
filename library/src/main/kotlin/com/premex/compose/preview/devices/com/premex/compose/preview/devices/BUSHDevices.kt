package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BUSH device specifications for Android Compose previews.
 *
 * This extension provides BUSH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BUSH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BUSH: Any
  get() = object {
      /** DeviceSpec(manufacturer=BUSH, code=Bush10Nou, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BUSH, code=Bush10Nou, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val BUSH10NOU = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=BUSH, code=ewha, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BUSH, code=ewha, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val EWHA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=BUSH, code=sindang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BUSH, code=sindang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SINDANG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
