package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MundoPacifico device specifications for Android Compose previews.
 *
 * This extension provides MundoPacifico device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MundoPacifico.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MundoPacifico: Any
  get() = object {
      /** DeviceSpec(manufacturer=MundoPacifico, code=S2000, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MundoPacifico, code=S2000,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val S2000 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MundoPacifico, code=S3001, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MundoPacifico, code=S3001,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val S3001 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
