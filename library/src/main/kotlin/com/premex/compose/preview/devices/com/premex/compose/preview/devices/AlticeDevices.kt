package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Altice device specifications for Android Compose previews.
 *
 * This extension provides Altice device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Altice.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Altice: Any
  get() = object {
      /** DeviceSpec(manufacturer=Altice, code=E25, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altice, code=E25, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val E25 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Altice, code=S13, width=540, height=1200, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altice, code=S13, width=540,
      height=1200, dpi=240, isGoogleDevice=false).code */
      val S13 = "spec:width=540,height=1200,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Altice, code=S14, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altice, code=S14, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S14 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Altice, code=S23, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altice, code=S23, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S23 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Altice, code=S24, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altice, code=S24, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S24 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Altice, code=S25, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altice, code=S25, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val S25 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Altice, code=S32_NFC, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altice, code=S32_NFC, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val S32_NFC = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Altice, code=S34, width=444, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altice, code=S34, width=444,
      height=960, dpi=200, isGoogleDevice=false).code */
      val S34 = "spec:width=444,height=960,unit=px,dpi=200"

  }
