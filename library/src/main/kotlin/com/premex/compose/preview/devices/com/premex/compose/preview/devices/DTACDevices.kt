package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DTAC device specifications for Android Compose previews.
 *
 * This extension provides DTAC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DTAC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DTAC: Any
  get() = object {
      /** DeviceSpec(manufacturer=DTAC, code=dtacPhoneS3, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DTAC, code=dtacPhoneS3, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val DTACPHONES3 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DTAC, code=dtacPhoneT3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DTAC, code=dtacPhoneT3, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val DTACPHONET3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DTAC, code=dtacPhoneX3, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DTAC, code=dtacPhoneX3, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val DTACPHONEX3 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
