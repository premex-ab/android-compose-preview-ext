package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * humaxdigital device specifications for Android Compose previews.
 *
 * This extension provides humaxdigital device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Humaxdigital.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Humaxdigital: Any
  get() = object {
      /** DeviceSpec(manufacturer=humaxdigital, code=b604tnw, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=humaxdigital, code=b604tnw,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val B604TNW = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=humaxdigital, code=fvp4kgtr, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=humaxdigital, code=fvp4kgtr,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val FVP4KGTR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=humaxdigital, code=h5mini, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=humaxdigital, code=h5mini,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val H5MINI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=humaxdigital, code=vision, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=humaxdigital, code=vision,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val VISION = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
