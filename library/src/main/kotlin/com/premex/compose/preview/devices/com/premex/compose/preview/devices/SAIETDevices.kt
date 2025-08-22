package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SAIET device specifications for Android Compose previews.
 *
 * This extension provides SAIET device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SAIET.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SAIET: Any
  get() = object {
      /** DeviceSpec(manufacturer=SAIET, code=STS502, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SAIET, code=STS502, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val STS502 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SAIET, code=STS550, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SAIET, code=STS550, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val STS550 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=SAIET, code=STS570, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SAIET, code=STS570, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val STS570 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SAIET, code=STS571, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SAIET, code=STS571, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val STS571 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SAIET, code=STS600, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SAIET, code=STS600, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val STS600 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SAIET, code=STS601, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SAIET, code=STS601, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val STS601 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SAIET, code=STS602, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SAIET, code=STS602, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val STS602 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
