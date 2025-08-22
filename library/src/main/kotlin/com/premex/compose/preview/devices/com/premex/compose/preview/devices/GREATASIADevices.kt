package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GREATASIA device specifications for Android Compose previews.
 *
 * This extension provides GREATASIA device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GREATASIA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GREATASIA: Any
  get() = object {
      /** DeviceSpec(manufacturer=GREATASIA, code=E101GC, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREATASIA, code=E101GC, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val E101GC = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=GREATASIA, code=E101GC4G, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREATASIA, code=E101GC4G,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val E101GC4G = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GREATASIA, code=E108GC, width=800, height=1280, dpi=170,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREATASIA, code=E108GC, width=800,
      height=1280, dpi=170, isGoogleDevice=false).code */
      val E108GC = "spec:width=800,height=1280,unit=px,dpi=170"

      /** DeviceSpec(manufacturer=GREATASIA, code=E10A133_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREATASIA, code=E10A133_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val E10A133_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GREATASIA, code=E10_A133_EEA, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREATASIA, code=E10_A133_EEA,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val E10_A133_EEA = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GREATASIA, code=E700_Kids_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREATASIA, code=E700_Kids_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val E700_KIDS_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GREATASIA, code=E720_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREATASIA, code=E720_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val E720_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GREATASIA, code=E9863, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREATASIA, code=E9863, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val E9863 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=GREATASIA, code=TK_E109GCM, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREATASIA, code=TK_E109GCM,
      width=1200, height=1920, dpi=213, isGoogleDevice=false).code */
      val TK_E109GCM = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=GREATASIA, code=TK_E720_EEA, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREATASIA, code=TK_E720_EEA,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val TK_E720_EEA = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=GREATASIA, code=TK-P1197, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GREATASIA, code=TK-P1197,
      width=1200, height=2000, dpi=320, isGoogleDevice=false).code */
      val TK_P1197 = "spec:width=1200,height=2000,unit=px,dpi=320"

  }
