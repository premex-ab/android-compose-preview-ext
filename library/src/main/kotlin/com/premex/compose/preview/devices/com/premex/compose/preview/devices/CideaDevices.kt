package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Cidea device specifications for Android Compose previews.
 *
 * This extension provides Cidea device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cidea.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cidea: Any
  get() = object {
      /** DeviceSpec(manufacturer=Cidea, code=CM14000Plus, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cidea, code=CM14000Plus,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val CM14000PLUS = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Cidea, code=CM76_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cidea, code=CM76_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CM76_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Cidea, code=CM77, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cidea, code=CM77, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CM77 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Cidea, code=CM81_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cidea, code=CM81_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CM81_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Cidea, code=CM82, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cidea, code=CM82, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CM82 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Cidea, code=CM826, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cidea, code=CM826, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val CM826 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Cidea, code=CM90, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cidea, code=CM90, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CM90 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Cidea, code=CM91_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cidea, code=CM91_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CM91_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Cidea, code=CM92_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cidea, code=CM92_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CM92_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Cidea, code=CM93, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cidea, code=CM93, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val CM93 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Cidea, code=P1100, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cidea, code=P1100, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P1100 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Cidea, code=P1150, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Cidea, code=P1150, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val P1150 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
