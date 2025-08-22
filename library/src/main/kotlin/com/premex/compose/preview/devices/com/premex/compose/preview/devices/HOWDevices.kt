package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOW device specifications for Android Compose previews.
 *
 * This extension provides HOW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HOW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HOW: Any
  get() = object {
      /** DeviceSpec(manufacturer=HOW, code=HT704, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOW, code=HT704, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HT704 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOW, code=HT705, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOW, code=HT705, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HT705 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOW, code=HT-705XS, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOW, code=HT-705XS, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val HT_705XS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOW, code=1001-G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOW, code=1001-G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val _1001_G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOW, code=1001-G_Go, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOW, code=1001-G_Go, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val _1001_G_GO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOW, code=704-G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOW, code=704-G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val _704_G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOW, code=705-G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOW, code=705-G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val _705_G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=HOW, code=705-G_Go, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HOW, code=705-G_Go, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val _705_G_GO = "spec:width=600,height=1024,unit=px,dpi=213"

  }
