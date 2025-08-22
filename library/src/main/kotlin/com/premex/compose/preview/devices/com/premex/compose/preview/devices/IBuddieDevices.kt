package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * i-Buddie device specifications for Android Compose previews.
 *
 * This extension provides i-Buddie device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IBuddie.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IBuddie: Any
  get() = object {
      /** DeviceSpec(manufacturer=i-Buddie, code=RealPad_MA7BX2_1, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-Buddie, code=RealPad_MA7BX2_1,
      width=768, height=1024, dpi=160, isGoogleDevice=false).code */
      val REALPAD_MA7BX2_1 = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=i-Buddie, code=TF10EA2_P8_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-Buddie, code=TF10EA2_P8_1,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TF10EA2_P8_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=i-Buddie, code=TG08RK, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-Buddie, code=TG08RK, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val TG08RK = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=i-Buddie, code=TG08RK1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-Buddie, code=TG08RK1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TG08RK1 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=i-Buddie, code=TP10RA1_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-Buddie, code=TP10RA1_1,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TP10RA1_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=i-Buddie, code=TR10CS1_12, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-Buddie, code=TR10CS1_12,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TR10CS1_12 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=i-Buddie, code=TU10MK1_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-Buddie, code=TU10MK1_1,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TU10MK1_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=i-Buddie, code=TU11MK1_1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-Buddie, code=TU11MK1_1,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TU11MK1_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=i-Buddie, code=TU11MK1_2, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-Buddie, code=TU11MK1_2,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TU11MK1_2 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
