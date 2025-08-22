package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OALE device specifications for Android Compose previews.
 *
 * This extension provides OALE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OALE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OALE: Any
  get() = object {
      /** DeviceSpec(manufacturer=OALE, code=Apex1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OALE, code=Apex1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val APEX1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OALE, code=Apex2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OALE, code=Apex2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val APEX2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OALE, code=Apex3, width=720, height=1500, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OALE, code=Apex3, width=720,
      height=1500, dpi=320, isGoogleDevice=false).code */
      val APEX3 = "spec:width=720,height=1500,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OALE, code=dbx, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OALE, code=dbx, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DBX = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OALE, code=P2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OALE, code=P2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OALE, code=P3, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OALE, code=P3, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val P3 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=OALE, code=P5S, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OALE, code=P5S, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val P5S = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=OALE, code=XS2_LTE, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OALE, code=XS2_LTE, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val XS2_LTE = "spec:width=720,height=1520,unit=px,dpi=320"

  }
