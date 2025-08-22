package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AEEZO device specifications for Android Compose previews.
 *
 * This extension provides AEEZO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AEEZO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AEEZO: Any
  get() = object {
      /** DeviceSpec(manufacturer=AEEZO, code=TK701, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AEEZO, code=TK701, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TK701 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AEEZO, code=TK701_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AEEZO, code=TK701_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TK701_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AEEZO, code=TK801, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AEEZO, code=TK801, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TK801 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AEEZO, code=TK806, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AEEZO, code=TK806, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TK806 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AEEZO, code=TK806_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AEEZO, code=TK806_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TK806_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AEEZO, code=TK809, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AEEZO, code=TK809, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TK809 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AEEZO, code=TK809_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AEEZO, code=TK809_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TK809_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AEEZO, code=TP1001, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AEEZO, code=TP1001, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TP1001 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=AEEZO, code=TP901, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AEEZO, code=TP901, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TP901 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
