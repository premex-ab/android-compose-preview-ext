package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GREENHOUSE device specifications for Android Compose previews.
 *
 * This extension provides GREENHOUSE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GREENHOUSE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GREENHOUSE: Any
  get() = object {
      /** DeviceSpec(manufacturer=GREENHOUSE, code=kannai, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREENHOUSE, code=kannai, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KANNAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GREENHOUSE, code=piha, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREENHOUSE, code=piha, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PIHA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GREENHOUSE, code=SW6H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREENHOUSE, code=SW6H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=GREENHOUSE, code=umeda, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREENHOUSE, code=umeda, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
