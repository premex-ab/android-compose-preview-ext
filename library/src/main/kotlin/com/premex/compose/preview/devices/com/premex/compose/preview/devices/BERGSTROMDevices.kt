package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BERGSTROM device specifications for Android Compose previews.
 *
 * This extension provides BERGSTROM device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BERGSTROM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BERGSTROM: Any
  get() = object {
      /** DeviceSpec(manufacturer=BERGSTROM, code=H634_BLK, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BERGSTROM, code=H634_BLK,
      width=480, height=854, dpi=200, isGoogleDevice=false).code */
      val H634_BLK = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=BERGSTROM, code=P187, width=720, height=1440, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BERGSTROM, code=P187, width=720,
      height=1440, dpi=360, isGoogleDevice=false).code */
      val P187 = "spec:width=720,height=1440,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=BERGSTROM, code=666770, width=720, height=1440, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BERGSTROM, code=666770, width=720,
      height=1440, dpi=360, isGoogleDevice=false).code */
      val _666770 = "spec:width=720,height=1440,unit=px,dpi=360"

  }
