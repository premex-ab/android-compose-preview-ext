package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YESTEL device specifications for Android Compose previews.
 *
 * This extension provides YESTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YESTEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YESTEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=YESTEL, code=T13_EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=T13_EEA, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val T13_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YESTEL, code=T13_US, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=T13_US, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val T13_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YESTEL, code=T15_EEA, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=T15_EEA, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val T15_EEA = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YESTEL, code=T15_US, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=T15_US, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val T15_US = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YESTEL, code=T5, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=T5, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val T5 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=YESTEL, code=T5_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=T5_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val T5_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YESTEL, code=T5-plus, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=T5-plus, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val T5_PLUS = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YESTEL, code=T5-plus-EEA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=T5-plus-EEA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val T5_PLUS_EEA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=YESTEL, code=X2_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=X2_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val X2_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YESTEL, code=X2_US, width=800, height=1280, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=X2_US, width=800,
      height=1280, dpi=200, isGoogleDevice=false).code */
      val X2_US = "spec:width=800,height=1280,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=YESTEL, code=X3_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=X3_EEA, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val X3_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=YESTEL, code=X9_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=X9_EEA, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val X9_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=YESTEL, code=X9_US, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YESTEL, code=X9_US, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val X9_US = "spec:width=800,height=1280,unit=px,dpi=213"

  }
