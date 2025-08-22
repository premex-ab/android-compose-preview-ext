package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SWISSMOBILITY device specifications for Android Compose previews.
 *
 * This extension provides SWISSMOBILITY device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SWISSMOBILITY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SWISSMOBILITY: Any
  get() = object {
      /** DeviceSpec(manufacturer=SWISSMOBILITY, code=B4SWM, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SWISSMOBILITY, code=B4SWM,
      width=720, height=1512, dpi=320, isGoogleDevice=false).code */
      val B4SWM = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SWISSMOBILITY, code=Z7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SWISSMOBILITY, code=Z7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Z7 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
