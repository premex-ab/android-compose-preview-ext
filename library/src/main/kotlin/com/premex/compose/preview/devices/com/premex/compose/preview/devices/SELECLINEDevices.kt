package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SELECLINE device specifications for Android Compose previews.
 *
 * This extension provides SELECLINE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SELECLINE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SELECLINE: Any
  get() = object {
      /** DeviceSpec(manufacturer=SELECLINE, code=S3T10IN, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SELECLINE, code=S3T10IN, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val S3T10IN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SELECLINE, code=S5S5IN4G, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SELECLINE, code=S5S5IN4G,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val S5S5IN4G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=SELECLINE, code=S5T10IN, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SELECLINE, code=S5T10IN, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val S5T10IN = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SELECLINE, code=ST19101, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SELECLINE, code=ST19101, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ST19101 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
